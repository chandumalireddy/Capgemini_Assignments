package com.example.demo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("emp")
public class employee {
	
	private String name;
	private String depart;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public employee(String name, String depart) {
		super();
		this.name = name;
		this.depart = depart;
	}
	

}
