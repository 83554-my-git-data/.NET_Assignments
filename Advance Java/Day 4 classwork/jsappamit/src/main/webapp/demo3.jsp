<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="error.jsp" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error Page Trial</title>
</head>
<body>
	<% Random rnum = new Random(); %>
	<%
		int num = rnum.nextInt(2);
		out.println("Division 101 /" + num + " = " + (101/num));
		
	%>

</body>
</html>