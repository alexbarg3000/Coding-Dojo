import React from "react";

const Route =(props) =>{
    console.log(props);
    let test =props.match.params.test_params;
    return(
        <div>
            <h2>Route</h2>
            <p>This is Route Section</p>
            <p>{test}</p>
        </div>
    )
}

export default Route;