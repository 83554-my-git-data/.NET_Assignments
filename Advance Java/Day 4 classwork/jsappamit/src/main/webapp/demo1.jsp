<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Syntax</title>
</head>
<body>
	<h1>Checking JSP Syntax</h1>
	
	<!-- This is JSP declaration -->
	<%-- This is JSP declaration --%>
	<%! 
		int cnt = 0;
		
		public void jspInit() {
			System.out.println("jspInit() called internally.");
		}
		
		public void jspDestroy() {
			System.out.println("jspDestroy() called internally.");
		}
		
		
	%>
	
	<!--This is JSP scriptlet  -->
	<%-- This is JSP scripttlet --%>
	<%
		Date now = new Date();
		
		out.println("Current Time: " + now);
	%>
	<br><br>
	<%cnt++; %>
	<%
	if(cnt % 2 == 0)
		out.println("Even count: "+ cnt);
	else
		out.println("Odd count: "+cnt);
	%>
	
</body>
</html>