import React from 'react';
import axios from 'axios';
import {navigate} from '@reach/router';

export default function LogoutButton(){
    function handleClick(){
        axios.delete('http://localhost:8000/api/users/logout', {withCredentials: true})
            .then(() => navigate('/login'))
            .catch(console.log);
    }
    return (
        <button onClick={handleClick} className="btn btn-primary" style={{margin: "20px", padding:"10px"}}>Log Out</button>
    )
}