package com.casestudyapigate;


import org.springframework.data.mongodb.core.mapping.Document;

@Document("user")
public class user {

	private String username;
	private String password;
	private String role;
	private boolean enable;
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
	
		this.role = role;
	}
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = true;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public user(String username, String password, String role, boolean enable) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
		this.enable = true;
	}
	public user() {
		
	}
	
	
}