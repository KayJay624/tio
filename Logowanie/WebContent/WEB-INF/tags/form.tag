<%@ tag language="java" pageEncoding="ISO-8859-1"%>

<%-- Taglib directives can be specified here: --%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="action" required="true" rtexprvalue="true"%>
<jsp:useBean id="users" class="com.example.tags.UsersBean" scope="application" />
<c:choose>
    <c:when test="${empty login}">
       <FORM ACTION="http://localhost:8080/Logowanie/loginServlet"
      		 METHOD="POST">
    		You are not login <br>
    		<table>
    		<tr>
    			<td>login:</td>
		    	<td><INPUT TYPE="TEXT" NAME="login"></td>
		    </tr>
		    <tr>
		    <td>password:</td>
  			<td><INPUT TYPE="PASSWORD" NAME="password"></td>
  			</tr>
  			<tr>
  			<td><INPUT TYPE="SUBMIT" VALUE="login">	</td>
  			</tr>
  			</table> 
		</FORM>
    </c:when>
    <c:otherwise>
    	You are already login as: ${login} <br>
         <FORM ACTION="http://localhost:8080/Logowanie/loginServlet"
      		 METHOD="POST">
  			<INPUT TYPE="SUBMIT" VALUE="logout">	 
		</FORM>
    </c:otherwise>
</c:choose>

<jsp:doBody />
