
import React, {useState} from 'react';
import axios from 'axios';
import { navigate } from '@reach/router';

export default function RegistrationForm(){
    const [errors, setErrors] = useState([]);
    const [formState, setFormState] = useState({
        firstName: '',
        lastName: '',
        email: '',
        password: '',
        confirmPassword: '',
    });

    function handleChange(event){
        const { name, value } = event.target;

        setFormState({
            ...formState,
            [name]: value
        });
    }

    function handleSubmit(event){
        event.preventDefault();
        setErrors([]);

        axios.post('http://localhost:8000/api/users',formState, {
            withCredentials: true
        })
            .then(()=> navigate('/pirates'))
            // .catch(() => setError('Please check your credentials'));
            .catch(err => {
                const errs = [];
                // like simpleLens(err, ['response', 'data', 'errors'])
                const innerErrorsObject = err.response.data.errors;

                for(const key in innerErrorsObject) {
                    errs.push(innerErrorsObject[key].message);
                }

                setErrors(errs);
            })
    }
    return (
        <>
            <h2>Registration</h2>
            <br />
            {errors.map((err, i) => (
                <p key={i} style={{ color: 'red' }}>{err}</p>
            ))}
            <form onSubmit={handleSubmit} className="col-6 mx-auto border">
                <div className="form-group">
                    <label>First Name</label>
                    <input
                        name = "firstName"
                        value = {formState.firstName}
                        onChange={handleChange}
                        className={"form-control"}
                        type="text"
                    />
                </div>
                <div className="form-group">
                    <label>Last Name</label>
                    <input
                        name = "lastName"
                        value = {formState.lastName}
                        onChange={handleChange}
                        className={"form-control"}
                        type="text"
                    />
                </div>
                <div className="form-group">
                    <label>Email</label>
                    <input
                        name = "email"
                        type="email"
                        value = {formState.email}
                        onChange={handleChange}
                        className={"form-control"}
                    />
                </div>
                <div className="form-group">
                    <label>Password</label>
                    <input
                        type = "password"
                        name = "password"
                        value = {formState.password}
                        onChange={handleChange}
                        className={"form-control"}
                    />
                </div>
                <div className="form-group">
                    <label>Confirm Password</label>
                    <input
                        type = "password"
                        name = "confirmPassword"
                        value = {formState.confirmPassword}
                        onChange={handleChange}
                        className={"form-control"}
                    />
                </div>
                <button type="submit" className="btn btn-primary">Register</button>
            </form>
        </>
    )
}