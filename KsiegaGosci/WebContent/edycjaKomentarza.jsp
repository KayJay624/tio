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
 	
 	 <c:if test="${!empty param.name}">
		<FORM ACTION="http://localhost:8080/KsiegaGosci/edycjaKomentarza2.jsp"
      		METHOD="POST">
      	
      	
	    <b>Please submit your feedback:</b> <BR>
	    <table>
      	<tr>
	    <td>name:</td>
	    <td><INPUT TYPE="TEXT" NAME="new_name" VALUE="${param.name}"></td>
	    </tr>
	    <tr>
	    <td>email:</td>
	    <td><INPUT TYPE="TEXT" NAME="new_email" VALUE="${param.email}"></td>
	    </tr>
	    <tr>
	    <td>comment:</td>
	    <td><INPUT TYPE="TEXT" NAME="new_comment" VALUE="${param.comment}"></td>
	    </tr>
	    <tr>
	     <td><INPUT TYPE="hidden" NAME="oldname" VALUE="${param.name}"></td>
	    </tr>
	    <tr>
	    <td><INPUT TYPE="hidden" NAME="oldemail" VALUE="${param.email}"></td>
	    </tr>
	    <tr>
	    <td><INPUT TYPE="hidden" NAME="oldcomment" VALUE="${param.comment}"></td>
	    </tr>
	    </table>
	    <INPUT TYPE="SUBMIT" VALUE="Edit Comment">
	  </FORM> 
	  </c:if>
	  
	    
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
	    
 	   	
</body>
</html>