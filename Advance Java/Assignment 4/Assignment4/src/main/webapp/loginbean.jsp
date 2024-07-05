<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Bean</title>
</head>
<body>
	<jsp:useBean id="log" class="com.sunbeam.beans.LoginBean" />
	<jsp:setProperty name="log" property="email" param="email"/>
	<jsp:setProperty name="log" property="password" param="pwd"/>
	<% log.validate(); %>
	<%if(log.getUser() != null)  {%>
	Welcome, <jsp:getProperty property="email" name="log"/>
	<jsp:forward page="candlist.jsp"></jsp:forward>
	<%} else { %>
		Login Failed.
	<% } %>	

</body>
</html>