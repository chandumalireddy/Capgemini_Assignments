package com.casestudy.service;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casestudy.exeption.EmptyEntityListException;
import com.casestudy.exeption.EntityCreationException;
import com.casestudy.exeption.EntityDeletionException;
import com.casestudy.repository.trainRepo;
import com.casestudy.user.Train;
import com.casestudy.user.reservationType;


@Service
public class trainServiceImpl implements trainService{

	@Autowired
	trainRepo repository;
	
	
	public Train saveTrain(Train train) 
	{
		try {
			if (repository.existsByDate(train.getDate())  && repository.existsByTrainNo(train.getTrainNo())) {
			throw new EntityCreationException("Train details on this date is  already Exists");
			} else {
				return repository.save(train);
			}
		} catch (Exception exception) {
			throw new EntityCreationException(exception.getMessage());
		}
	}

	public List<Train> getallTrain(){
		List<Train> train=new ArrayList<>();
		repository.findAll()
		.forEach(train::add);
		return train;
	
	}
	public List<Train> findTrainByTrainName(String trainName) {
		List<Train> train;			
		train=repository.findByTrainName(trainName);
	return train;
		
	}
public List<Train> findTrainByTrainNo(Long trainNo) {
		
		
	List<Train> train;
	try {
		 train=repository.findByTrainNo(trainNo);
		if (train.isEmpty()) {
			throw new EmptyEntityListException("No Train details Found to delete");
		} else
			return train;
	} catch (Exception exception) {
		throw new EmptyEntityListException(exception.getMessage());
	}
	
		
	}
	
	public void deleteByTrainNo(Long trainNo) {
		
		repository.deleteByTrainNo(trainNo);
	}
public void deletebydate(LocalDate date) {
		
	repository.deleteByDate(date);
	}


	public List<Train> allTrainsFromSourceWithDate(String source,LocalDate date) {
		List<Train> train;
		List<Train> trainDetails=new ArrayList<>();
		try {
			 train=repository.findBySource(source);
			 for(Train trainSource:train)
			 {
				 if(trainSource.getDate().equals(date))
					 trainDetails.add(trainSource);
			 }
			if (trainDetails.isEmpty()) {
				throw new EmptyEntityListException("No Train details Found ");
			} else
				return trainDetails;
		} catch (Exception exception) {
			throw new EmptyEntityListException(exception.getMessage());
		}
		
		
	}
	
	public List<Train> allTrainsFromSourceToDestintion(String source,String destination) {
		
		List<Train> train;
		try {
			 train=repository.findBySource(source);
			 List<Train> trainDetails=new ArrayList<>();
			 for(Train trainSource:train)
				{
					if(trainSource.getDestination().equals(destination))
					{
						trainDetails.add(trainSource);
					}
				}
			if (trainDetails.isEmpty()) {
				throw new EmptyEntityListException("No Train details Found in this route");
			} else
				return train;
		} catch (Exception exception) {
			throw new EmptyEntityListException(exception.getMessage());
		}
		
	}
	
	
	
	
	
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


  public int Book(List<Train>h,String type) {
  
  int c=0; for(Train b:h) { for(reservationType a: b.getReservationVacancy()) {
  if(a.getType().equals(type)) { deletebydate(b.getDate());
  c=a.getReservations(); --c; a.setReservations(c); repository.save(b);
  
  
  } } }return c;}
  
  public int Bookwithnum(List<Train>h,String type,int seats) {
	  
  int c=0; 
  for(Train b:h) 
  {
	  for(reservationType a: b.getReservationVacancy())
	  {
  if(a.getType().equals(type)) {
	  deletebydate(b.getDate());
  c=a.getReservations();
  c=c-seats;
  a.setReservations(c);
  repository.save(b);
  } } }
return c;}
  
  public int cancelWithNum(List<Train>h,String type,int seats) {
	  
  int c=0; 
  for(Train b:h) 
  {
	  for(reservationType a: b.getReservationVacancy())
	  {
  if(a.getType().equals(type)) {
	  deletebydate(b.getDate());
  c=a.getReservations();
  c=c+seats;
  a.setReservations(c);
  repository.save(b);
  } } }
return c;}
  
 


	public List<Train>  allTrainsFromSourceToDestintionWithDate(String source, String destination, LocalDate date) {
		
		List<Train> train=new ArrayList<>();
		repository.findBySource(source)
		.forEach(train::add);
		List<Train> trainDetails=new ArrayList<>();
		
		for(Train trainSource:train)
		{
			if(trainSource.getDestination().equals(destination) && trainSource.getDate().equals(date))
			{
				trainDetails.add(trainSource);
			}
		}
		
		
		return trainDetails;
	}
	
	public List<Train> getallTrainsfromsourcewithdate(String name, LocalDate date) {
		
		
		List<Train> train=new ArrayList<>();
		repository.findByTrainName(name)
		.forEach(train::add);
		List<Train> trainDetails=new ArrayList<>();
		
		for(Train trainName:train)
		{
			if(trainName.getDate().equals(date))
			{
				trainDetails.add(trainName);
			}
		}
		
return  trainDetails;
	}
	
public List<Train> allTrainsWithTrainNameAndDate(String name, LocalDate date) {
	
	List<Train> train=new ArrayList<>();
	List<Train>trainDetails=new ArrayList<>();
	repository.findByTrainName(name)
	.forEach(train::add);
	for(Train trainName:train)
	{
		if(trainName.getDate().equals(date))
		{
			trainDetails.add(trainName);
		}
		
	}
	return trainDetails;
}

	public int getReservationSeats(List<Train> train, String type) {
		
		int c=0; for(Train trainDetails:train)
		{ for(reservationType reservationType: trainDetails.getReservationVacancy()) {
			  if(reservationType.getType().equals(type)) { 
			  c=reservationType.getReservations(); 	  
			  
			  } } }return c;}

	public void deleteByTrainNo(long trainNo) {
		try {

			List<Train> deleteTrain = repository.findByTrainNo(trainNo);
			if (deleteTrain.isEmpty()) {
				throw new EntityDeletionException("No Train details Found to delete ");
			}
			else 
				repository.deleteByTrainNo(trainNo);
		} catch (Exception exception) {
			throw new EntityDeletionException(exception.getMessage());
		}

	}
		
	public void deleteByTrainNameWithDate(String trainName, LocalDate date) {
		
		List<Train> trainDetails=new ArrayList<>();
		repository.findByTrainName(trainName)
		.forEach(trainDetails::add);
		
		for(Train trainDate:trainDetails)
		{
			if(trainDate.getDate().equals(date))
			{
				repository.deleteByDate(date);
			}
		}
	}
}
	



