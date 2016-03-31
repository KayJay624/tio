<%@page contentType="text/html; charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib tagdir="/WEB-INF/tags" prefix="moje" %>
<%@taglib uri="/WEB-INF/tlds/znaczniki" prefix="znaczniki"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
    </head>
    <body>

        <jsp:useBean id="users" class="com.example.tags.UsersBean" scope="application" />
           
        <moje:form action="${tb}"></moje:form>
		<moje:usersList order="asc" col="red"></moje:usersList> <br><br>
		<moje:usersList order="dsc" col="blue"></moje:usersList> <br><br>
        <moje:usersList order="asc"></moje:usersList> <br><br>
		
		<znaczniki:akapit header="Nagłówek 1.0" alignment="right" color="red">
        	Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum 
        </znaczniki:akapit>
        
        <znaczniki:akapit header="Nagłówek 2.0" alignment="center" color="blue">
        	Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum
        </znaczniki:akapit>
        
        <h2>Zamiana walut</h2>
        <p>${znaczniki:zamienWalute("10", "USD", "EUR")}</p>
        <p>${znaczniki:zamienWalute("100", "JPY", "PLN")}</p>
        
    </body>
</html>
