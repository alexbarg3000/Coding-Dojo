import logo from './logo.svg';
import React, {useState} from 'react';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import UserForm from "./components/UserForm";


function App() {

  return (
      <div className="App">
          <UserForm/>
      </div>
  );
}

export default App;
