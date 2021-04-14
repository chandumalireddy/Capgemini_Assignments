package com.casestudy.user.controller;




import java.util.List;

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


import com.casestudy.user.Train;
import com.casestudy.user.user;
import com.casestudy.user.userService;

import io.swagger.annotations.Api;



@RestController
  @Api(value = "Swagger2DemoRestController")
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/user")

public class controller {

	@Autowired
	userService s;
	

	
	
	 /* 
	 * @GetMapping("/gettrainby/{id}") public Train[]
	 * gettrainbyid(@PathVariable("id")Long id) { RestTemplate resttemplate= new
	 * RestTemplate();
	 * 
	 * Train[]
	 * m=resttemplate.getForObject("http://localhost:8082/train/trainNo/"+id,
	 * Train[].class);
	 * 
	 * return m; }
	 * 
	 * @GetMapping("/gettrain/{name}") public Train[]
	 * gettrainbyname(@PathVariable("name")String name) { RestTemplate resttemplate=
	 * new RestTemplate();
	 * 
	 * Train[] m=resttemplate.getForObject("http://localhost:8082/train/"+name,
	 * Train[].class);
	 * 
	 * return m; }
	 * 
	 * @GetMapping("/gettrainwith/{source}") public Train[]
	 * gettrainbysource(@PathVariable("source")String source) { RestTemplate
	 * resttemplate= new RestTemplate();
	 * 
	 * Train[]
	 * m=resttemplate.getForObject("http://localhost:8082/train/train/"+source,
	 * Train[].class);
	 * 
	 * return m; }
	 * 
	 * @GetMapping("/gettrainby/{source}/{destination}") public Train[]
	 * gettrainbysourceanddestination(@PathVariable("source")String
	 * source,@PathVariable("destination")String destination) { RestTemplate
	 * resttemplate= new RestTemplate();
	 * 
	 * Train[]
	 * m=resttemplate.getForObject("http://localhost:8082/train/train/"+source+"/"+
	 * destination, Train[].class);
	 * 
	 * return m; }
	 * 
	 * @GetMapping("/gettrainby/{source}/{destination}/{date}") public Train[]
	 * gettrainbysourceanddestinationwithdate(@PathVariable("source")String
	 * source,@PathVariable("destination")String destination
	 * ,@PathVariable("date") @DateTimeFormat(iso =
	 * DateTimeFormat.ISO.DATE)LocalDate date) { RestTemplate resttemplate= new
	 * RestTemplate();
	 * 
	 * Train[]
	 * m=resttemplate.getForObject("http://localhost:8082/train/train/"+source+"/"+
	 * destination+"/"+date, Train[].class);
	 * 
	 * return m; }
	 * 
	 * @GetMapping("/wtihdate/{name}/{date}") public Train[]
	 * gettrainwithdate(@PathVariable("name")String
	 * name,@PathVariable("date") @DateTimeFormat(iso =
	 * DateTimeFormat.ISO.DATE)LocalDate date) { RestTemplate resttemplate= new
	 * RestTemplate();
	 * 
	 * Train[]
	 * m=resttemplate.getForObject("http://localhost:8082/train/withdate/"+name+"/"+
	 * date, Train[].class);
	 * 
	 * return m; }
	 */
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
