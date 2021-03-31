package com.example.demo1;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class userservice {
	
	@Autowired
userrepo e;
	
	public void addem(user e1)
	{
		e.save(e1);
	}

	public List<user> getall() {
	List<user> em=new ArrayList<>();
	e.findAll()
	.forEach(em::add);
	return em;
	}
  public void delete(String name) { e.deleteById(name);
	  
	  }
	
	public void update(String name, user e1) {
		e.save(e1);
		
	}

	public user getname(String name) {
		
	return e.findByname(name);
	}
}
