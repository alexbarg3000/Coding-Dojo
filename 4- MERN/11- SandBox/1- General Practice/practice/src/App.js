import './App.css';
import React, {Component} from 'react';
// import 'bootstrap/dist/css/bootstrap.min.css';
// import Items from "./components/Items"
// import Nav from "./components/Nav"
// import Home from "./components/Home"
// import About from "./components/About"
// import {Router} from "@reach/router";
// import {BrowserRouter, Route, Switch} from "react-router-dom";
// import Blog from "./components/Blog";
// import Rout from "./components/Route"
// import Col from "./components/Col";
// import myPicture from "./logo_big.gif"


class App extends Component {



    render() {
        return (
                <BrowserRouter>
                    <div className={"App container jumbotron"}>
                        <Nav />
                        <Switch>
                            <Route exact path ="/" component={Home} />
                            <Route path ="/about" component={About} />
                            <Route path={"/blog"} component={Blog} />
                            <Route path={"/:test_params"} component={Rout} />
                        </Switch>

                    </div>
                    <table>
                        <tbody>
                            <tr>
                                <Col />
                            </tr>
                        </tbody>
                    </table>
                    <img src={myPicture} className={"img"} />
                </BrowserRouter>

        );
    }
}


// function App() {
//   return (
//     <div className="App">
//
//     </div>
//   );
// }

export default App;



// <form className={"form-group"} onSubmit={this.handleSubmit}>
//     <textarea type="text" className={"form-control"} onChange={this.handleChange}/>
//     <button className={"btn btn-primary"}>Submit</button>
//     <select className={"form-select"}
//             aria-label="Default select example"
//             onChange={this.handleChange}
//     >
//         <option  value={"value 1"}>Value 1</option>
//         <option value={"value 2"}>Value 2</option>
//         <option value={"value 3"}>Value 3</option>
//     </select>
//     <input type={"submit"} value={"send"}/>
// </form>
// {this.state.name}

// handleChange = (e) => {
//     this.setState({
//         name: e.target.value
//     })
// }
//
// handleSubmit = (e) => {
//     e.preventDefault();
//     console.log(this.state.name)
// }

//
// Conditional Output
// <Items items={this.state.items} />
// <button className={"btn btn-primary"} onClick={this.handleClick}>Add</button>
// <button className={"btn btn-danger"} onClick={this.handleDelete}>Delete</button>


// state={
//     items:[
//         {id:1, name:"Alex", age:31, count:2},
//         {id:2, name: "Mimo", age:26, count:1},
//         {id:3, name:"Renti", age:4, count:3},
//         {id:4, name:"Ayham", age:23, count:4}
//
//     ]
// }
//
// handleClick = (e) => {
//     let items =this.state.items;
//     let rand= Math.floor((Math.random()*10)+5);
//     items.push({id:rand, name: "John", age:24, count:5})
//     this.setState({
//         items: items
//     })
// }
//
// handleDelete = (e) =>{
//     let items =this.state.items;
//     items.pop();
//     this.setState({
//         items: items
//     })
// }

// <Router>
//     <Nav path={"/"} />
//     <Home path={"/home"} />
//     <About path={"/about"} />
//
// </Router>