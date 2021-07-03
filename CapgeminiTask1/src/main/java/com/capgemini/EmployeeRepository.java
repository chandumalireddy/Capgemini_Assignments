package com.capgemini;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepository extends MongoRepository<EmployeeModel,Integer>{
	
	EmployeeModel findById(int id);
	List<EmployeeModel> findByempName(String name);
	List<EmployeeModel> findBydepartment(String department);
}