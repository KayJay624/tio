package com.example.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mm.beans.UserBean;

/**
 * Servlet implementation class SimpleBeanServlet
 */
@WebServlet("/SimpleBeanServlet")
public class SimpleBeanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleBeanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext ctx = this.getServletContext();
		RequestDispatcher dispatcher =
		ctx.getRequestDispatcher("/SimpleBeanPage.jsp");
		UserBean user = new UserBean();
		user.setUsername("James Bond");
		user.setEmail("bond007@hotmail.com");
		request.setAttribute("user",user);
		dispatcher.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext ctx = this.getServletContext();
		RequestDispatcher dispatcher =
		ctx.getRequestDispatcher("/SimpleBeanPage.jsp");
		UserBean user = new UserBean();
		user.setUsername("James Bond");
		user.setEmail("bond007@hotmail.com");
		request.setAttribute("user",user);
		dispatcher.forward(request,response);
	}
}
