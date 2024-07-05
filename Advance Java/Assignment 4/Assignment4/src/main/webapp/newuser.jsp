<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<h3 style="text-align: center;">Register</h3>
<form style="text-align: center;" action="registerbean.jsp" method="post"> <br/><br/>
First Name: <input type="text" name="fname"> <br/><br/>
Last Name: <input type="text" name="lname"> <br/><br/>
Email: <input type="text" name="email"> <br/><br/>
Password: <input type="password" name="pwd"> <br/><br/>
Birth Date: <input type="date" name="bdate"> <br/><br/>
<input type="submit" value="Register"> <br/> <br/>
Already have an account <a href="index.jsp">Log in</a>
</form>


</body>
</html>