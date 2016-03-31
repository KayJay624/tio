<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Hashtable"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  </head>
  <body>
    <jsp:useBean id="koszyk" class="com.example.beans.Koszyk" scope="session"/>
    <BR>
      Twój koszyk:<BR>
      <c:import var="xmlfile" url="produkty.xml"/>
      <x:parse doc="${xmlfile}" var="result"/>
      <c:set var="total_price" value="0"/>
      
      <c:if test="${koszyk.size == 0 }">
      		jest pusty.
      </c:if>
      
      <c:if test="${koszyk.size != 0}">
      <table border=2>
         <tr><td>Nazwa</td>
             <td>Cena</td>
             <td>Ilość</td>
             <td> </td>
         </tr>
         <c:forEach var="produkt" items="${koszyk.produkty}">
            <c:set var="key" value="${produkt.key}"/>
            <x:forEach select="$result//part[@ID=$key]" var="currentPart">
              <tr>
                <x:set var="price" select="string($currentPart/price)"/>
                <c:set var="total_price" value="${total_price + price * produkt.value}"/>
                <td><x:out select="$currentPart/name"/></td>
                <td><c:out value="${price}"/></td>
                <c:set var="id_part">
                   <x:out select="$currentPart/@ID" />
                </c:set>
                <c:url value="/obslugaKoszyka.jsp" var="addURL">
                  <c:param name="action" value="remove"/>
                  <c:param name="id_part" value="${id_part}"/>
                </c:url>
                <td><c:out value="${produkt.value}"/></td>
                <td><a href="<c:out value="${addURL}"/>">Usuń z koszyka.</a></td>
              </tr>
            </x:forEach>
         </c:forEach>
      </table>
      </c:if>
      <BR>
      Do zapłaty:
      <c:out value="${total_price}"/><BR><BR>
      <a href="main.jsp">Powrót</a>
  </body>
</html>