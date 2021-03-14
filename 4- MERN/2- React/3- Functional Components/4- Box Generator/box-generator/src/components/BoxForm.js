import React, {useState} from 'react';

const BoxForm = (props) =>{
    const[currentColor, setCurrentColor] = useState("");
    const[currentHeight, setCurrentHeight] =useState("");

    const handleSubmit = (e) => {
        e.preventDefault();

        const newBox = { color:currentColor, height:currentHeight};

        props.onNewBox(newBox);
        setCurrentColor("");
        setCurrentHeight("");

    };

    return (
        <form className={"header"} onSubmit={handleSubmit}>
            <h1 className={"welcome"}>Welcome to Box Generator</h1>
            <div className={"input"}>

                <input
                       className={"form-control m-2 w-50"}
                       type="text"
                       placeholder={"Enter color here"}
                       name={"color"}
                       onChange ={(e) => setCurrentColor(e.target.value)}
                       value={currentColor}
                       >
                </input>
                <input
                    className={"form-control m-2 w-50"}
                    type="number"
                    placeholder={"Enter box-size here"}
                    name={"height"}
                    onChange = { (e) => setCurrentHeight(e.target.value) }
                    value={ currentHeight }
                    >
                </input>

                <input type="submit" className="m-2 btn btn-secondary" value="Submit"/>

            </div>
        </form>
    );
}

export default BoxForm;
