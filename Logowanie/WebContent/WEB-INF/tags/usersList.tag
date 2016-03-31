<%@ tag language="java" pageEncoding="UTF-8"%>
<%-- Taglib directives can be specified here: --%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="order" required="true" rtexprvalue="true"%>
<%@attribute name="col" required="false" rtexprvalue="true"%>

<jsp:useBean id="users" class="com.example.tags.UsersBean" scope="application" />

	<h1>Lista aktywnych użytkowników</h1>
	
	<table  border="2">
 	<tr><td>login</td><td>data logowania</td></tr>
 	<c:choose>
    	<c:when test="${order == 'asc'}">	
 			<c:forEach var="user" items="${users.sortASC()}">
				<tr>
	  			<td><c:out value="${user.login}"/></td>
	  			<td> <font color = "${col}"><c:out value="${user.date}"/></font></td>
	  		
				</tr>	
			</c:forEach>
		</c:when>
		<c:otherwise>
    		<c:forEach var="user" items="${users.sortDSC()}">
				<tr>
	  			<td><c:out value="${user.login}"/></td>
	  			<td> <font color = "${col}" ><c:out value="${user.date}"/></font></td>
	  		
				</tr>	
			</c:forEach>
         
    </c:otherwise>
	</c:choose>
 	</table>
	
<jsp:doBody />
