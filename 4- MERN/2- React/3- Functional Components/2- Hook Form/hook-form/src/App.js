import logo from './logo.svg';
import React, {useState} from 'react';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import UserForm from "./components/UserForm";
import Results from "./components/Results";


function App() {

  const [state, setState] = useState({
    firstName: "",
    lastName: "",
    email: "",
    password: "",
    confirmPassword: ""
  });

  return (
    <div className="App">
      <UserForm inputs={ state} setInputs={setState}/>
      <Results data={ state }/>
    </div>
  );
}

export default App;
