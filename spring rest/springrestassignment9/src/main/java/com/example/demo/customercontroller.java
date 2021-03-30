package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController  
public class customercontroller {
	
	@Autowired 
	customerservice a;
	@RequestMapping(method=RequestMethod.POST,value="/add")
	public void addcus(@RequestBody customer c)
	{
		a.addcust(c);
	}
	  @RequestMapping(value="/all")
	    public List<customer> getAll() {

	     return a.getcust();
	    }
	  
		 
	    @PutMapping("/update/{name}")

	    public void update(@RequestBody customer e,@PathVariable String name) {
	    	
	a.update(name, e);
	        
	       
	    }

}
