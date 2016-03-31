<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
 "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head><title>Java Beans and HTML forms</title></head>
 <body>
 <jsp:useBean id="formBean" class="mm.beans.UserFormBean" scope="request"/>
 <jsp:setProperty name="formBean" property="*"/>
 <jsp:useBean id="testB" class="mm.beans.ZagadkaBean" scope="request"/>
 	${testB.incProby()}
 <form>
 <table>
 <tr><td>UŜytkownik</td><td><input type="text" name="username"/></td></tr>
 <tr><td>Email</td><td><input type="text" name="email"/></td></tr>
 <tr><td>Hasło</td><td><input type="password" name="password"/></td></tr>
 <tr><td colspan="2"><input type="submit" value="send"/></td></tr>
 </table>
 </form>
 <h2>Dane przesłane z formularza</h2>
 <ul>
 <li>uŜytkownik: <jsp:getProperty name="formBean" property="username"/>
 <li>email: <jsp:getProperty name="formBean" property="email"/>
 <li>hasło: <jsp:getProperty name="formBean" property="password"/>
 <li>test: <jsp:getProperty name="testB" property="zagadka"/>
 <li>Prob: <jsp:getProperty name="testB" property="proby"/>
 </ul>
 </body>
</html> 