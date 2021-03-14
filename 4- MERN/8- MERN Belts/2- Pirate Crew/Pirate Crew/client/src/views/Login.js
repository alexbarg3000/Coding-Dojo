import React, {useState} from 'react';
import axios from 'axios';
import {navigate} from '@reach/router';
import RegistrationForm from '../components/RegistrationForm';


export default function Login() {
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');
    const [inputErrors, setInputErrors] = useState([])


    function handleSubmit(e) {
        e.preventDefault();
        axios.post('http://localhost:8000/api/users/login', {
            email,
            password
        }, {withCredentials: true})
            .then(() => navigate('/pirates'))
            .catch(err => {
                    const errorResponse = err.response.data.errors;
                    console.log(err.response)
                    const errorArr = [];
                    for (var key of Object.keys(errorResponse)) {
                        console.log(key)
                        errorArr.push(errorResponse[key])
                    }
                    setInputErrors(errorArr)
                }
            )
    }


    return (
        <div className={"container "} style={{"backgroundColor": "#ff9900", paddingBottom:"10px"}}>
            <div className={"col-12"}>
                <h1 style={{"backgroundColor": "#783f04", color: "white"}} className="text-center">Welcome to Pirate Crew!</h1>
                <br />
                <div className={"row"}>
                    <div className={"col-6"} >
                    <h2>Login </h2>
                        <br />
                    {inputErrors.map((err, idx) => <p key={idx} className={"text-danger"}>{err}</p>)}
                    <form onSubmit={handleSubmit} className="col-6 mx-auto border">
                        <div className="form-group">
                            <label>Email</label>
                            <input
                                name="email"
                                value={email}
                                onChange={e => setEmail(e.target.value)}
                                className={"form-control"}
                            />
                        </div>
                        <div className="form-group">
                            <label>Password</label>
                            <input
                                name="password"
                                type="password"
                                value={password}
                                onChange={e => setPassword(e.target.value)}
                                className={"form-control"}
                            />
                        </div>
                        <button type="submit" className="btn btn-primary">Login</button>
                    </form>
                    </div>
                    <div className={"col-6"}>

                    <RegistrationForm/><br />
                    </div>
                </div>
            </div>
        </div>
    )
}


// import React,{useState} from 'react';
// import axios from 'axios';
// import {navigate} from '@reach/router';
// import RegistrationForm from '../components/RegistrationForm';
//
//
// export default function Login(){
//     const[email,setEmail] =useState('');
//     const[password,setPassword] = useState('');
//     const[err,setErr] = useState("");
//     const [inputErrors, setInputErrors] = useState([])
//
//
//
//     function handleSubmit(e){
//         e.preventDefault();
//         setErr('');
//         axios.post('http://localhost:8000/api/users/login',{
//             email,
//             password
//         },{withCredentials:true})
//             .then(()=>navigate('/pirates'))
//             .catch(()=>setErr('Please check the information you entered'))
//
//     }
//
//
//     return (
//         <>
//             <h1>Login page</h1>
//             {err && (
//                 <p style = {{color: 'red'}}>{err}</p>
//             )}
//             <form onSubmit={handleSubmit}>
//                 <div>
//                     <label >Email</label>
//                     <input
//                         name="email"
//                         value={email}
//                         onChange={e=>setEmail(e.target.value)}
//                     />
//                 </div>
//                 <div>
//                     <label >Password</label>
//                     <input
//                         name="password"
//                         type="password"
//                         value={password}
//                         onChange={e=>setPassword(e.target.value)}
//                     />
//                 </div>
//                 <button>Submit</button>
//             </form>
//             <RegistrationForm />
//         </>
//     )
// }