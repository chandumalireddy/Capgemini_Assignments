package com.example.demo;


import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class employeecontroller {
	 Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    Employeeservice serv;

    @RequestMapping(value="/add",method=RequestMethod.POST)
    public String create(@RequestBody employee emp) {
        serv.create(emp);
        return "Employee records created.";
    }
    @RequestMapping(value="/all")
    public List<employee> getAllEmployee() {

     return serv.getall();
    }
	
	  @DeleteMapping("/delete/{name}")
	  
	  
	  public String deleteEmployee(@PathVariable String name) {
	  
	  serv.delete(name);
	  
	  return "Delete emp for name"+name; }
	 
    @PutMapping("/update/{name}")

    public void updateEmployee(@RequestBody employee e,@PathVariable String name) {
    	
serv.update(name, e);
        
       
    }
}