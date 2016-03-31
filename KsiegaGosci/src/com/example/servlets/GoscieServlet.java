package com.example.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.beans.CommentList;
import com.example.beans.CommentList.Comment;


@WebServlet("/goscie")
public class GoscieServlet extends HttpServlet {

	String msg = "";
	      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//String msg = request.getParameter("msg");
		
		out.println("<!DOCTYPE HTML PUBLIC '-//W3C//DTD HTML 4.0 Transitional//EN'>");
		out.println("<HTML>");
		out.println("<HEAD>");
		out.println("  <TITLE>Ksiega gosci</TITLE>");
		out.println("</HEAD>");
		 
		out.println("<H1 ALIGN='CENTER'>Ksiega gosci</H1>");
		 
		if(!msg.equals("")) {
			out.println("Wypelnij wszystkie pola<BR><BR>");	
		}
		
		out.println("<FORM ACTION='http://localhost:8080/KsiegaGosci/goscie'");
		out.println("METHOD='POST'>");
		out.println("Please submit your feedback: <BR>");
		out.println("name:");
		out.println("<INPUT TYPE='TEXT' NAME='name'><BR>");
		out.println(" email:");
		out.println("    <INPUT TYPE='TEXT' NAME='email'><BR>");
		out.println("   comment:");
		out.println("   <INPUT TYPE='TEXT' NAME='comment'><BR>");
		    
		out.println("   <INPUT TYPE='SUBMIT' VALUE='Send'>");
		out.println("</FORM>");
		
		for(Comment c: comments) {
			out.println(c.name + "(" + c.email + ") says: " + "<BR>");
			out.println("\t" + c.comment + "<BR><BR>");
		}
		 
		out.println("</BODY>");
		out.println("</HTML>");*/
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String com = request.getParameter("comment");	
		System.out.println(name);
		System.out.println(email);
		System.out.println(com);
		if(!name.equals("") && !email.equals("") && !com.equals("")) {
			CommentList comments = (CommentList) getServletContext().getAttribute("comments");
			comments.add(name, email, com);
			//comments.add(new Comment(name, email, com));
			//doGet(request,response);
		} else {
			msg = "Wszystkie pola powinny byc wypelnione";
		}
				
		// ServletContext context = getServletContext();
	     //RequestDispatcher dispatcher = context.getRequestDispatcher("/index.jsp");
	     //dispatcher.forward(request,response);
		 response.sendRedirect("http://localhost:8080/KsiegaGosci/index.jsp");
		
	}
	
	
}
