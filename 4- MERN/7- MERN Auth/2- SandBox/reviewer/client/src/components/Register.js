import { navigate } from '@reach/router'
import axios from 'axios'
import {useEffect, useState} from 'react'

const Register = ({ setUser }) => {
    const [inputFields, setInputFields] = useState({
        firstName: "",
        lastName: "",
        email: "",
        password: "",
        confirmPassword: "",
        country: ""
    })
    var [countries, setCountries] = useState([])

    console.log(inputFields)

    const [inputErrors, setInputErrors] = useState([])
    console.log(inputErrors)

    useEffect(() => {
        axios.get('http://localhost:8000/api/country')
            .then(response => setCountries(response.data))
            .catch(err => console.log(err))
    }, []);

    const handleSubmit = (event) => {
        console.log("submitting form")
        event.preventDefault()

        axios
            .post("http://localhost:8000/api/register", inputFields)
            .then((res) => {
                console.log(res.data)

                setUser(res.data.user)

                navigate("/")
            })
            .catch(err => {
                const errorResponse = err.response.data.errors;
                const errorArr =[];
                for(var key of Object.keys(errorResponse)){
                    errorArr.push(errorResponse[key].message)
                }
                setInputErrors(errorArr)
            })
    }

    const handleChange = (e) => {
        console.log("changing state")
        setInputFields({
            ...inputFields,
            [e.target.name]: e.target.value,
        })
    }

    return (
        <form onSubmit={handleSubmit}  className="col-6 mx-auto border">
            <div className="form-group">
                <label>First Name</label>
                <input
                    type="text"
                    name="firstName"
                    onChange={handleChange}
                    className={"form-control"}
                />
            </div>
            <div className="form-group">
                <label>Last Name</label>
                <input
                    type="text"
                    name="lastName"
                    onChange={handleChange}
                    className={"form-control"}
                />
            </div>
            <div className="form-group">
                <label>Email Address</label>
                <input
                    type="email"
                    name="email"
                    onChange={handleChange}
                    className={"form-control"}
                />
            </div>
            <div className="form-group">
                <label>Password</label>
                <input
                    type="password"
                    name="password"
                    onChange={handleChange}
                    className={"form-control"}
                />
            </div>
            <div className="form-group">
                <label>Confirm Password</label>
                <input
                    type="password"
                    name="confirmPassword"
                    onChange={handleChange}
                    className={"form-control"}
                />
            </div>
            <div className="form-group">
                <label >Country  </label>
                <select  className={"form-select form-select-sm offset-1"}  name="country"  onChange={handleChange}>
                    {countries.map(countries => (
                        <option value={countries.name} key={countries.name} style={{listStyleType: "none"}}>{countries.name}</option>))}
                </select>
            </div>
            <button type="submit" className="btn btn-primary">Register</button>
            {inputErrors.map((err,idx) => <p className={"text-danger"} key={idx}>{err}</p>)}
        </form>
    )
}
export default Register