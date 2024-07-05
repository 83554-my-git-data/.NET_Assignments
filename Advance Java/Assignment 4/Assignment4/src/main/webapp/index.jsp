<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<h3 style="text-align: center;">Login</h3>
	<form style="text-align: center;" action="loginbean.jsp" method="post"> <br/><br/>
	Email: <input type="text" name="email"> <br/><br/>
	Password: <input type="password" name="pwd"> <br/><br/>
	<input type="submit" value="Sign In"><br/><br/>
	Don't have account <a href="newuser.jsp">Register Here</a>
	
	</form>

</body>
</html>