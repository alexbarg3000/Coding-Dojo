import React, { useState } from 'react';
import axios from 'axios';
import { navigate } from '@reach/router';
import {  Link } from '@reach/router';

export default function NewPirate() {
    const [name, setName] = useState('');
    const [catchPhrase, setCatchPhrase] = useState('');
    const [imageUrl, setImageUrl] = useState('');
    const [chest, setChest] = useState(0);
    const [pegLeg, setPegLeg] = useState(true);
    const [eyePatch, setEyePatch] = useState(true);
    const [hookHand, setHookHand] = useState(true);
    const [crewPosition, setCrewPosition] = useState("boatswain");

    const [errors, setErrors] = useState([]);

    function handleSubmit(event) {
        event.preventDefault();

        axios.post('http://localhost:8000/api/pirates', {
            name,
            catchPhrase,
            imageUrl,
            chest,
            pegLeg,
            eyePatch,
            hookHand,
            crewPosition

        })
            .then(() => navigate('/pirates'))
            .catch(err => {
                const errs = [];
                const innerErrorsObject = err.response.data.errors;

                for(const key in innerErrorsObject) {
                    errs.push(innerErrorsObject[key].message);
                }

                setErrors(errs);
            })
    }

    return (
        <div className={"container"} style={{backgroundColor: "#ff9900", color: "white", paddingBottom:"20px"}}>
            {errors.map((err, i) => (
                <p key={i} style={{ color: 'red' }}>{err}</p>
            ))}
            <div className={"row justify-content-center "} style={{"backgroundColor": "#783f04", color: "white", padding:"10px"}}>
            <h1 className={"offset-5"}>Add Pirate</h1>
                <div className={"offset-3"}>
            <Link to="/pirates" style={{
                backgroundColor: "#007bff",
                fontSize: "20px",
                color: "white",
                "text-align": "center",
                "vertical-align": "center",
                margin: "20px",
                padding: "10px",
                "border-radius": ".25rem"
            }} >Crew Board</Link>
                </div>
                </div>
            <br />
            <form onSubmit={handleSubmit} className="col-12 mx-auto border" style={{backgroundColor: "#ff9900", color: "white"}}>
                <br />
                <div className={"row"}>
                    <div className={"col-6"}>
                <div className="form-group">
                    <label>Pirate Name</label>
                    <input
                        name="name"
                        value={name}
                        onChange={e => setName(e.target.value)}
                        className={"form-control"}
                    />
                </div>
                <div className="form-group">
                    <label>Image Url</label>
                    <input
                        name="imageUrl"
                        value={imageUrl}
                        onChange={e => setImageUrl(e.target.value)}
                        className={"form-control"}
                    />
                </div>
                <div className="form-group">
                    <label># of Treasure chests:</label>
                    <input
                        name="chest"
                        type="number"
                        value={chest}
                        onChange={e => setChest(e.target.value)}
                        className={"form-control"}
                    />
                </div>
                <div className="form-group">
                    <label>Pirate Catch Phrase</label>
                    <input
                        name="catchPhrase"
                        value={catchPhrase}
                        onChange={e => setCatchPhrase(e.target.value)}
                        className={"form-control"}
                    />
                </div>
                    </div>
                    <div className={"col-6"}>
                    <div className="form-group">
                    <label >Crew Position:  </label>
                    <select  className={"form-select form-select-sm offset-1"}  value={crewPosition}  onChange={e=>setCrewPosition(e.target.value)}>
                        <option value="Captain">Captain</option>
                        <option value="Quarter Master">Quarter Master</option>
                        <option value="Boatswain">Boatswain</option>
                        <option value="Powder Monkey">Powder Monkey</option>
                    </select>
                </div>
                <div className="form-check">
                    <input
                        type="checkbox"
                        checked={pegLeg}
                        onChange={e => setPegLeg(e.target.checked)}
                        className={"form-check-input"}
                    />
                    <label className={"form-check-label"}>Peg Leg</label>

                </div>
                <div className="form-check">
                    <input
                        type="checkbox"
                        checked={eyePatch}
                        onChange={e => setEyePatch(e.target.checked)}
                        className={"form-check-input"}
                    />
                    <label className={"form-check-label"}>Eye Patch</label>
                </div>
                <div className="form-check">
                    <input
                        type="checkbox"
                        checked={hookHand}
                        onChange={e => setHookHand(e.target.checked)}
                        className={"form-check-input"}
                    />
                    <label className={"form-check-label"}>Hook Hand</label>
                </div>
                <br />
                <button className="btn btn-primary">Add Pirate</button>
                        </div>
                </div>
            </form>

        </div>
    )
}