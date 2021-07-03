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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@TestInstance(Lifecycle.PER_CLASS) 
class ControllerTest {

	
	  
	  @Mock
	  private EmployeeService employeeService;
	  
	  @InjectMocks
	  private Controller controller;
	  
	    @SuppressWarnings("deprecation")
		@BeforeAll public void init() { MockitoAnnotations.initMocks(this); }
	@Test
	void testGetEmployee() {
		 EmployeeModel employee=new EmployeeModel(1,"chandu","analyst");
		  EmployeeModel employee1=new EmployeeModel(2,"chandu","HR");
		  employeeService.addEmployee(employee);
		  employeeService.addEmployee(employee1);
		  List<EmployeeModel> employeeDetails=new ArrayList<>();
		  employeeDetails.add(employee);
		  employeeDetails.add(employee1);
	      when(employeeService.getEmployeeById(1)).thenReturn(employee);
	      EmployeeModel emp=controller.getEmployee(1);
	      assertEquals(emp.getDepartment(),"analyst");
	      assertEquals(emp.getEmpName(),"chandu");
	}

	@Test
	void testGetEmployeeByName() {
		  EmployeeModel employee=new EmployeeModel(1,"chandu","analyst");
		  EmployeeModel employee1=new EmployeeModel(2,"chandu","HR");
		  employeeService.addEmployee(employee);
		  employeeService.addEmployee(employee1);
		  List<EmployeeModel> employeeDetails=new ArrayList<>();
		  employeeDetails.add(employee);
		  employeeDetails.add(employee1);
	      when(employeeService.getEmployeeByName("chandu")).thenReturn(employeeDetails);
	      List<EmployeeModel> emp=controller.getEmployeeByName("chandu");
	      assertEquals(2,emp.size());
	}

	@Test
	void testGetEmployeeByDepartment() {
		  String a="analyst";
		  EmployeeModel employee=new  EmployeeModel(1,"chandu",a);
		 List<EmployeeModel> employeeDetails=new ArrayList<>();
		 employeeDetails.add(employee);
		 when(employeeService.getEmployeeBydepartment(a)).thenReturn(employeeDetails);
		 List<EmployeeModel> emp=controller.getEmployeeByDepartment(a);
		 assertEquals(emp.size(),1);
	}

	@Test
	void testAddEmployee() {
		 EmployeeModel employee=new EmployeeModel(1,"chandu","analyst");
		  System.out.print(employee.getDepartment());
		  when(employeeService.addEmployee(employee)).thenReturn("employee added"); 
		  assertEquals(controller.addEmployee(employee),"employee added");
	}
	

	@Test
	void testDeleteEmployee() {
		 EmployeeModel employee=new EmployeeModel(1,"chandu","consultant"); 
		 controller.addEmployee(employee);
		 String subject1=controller.deleteEmployee(employee.getId());
				 

	}

	@Test
	void testUpdateEmployee() {
		 EmployeeModel employee=new EmployeeModel(1,"chandu","analyst");
		 controller.updateEmployee(employee);
		 verify(employeeService,times(1)).updateEmployee(employee);
	}

	@Test
	void testGetAllEmployee() {
		 EmployeeModel employee=new EmployeeModel(1,"chandu","analyst");
		  EmployeeModel employee1=new EmployeeModel(2,"chandu","HR");
		  List<EmployeeModel> employeeDetails=new ArrayList<>();
		  employeeDetails.add(employee);
		  employeeDetails.add(employee1);
		  when(employeeService.allEmployeeDetails()).thenReturn(employeeDetails);
		  List<EmployeeModel> emp=controller.getAllEmployee();
		  assertEquals(employeeDetails.size(),emp.size());
	}

}
