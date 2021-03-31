<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<body>
<% Class.forName("com.mysql.jdbc.Driver"); %>
	<%Connection connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/springsql", "root", "");
      Statement statement = connection.createStatement() ;
      ResultSet r = statement.executeQuery("select * from emp") ;%>
      
        <table>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Department</th>
                <th>Designation</th>
                <th>Salary</th>
                <th>Delete</th>
                <th>Update</th>
            </tr>
            <% while(r.next()){ %>
            <tr>
               <td><%= r.getInt(1) %></td>
                <td> <%= r.getString(2) %></td>
                <td> <%= r.getString(3) %></td>
                <td> <%= r.getString(4) %></td>
                <td> <%= r.getInt(5)  	%></td>
                <td> <a href="deleteEmployee.html/		<%= r.getInt(1) %>">Delete</a> </td>
                <td> <a href="editEmployeeDetail.html/	<%= r.getInt(1) %>">Edit</a> </td>
            </tr>
            <% } %>
        </table>
        
</body>
</html>