package com.casestudy.traincontroller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.exeption.EmptyEntityListException;
import com.casestudy.exeption.EntityCreationException;
import com.casestudy.exeption.EntityIdException;
import com.casestudy.service.trainServiceImpl;
import com.casestudy.user.StationStops;
import com.casestudy.user.Train;
import com.casestudy.user.reservationType;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import io.swagger.annotations.Api;



@RestController
@Api(value = "Swagger2DemoRestController")
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/train")
public class RsourceController  {

	
	 
	@Autowired
	private trainServiceImpl trainService;		
	
	@PostMapping("/addtrain")
	public Train addTrain(@Valid @RequestBody Train train) 
	{
		return trainService.saveTrain(train);
		
		
	}
	@GetMapping("/{trainName}")
	public List<Train> trainDetailsByTrainName(@PathVariable("trainName")String trainName)
	{
		

		return trainService.findTrainByTrainName(trainName);
	}
	@HystrixCommand(fallbackMethod = "fallbackhello")
	@GetMapping("/trainNo/{trainNo}")
	public List<Train> trainDetailsByTrainNo(@Valid  @PathVariable("trainNo") long trainNo)
	{
			  return trainService.findTrainByTrainNo(trainNo);		
	}
	private List<Train> fallbackhello(long trainNo) {
		
		List<Train>train=new ArrayList<>();
		reservationType resrvation=new reservationType("1ac",20,2500);
		List<reservationType>trainreservation=new ArrayList<>();
		List<StationStops>trainStops=new ArrayList<>();
		trainreservation.add(resrvation);
		StationStops stops=new StationStops("nagpur");
		trainStops.add(stops);
		long a=124;
		Train trainDetails=new Train(a,"abcd express","viz","del",LocalDate.of(2021, 05, 20),LocalTime.of(12, 00, 00),LocalTime.of(12, 15, 00),trainreservation,trainStops);
	train.add(trainDetails);
		return train;
	}

	@GetMapping("/allTrains")
	public List<Train> allTrainDetails()
	{
		return trainService.getallTrain();
	}
	@GetMapping("/getStationTimeTable/{source}/{date}")
	public List<Train> allTrainDetailsFromSource(@PathVariable("source")String source,@PathVariable("date")  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)LocalDate date)
	{
		return trainService.allTrainsFromSourceWithDate(source,date);
	}
	@GetMapping("/getTrainRoute/{source}/{destination}")
	public List<Train> allTrainDetailsFromSourceToDestination(@PathVariable("source")String source,@PathVariable("destination")String destination)
	{
		return trainService.allTrainsFromSourceToDestintion(source, destination);
	}
	
	@GetMapping("/getTrainRouteWithDate/{source}/{destination}/{date}")
	public List<Train> allTrainDetailsFromsourceToDestinationWithdate(@PathVariable("source")String source,@PathVariable("destination")String destination,@PathVariable("date")  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)LocalDate date)
	{
		return trainService. allTrainsFromSourceToDestintionWithDate(source, destination,date);
	}

	
	  @GetMapping("/getTrainNameWithDate/{name}/{date}") 
	  public List<Train> allTraindetailsWithTrainNameAndDate(@PathVariable("name")String
	  name,@PathVariable("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)LocalDate date) {
		
		  return  trainService.allTrainsWithTrainNameAndDate(name, date);
	  
	  }
	  
	  
	  @GetMapping("/getSeats/{trainName}/{date}/{reservationType}") 
	  public int getTrainReservationVacanvy(@PathVariable("trainName")String
	  trainName,@PathVariable("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)LocalDate date,@PathVariable("reservationType")String type) {
		  List<Train>  train= trainService.getallTrainsfromsourcewithdate(trainName, date);
		  return  trainService.getReservationSeats(train,type);
	  
	  }
	  
	  
	  
	  
	  @PutMapping("/book/{name}/{date}/{type}") 
	  public int  book(@PathVariable("name")String name,@PathVariable("type")String  type,@PathVariable("date")@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)LocalDate date) 
	  { 
		  List<Train>  train= trainService.getallTrainsfromsourcewithdate(name, date);
		  return trainService.Book(train ,type);
	  
	  
	  
	  }
	  @PutMapping("/book/{name}/{date}/{type}/{seats}") 
	  public int  bookWithNumber(@PathVariable("name")String name,@PathVariable("type")String  type,@PathVariable("date")@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)LocalDate date,@PathVariable("seats") int seats) 
	  { 
		  List<Train>  train= trainService.allTrainsWithTrainNameAndDate(name, date);
		 return  trainService.Bookwithnum(train ,type,seats);
	  
	  
	  
	  }
	  @PutMapping("/cancel/{name}/{date}/{type}/{seats}") 
	  public int cancelTickets(@PathVariable("name")String name,@PathVariable("type")String  type,@PathVariable("date")@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)LocalDate date,@PathVariable("seats") int seats) 
	  { 
		  List<Train>  train= trainService.allTrainsWithTrainNameAndDate(name, date);
		 return  trainService.cancelWithNum(train ,type,seats);
	  
	  
	  
	  }  
	 
		/*
		 * @DeleteMapping("/deleteByTrainNo/{trainNo}") public void
		 * deletebytrainno(@PathVariable("trainNo")long trainNo) {
		 * trainService.deletebytrainno(trainNo); }
		 */
	 
		
		  @DeleteMapping("/deletebyTrainName/{trainName}/{date}") public void
		  deleteTrainNameWithDate(@PathVariable("trainName")String
		  trainname,@PathVariable("date")@DateTimeFormat(iso =
		  DateTimeFormat.ISO.DATE)LocalDate date) {
		  trainService.deleteByTrainNameWithDate(trainname,date); }
		  
		/*
		 * @DeleteMapping("/deletebySourceToDestination/{source}/{destination}") public
		 * void deletebBySourceToDestination(@PathVariable("source")String
		 * source,@PathVariable("destination")String destination) {
		 * trainService.deletebBySourceToDestination(source,destination); }
		 */
	 
	
}
