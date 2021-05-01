package com.casestudy.traincontroller;

import java.time.LocalDate;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
	
	/**********
	 * Method:                                                addTrain
     *Description:                                            It is used to save Train details into Train collection
     * @param Train:                                   		  train reference data
	 * @returns Train                               		 It returns added train with details
	 **********/
	@PostMapping("/addtrain")
	public Train addTrain(@Valid @RequestBody Train train) 
	{
		return trainService.saveTrain(train);
	}
	
	/**********
	 * Method:                                                trainDetailsByTrainName
     *Description:                                            It is used to find a particular train information 
     * @param Train:                                   		  name of the train
	 * @returns Train                               		 It returns a single train with details
	 **********/
	@GetMapping("/{trainName}")
	public List<Train> trainDetailsByTrainName(@PathVariable("trainName")String trainName)
	{
		return trainService.findTrainByTrainName(trainName);
	}
	
	
	/**********
	 * Method:                                                findDetailsByTrainNo
     *Description:                                            It is used to find a particular train information 
     * @param Train:                                   		  number of the train
	 * @returns Train                               		 It returns a single train with details
	 **********/
	@HystrixCommand(fallbackMethod = "fallbackhello")
	@GetMapping("/trainNo/{trainNo}")
	public List<Train> trainDetailsByTrainNo(@Valid  @PathVariable("trainNo") long trainNo)
	{
			  return trainService.findTrainByTrainNo(trainNo);		
	}
	private List<Train> fallbackhello(long trainNo) {	
		List<Train>train=new ArrayList<>();
		reservationType resrvation=new reservationType("1ac",20,2500);
		List<reservationType>trainReservation=new ArrayList<>();
		List<StationStops>trainStops=new ArrayList<>();
		trainReservation.add(resrvation);
		StationStops stops=new StationStops("nagpur");
		trainStops.add(stops);
		long a=124;
		Train trainDetails=new Train(a,"abcd express","viz","del",LocalDate.of(2021, 05, 20),LocalTime.of(12, 00, 00),LocalTime.of(12, 15, 00),12,LocalTime.of(18, 00,00),trainReservation,trainStops);
	train.add(trainDetails);
		return train;
	}

	/**********
	 * Method:                                                allTrainDetails
     *Description:                                            It is used to fetch Train details from Train collection
	 * @returns Train                               		 It returns all trains with details
	 **********/
	@GetMapping("/allTrains")
	public List<Train> allTrainDetails()
	{
		return trainService.getallTrain();
	}
	
	/**********
	 * Method:                                               allTrainDetailsFromSource
     *Description:                                            It is used to find a list of train informations
     * @param Train:                                   		  source and date of the train
	 * @returns Train                               		 It returns List of  trains with details
	 **********/
	@GetMapping("/getStationTimeTable/{source}/{date}")
	public List<Train> allTrainDetailsFromSource(@PathVariable("source")String source,@PathVariable("date")  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)LocalDate date)
	{
		return trainService.allTrainsFromSourceWithDate(source,date);
	}
	
	
	
	/**********
	 * Method:                                               allTrainDetailsFromSourceToDestination
     *Description:                                            It is used to find a list of train informations
     * @param Train:                                   		  source and destination of the train
	 * @returns Train                               		 It returns List of  trains with details
	 **********/
	@GetMapping("/getTrainRoute/{source}/{destination}")
	public List<Train> allTrainDetailsFromSourceToDestination(@PathVariable("source")String source,@PathVariable("destination")String destination)
	{
		return trainService.allTrainsFromSourceToDestintion(source, destination);
	}
	
	
	/**********
	 * Method:                                             allTrainDetailsFromsourceToDestinationWithdate
   *Description:                                           it will fetch list of  trains available for particular source to destination on particular date
   * @param Train:                                   		 source , destination and date of train
	 * @returns Train                               		 it will return list of trains
	 **********/
	
	@GetMapping("/getTrainRouteWithDate/{source}/{destination}/{date}")
	public List<Train> allTrainDetailsFromsourceToDestinationWithdate(@PathVariable("source")String source,@PathVariable("destination")String destination,@PathVariable("date")  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)LocalDate date)
	{
		return trainService. allTrainsFromSourceToDestintionWithDate(source, destination,date);
	}

	  /**********
	 * Method:                                             allTraindetailsWithTrainNameAndDate
	   *Description:                                           it will fetch list of  trains available for particular trainName on particular date
	   * @param Train:                                   		 trainName  and date of train
		 * @returns Train                               		 it will return list of trains
		 **********/
	  @GetMapping("/getTrainNameWithDate/{name}/{date}") 
	  public List<Train> allTraindetailsWithTrainNameAndDate(@PathVariable("name")String name,@PathVariable("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)LocalDate date) 
	  {
		  return  trainService.allTrainsWithTrainNameAndDate(name, date);
	  }
	  
		/**********
		 * Method:                                             getTrainReservationVacanvy
	     *Description:                                           it will fetch particular train reservations seats . 
	     * @param Train:                                   		  List of trains , type of reservation and number of seats
		 * @returns Train                               		 it will return number of reservation vacancy for particular train
		 **********/
	  @GetMapping("/getSeats/{trainName}/{date}/{reservationType}") 
	  public int getTrainReservationVacanvy(@PathVariable("trainName")String trainName,@PathVariable("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)LocalDate date,@PathVariable("reservationType")String type) 
	  {
		  List<Train>  train= trainService.getallTrainsfromsourcewithdate(trainName, date);
		  return  trainService.getReservationSeats(train,type);
	  
	  }
	  
	  
	  
	  
	  @PutMapping("/book/{name}/{date}/{type}") 
	  public int  book(@PathVariable("name")String name,@PathVariable("type")String  type,@PathVariable("date")@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)LocalDate date) 
	  { 
		  List<Train>  train= trainService.getallTrainsfromsourcewithdate(name, date);
		  return trainService.Book(train ,type);
	  
	  
	  
	  }
	  
	  /**********
		 * Method:                                              bookWithNumber
	   *Description:                                           it will fetch particular train reservations seats and decrease the seats . This operation is done from booking microService
	   * @param Train:                                   		  List of trains , type of reservation and number of seats
		 * @returns Train                               		 it will return number of reservation vacancy for particular train
		 **********/
	  @PutMapping("/book/{name}/{date}/{type}/{seats}") 
	  public int  bookWithNumber(@PathVariable("name")String name,@PathVariable("type")String  type,@PathVariable("date")@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)LocalDate date,@PathVariable("seats") int seats) 
	  { 
		  List<Train>  train= trainService.allTrainsWithTrainNameAndDate(name, date);
		 return  trainService.Bookwithnum(train ,type,seats);
	  }
	  
	  /**********
		 * Method:                                              cancelTickets
	   *Description:                                           it will fetch particular train reservations seats and increase the seats . This operation is done from booking microService
	   * @param Train:                                   		  List of trains , type of reservation and number of seats
		 * @returns Train                               		 it will return number of reservation vacancy for particular train
		 **********/
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
	 
	
	  /**********
		 * Method:                                                updateTrain
	     *Description:                                            It is used to update Train details into Train collection
	     * @param Train:                                    FlatBooking's reference variable.
		 * @returns                                    It returns updated details of the existed TrainDetails.
	           
		 **********/  
	  @PutMapping("/update")
	  public void updateTrain(@RequestBody Train train) { 
		  trainService.updateTrain(train.getTrainName(), train.getDate(),train);  
	  }
			
		
	  
		/**********
		 * Method:                                                deleteTrainNameWithDate
	     *Description:                                            It is used to delete Train details from Train collection
	     * @param Train:                                    trainName and date variables from train entity
		
		 **********/
		  @DeleteMapping("/deletebyTrainName/{trainName}/{date}") 
		  public void deleteTrainNameWithDate(@PathVariable("trainName")String trainname,@PathVariable("date")@DateTimeFormat(iso =DateTimeFormat.ISO.DATE)LocalDate date)
		  {
		  trainService.deleteByTrainNameWithDate(trainname,date);
		  }
		  
		/*
		 * @DeleteMapping("/deletebySourceToDestination/{source}/{destination}") public
		 * void deletebBySourceToDestination(@PathVariable("source")String
		 * source,@PathVariable("destination")String destination) {
		 * trainService.deletebBySourceToDestination(source,destination); }
		 */
	 
	
}
