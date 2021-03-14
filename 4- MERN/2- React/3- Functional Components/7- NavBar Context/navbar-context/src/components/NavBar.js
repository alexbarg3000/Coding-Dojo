
import React, {useContext} from 'react';
import Wrapper from './Wrapper';


const Navbar = () => {
    const context = useContext(Wrapper);

    return(
        <div className="navigationbar">
            <h2 >Hello {context.name}</h2>
        </div>
    )
}
export default Navbar;