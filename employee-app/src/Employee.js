import Table from "./Components/Table";
import { useState } from "react";

function Employee(){

    const url = "http://localhost:8080/employees/";
  const [employees, setEmployees] = useState();
  const [id, setId] = useState(false);
  const [error, setError] = useState(false);

  

  const handleSubmit = (event) => {
    event.preventDefault();
    let id = event.target[0].value;

    console.log(id);
    if (id !== "") {
      fetch(url + id)     
        .then((res) => {
          res.json();
        })
        .then((json) => {
          if (json.data !== null) {
            setEmployees(json);
            console.log(employees);
          } else {
            setEmployees(undefined);
            setId(true);
          }
        });
    } else {
      fetch(url + "all")
        .then((res) => {
          res.json();
        })
        .then((json) => {
          setEmployees(json);
          console.log(employees);
        });
    }
  };

  return(
      <div className="container">
      <h1>Search Employee</h1>
        <form onSubmit={handleSubmit}>
          <div className="mb-3">
            <label htmlFor="exampleInputEmail1" className="form-label">
              Employee ID
            </label>
            <input
              type="text"
              className="form-control"
              id="exampleInputEmail1"
              placeholder="ID"
              aria-describedby="emailHelp"
            />
          </div>
          <button type="submit" className="btn btn-primary">
            Submit
          </button>
        </form>

        {employees && employees.data !== null ? (
          <Table employees={employees.data}></Table>
        ) : id ? (
          <p>Id no valido</p>
        ) : (
          <></>
        )}
      </div>
  )


}

export default Employee;