import logo from './logo.svg';
import './App.css';
import Navbar from './components/Navbar';
import Seo from './components/Seo';
import Stats from './components/Stats';
import Services from './components/Services';
import Mission from './components/Mission';
import Team from './components/Team';
import Enrollpage from './components/Enrollpage';
import Home from './components/Home';
import Login from './components/Login';
import { BrowserRouter as Router,Routes,Route } from 'react-router-dom';
function App() {
  return (
    <div className="App">
        
       <Router>    
         <Navbar />
      <Seo />
      <Stats />
      <Services />
      <Mission />
      <Team />
      
      <Routes>
        <Route path="/" element={<Navbar/>}/>
        <Route path="/enroll" element={<Login />} />
        
        
      </Routes>
      </Router>

    </div>
  );
}

export default App;
