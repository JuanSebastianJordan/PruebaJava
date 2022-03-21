import "./App.css";
import Table from "./Components/Table";
import { useState } from "react";
import Logo from "./logo.svg";
import {
  BrowserRouter as Router,
  Routes,
  Route,
  Link
} from "react-router-dom";
import Employee from "./Employee";
import Home from "./Home";

function App() {
  
  return (
    <>
      <header>
        <Router>
          <nav className="navbar navbar-expand-lg navbar-light bg-light">
            <div className="container-fluid">
              <Link className="navbar-brand" to="/">
                <img src={Logo} alt="" width="30" height="24" />
                Navbar
              </Link>
              <button
                className="navbar-toggler"
                type="button"
                data-bs-toggle="collapse"
                data-bs-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent"
                aria-expanded="false"
                aria-label="Toggle navigation"
              >
                <span className="navbar-toggler-icon"></span>
              </button>
              <div
                className="collapse navbar-collapse"
                id="navbarSupportedContent"
              >
                <ul className="navbar-nav me-auto mb-2 mb-lg-0">
                  <li className="nav-item">
                    <Link className="nav-link active" aria-current="page" to="/">
                      Home
                    </Link>
                  </li>
                  <li className="nav-item">
                    <Link className="nav-link" to="/employees">
                      Employees
                    </Link>
                  </li>
                </ul>
              </div>
            </div>
          </nav>
          <Routes>
            <Route exact path="/" element={<Home/>} />
            <Route exact path="/employees" element={<Employee />} />
          </Routes>
        </Router>
      </header>
      <main className="container">
       
      </main>
    </>
  );
}

export default App;
