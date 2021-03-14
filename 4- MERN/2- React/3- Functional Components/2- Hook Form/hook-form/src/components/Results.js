import React from 'react';

const Results = props =>{

    const { firstName, lastName, email, password, confirmPassword } = props.data;     // var name 'data' coming from App.js

    return(
        <div>
            <h2>Results:</h2>
            <p>First Name: {firstName}</p>
            <p>Last Name: {lastName}</p>
            <p>Email: { email }</p>
            <p>Password: { password }</p>
            <p>Confirm Password: { confirmPassword }</p>
        </div>
    )
}

export default Results;