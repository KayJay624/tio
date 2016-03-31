package com.example.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.tags.UsersBean;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		if(request.getSession().getAttribute("login") == null) {
			String login = request.getParameter("login");
	        String password = request.getParameter("password");
	        
	        if (login == null || password == null) {
	        	out.print("Invalid paramters ");
	        }
	        
	        if (login.toLowerCase().trim().equals("admin") ||
	        	login.toLowerCase().trim().equals("admin2") ||
	        	login.toLowerCase().trim().equals("admin3")) {
	            
	        	out.println("Welcome " + login + "<br> <a href=\"index.jsp\">Back to main</a>");
	            request.getSession().setAttribute("login", login);
	            UsersBean users = (UsersBean) getServletContext().getAttribute("users");
	            
	            users.addUser(login);
	        }
	        else {
	             out.println("Invalid username and password");
	        }
		
		} else {
			 UsersBean users = (UsersBean) getServletContext().getAttribute("users");	            
	         String login = (String) request.getSession().getAttribute("login");
	         out.println(login);
			 users.delUser(login);
			 
			 out.println("You were logout <br>" + " <a href=\"index.jsp\">Back to main</a>");
			 request.getSession().setAttribute("login", null);
			 
			 
		}
	}

}
