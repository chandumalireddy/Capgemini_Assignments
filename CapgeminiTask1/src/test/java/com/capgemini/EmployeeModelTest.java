package com.capgemini;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class EmployeeModelTest {

	@Mock
	private EmployeeModel employee;
	@Test
	void testGetId() {
		EmployeeModel emp=new EmployeeModel(1,"chandu","Analyst");
		assertEquals(emp.getId(),1);
	}

	@Test
	void testGetEmpName() {
		EmployeeModel emp=new EmployeeModel(1,"chandu","Analyst");
		assertEquals(emp.getEmpName(),"chandu");
	}

	@Test
	void testGetDepartment() {
		EmployeeModel emp=new EmployeeModel(1,"chandu","Analyst");
		assertEquals(emp.getDepartment(),"Analyst");
	}

	@Test
	void testSetId() {
		EmployeeModel emp=new EmployeeModel(1,"chandu","Analyst");
		emp.setId(2);
		assertEquals(emp.getId(),2);
	}

	@Test
	void testSetEmpName() {
		EmployeeModel emp=new EmployeeModel(1,"chandu","Analyst");
		emp.setEmpName("sekhar");
		assertEquals(emp.getEmpName(),"sekhar");
	}

	@Test
	void testSetDepartment() {
		EmployeeModel emp=new EmployeeModel(1,"chandu","Analyst");
		emp.setDepartment("HR");;
		assertEquals(emp.getDepartment(),"HR");
	}

}
