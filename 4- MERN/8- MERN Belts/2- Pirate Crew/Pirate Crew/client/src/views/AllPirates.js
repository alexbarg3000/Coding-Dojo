import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { navigate, Link } from '@reach/router';
import LogoutButton from '../components/LogoutButton';


export default function AllPirate() {
    const [pirates, setPirates] = useState([]);
    const [hasError, setHasError] = useState(false);

    pirates.sort(function(a,z) {
        if ( a.name < z.name ) return -1;
        if ( z.name > a.name ) return 1;
        return 0;
    })

    useEffect(() => {
        axios.get('http://localhost:8000/api/pirates',{
            withCredentials:true
        })
            .then(response => setPirates(response.data))
            // .catch(() => setHasError(true));
            .catch(()=>navigate('/login'));
        // .catch(console.log);
    }, []);

    function handleDelete(id) {
        axios.delete('http://localhost:8000/api/pirates/' + id)
            .then(() => setPirates(pirates.filter(pirate => pirate._id !== id)))
    }

    if(hasError) return 'Something went wrong!';

    if(pirates === null) return 'Loading...';

    return (
        <div className={"container"} style={{"backgroundColor": "#ff9900", paddingBottom:"10px"}}>
            <div className={"row justify-content-between"}
                 style={{"backgroundColor": "#783f04", color: "white"}}
            >
                <LogoutButton/> {' '}
                <br/>
                <br/>
                <h1>Pirate Crew</h1>
                <br/>
                <br/>
                <Link to="/pirates/new" style={{
                    backgroundColor: "#007bff",
                    fontSize: "20px",
                    color: "white",
                    "text-align": "center",
                    "vertical-align": "center",
                    margin: "20px",
                    padding: "10px",
                    "border-radius": ".25rem"
                }}>Add Pirate</Link>

            </div>
            <br/>
            <div>
                {pirates.map(pirate => (
                    <ul key={pirate._id} style={{listStyleType: "none"}}>
                        <div className={"row"} style={{"backgroundColor": "white",marginRight:"25px",marginBottom:"20px"}}>
                            <div className={"col-4"}>
                                <li><img src={pirate.imageUrl} alt={pirate.name}
                                         style={{width: "200px", high: "100px",marginTop:"20px"}}/></li>
                                <br/>

                            </div>
                            <div className={"col-8"}>
                                <li>
                                    <h3>{pirate.name}</h3>
                                </li>
                                <li>
                                    <button onClick={() => navigate('/pirates/' + pirate._id)}
                                            className="btn btn-primary "
                                    >View Pirate
                                    </button>
                                    {' '}
                                    <button
                                        onClick={() => handleDelete(pirate._id)}
                                        className="btn btn-danger offset-1"
                                    >
                                        Walk the Plank
                                    </button>

                                </li>
                                <br/>
                            </div>
                        </div>

                    < /ul>
                ))}

            </div>

        </div>
    );

}