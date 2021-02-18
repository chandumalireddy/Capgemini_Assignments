package springmvc.springmvc4assignment.controller;

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
	"jdbc:mysql://localhost:3306/sample_db","root","");  
	Statement stmt=con.createStatement();  
	ResultSet rs=stmt.executeQuery("select * from sample");  
	while(rs.next())  {
	String usern=rs.getString("username");
	String pass=rs.getString("password");  
	a.add(new User(usern,pass));
	}
	}
	catch(Exception e)
	{ System.out.println(e);}  
	
	return a;
}
	

}