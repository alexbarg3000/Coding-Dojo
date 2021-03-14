import React from "react";
import  {Link, NavLink} from 'react-router-dom';

const Nav = () => {
    return(
        <div>
            <a href={"#"}>Logo</a>
            <ul>
                <NavLink activeClassName={"selected"} exact to={"/"}>Home</NavLink>
                <NavLink activeClassName={"selected"} to={"/about"}>About</NavLink>
                <NavLink activeClassName ={"selected"} to={"/blog"}>Blog</NavLink>
            </ul>
        </div>
    )
}

export default Nav;