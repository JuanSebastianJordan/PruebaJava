package api.employee.Controller;

import api.employee.Model.EmployeeJson;
import api.employee.Model.EmployeeListJson;
import api.employee.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET})
@RequestMapping("/employees")
public class EmployeeController {


    @Autowired
    EmployeeService employeeService;


    @GetMapping("/all")
    public EmployeeListJson getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public EmployeeJson getAllEmployees(@PathVariable int id){
        return employeeService.getEmployeeByID(id);
    }


}
