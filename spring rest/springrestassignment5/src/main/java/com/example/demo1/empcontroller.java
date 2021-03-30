package com.example.demo1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;






@RestController
public class empcontroller {

	@Autowired
	empservice em;
	
	  @RequestMapping(value="/add",method=RequestMethod.POST)
	  @ResponseBody
	    public void create(@RequestBody employee emp) {
	       em.addemp(emp);
	       
	 
	  }
	  @RequestMapping(value="/all")
	    public List<employee> getAllEmployee() {

	     return em.getall();
	    }
	    @DeleteMapping("/delete/{name}")
		  
		  
		  public String deleteEmployee(@PathVariable String name) {
		  
		  em.delete(name);
		  
		  return "Delete emp for name"+name; }
		 
	    @PutMapping("/update/{name}")

	    public void updateEmployee(@RequestBody employee e,@PathVariable String name) {
	    	
	em.update(name, e);
	        
	       
	    }
	  
	}

