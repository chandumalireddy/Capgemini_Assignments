package com.Casestudy.aZuulApi;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class Controller {

	
	@GetMapping("/hello")
	public String hello() {
		return "heloo";
	}
	
}
