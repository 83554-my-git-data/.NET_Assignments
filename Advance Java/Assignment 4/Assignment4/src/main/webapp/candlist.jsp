<%@page import="com.sunbeam.pojos.Candidate"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Candidate List</title>
</head>
<body>
	<h1>List of Candidates</h1>
	
	<jsp:useBean id="cdl" class="com.sunbeam.beans.CandListBean"></jsp:useBean>
	
	<%
	
	 List<Candidate> cd=new ArrayList<Candidate>();
	 cd = cdl.candlist();
	 
	 if(cd==null)
     {
  	out.println("error in loading candidate list");   
     }
	 
	 else
     {
			 
  	   out.println("<form method='post' action='vote'>");
  	   
  	   for(Candidate c:cd)
  	   {
  		//   <input type='radio' name='candidate' value='%d'/> %s (%s) <br/>\n", 
 				//	c.getId(), c.getName(), c.getParty()
  		   
 			  out.println("<input type='radio' name='candidate' value="+c.getId()+"/>"+c.getName()+"("+c.getParty()+")" +"<br/>\n");	
  		  //out.println("name : "+c.getName()+"  party : "+c.getParty()+"  votes : "+c.getVotes());
  	   }
  	   out.println("<input type='submit' value='Vote'/>");
 		out.println("</form>");
     }
	%>
	

</body>
</html>