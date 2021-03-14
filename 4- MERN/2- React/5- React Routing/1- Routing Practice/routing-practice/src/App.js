import React from 'react';
import { Router } from '@reach/router';
import Welcome from './components/Welcome';
import NumberOrWord from './components/NumberOrWord';
import Custom from './components/Custom';
import 'bootstrap/dist/css/bootstrap.min.css';

function App() {

  return (
      <div className="App">
        <Router>
          <Welcome path="/home"/>
          <NumberOrWord path="/:numOrWord"/>
          <Custom path="/:numOrWord/:bgColor/:txtColor"/>
        </Router>
      </div>
  );
}

export default App;