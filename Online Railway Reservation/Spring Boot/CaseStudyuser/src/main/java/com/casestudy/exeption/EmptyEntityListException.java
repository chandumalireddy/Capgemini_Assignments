package com.casestudy.exeption;

public class EmptyEntityListException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmptyEntityListException(String message) {
		super(message);
	}

}
