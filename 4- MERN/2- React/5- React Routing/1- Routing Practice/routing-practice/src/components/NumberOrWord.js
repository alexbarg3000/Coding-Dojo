import React from 'react';

const NumberOrWord = (props) =>{
    const type = isNaN(props.numOrWord) ? "word" : "number";

    return(
        <h1 className={"text-center my-5"}>The {type} is: {props.numOrWord}</h1>
    )
}

export default NumberOrWord;


