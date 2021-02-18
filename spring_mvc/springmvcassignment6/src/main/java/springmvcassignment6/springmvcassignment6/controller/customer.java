package springmvcassignment6.springmvcassignment6.controller;




import javax.validation.constraints.Email;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class customer {
	
	@NotBlank(message="should not be blank")
	@Size(min=8,max=20, message="uername should be between 8-20 characters")
	@Pattern(regexp="/^[a-zA-Z0-9\\-_]$/", message="no spaces allowed in username")
	private String username;
	
	@Size(min=8,max=20,message="password should be between 8-20 characters")
	@Pattern(regexp="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[_$#.@])[A-Za-z\\\\d_$#.@]$",
	message="*for password use combination of 1 uppercase,lowercase,digit,special char [$][_][#][.][@]") 
	private String password;
	
	@NotBlank(message="should not be blank")
	@Email
	private String email;
	
	@Isvalidcity
	private int contact;
	
	private String city;

	private int zip;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	
	
	
	

}
