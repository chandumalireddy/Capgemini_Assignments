package com.casestudy.user;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.casestudy.user.controller.booking;



@RestController
@RequestMapping("/admin")
@CrossOrigin(origins="http://localhost:4200")
public class admincontroller {

	
	RestTemplate restTemplate=new RestTemplate();
	@Autowired
	RestTemplate resttemplate;
	@PostMapping(value="/post")
	public void addTrain(@RequestBody Train e)
	{
		
	resttemplate.postForObject("http://TRAIN/train/addtrain",e, Train.class);
	}

	@GetMapping("/allTrains") public Train[]
			 gettrainbyid() { 
			  
			  Train[]
			  m=resttemplate.getForObject("http://TRAIN/train/allTrains/",
			  Train[].class);
			  
			  return m; }
	@DeleteMapping("/deletebyTrainName/{trainName}/{date}")
	public void deleteTrain(@PathVariable("trainName")String
		  trainName,@PathVariable("date")@DateTimeFormat(iso =
		  DateTimeFormat.ISO.DATE)LocalDate date) {
		restTemplate.delete("http://localhost:8082/train/deletebyTrainName/"+trainName+"/"+date);
	}
	@GetMapping("/validate")
	public String validateAdmin() {
		return "success";
	}
	@GetMapping("/signin")
	public String Login(){
		return "Welcome User";
	}
}
