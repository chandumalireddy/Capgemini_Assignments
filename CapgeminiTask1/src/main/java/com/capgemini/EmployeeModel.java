package com.capgemini;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("employeedata")
public class EmployeeModel {

	private int id;
	private String empName;
	private String department;
	
	public EmployeeModel(int id, String empName, String department) {
		super();
		this.id = id;
		this.empName = empName;
		this.department = department;
	}
	public int getId() {
		return id;
	}

	public String getEmpName() {
		return empName;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
