package com.casestudy;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface bookRepo extends MongoRepository<booking,String> {

	void deleteBypnr(String name);
	List<booking> findByusername(String name);
	booking findBypnr(String pnr);
	
}
