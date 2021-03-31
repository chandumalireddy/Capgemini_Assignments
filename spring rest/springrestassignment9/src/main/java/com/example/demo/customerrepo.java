package com.example.demo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface customerrepo  extends CrudRepository<customer, String> {

	void deleteById(int id);

	Optional<customer> findById(int id);

}
