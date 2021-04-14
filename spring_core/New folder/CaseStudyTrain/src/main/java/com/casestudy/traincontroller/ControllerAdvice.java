package com.casestudy.traincontroller;
import java.net.http.HttpHeaders;
import java.util.Date;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.casestudy.exeption.EmptyEntityListException;
import com.casestudy.exeption.EntityCreationException;
import com.casestudy.exeption.EntityDeletionException;
import com.casestudy.exeption.EntityIdException;
import com.casestudy.exeption.EntityNotFoundException;
import com.casestudy.exeption.EntityUpdationException;
import com.casestudy.exeption.ErrorDetails;


@RestControllerAdvice
public class ControllerAdvice {

	
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
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> customValidationErrorHandling(MethodArgumentNotValidException exception)
	{
		ErrorDetails errorDetails=new ErrorDetails(new Date(),"please enter correct details and fill every coloumn",exception.getBindingResult().getFieldError().getDefaultMessage());
		return new ResponseEntity<>(errorDetails,HttpStatus.BAD_REQUEST);
	}
	
}