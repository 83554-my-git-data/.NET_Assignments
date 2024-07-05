<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%@page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Error Page</h3>
	Some error occurred. Please contact your vendor. <br/>
	Email: nobody@gmail.com <br/><br/>
	
	Error: <%= exception.getMessage() %>

</body>
</html>