import Navbar from './Navbar';
import Home from './Home';
import {BrowserRouter as Router, Routes, Route} from 'react-router-dom'; // react-router-dom v6 uses "Routes" instead of "Switch"

function App() {  
  return (
    // Wrap the entire application with "Router" component
    <Router>
      <div className="App">
        <Navbar/>
        <div className="content">
          <Routes>
            {/* Show "Home" component when visit "/" path */}
            <Route path='/' element={<Home/>}></Route> 
          </Routes>
        </div>
      </div>
    </Router>
  );
}

export default App;


