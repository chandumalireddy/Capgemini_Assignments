
  package com.casestudy; 


import static  org.junit.jupiter.api.Assertions.assertEquals;
import static  org.junit.jupiter.api.Assertions.assertNotNull;

import static org.mockito.Mockito.times; 
import static org.mockito.Mockito.verify; 
import  static org.mockito.Mockito.when;
  
 import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList; 
import  java.util.List; 
  
  import org.junit.jupiter.api.BeforeAll; 
  import org.junit.jupiter.api.Test;
  import org.junit.jupiter.api.TestInstance;
  import org.junit.jupiter.api.TestInstance.Lifecycle;
  import org.mockito.Mock; 
  import org.mockito.MockitoAnnotations;


import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.casestudy.repository.trainRepo; 
import  com.casestudy.service.trainServiceImpl;
import com.casestudy.traincontroller.RsourceController;
import com.casestudy.user.StationStops;
import com.casestudy.user.Train;
  import com.casestudy.user.reservationType;
  
  
  
  
  @TestInstance(Lifecycle.PER_CLASS) public class TrainTest {
  
  
  @Mock trainRepo trainRepository;
  
  @Mock private trainServiceImpl trainService;
  @Mock private RsourceController trainController;
  
  @BeforeAll public void init() { MockitoAnnotations.initMocks(this); }
  
  
  //Testing for add Train Details
  @Test public void testaddExample() throws Exception {
  
	  reservationType reservationType1=new reservationType("1tier",2500,30);
	  reservationType reservationType2=new reservationType("2tier",2000,40);
	  reservationType reservationType3=new reservationType("3tier",1500,45);
	  List<reservationType>reservationType=new ArrayList<>();
	  List<StationStops>stops=new ArrayList<>();
	  reservationType.add(reservationType1); reservationType.add(reservationType2);
	  reservationType.add(reservationType3);
	  StationStops station1=new StationStops("nagpur");
	  StationStops station2=new StationStops("bhopal");
	  stops.add(station1);
	  stops.add(station2);
	  
	  
	  Train train =new Train(1111,"abcd","hyd","viz",LocalDate.of(2021, 10,
	  25),LocalTime.of(12, 0),LocalTime.of(12, 05),12,LocalTime.of(16, 0),reservationType,stops); 
  trainService.saveTrain(train);
  assertEquals(train.getDate(), LocalDate.of(2021,10,25));
  verify(trainService,times(1)).saveTrain(train); 
  }
  
  // Testing for all Train Details
  @Test 
  public void viewAllTrainDetails() { 
	  List<Train> trainList= new ArrayList<>();
  reservationType reservationType1=new reservationType("1tier",2500,30);
  reservationType reservationType2=new reservationType("2tier",2000,40);
  reservationType reservationType3=new reservationType("3tier",1500,45);
  List<reservationType>reservationType=new ArrayList<>();
  List<StationStops>stops=new ArrayList<>();
  reservationType.add(reservationType1); reservationType.add(reservationType2);
  reservationType.add(reservationType3);
  StationStops station1=new StationStops("nagpur");
  StationStops station2=new StationStops("bhopal");
  stops.add(station1);
  stops.add(station2);
  
  
  Train train =new Train(1111,"abcd","hyd","viz",LocalDate.of(2021, 10,
  25),LocalTime.of(12, 0),LocalTime.of(12, 05),12,LocalTime.of(16, 0),reservationType,stops); 
  trainList.add(train);
  trainService.saveTrain(train);
  when(trainService.getallTrain()).thenReturn(trainList); 
  List<Train> trainList1= trainService.getallTrain(); 
  assertEquals(1,trainList1.size());
  verify(trainService,times(1)).getallTrain(); }
  
  
  
  //Get Train Details By Train Number
  
  @Test public void viewAllTrainDetailsByTrainNo() {
	  List<Train> trainList= new ArrayList<>(); 
	  reservationType reservationType1=new reservationType("1tier",2500,30);
	  reservationType reservationType2=new reservationType("2tier",2000,40);
	  reservationType reservationType3=new reservationType("3tier",1500,45);
	  List<reservationType>reservationType=new ArrayList<>();
	  List<StationStops>stops=new ArrayList<>();
	  reservationType.add(reservationType1); reservationType.add(reservationType2);
	  reservationType.add(reservationType3);
	  StationStops station1=new StationStops("nagpur");
	  StationStops station2=new StationStops("bhopal");
	  stops.add(station1);
	  stops.add(station2);
	  
	  
	  Train train =new Train(1111,"abcd","hyd","viz",LocalDate.of(2021, 10,
	  25),LocalTime.of(12, 0),LocalTime.of(12, 05),12,LocalTime.of(16, 0),reservationType,stops); 
  trainService.saveTrain(train);
  when(trainService.findTrainByTrainNo(train.getTrainNo())).thenReturn(
  trainList); 
  List<Train> trainList1=trainService.findTrainByTrainNo(train.getTrainNo());
  Long trainNo = train.getTrainNo();
  for(Train trainDetails:trainList1) trainNo=trainDetails.getTrainNo();
  assertEquals(1111,trainNo); 
  verify(trainService,times(1)).getallTrain();
  }
  
  //Train Name
  //Get Train Details By Train Number
  
  @Test public void viewAllTrainDetailsByTrainName() {
	  List<Train> trainList= new ArrayList<>(); 
	  reservationType reservationType1=new reservationType("1tier",2500,30);
	  reservationType reservationType2=new reservationType("2tier",2000,40);
	  reservationType reservationType3=new reservationType("3tier",1500,45);
	  List<reservationType>reservationType=new ArrayList<>();
	  List<StationStops>stops=new ArrayList<>();
	  reservationType.add(reservationType1); reservationType.add(reservationType2);
	  reservationType.add(reservationType3);
	  StationStops station1=new StationStops("nagpur");
	  StationStops station2=new StationStops("bhopal");
	  stops.add(station1);
	  stops.add(station2);
	  
	  
	  Train train =new Train(1111,"abcd","hyd","viz",LocalDate.of(2021, 10,
	  25),LocalTime.of(12, 0),LocalTime.of(12, 05),12,LocalTime.of(16, 0),reservationType,stops); 
  trainService.saveTrain(train);
  when(trainService.findTrainByTrainNo(train.getTrainNo())).thenReturn(
  trainList); 
  List<Train> trainList1=trainService.findTrainByTrainName(train.getTrainName());
String name = train.getTrainName();
  for(Train trainDetails:trainList1) 
	  name=trainDetails.getTrainName();
  assertEquals("abcd",name); 
  
  }
  
  
  // Train Details Details
  @Test
  public void deleteTrain() {
	  List<Train> trainList= new ArrayList<>(); 
	  reservationType reservationType1=new reservationType("1tier",2500,30);
	  reservationType reservationType2=new reservationType("2tier",2000,40);
	  reservationType reservationType3=new reservationType("3tier",1500,45);
	  List<reservationType>reservationType=new ArrayList<>();
	  List<StationStops>stops=new ArrayList<>();
	  reservationType.add(reservationType1); reservationType.add(reservationType2);
	  reservationType.add(reservationType3);
	  StationStops station1=new StationStops("nagpur");
	  StationStops station2=new StationStops("bhopal");
	  stops.add(station1);
	  stops.add(station2);
	  
	  
	  Train train =new Train(1111,"abcd","hyd","viz",LocalDate.of(2021, 11,
	  25),LocalTime.of(12, 0),LocalTime.of(12, 05),12,LocalTime.of(16, 0),reservationType,stops); 
  trainService.saveTrain(train);
 trainService.deleteByTrainNameWithDate(train.getTrainName(), train.getDate());
 verify(trainService,times(1)).deleteByTrainNameWithDate(train.getTrainName(), train.getDate());
	assertNotNull(trainService);
  }
  
  //source to destination With Date
  @Test
  public void trainNameWithDate() {
	  List<Train> trainList= new ArrayList<>(); 
	  reservationType reservationType1=new reservationType("1tier",2500,30);
	  reservationType reservationType2=new reservationType("2tier",2000,40);
	  reservationType reservationType3=new reservationType("3tier",1500,45);
	  List<reservationType>reservationType=new ArrayList<>();
	  List<StationStops>stops=new ArrayList<>();
	  reservationType.add(reservationType1); reservationType.add(reservationType2);
	  reservationType.add(reservationType3);
	  StationStops station1=new StationStops("nagpur");
	  StationStops station2=new StationStops("bhopal");
	  stops.add(station1);
	  stops.add(station2);
	  
	  
	  Train train5 =new Train(1530,"abcde","gnt","viz",LocalDate.of(2021, 10,
	  20),LocalTime.of(12, 0),LocalTime.of(12, 05),12,LocalTime.of(16, 0),reservationType,stops); 
	
  trainService.saveTrain(train5);
 
  List<Train> trainList1= trainService.allTrainsFromSourceToDestintionWithDate("gnt", "viz", LocalDate.of(2021, 10, 20));
  for(Train trainDetails:trainList1) {
  assertEquals("abcde",trainDetails.getTrainName());
  }
  }
  //source to Destination
  @Test
  public void tsourceToDestination() {
	  List<Train> trainList= new ArrayList<>(); 
	  reservationType reservationType1=new reservationType("1tier",2500,30);
	  reservationType reservationType2=new reservationType("2tier",2000,40);
	  reservationType reservationType3=new reservationType("3tier",1500,45);
	  List<reservationType>reservationType=new ArrayList<>();
	  List<StationStops>stops=new ArrayList<>();
	  reservationType.add(reservationType1); reservationType.add(reservationType2);
	  reservationType.add(reservationType3);
	  StationStops station1=new StationStops("nagpur");
	  StationStops station2=new StationStops("bhopal");
	  stops.add(station1);
	  stops.add(station2);
	  
	  
	  Train train5 =new Train(1530,"abcde","gnt","viz",LocalDate.of(2021, 10,
	  20),LocalTime.of(12, 0),LocalTime.of(12, 05),12,LocalTime.of(16, 0),reservationType,stops); 
	
  trainService.saveTrain(train5);
 
  List<Train> trainList1= trainService.allTrainsFromSourceToDestintion("gnt", "viz");
  for(Train trainDetails:trainList1) {
  assertEquals("abcde",trainDetails.getTrainName());
  }
  }
  
  //testing controller by adding train
  @Test
  public void controlleradd() {
	  List<Train> trainList= new ArrayList<>(); 
	  reservationType reservationType1=new reservationType("1tier",2500,30);
	  reservationType reservationType2=new reservationType("2tier",2000,40);
	  reservationType reservationType3=new reservationType("3tier",1500,45);
	  List<reservationType>reservationType=new ArrayList<>();
	  List<StationStops>stops=new ArrayList<>();
	  reservationType.add(reservationType1); reservationType.add(reservationType2);
	  reservationType.add(reservationType3);
	  StationStops station1=new StationStops("nagpur");
	  StationStops station2=new StationStops("bhopal");
	  stops.add(station1);
	  stops.add(station2);
	  
	  
	  Train train5 =new Train(1531,"abcde","gnt","viz",LocalDate.of(2021, 10,
	  20),LocalTime.of(12, 0),LocalTime.of(12, 05),12,LocalTime.of(16, 0),reservationType,stops); 
	
	  RestTemplate restTemplate=new RestTemplate();
	  ResponseEntity<Train> postResponse = restTemplate.postForEntity("http://localhost:8082/train/addtrain" , train5, Train.class);
		assertNotNull(postResponse);
		assertNotNull(postResponse.getBody());

}
  //deleting train fron controller
  
  @Test
  public void deelte() {
	  List<Train> trainList= new ArrayList<>(); 
	  reservationType reservationType1=new reservationType("1tier",2500,30);
	  reservationType reservationType2=new reservationType("2tier",2000,40);
	  reservationType reservationType3=new reservationType("3tier",1500,45);
	  List<reservationType>reservationType=new ArrayList<>();
	  List<StationStops>stops=new ArrayList<>();
	  reservationType.add(reservationType1); reservationType.add(reservationType2);
	  reservationType.add(reservationType3);
	  StationStops station1=new StationStops("nagpur");
	  StationStops station2=new StationStops("bhopal");
	  stops.add(station1);
	  stops.add(station2);
	  
	  
	  Train train5 =new Train(1533,"abcde","gnt","viz",LocalDate.of(2021, 10,
	  20),LocalTime.of(12, 0),LocalTime.of(12, 05),12,LocalTime.of(16, 0),reservationType,stops); 
	
	  RestTemplate restTemplate=new RestTemplate();
	restTemplate.delete("http://localhost:8082/train/deletebyTrainName"+"/"+train5.getTrainName()+"/"+train5.getDate());

}
  //Get Reservation Vacancy
  @Test
  public void reservationVacancy() {
	  List<Train> trainList= new ArrayList<>(); 
	  reservationType reservationType1=new reservationType("1tier",2500,30);
	  reservationType reservationType2=new reservationType("2tier",2000,40);
	  reservationType reservationType3=new reservationType("3tier",1500,45);
	  List<reservationType>reservationType=new ArrayList<>();
	  List<StationStops>stops=new ArrayList<>();
	  reservationType.add(reservationType1); reservationType.add(reservationType2);
	  reservationType.add(reservationType3);
	  StationStops station1=new StationStops("nagpur");
	  StationStops station2=new StationStops("bhopal");
	  stops.add(station1);
	  stops.add(station2);
	  
	  
	  Train train5 =new Train(1530,"abcde","gnt","viz",LocalDate.of(2021, 10,
	  20),LocalTime.of(12, 0),LocalTime.of(12, 05),12,LocalTime.of(16, 0),reservationType,stops); 
	
  trainService.saveTrain(train5);
 trainList.add(train5);

  trainService.getReservationSeats(trainList, "1tier");
 
  assertEquals(30,reservationType1.getFare());
  
  }
  
  @Test
  public void reservation() {
	  List<Train> trainList= new ArrayList<>(); 
	  reservationType reservationType1=new reservationType("1tier",2500,30);
	  reservationType reservationType2=new reservationType("2tier",2000,40);
	  reservationType reservationType3=new reservationType("3tier",1500,45);
	  List<reservationType>reservationType=new ArrayList<>();
	  List<StationStops>stops=new ArrayList<>();
	  reservationType.add(reservationType1); reservationType.add(reservationType2);
	  reservationType.add(reservationType3);
	  StationStops station1=new StationStops("nagpur");
	  StationStops station2=new StationStops("bhopal");
	  stops.add(station1);
	  stops.add(station2);
	  
	  
	  Train train5 =new Train(1530,"abcde","gnt","viz",LocalDate.of(2021, 10,
	  20),LocalTime.of(12, 0),LocalTime.of(12, 05),12,LocalTime.of(16, 0),reservationType,stops); 
	
  trainService.saveTrain(train5);
 trainList.add(train5);

  trainService.getReservationSeats(trainList, "2tier");
 
  assertEquals(40,reservationType2.getFare());
  
  }
  
  @Test
  public void bookTicket() {
	  List<Train> trainList= new ArrayList<>(); 
	  reservationType reservationType1=new reservationType("1tier",2500,30);
	  reservationType reservationType2=new reservationType("2tier",2000,40);
	  reservationType reservationType3=new reservationType("3tier",1500,45);
	  List<reservationType>reservationType=new ArrayList<>();
	  List<StationStops>stops=new ArrayList<>();
	  reservationType.add(reservationType1); reservationType.add(reservationType2);
	  reservationType.add(reservationType3);
	  StationStops station1=new StationStops("nagpur");
	  StationStops station2=new StationStops("bhopal");
	  stops.add(station1);
	  stops.add(station2);
	  
	  
	  Train train5 =new Train(1530,"abcde","gnt","viz",LocalDate.of(2021, 10,
	  20),LocalTime.of(12, 0),LocalTime.of(12, 05),12,LocalTime.of(16, 0),reservationType,stops); 
	
  trainService.saveTrain(train5);
 trainList.add(train5);

 int a= trainService.Bookwithnum(trainList, "1tier", 5);
 
  assertEquals(30,reservationType1.getFare());
  
  }
  
  @Test
  public void cancel() {
	  List<Train> trainList= new ArrayList<>(); 
	  reservationType reservationType1=new reservationType("1tier",2500,30);
	  reservationType reservationType2=new reservationType("2tier",2000,40);
	  reservationType reservationType3=new reservationType("3tier",1500,45);
	  List<reservationType>reservationType=new ArrayList<>();
	  List<StationStops>stops=new ArrayList<>();
	  reservationType.add(reservationType1); reservationType.add(reservationType2);
	  reservationType.add(reservationType3);
	  StationStops station1=new StationStops("nagpur");
	  StationStops station2=new StationStops("bhopal");
	  stops.add(station1);
	  stops.add(station2);
	  
	  
	  Train train5 =new Train(1530,"abcde","gnt","viz",LocalDate.of(2021, 10,
	  20),LocalTime.of(12, 0),LocalTime.of(12, 05),12,LocalTime.of(16, 0),reservationType,stops); 
	
  trainService.saveTrain(train5);
 trainList.add(train5);

 int a= trainService.cancelWithNum(trainList, "1tier", 5);
 
 assertEquals(30,reservationType1.getFare());
}

  
  }
  
  
  
  
  /*
  @Autowired
  private TestRestTemplate restTemplate;
  @Test
  public void addTest() throws Exception {
  
  reservationType reservationType1=new reservationType("1tier",2500,30);
  reservationType reservationType2=new reservationType("2tier",2000,40);
  reservationType reservationType3=new reservationType("3tier",1500,45);
  List<reservationType>reservationType=new ArrayList<>();
  List<StationStops>stops=new ArrayList<>();
  reservationType.add(reservationType1); reservationType.add(reservationType2);
  reservationType.add(reservationType3); StationStops station1=new
  StationStops("nagpur"); StationStops station2=new StationStops("bhopal");
  stops.add(station1); stops.add(station2);
  
  
  Train train =new Train(1111,"abcd","hyd","viz",LocalDate.of(2021, 10,25),LocalTime.of(12, 0),LocalTime.of(12, 05),12,LocalTime.of(16,0),reservationType,stops); 


 ResponseEntity<Train> train1 = restTemplate.postForEntity("http://localhost:8082/train/addtrain",train, Train.class);
assertNull(train1);

  }*/
  
  
 