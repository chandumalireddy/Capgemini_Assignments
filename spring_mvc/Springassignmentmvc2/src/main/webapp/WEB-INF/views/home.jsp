<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>
<body>

<form:errors path="s1.*"/>   <!--  used to suggest when any wrong value placin in output -->
<form action="/Springassignmentmvc2/simath"    method="post">
<table>


<tr><td>principle<input type="text" name="priciple">
</td></tr>



<tr><td>time <input type="text" name="time">
</td></tr>



<tr><td>interest <input type="text" name="interest">
</td></tr>

<tr><td>Submit<input type="submit" name="submit">
</table></form></body></html>