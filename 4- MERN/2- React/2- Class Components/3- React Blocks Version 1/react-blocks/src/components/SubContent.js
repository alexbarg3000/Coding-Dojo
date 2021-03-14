import React from "react";

export default class SubContent extends React.Component{
    constructor(props) {
        super(props);

        this.state={
            color: "yellow"
        }
}
    render() {
        return(
            <div
                onMouseOver={() => this.setState({color: "peachpuff"})}
                onMouseOut={() => this.setState({color: "yellow"})}
                className= "m-4" style={{width: "300px", height: "400px", background: this.state.color}}
                ></div>
        );
    }
}
