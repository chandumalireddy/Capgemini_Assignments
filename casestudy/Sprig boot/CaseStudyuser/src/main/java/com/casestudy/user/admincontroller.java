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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import Casestudy.Model.Train;



@RestController
@RequestMapping("/admin")
@CrossOrigin(origins="http://localhost:4200")
public class admincontroller 
{	
	RestTemplate resttemplate=new RestTemplate();
	@Autowired
	RestTemplate restTemplate;
	
	// This request will pass to train microService and add a new train
	@PostMapping(value="/post")
	public void addTrain(@RequestBody Train train)
	{
		restTemplate.postForObject("http://TRAIN/train/addtrain",train, Train.class);
	}
	
	// This request will pass to train microService and fetch all train details
	@GetMapping("/allTrains")
	public Train[] gettrainbyid() 
	{ 
		Train[]  m=restTemplate.getForObject("http://TRAIN/train/allTrains/",Train[].class); 
		return m; 
	}
	
	// This request will pass to train microService and delete a train
	@DeleteMapping("/deletebyTrainName/{trainName}/{date}")
	public void deleteTrain(@PathVariable("trainName")String trainName,@PathVariable("date")@DateTimeFormat(iso =DateTimeFormat.ISO.DATE)LocalDate date) 
	{
		resttemplate.delete("http://localhost:8082/train/deletebyTrainName/"+trainName+"/"+date);
	}
	
	//This request will verify the user existing user
	@GetMapping("/validate")
	public String validateAdmin()
	{
		return "success";
	}
	
	@GetMapping("/signin")
	public String Login()
	{
		return "Welcome User";
	}
}
