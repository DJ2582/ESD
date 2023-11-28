import './App.css';
import "../node_modules/bootstrap/dist/css/bootstrap.min.css";
import Navbar from './layout/Navbar';
import Home from './pages/Home';
import { BrowserRouter as Router, Routes, Route} from 'react-router-dom';
import Login from './pages/Login';



function App() {
  return (
    <div className="App">
     <Router>

     <Navbar/>

     <Routes>
        <Route exact path="/" element={<Login/>}/>
        <Route exact path="/home" element={<Home/>}></Route>
        
     </Routes>
  
     </Router>
     

    </div>
  );
}

export default App;
