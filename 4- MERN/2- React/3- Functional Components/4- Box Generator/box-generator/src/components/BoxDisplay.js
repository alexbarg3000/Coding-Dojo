import React,{useState} from 'react';

const BoxDisplay = (props) => {

    return(
        <div className="d-flex flex-wrap text-light col-8 mx-auto">
            {props.box.map((box, i) =>
                <div
                className="m-2 rounded"
                key={i}
                style={{ backgroundColor: box.color, height: box.height + "px", width: box.height + "px" }}
                ></div>
            )}
        </div>
    );
}

export default BoxDisplay;


