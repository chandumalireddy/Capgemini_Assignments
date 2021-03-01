package com.example.demo;

import java.util.List;

public interface Employeeservice {
	public void create(employee e);
	
	public List<employee>  getall();
	public void update(String name,employee e);

	 public void delete(String name); 

}
