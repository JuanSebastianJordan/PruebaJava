package api.employee;

import api.employee.Service.EmployeeService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeApplicationTests {

	EmployeeService employeeService = new EmployeeService();

	@DisplayName("Test successful")
	@Test
	void anualSalaryCalculationTest() {
		int [] salaries = {10,20,30,40};

		assertAll("salaries",
				() -> assertEquals(120, employeeService.calculateAnualSalary(salaries[0])),
				() -> assertEquals(240, employeeService.calculateAnualSalary(salaries[1])),
				() -> assertEquals(360, employeeService.calculateAnualSalary(salaries[2])),
				() -> assertEquals(480, employeeService.calculateAnualSalary(salaries[3]))
		);

	}

	@DisplayName("Wrong Test")
	@Test
	void anualSalaryCalculationBadTest() {
		int [] salaries = {10,20,30,40};

		assertAll("salaries",
				() -> assertNotEquals(122, employeeService.calculateAnualSalary(salaries[0])),
				() -> assertNotEquals(245, employeeService.calculateAnualSalary(salaries[1])),
				() -> assertNotEquals(365, employeeService.calculateAnualSalary(salaries[2])),
				() -> assertNotEquals(485, employeeService.calculateAnualSalary(salaries[3]))
		);

	}

}
