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
 	
 	 <% 
	    synchronized(this) {
 	 	String jspPath = session.getServletContext().getRealPath("/");
       	//String txtFilePath = jspPath+ "/komentarze2.txt";
       		      		
       	 String oldFileName = jspPath+ "/komentarze2.txt";
         String tmpFileName = jspPath+ "/komentarze2_tmp.txt";

         BufferedReader br = null;
         BufferedWriter bw = null;
       
            br = new BufferedReader(new FileReader(oldFileName));
            bw = new BufferedWriter(new FileWriter(tmpFileName));
            String line;
            String lineToEdit = request.getParameter("oldname")+";"+request.getParameter("oldemail")+";"+request.getParameter("oldcomment");
            while ((line = br.readLine()) != null) {
            	
               if (line.equals(lineToEdit)){
            	   //out.println("sdfdssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss\n");
                  line = line.replace(request.getParameter("oldname")+";"+request.getParameter("oldemail")+";"+request.getParameter("oldcomment"),
                  	request.getParameter("new_name")+";"+request.getParameter("new_email")+";"+request.getParameter("new_comment"));
                 
                  //bw.write(line+"\n");
                  //bw.flush();
               }
               //out.println(line+"\n");
               bw.write(line+"\n");
               bw.flush();
            }
            
            br = new BufferedReader(new FileReader(tmpFileName));
            bw = new BufferedWriter(new FileWriter(oldFileName));
           
           
            while ((line = br.readLine()) != null) {
            	              
               bw.write(line+"\n");
               bw.flush();
            }
	    
       /*   
         // Once everything is complete, delete old file..
         File oldFile = new File(oldFileName);
         oldFile.delete();

         // And rename tmp file's name to old file name
         File newFile = new File(tmpFileName);
         newFile.renameTo(oldFile);
	     */
	   	
		//String jspPath2 = session.getServletContext().getRealPath("/");
   		//	String txtFilePath = jspPath+ "/komentarze2.txt";
 	   	//	BufferedReader reader = new BufferedReader(new FileReader(txtFilePath)); 
	 	//	String linen; 
		//	while ((linen = reader.readLine()) != null) { 
		//	String[] parts = linen.split(";");
		//	if(parts.length == 3){%>
			<%-- <b><%=parts[0] %></b>(<%=parts[1]%>) says: <br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp
				<%=parts[2] %>
	 --%>
		<br>
  	 	<br>
	 	<% } %>
	    <c:redirect url="http://localhost:8080/KsiegaGosci/edycjaPliku.jsp"/>
 	   	
</body>
</html>