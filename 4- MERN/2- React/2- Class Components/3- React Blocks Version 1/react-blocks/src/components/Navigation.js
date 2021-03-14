import React, { Component} from 'react';

export default class Navigation extends Component {
    constructor(props){
        super(props);

        this.state = {
            color: "blue"
        }
    }

    render(){
        return(
            <div
                onMouseOver={() => this.setState({color: "rebeccapurple"})}
                onMouseOut={() => this.setState({color:"blue"})}
                className="my-4"
                style={{height:"400px", width: "290px", backgroundColor:this.state.color}}>
                </div>
        )
    }
}