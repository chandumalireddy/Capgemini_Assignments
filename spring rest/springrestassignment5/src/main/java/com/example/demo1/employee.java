package com.example.demo1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class employee {

	
	@Id
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
	
	
}
