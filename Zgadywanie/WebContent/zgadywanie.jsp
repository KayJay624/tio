<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.example.beans.ZagadkaBean;" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Gra w zgadywanie liczby</title>
</head>

	
<body> 
	<jsp:useBean id="ZagadkaBean" scope="session" class="com.example.beans.ZagadkaBean">
		${ZagadkaBean.init() }
	</jsp:useBean>
	
	<H1 ALIGN="CENTER">Gra w zgadywanie liczby</H1>
 
	<FORM>
    	Podaj liczbe:
   		<INPUT TYPE="TEXT" NAME="liczba">
  		<INPUT TYPE="SUBMIT" VALUE="Zgaduj">
	</FORM>
	<br>	
	
	<% int li = -1; %>
	<% if (request.getParameter("liczba") != null) { 
		li= Integer.valueOf(request.getParameter("liczba"));
 				
		request.setAttribute("li", li);
		//request.setAttribute("ZagadkaBean", ${ZagadkaBean});
		//request.get
		/* RequestDispatcher rd = request.getRequestDispatcher("/zgadywanie.jsp");
  		rd.forward(request, response); */
	
 	%>


	

	<%-- Liczba: ${li } <br>
	Zagadka: ${ZagadkaBean.zagadka } <br>
	Proby: ${ZagadkaBean.proby }  <br> --%>
	
	
	<c:choose>
		<c:when test="${ZagadkaBean.zagadka > li}">
			Twoja liczba (${li}) jest mniejsza od zagadki.
			${ZagadkaBean.incProby()}
		</c:when>
		<c:when test="${ZagadkaBean.zagadka < li}">
			Twoja liczba (${li}) jest wieksza od zagadki.
			${ZagadkaBean.incProby()}
		</c:when>
		<c:otherwise>
			Brawo zgadleś w ${ZagadkaBean.proby} próbach.
			${ZagadkaBean.init()}
			${ZagadkaBean.reset() } 
			<br>
			Spróbuj <a href="<c:out value="/Zgadywanie/zgadywanie.jsp"/>">raz jeszcze</a>
		</c:otherwise>
	</c:choose> 
		<% }%>
</body>
</html>