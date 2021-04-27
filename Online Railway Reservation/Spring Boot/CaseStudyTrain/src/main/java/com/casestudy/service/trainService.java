package com.casestudy.service;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casestudy.exeption.EntityCreationException;
import com.casestudy.repository.trainRepo;
import com.casestudy.user.Train;
import com.casestudy.user.reservationType;



@Service
public interface trainService {

	
	

	
	
	public Train saveTrain(Train train) ;

	public List<Train> getallTrain();
	public List<Train> findTrainByTrainName(String trainName);
		
	public List<Train> findTrainByTrainNo(Long trainNo);
	
	public void deleteByTrainNo(Long trainNo);
public void deletebydate(LocalDate date);
	public List<Train> allTrainsFromSourceWithDate(String source,LocalDate date) ;
	public List<Train> allTrainsFromSourceToDestintion(String source,String destination);
	
	
	
/*public Train Book(String name,String type,Train t) {
	int index=0;
	int c=0;
for(reservationType b:t.getReservationvacancy())
{
	if(b.getType().equals(type))
	{
		deletebyid(t.getTrainno());
		c=b.getReservations();
		--c;
		b.setReservations(c);
		r.save(t);
		
	}
	return t;}
*/

/*
 * public void Book(List<Train>h,String type) {
 * 
 * int c=0; for(Train b:h) { for(reservationType a: b.getReservationvacancy()) {
 * if(a.getType().equals(type)) { deletebyid(b.getTrainno());
 * c=a.getReservations(); --c; a.setReservations(c); r.save(b);
 * 
 * } }
 * 
 * 
 * } }
 */


  public int Book(List<Train>h,String type);
  
  public int Bookwithnum(List<Train>h,String type,int seats) ;
 


	public List<Train> allTrainsFromSourceToDestintionWithDate(String source, String destination, LocalDate date);
	public List<Train> getallTrainsfromsourcewithdate(String name, LocalDate date);
	
public List<Train> allTrainsWithTrainNameAndDate(String name, LocalDate date);

	public int getReservationSeats(List<Train> t, String type) ;
	public void deleteByTrainNo(long trainno);

	public void deleteByTrainNameWithDate(String trainname, LocalDate date) ;
}
	



