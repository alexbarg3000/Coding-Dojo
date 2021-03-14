import React, { useState } from 'react';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import Navbar from './components/NavBar';
import FormWrapper from './components/FormWrapper';
import Wrapper from './components/Wrapper';


function App() {
  const [name, setName] = useState("");
  return (
      <div className="App">
        <Wrapper.Provider value={{name, setName}}>
          <Navbar />
          <FormWrapper />
        </Wrapper.Provider>
      </div>
  );
}

export default App;