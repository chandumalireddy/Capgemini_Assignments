package com.example.demo1;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class empservice {
	
	@Autowired
	emprepo e;
	
	public void addemp(employee emp)
	{
		e.save(emp);
	}

	public List<employee> getall() {
	List<employee> emp=new ArrayList<>();
	e.findAll()
	.forEach(emp::add);
	return emp;
	}
  public void delete(String name) { e.deleteById(name);
	  
	  }
	
	public void update(String name, employee e1) {
		e.save(e1);
		
	}
}
