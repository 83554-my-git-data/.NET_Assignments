<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Bean</title>
</head>
<body>
	<jsp:useBean id="rb" class="com.sunbeam.beans.RegisterBean" />
	<jsp:setProperty name="rb" property="firstName"  param="fname"/>
	<jsp:setProperty name="rb" property="lastName"  param="lname"/>
	<jsp:setProperty name="rb" property="email"  param="email"/>
	<jsp:setProperty name="rb" property="password"  param="pwd"/>
	<jsp:setProperty name="rb" property="birth"  param="bdate"/>
	
	<% if(rb.register() != 0) {%>
		Registration completed successfully.
		<a href="login.jsp">Login Again!!</a>
	<%} else {%>
		Registration failed.
		<br/><br/>
		<a href="newuser.jsp">Register Again!!</a>
		<br>
		<br>
		<a href="index.jsp"> Try Login !!</a>
	<%} %>	
	

</body>
</html>