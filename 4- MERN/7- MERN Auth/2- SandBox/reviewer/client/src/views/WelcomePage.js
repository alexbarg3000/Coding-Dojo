import Login from '../components/Login';
import Register from '../components/Register';
import { useState } from 'react'
import ProjectList from "../views/ProjectList";


const WelcomePage = () => {
    const [user, setUser] = useState(null)

    if(user===null){
    return (

        <div className={"container jumbotron"} >
            <h1 className="text-center">Welcome!!</h1>
            <br />
            <div className={"col-12"}>
                <div className={"row"}>
                    <div className={"col-6"}>
                        <Register path="/" setUser={setUser} />
                    </div>
                    <div className={"col-6"}>
                        <Login path="/" setUser={setUser}  />
                    </div>
                </div>
            </div>
        </div>
    )}
    else{console.log(user._id)
        return(
            <ProjectList id={user._id} user={user}/>

        )
    }
}

export default WelcomePage;