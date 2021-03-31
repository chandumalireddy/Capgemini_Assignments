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
public class usercontroller {

	@Autowired
	userservice em;
	
	  @RequestMapping(value="/add",method=RequestMethod.POST)
	  @ResponseBody
	    public void create(@RequestBody user em2) {
	       em.addem(em2);
	       
	 
	  }
	  @RequestMapping(value="/all")
	    public List<user> getAll() {

	     return em.getall();
	    }
	    @RequestMapping(value="/name/{name}")
	    public user getname(@PathVariable("name")String name) {

	     return em.getname(name);
	    }
	    @DeleteMapping("/delete/{name}")
		  
		  
		  public String delete(@PathVariable String name) {
		  
		  em.delete(name);
		  
		  return "Delete  for name"+name; }
		 
	    @PutMapping("/update/{name}")

	    public void update(@RequestBody user e,@PathVariable String name) {
	    	
	em.update(name, e);
	        
	       
	    }
	  
	}

