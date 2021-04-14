/*
 * package com.casestudy; import static
 * org.junit.jupiter.api.Assertions.assertEquals; import static
 * org.junit.jupiter.api.Assertions.assertNotNull; import static
 * org.mockito.Mockito.times; import static org.mockito.Mockito.verify; import
 * static org.mockito.Mockito.when;
 * 
 * import java.time.LocalDate; import java.util.ArrayList; import
 * java.util.List; import java.util.Optional;
 * 
 * import org.junit.jupiter.api.BeforeAll; import org.junit.jupiter.api.Test;
 * import org.junit.jupiter.api.TestInstance; import
 * org.junit.jupiter.api.TestInstance.Lifecycle; import org.mockito.Mock; import
 * org.mockito.MockitoAnnotations; import
 * org.springframework.boot.test.context.SpringBootTest;
 * 
 * import com.casestudy.repository.trainRepo; import
 * com.casestudy.service.trainServiceImpl;import com.casestudy.user.Train;
 * import com.casestudy.user.reservationType;
 * 
 * 
 * 
 * 
 * @TestInstance(Lifecycle.PER_CLASS) public class TrainTest {
 * 
 * 
 * @Mock trainRepo trainRepository;
 * 
 * @Mock private trainServiceImpl trainService;
 * 
 * @BeforeAll public void init() { MockitoAnnotations.initMocks(this); }
 * 
 * @Test public void testaddExample() throws Exception {
 * 
 * reservationType reservationType1=new reservationType("1tier",2500,30);
 * reservationType reservationType2=new reservationType("2tier",2000,40);
 * reservationType reservationType3=new reservationType("3tier",1500,45);
 * List<reservationType>reservationType=new ArrayList<>();
 * reservationType.add(reservationType1); reservationType.add(reservationType2);
 * reservationType.add(reservationType3);
 * 
 * Train train =new Train(1111,"abcd","hyd","viz",LocalDate.of(2021, 10,
 * 25),"12:00","8:00",reservationType); trainService.saveTrain(train);
 * assertEquals(train.getDate(), LocalDate.of(2021,10,25));
 * verify(trainService,times(1)).saveTrain(train); }
 * 
 * @Test public void viewAllTrainDetails() { List<Train> trainList= new
 * ArrayList<>(); reservationType reservationType1=new
 * reservationType("1tier",2500,30); reservationType reservationType2=new
 * reservationType("2tier",2000,40); reservationType reservationType3=new
 * reservationType("3tier",1500,45); List<reservationType>reservationType=new
 * ArrayList<>(); reservationType.add(reservationType1);
 * reservationType.add(reservationType2); reservationType.add(reservationType3);
 * 
 * Train train =new Train(1111,"abcd","hyd","viz",LocalDate.of(2021, 10,
 * 25),"12:00","8:00",reservationType); trainList.add(train);
 * trainService.saveTrain(train);
 * when(trainService.getallTrain()).thenReturn(trainList); List<Train>
 * trainList1= trainService.getallTrain(); assertEquals(1,trainList1.size());
 * verify(trainService,times(1)).getallTrain(); }
 * 
 * @Test public void viewAllTrainDetailsByTrainNo() { List<Train> trainList= new
 * ArrayList<>(); reservationType reservationType1=new
 * reservationType("1tier",2500,30); reservationType reservationType2=new
 * reservationType("2tier",2000,40); reservationType reservationType3=new
 * reservationType("3tier",1500,45); List<reservationType>reservationType=new
 * ArrayList<>(); reservationType.add(reservationType1);
 * reservationType.add(reservationType2); reservationType.add(reservationType3);
 * 
 * Train train =new Train(1111,"abcd","hyd","viz",LocalDate.of(2021, 10,
 * 25),"12:00","8:00",reservationType); trainList.add(train);
 * trainService.saveTrain(train);
 * when(trainService.findTrainByTrainNo(train.getTrainNo())).thenReturn(
 * trainList); List<Train> trainList1=
 * trainService.findTrainByTrainNo(train.getTrainNo()); Long trainNo = null;
 * for(Train trainDetails:trainList1) trainNo=trainDetails.getTrainNo();
 * assertEquals(1111,trainNo); verify(trainService,times(1)).getallTrain(); }
 * 
 * 
 * }
 */