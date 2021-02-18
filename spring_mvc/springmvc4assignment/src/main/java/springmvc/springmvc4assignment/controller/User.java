package springmvc.springmvc4assignment.controller;

public class User {

	private String user;
	private String pass;
	
	public User(String usern, String pass) {
		this.user = usern;
		this.pass = pass;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return pass;
	}
	public void setPassword(String password) {
		this.pass = password;
	}
	
	
	
}
