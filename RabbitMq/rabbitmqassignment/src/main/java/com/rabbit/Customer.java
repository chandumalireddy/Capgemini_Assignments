package com.rabbit;

import java.io.Serializable;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.io.Serializable;

@Document("user")
public class Customer implements Serializable {

    private String FirstName;
    private String LastName;

    public Customer() {
    }

	public Customer(String firstName, String lastName) {
		super();
		FirstName = firstName;
		LastName = lastName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

   
}