package com.casestudy.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import Casestudy.Model.booking;
import io.swagger.annotations.Api;

@RestController
  @Api(value = "Swagger2DemoRestController")
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/pas")
public class UserController {

	@Autowired
	userService s;
	@PostMapping(value="/bookTicket")
	public void bookTicket(@RequestBody booking book)
	{
		RestTemplate resttemplate= new RestTemplate();
		resttemplate.postForObject("http://localhost:8083/booking/add",book, booking.class);
		
		
	}
	@DeleteMapping(value="/dropticket/{pnr}")
	public void dropTicket(@PathVariable("pnr") String pnr) {
		RestTemplate restTemplate=new RestTemplate();
		restTemplate.delete("http://localhost:8083/booking/del"+pnr);
	}
	
	@GetMapping("/ticket/{userName}")
	public booking[] tickt(@PathVariable("userName") String userName)
	{
		RestTemplate restTemplate=new RestTemplate();
	booking book[]=	restTemplate.getForObject("http://localhost:8083/booking/getuser/"+userName, booking[].class);
	return book;
	}
	
	@PostMapping("/signUp")
	public user signUp(@RequestBody user user)
	{
		
		return s.create(user);
	}
	@GetMapping("/signin")
	public String Login(){
		return "Welcome User";
	}
}
