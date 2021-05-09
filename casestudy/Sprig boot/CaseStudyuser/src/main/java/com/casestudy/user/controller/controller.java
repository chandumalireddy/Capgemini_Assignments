package com.casestudy.user.controller;



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
import com.casestudy.user.user;
import com.casestudy.user.userService;
import Casestudy.Model.booking;
import io.swagger.annotations.Api;



@RestController
  @Api(value = "Swagger2DemoRestController")
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/user")

public class controller {

	@Autowired
	userService service;

	
	//This request will passes to booking microService and add the ticket
	@PostMapping(value="/bookTicket")
	public void bookTicket(@RequestBody booking book)
	{
		RestTemplate restTemplate= new RestTemplate();
		restTemplate.postForObject("http://localhost:8083/booking/add",book, booking.class);
		
		
	}
	
	//This request will passes to booking microService and delete the ticket
	@DeleteMapping(value="/dropticket/{pnr}")
	public void dropTicket(@PathVariable("pnr") String pnr) 
	{
		RestTemplate restTemplate=new RestTemplate();
		restTemplate.delete("http://localhost:8083/booking/del"+pnr);
	}
	
	//This request will passes to booking microService and get the ticket
	@GetMapping("/ticket/{userName}")
	public booking[] tickt(@PathVariable("userName") String userName)
	{
		RestTemplate restTemplate=new RestTemplate();
		booking book[]=	restTemplate.getForObject("http://localhost:8083/booking/getuser/"+userName, booking[].class);
		return book;
	}
	
	//This request will add new user to userService
	@PostMapping("/signUp")
	public user signUp(@RequestBody user user)
	{
		return service.create(user);
	}
	
	//This request will verify the existing user in userService
	@GetMapping("/signin")
	public String Login()
	{
		return "Welcome User";
	}
	
}
