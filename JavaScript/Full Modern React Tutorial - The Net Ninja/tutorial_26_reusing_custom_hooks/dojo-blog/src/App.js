import Navbar from './Navbar';
import Home from './Home';
import Create from './Create';
import {BrowserRouter as Router, Routes, Route} from 'react-router-dom';
import BlogDetails from './BlogDetails';


function App() {  
  return (
    <Router>
      <div className="App">
        <Navbar/>
        <div className="content">
          <Routes>
            <Route path='/' element={<Home/>}></Route>
            <Route path='/create' element={<Create/>}></Route>

            {/* Add ":id" as router parameter */}
            <Route path='/blogs/:id' element={<BlogDetails/>}></Route>    
          </Routes>
        </div>
      </div>
    </Router>
  );
}

export default App;


