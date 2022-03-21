function Table(props) {


    return(
      <table className="table">
        <thead>
          <tr>
            <th scope="col">ID</th>
            <th scope="col">Name</th>
            <th scope="col">Salary</th>
            <th scope="col">Age</th>
            <th scope="col">Year Salary</th>
          </tr>
        </thead>
        <tbody>
          {Array.isArray(props.employees)?props.employees.map((item, index) => (
            <tr key={index}>
              <th>{item.id}</th>
              <td>{item.employee_name}</td>
              <td>{item.employee_salary}</td>
              <td>{item.employee_age}</td>
              <td>{item.anual_salary}</td>
            </tr>
          )):<tr>
          <th>{props.employees.id}</th>
          <td>{props.employees.employee_name}</td>
          <td>{props.employees.employee_salary}</td>
          <td>{props.employees.employee_age}</td>
          <td>{props.employees.anual_salary}</td>
        </tr>}
          
        </tbody>
      </table>
    )
}
export default Table;
