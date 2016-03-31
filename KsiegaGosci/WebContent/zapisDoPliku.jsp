<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.io.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Księga gości</title>
</head>
<body>

	
	
	<H1 ALIGN="CENTER">Księga gości</H1>
 
	<FORM ACTION="http://localhost:8080/KsiegaGosci/zapisDoPliku.jsp"
      METHOD="POST">
      	
	    <b>Please submit your feedback:</b> <BR>
	    <table>
      	<tr>
	    <td>name:</td>
	    <td><INPUT TYPE="TEXT" NAME="name"></td>
	    </tr>
	    <tr>
	    <td>email:</td>
	    <td><INPUT TYPE="TEXT" NAME="email"></td>
	    </tr>
	    <tr>
	    <td>comment:</td>
	    <td><INPUT TYPE="TEXT" NAME="comment"></td>
	    </tr>
	    </table>
	    <INPUT TYPE="SUBMIT" VALUE="Send Feedback">
	    
	    
	    
	    <% 	if(request.getParameter("name") != null) {
	    	String jspPath = session.getServletContext().getRealPath("/");
       		String txtFilePath = jspPath+ "/komentarze2.txt";
       		      		
       	 	Writer objWriter = new BufferedWriter(new FileWriter(txtFilePath,true));
       	
       	 	objWriter.append(request.getParameter("name")+ ";" +
   			 	request.getParameter("email")+ ";" + 
   				request.getParameter("comment")+"\n");
       	 	objWriter.flush();
       	 	objWriter.close();
	    }%>
	    <br><br>
	    
 	   	<%	String jspPath = session.getServletContext().getRealPath("/");
   			String txtFilePath = jspPath+ "/komentarze2.txt";
 	   		BufferedReader reader = new BufferedReader(new FileReader(txtFilePath)); 
	 		String line; 
			while ((line = reader.readLine()) != null) { 
			String[] parts = line.split(";");
			if(parts.length == 3){%>
			<b><%=parts[0] %></b>(<%=parts[1]%>) says: <br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp
				<%=parts[2] %>
	
		<br>
  	 	<br>
	 	<% }} %>
	    
	</FORM>
</body>
</html>