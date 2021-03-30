package springmvc.springmvcassignment10.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;



public class connectdb {
	public static ArrayList<User> getDetails(){
		
		ArrayList<User>a=new ArrayList<>();
	try{  
	Class.forName("com.mysql.jdbc.Driver");  
	Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3306/spring10","root","");  
	Statement stmt=con.createStatement();  
	ResultSet rs=stmt.executeQuery("select * from std");  
	while(rs.next())  {
	String usern=rs.getString("name");
	String dep=rs.getString("dep");  
	a.add(new User(usern,dep));
	}
	}
	catch(Exception e)
	{ System.out.println(e);}  
	
	return a;
}
	

}

