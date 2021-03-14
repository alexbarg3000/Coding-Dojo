import { navigate } from "@reach/router"
import axios from "axios"
import { useState } from 'react'

const Login = ({ setUser }) => {
    const [inputErrors, setInputErrors] = useState([])
    const [inputFields, setInputFields] = useState({
        email: "",
        password: "",
    })

    const handleSubmit = (e) => {
        e.preventDefault()
        axios
            .post("http://localhost:8000/api/login", inputFields)
            .then((res) => {
                console.log(res.data.user)
                setUser(res.data.user)
                navigate('/')
            })
            .catch(err => {
                const errorResponse = err.response.data.errors;
                console.log(err.response)
                const errorArr =[];
                for(var key of Object.keys(errorResponse)){
                    console.log(key)
                    errorArr.push(errorResponse[key])
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
            <button type="submit" className="btn btn-primary">Login</button>
            {inputErrors.map((err,idx) => <p key={idx} className={"text-danger"}>{err}</p>)}
        </form>
    )
}
export default Login