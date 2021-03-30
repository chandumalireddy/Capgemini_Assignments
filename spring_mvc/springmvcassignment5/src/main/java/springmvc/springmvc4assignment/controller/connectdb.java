package springmvc.springmvc4assignment.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import springmvc.springassignmentmvc5.controller.Employee;

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
	public static void insertUser(User employee) throws Exception {
		 String employeeName		=employee.getUser();
		 String employeeDepartment	=employee.getPassword();
		
				Class.forName("com.mysql.jdbc.Driver");  
				Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/sample_db","root","");  
				Statement stmt=con.createStatement();  
				
		 PreparedStatement p = con.prepareStatement("insert into sample "
		 		+ "(username,password) values(?,?)");
		 
		 
   	 p.setString(1, employeeName);
   	 p.setString(2,employeeDepartment);
   	 p.executeUpdate();
		
	}
	
	public static void deleteuser(User e)throws Exception{
		 
		 String employeeName		=e.getUser();

		 Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/sample_db","root","");  
			Statement stmt=con.createStatement();  
			 PreparedStatement p = con.prepareStatement("delete from sample where username=?"); 
			 p.setString(1,employeeName);  
			 p.executeUpdate();  
	}
	public static void update(User e) throws Exception{  
      
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/sample_db","root","");  
		Statement stmt=con.createStatement();     
            PreparedStatement p=con.prepareStatement("update sample set username=? where password=?");  
            p.setString(1,e.getUser());  
            p.setString(2,e.getPassword());          
 p.executeUpdate();  
              
            
        }  
          
          
     
		
}

