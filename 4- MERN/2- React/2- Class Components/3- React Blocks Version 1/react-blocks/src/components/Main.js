import React from 'react';

export default class Main extends React.Component {
    render() {
        return (
            <div className="col-9 my-4 m-l-4 bg-danger" style={{height: "600px", width: "100%"}}>{this.props.children}</div>
            );
    }

}