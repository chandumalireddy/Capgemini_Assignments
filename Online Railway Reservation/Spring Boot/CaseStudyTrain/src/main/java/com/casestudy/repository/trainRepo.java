package com.casestudy.repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.casestudy.user.Train;

public interface trainRepo extends MongoRepository<Train,Long>{

	List<Train> findByTrainName(String name);
	
	List<Train> findByTrainNo(Long trainno);
	
	Train findByTrainName(String name,LocalDate date);
	Train findByDate(LocalDate date);
	void deleteByTrainNo(Long id);
	void deleteByDate(LocalDate date);

	/* void deleteByTraindate(String date); */
	List<Train> findBySource(String source);
	List<Train> findByDestination(String destination);

	void deleteByTrainName(String trainname);

	void deleteBySource(String source);



	boolean existsByDate(LocalDate date);
	boolean existsByTrainNo(Long traino);
	
	

}
