package api.employee.DataAccess;

import api.employee.Model.EmployeeJson;
import api.employee.Model.EmployeeListJson;
import org.springframework.web.client.RestTemplate;

public class JsonData {

    private String uri="http://dummy.restapiexample.com/api/v1/";



    public EmployeeListJson getAllEmployees(){
        RestTemplate restTemplate = new RestTemplate();
        System.out.println(uri);
        EmployeeListJson employees = restTemplate.getForObject(uri+"employees",EmployeeListJson.class);
        return employees;
    }
    public EmployeeJson getEmployeeById(int id){
        RestTemplate restTemplate = new RestTemplate();
        EmployeeJson employee = restTemplate.getForObject(uri+"employee/"+id,EmployeeJson.class);
        return employee;
    }

}
