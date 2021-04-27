package com.casestudy.user.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.casestudy.exeption.EmptyEntityListException;
import com.casestudy.exeption.EntityCreationException;
import com.casestudy.exeption.EntityDeletionException;
import com.casestudy.exeption.EntityNotFoundException;
import com.casestudy.exeption.EntityUpdationException;
import com.casestudy.user.exception.secuirtyException;


@RestControllerAdvice
public class controllerAdvice {

	@ExceptionHandler(EntityCreationException.class)
	public ResponseEntity<String> entityCreation(Exception e) {
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
	}

	
	@ExceptionHandler(EntityDeletionException.class)
	public ResponseEntity<String> entityDeletion(Exception e) {
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
	}

	
	@ExceptionHandler(EntityNotFoundException.class)
	public ResponseEntity<String> entityNotFound(Exception e) {
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
	}

	
	@ExceptionHandler(EmptyEntityListException.class)
	public ResponseEntity<String> emptyEntityList(Exception e) {
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
	}

	
	@ExceptionHandler(EntityUpdationException.class)
	public ResponseEntity<String> entityUpdation(Exception e) {
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
	}
	
}