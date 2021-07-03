package com.capgemini;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
@TestInstance(Lifecycle.PER_CLASS) 
class EmployeeServiceTest {

	  @Mock
	  EmployeeRepository employeeRepository;
	  
	  @InjectMocks 
	  private EmployeeService employeeService;
	  
	  @Mock
	  private Controller controller;
	  
	  @SuppressWarnings("deprecation")
	  @BeforeAll public void init() { MockitoAnnotations.initMocks(this); }
	  
	@Test
	void testGetEmployeeById() {
		  EmployeeModel employee=new EmployeeModel(1,"chandu","analyst");
		  EmployeeModel employee1=new EmployeeModel(2,"chandu","HR");
		  List<EmployeeModel> employeeDetails=new ArrayList<>();
		  employeeDetails.add(employee);
		  employeeDetails.add(employee1);
	      when(employeeService.getEmployeeById(1)).thenReturn(employee);
	      EmployeeModel emp=employeeService.getEmployeeById(1);
	      assertEquals("analyst",emp.getDepartment());
	      assertEquals("chandu",emp.getEmpName());
	}

	@Test
	void testGetEmployeeByName() {
		  EmployeeModel employee=new EmployeeModel(1,"chandu","analyst");
		  EmployeeModel employee1=new EmployeeModel(2,"chandu","HR");
		  List<EmployeeModel> employeeDetails=new ArrayList<>();
		  employeeDetails.add(employee);
		  employeeDetails.add(employee1);
	      when(employeeService.getEmployeeByName("chandu")).thenReturn(employeeDetails);
	      List<EmployeeModel> emp=employeeService.getEmployeeByName("chandu");
	      assertEquals(emp.size(),2);
	}

	@Test
	void testGetEmployeeBydepartment() {
		  String a="analyst";
		  EmployeeModel employee=new  EmployeeModel(1,"chandu",a);
		  List<EmployeeModel> employeeDetails=new ArrayList<>();
		  employeeDetails.add(employee);
		  when(employeeService.getEmployeeBydepartment(a)).thenReturn(employeeDetails);
		  List<EmployeeModel> emp=employeeService.getEmployeeBydepartment(a);
		  assertEquals(emp.size(),1);
	}

	@Test
	void testAddEmployee() {
		 EmployeeModel employee=new EmployeeModel(1,"chandu","analyst");
		  String subject=employeeService.addEmployee(employee);
		  assertEquals(subject,"employee added");
	}

	@Test
	void testDeleteByEmployee() {
		  EmployeeModel employee=new  EmployeeModel(1,"chandu","consultant"); 
		  String subject=employeeService.addEmployee(employee);
		  assertEquals(subject,"employee added");
		  String subject1=employeeService.deleteByEmployee(employee.getId());
		  assertEquals(subject1,"employee deleted");
	}

	@Test
	void testUpdateEmployee() {
		 EmployeeModel employee=new EmployeeModel(1,"chandu","analyst");
		 employeeService.updateEmployee(employee);
		 verify(employeeRepository,times(1)).save(employee);
	}
	
	
	@Test
	void testAllEmployeeDetails() {
		  EmployeeModel employee=new EmployeeModel(1,"chandu","analyst");
		  EmployeeModel employee1=new EmployeeModel(2,"chandu","HR");
		  List<EmployeeModel> employeeDetails=new ArrayList<>();
		  employeeDetails.add(employee);
		  employeeDetails.add(employee1);
		  when(employeeService.allEmployeeDetails()).thenReturn(employeeDetails);
		  List<EmployeeModel> emp=employeeService.allEmployeeDetails();
		  assertEquals(employeeDetails.size(),emp.size());
	}

}
