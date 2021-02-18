<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>
<body>

<form:errors path="s1.*"/>  
<form action="/springmvcassignment6/adminsuccess.html"    method="post">
<table>


<tr><td>username</td><td> <input type="text" name="username">
</td></tr>


<tr><td>password</td><td> <input type="password" name="password">
</td></tr>

<tr><td>email</td><td><input type="text" name="email">
</td></tr>

<tr><td>contact</td><td><input type="text" name="contact">
</td></tr>


<tr><td>city</td><td><input type="text" name="city">
</td></tr>



<tr><td>customer zip <input type="text" name="zip">
</td></tr>



<tr><td>
<input type="submit" value="submit this form by clcking button"></td></tr>
</table></form>
</body>
</html>
