import React from 'react';

const UserForm = (props) =>{

    const {inputs, setInputs} = props;      // var names coming from App.js

    const onChange = e => {
        setInputs({
            ...inputs,      // spreading to bring in everything
            [e.target.name] : e.target.value        // then just change one specific thing
        });
    };

    const createUser = (e) => {
        e.preventDefault();
        const newUser = { };
        console.log("Welcome", newUser);
    };


    return(
        <form onSubmit={createUser } className="col-5 mx-auto my-5">
            <div>
                <div className="form-group">
                    <label>First Name: </label>
                    <input type="text"
                           className="form-control"
                           name="firstName"
                           onChange={onChange}
                           value={inputs.firstName}
                           />
                    {inputs.firstName.length<2 && inputs.firstName.length!==0?
                    <p style={{color: 'red'}}>Must be at least 2 characters</p> : ''
                    }
                </div>

                <div className="form-group">
                    <label>Last Name: </label>
                    <input type="text"
                           className="form-control"
                           name="lastName"
                           onChange={onChange}
                           value={inputs.lastName}
                           />
                    {inputs.lastName.length<2 && inputs.lastName.length!==0?
                    <p style={{color: 'red'}}>Must be at least 2 characters</p> : ''
                    }
                </div>

                <div className="form-group">
                    <label>Email: </label>
                    <input type="text"
                           className="form-control"
                           name="email"
                           onChange={onChange}
                           value={inputs.email}
                           />
                    {inputs.email.length<5 && inputs.email.length!==0?
                    <p style={{color: 'red'}}>Must be at least 5 characters</p> : ''
                    }
                </div>

                <div className="form-group">
                    <label>Password: </label>
                    <input
                        type="password"
                        className="form-control"
                        name="password"
                        onChange={onChange}
                        value={inputs.password}
                        />
                        {inputs.password.length<8 && inputs.password.length!==0?
                            <p style={{color: 'red'}}>Must be at least 8 characters</p> : ''
                        }

                </div>

                <div className="form-group">
                    <label>Confirm Password: </label>
                    <input
                        type="password"
                        className="form-control"
                        name="confirmPassword"
                        onChange={onChange}
                        value={inputs.confirmPassword}
                    />
                    {inputs.confirmPassword !== inputs.password && inputs.confirmPassword.length!==0?
                        <p style={{color: 'red'}}>Passwords don't match </p> : ''
                    }

                </div>
                <input className="btn btn-primary" type="submit" value="Create User"/>
            </div>

        </form>

    );
};

export default UserForm;