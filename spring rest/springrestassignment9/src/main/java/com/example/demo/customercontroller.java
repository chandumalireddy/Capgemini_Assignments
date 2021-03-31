package com.example.demo;

import java.util.List;
import java.util.Optional;

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
public class customercontroller {
	
	@Autowired 
	customerservice a;
	 @RequestMapping(value="/add",method=RequestMethod.POST)
	  @ResponseBody
	    public void create(@RequestBody customer em2) {
	       a.addcust(em2);
	       
	 
	  }
	  @RequestMapping(value="/all")
	    public List<customer> getAll() {

	     return a.getcust();
	    }
	    @RequestMapping(value="/id/{id}")
	    public Optional<customer> getname(@PathVariable("id")int id) {

	     return a.getid(id);
	    }
	    @DeleteMapping("/delete/{name}")
		  
		  
		  public String delete(@PathVariable("id")int name) {
		  
		  a.delete(name);
		  
		  return "Delete  for name"+name; }
		 
	    @PutMapping("/update/{name}")

	    public void update(@RequestBody customer e,@PathVariable String name) {
	    	
	a.update(name, e);
	        
	       
	    }
	  
	}

