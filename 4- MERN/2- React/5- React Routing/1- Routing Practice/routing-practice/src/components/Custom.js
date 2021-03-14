import React from 'react';

const Custom = (props) =>{
    const type = isNaN(props.numOrWord) ? "word" : "number";


    return(
        <h1
            className={"text-center my-5"}
            style={{backgroundColor: props.bgColor, color: props.txtColor}}
        >The {type} is: {props.numOrWord}</h1>
    )
}

export default Custom;


