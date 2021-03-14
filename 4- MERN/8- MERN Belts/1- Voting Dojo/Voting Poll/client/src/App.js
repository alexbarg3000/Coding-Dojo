import React, { useState } from 'react';

import 'bootstrap/dist/css/bootstrap.min.css';
import './App.css';

import Home from './components/Home';
import PollForm from './components/PollForm';
import PollVoteForm from './components/PollVoteForm';
import PollResult from './components/PollResult';


function App() {
  const [page, setPage] = useState(["home", {}]);

  return (
    <div className="container ">
      <div className=" jumbotron-fluid">
        <div className="container jumbotron" style={{backgroundColor:"aqua"}}>
          <h1 className="display-4" style = {{textAlign: "center"}}>Welcome to the Voting Dojo</h1>
        </div>
      </div>
      <div className="App">
      { page[0] === "home" && <Home setPage={setPage} /> }
      { page[0] === "create" && <PollForm setPage={setPage} /> }
      { page[0] === "vote" && <PollVoteForm poll={ page[1].poll } setPage={setPage} /> }
      { page[0] === "result" && <PollResult poll={ page[1].poll } setPage={setPage} /> }
      </div>
    </div>
  );
}

export default App;