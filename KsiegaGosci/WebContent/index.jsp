<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Księga gości</title>
</head>
<body>

	<jsp:useBean id="comments" class="com.example.beans.CommentList" scope="application" />
	
	<H1 ALIGN="CENTER">Księga gości</H1>
 
	<FORM ACTION="http://localhost:8080/KsiegaGosci/goscie"
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
	    
	    <br><br>
	    <c:forEach var="c" items="${comments.getComments()}">
			<b><c:out value="${c.name}"/></b>
			(<c:out value="${c.email}"/>)
			says: <br>
	  		<c:out value="${c.comment}"/>
	  		<br><br>
		</c:forEach>
	    
	</FORM>
</body>
</html>