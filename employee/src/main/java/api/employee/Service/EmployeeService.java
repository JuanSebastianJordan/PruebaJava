package api.employee.Service;
import api.employee.DataAccess.JsonData;
import api.employee.Model.Data;
import api.employee.Model.EmployeeJson;
import api.employee.Model.EmployeeListJson;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

   private JsonData jsonData = new JsonData();

   public EmployeeListJson getAllEmployees(){
        EmployeeListJson empl = jsonData.getAllEmployees();
        for (int i=0; i<empl.getData().length; i++){
            Data current = empl.getData()[i];
            current.setAnual_salary(calculateAnualSalary(current.getEmployee_salary()));
        }
        return empl;
    }

    public EmployeeJson getEmployeeByID(int id){
        EmployeeJson emp = jsonData.getEmployeeById(id);
        if(emp.getData()!=null){
            emp.getData().setAnual_salary(calculateAnualSalary(emp.getData().getEmployee_salary()));
        }

        return emp;
    }

    public int calculateAnualSalary(int pSalary){
       return pSalary*12;
    }
}
