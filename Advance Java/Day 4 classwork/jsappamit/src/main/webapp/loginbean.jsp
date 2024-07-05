<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java Beans</title>
</head>
<body>
	<jsp:useBean id="log" class="jsappamit.LoginBean"></jsp:useBean>
	<jsp:setProperty name="log" property="email" param="gmail"/>
	<jsp:setProperty name="log" property="password" param="pwd"/>
	<% log.authenticate(); %>
	<%if(log.getUser() != null)  {%>
	Welcome, <jsp:getProperty property="email" name="log"/>
	<%} else { %>
		Login Failed.
	<% } %>	
</body>
</html>