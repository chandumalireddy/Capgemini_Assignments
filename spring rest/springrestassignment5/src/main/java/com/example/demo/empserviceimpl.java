package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class empserviceimpl implements Employeeservice {
	 @Autowired
	    mongorepository repo;
	 

	@Override
	public void create(employee e) {
		repo.save(e);
		
	}
	public List<employee> getall(){
		List<employee> emp=new ArrayList<>();
		repo.findAll()
		.forEach(emp::add);
		return emp;
	}
	
	  @Override public void delete(String name) { repo.deleteById(name);
	  
	  }
	
	@Override
	public void update(String name, employee e) {
		repo.save(e);
		
	}
}
