package com.capgemini;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController
@Api(value = "Swagger2DemoRestController")
//@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/emp")
public class Controller {

	@Autowired
	EmployeeService employee;
	
	@GetMapping("/getemp/{id}")
	public EmployeeModel getEmployee(@PathVariable("id")int id) 
	{
		return employee.getEmployeeById(id);	
	}
	
	@GetMapping("/getempname/{name}")
	public List<EmployeeModel> getEmployeeByName(@PathVariable("name")String name) 
	{
		return employee.getEmployeeByName(name);
	}
	
	@GetMapping("/getempdepart/{department}")
	public List<EmployeeModel> getEmployeeByDepartment(@PathVariable("department")String name) 
	{
		List<EmployeeModel>employeee=new ArrayList<>();
		employeee=employee.getEmployeeBydepartment(name);
		return employeee;
	}
	
	@GetMapping("/allemp")
	public List<EmployeeModel> getAllEmployee()
	{
		return employee.allEmployeeDetails();
	}
	
	@PostMapping("/addemp")
	public String addEmployee(@RequestBody EmployeeModel employeee) 
	{
		return employee.addEmployee(employeee);		
	}
	
	@DeleteMapping("/delemp/{id}")
	public String deleteEmployee(@PathVariable("id")int id) 
	{
		return employee.deleteByEmployee(id);
	}
	
	@PutMapping("/updateemp")
	public EmployeeModel updateEmployee(@RequestBody EmployeeModel emp) 
	{
		return employee.updateEmployee(emp);
	}
	
	
}
