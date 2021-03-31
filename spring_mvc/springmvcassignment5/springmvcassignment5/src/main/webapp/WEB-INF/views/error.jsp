<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<body>
<form action="/springmvc4assignment/InsertEmployee.html" method="post">
	 	<table>
	 		<tr>
	 		<td>Employee Name :</td> <td> <input type="text" name="user"/></td>
	 		</tr>
	 		<tr>
	 		<td>Employee Department :</td> <td> <input type="text" name="pass"/></td>
	 		</tr>
	 	
	 		<td> <input type="submit" name="Add"/></td>
	 		</tr>
	 	</table>
</form>
</body>
</html>