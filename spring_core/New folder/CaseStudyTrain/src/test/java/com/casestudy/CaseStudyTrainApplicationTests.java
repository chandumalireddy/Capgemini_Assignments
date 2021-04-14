/*
 * package com.casestudy;
 * 
 * import static org.junit.jupiter.api.Assertions.assertEquals; import static
 * org.mockito.Mockito.times; import static org.mockito.Mockito.verify;
 * 
 * import java.time.LocalDate; import java.util.ArrayList; import
 * java.util.List;
 * 
 * import org.junit.jupiter.api.BeforeAll; import org.junit.jupiter.api.Test;
 * import org.mockito.Mock; import org.mockito.MockitoAnnotations; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.context.SpringBootTest;
 * 
 * import com.casestudy.exeption.EmptyEntityListException; import
 * com.casestudy.service.trainService; import
 * com.casestudy.service.trainServiceImpl; import com.casestudy.user.Train;
 * import com.casestudy.user.reservationType;
 * 
 * @SpringBootTest class CaseStudyTrainApplicationTests {
 * 
 * @Autowired public trainServiceImpl trainService;
 * 
 * 
 * 
 * 
 * @Test public void addTest() {
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
 * 
 * }
 * 
 * @Test public void deleteTest() throws EmptyEntityListException{
 * 
 * 
 * long a=1111; try { trainService.deleteByTrainNo(a); } catch(Exception e) {
 * 
 * assertEquals(e, "No Train details Found to delete"); } }
 * 
 * @Test public void get() {
 * 
 * 
 * reservationType reservationType1=new reservationType("1tier",2500,30);
 * reservationType reservationType2=new reservationType("2tier",2000,40);
 * reservationType reservationType3=new reservationType("3tier",1500,45);
 * List<reservationType>reservationType=new ArrayList<>();
 * reservationType.add(reservationType1); reservationType.add(reservationType2);
 * reservationType.add(reservationType3);
 * 
 * Train train =new Train(1112,"abcd","hyd","viz",LocalDate.of(2021, 9,
 * 29),"12:00","8:00",reservationType); long a=1112;
 * trainService.saveTrain(train); List<Train>
 * train2=trainService.findTrainByTrainNo(a); for(Train train3:train2) {
 * assertEquals(train3.getDate(),train.getDate());
 * trainService.deleteByTrainNo(1112); }
 * 
 * }
 * 
 * @Test public void getByTrainNo() {
 * 
 * 
 * reservationType reservationType1=new reservationType("1tier",2500,30);
 * reservationType reservationType2=new reservationType("2tier",2000,40);
 * reservationType reservationType3=new reservationType("3tier",1500,45);
 * List<reservationType>reservationType=new ArrayList<>();
 * reservationType.add(reservationType1); reservationType.add(reservationType2);
 * reservationType.add(reservationType3);
 * 
 * Train train =new Train(1112,"abcd","hyd","viz",LocalDate.of(2021, 9,
 * 29),"12:00","8:00",reservationType); long a=1112;
 * trainService.saveTrain(train); List<Train>
 * train2=trainService.findTrainByTrainNo(a); for(Train train3:train2) {
 * assertEquals(train3.getTrainNo(),train.getTrainNo());
 * trainService.deleteByTrainNo(1112); }
 * 
 * }
 * 
 * 
 * }
 * 
 */