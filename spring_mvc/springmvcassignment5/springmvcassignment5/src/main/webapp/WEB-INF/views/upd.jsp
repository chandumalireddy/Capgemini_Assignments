<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<body>
<form action="/springmvc4assignment/UpdateEmployee.html" method="post">
	 	<table>
	 		<tr>
	 		<td>Employee name :</td> <td> <input type="text" name="user"/></td>
	 		</tr>
	 		<td>Employee password :</td> <td> <input type="text" name="password"/></td>
	 		<td> <input type="submit" name="table"/></td>
	 		</tr>
	 	</table>
</form>
</body>
</html>