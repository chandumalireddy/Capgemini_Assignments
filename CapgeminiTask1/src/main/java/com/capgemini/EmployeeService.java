package com.capgemini;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public EmployeeModel getEmployeeById(int id)
	{
		return employeeRepository.findById(id);
	}
		
	public List<EmployeeModel> getEmployeeByName(String name)
	{
		return employeeRepository.findByempName(name);
	}
	
	public List<EmployeeModel> getEmployeeBydepartment(String department)
	{
		return employeeRepository.findBydepartment(department);
	}
	
	public String addEmployee(EmployeeModel model)
	{
		employeeRepository.save(model);
		return "employee added";
	}
	
	public String deleteByEmployee(int id)
	{
		employeeRepository.deleteById(id);
		return "employee deleted";
	}
	
	public EmployeeModel updateEmployee(EmployeeModel emp)
	{
		return employeeRepository.save(emp);
	}
	
	
	public List<EmployeeModel> allEmployeeDetails()
	{
		return employeeRepository.findAll();
	}
	
}
