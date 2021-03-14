import logo from './logo.svg';
import React, {useState} from 'react';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import BoxDisplay from "./components/BoxDisplay";
import BoxForm from "./components/BoxForm";

function App() {
  const [ currentColor, setCurrentColor ] = useState([]);

  const changeColor = ( newColor ) => {
    setCurrentColor([ ...currentColor, newColor ]);
  }

  return (
      <div className="body">
        <div className="text-light">
          <BoxForm onNewBox={ changeColor }/>
          <BoxDisplay box={ currentColor }/>
        </div>
      </div>

  );
}


export default App;
