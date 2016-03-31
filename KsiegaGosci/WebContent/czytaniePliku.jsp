<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.io.BufferedReader,java.io.FileReader" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Księga gości</title>
</head>
<body>	
	<H1 ALIGN="CENTER">Księga gości</H1>
 	
 	<% 	String jspPath = session.getServletContext().getRealPath("/");
       	String txtFilePath = jspPath+ "/komentarze.txt";
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
 
	    
	   
</body>
</html>