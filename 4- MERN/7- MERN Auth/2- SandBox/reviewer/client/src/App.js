import Home from './views/WelcomePage';
// import New from './views/New';
import WelcomePage from './views/WelcomePage';
import { Router } from '@reach/router';
import 'bootstrap/dist/css/bootstrap.min.css';



function App() {

  return (
      <div>
        <Router>
          <WelcomePage path="/"/>
          {/*<Home path="/project"/>*/}
          {/*<New path="/new"/>*/}
        </Router>
      </div>
  );
}

export default App;