<%@page contentType="text/html"%>
<html>
<body>
	<jsp:useBean id="user"
	class="mm.beans.UserBean" scope="request">
		<jsp:setProperty name="user" property="name" value="007"/>
		<jsp:setProperty name="user" property="age" value="40"/>	
	</jsp:useBean>
	
	My name is <jsp:getProperty name="user" property="name"/>
		and I'm <jsp:getProperty name="user" property="age"/> old.
</body>
</html>