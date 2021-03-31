package com.example.demo;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class customerservice {
	@Autowired
	static  
	customerrepo cust;
	
	public List<customer> getcust(){
		List<customer> c=new ArrayList<>();
		cust.findAll()
		.forEach(p->c.add(p));
		return c;
	}
	
	public static void addcust(customer c)
	{
		cust.save(c);
	}

	public void update(String name, customer e) {
		
			cust.save(e);
			
		}

	public Optional<customer> getid(int id) {
	
		return cust.findById(id);
	}

	public void delete(int id) {
		cust.deleteById(id);
	}

	
		
	}

