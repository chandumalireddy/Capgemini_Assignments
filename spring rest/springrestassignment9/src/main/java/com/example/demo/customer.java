package com.example.demo;

import javax.persistence.Entity;

@Entity
public class customer {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public customer(String name) {
		super();
		this.name = name;
	}



}
