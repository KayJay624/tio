<%@page language="Java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.Iterator"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd">
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>Sklep internetowy</title>
   </head>
   <body>
     <jsp:useBean id="koszyk" class="com.example.beans.Koszyk" scope="session"/>
         
     <h1>Sklep internetowy</h1>
     <c:import var="xmlfile" url="produkty.xml"/>
     <x:parse doc="${xmlfile}" var="result"/>
     <table border=2>
     	<tr>
        	<td>Nazwa</td>
            <td>Cena</td>
            <td> </td>
        </tr>
             
        <x:forEach select="$result//part" var="currentPart">
        <tr>
         	<td><x:out select="$currentPart/name"/></td>
        	<td><x:out select="$currentPart/price"/></td>
        	
        	<c:set var="id_part">
            	<x:out select="$currentPart/@ID" />
            </c:set>
          	
          	<c:url value="/obslugaKoszyka.jsp" var="addURL">
            	<c:param name="action" value="add"/>
           		<c:param name="id_part" value="${id_part}"/>
            </c:url>
            
            <td><a href="<c:out value="${addURL}"/>">Dodaj do koszyka</a></td>
        </tr>
        </x:forEach>
     </table>
     <BR>
     Suma przedmiotów: 
     <c:out value="${koszyk.size}"/><BR>
     <a href="zawartoscKoszyka.jsp">Pokaż koszyk</a>
    </body>
</html>