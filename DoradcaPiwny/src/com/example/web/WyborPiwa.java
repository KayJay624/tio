package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.example.model.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WyborPiwa
 */
@WebServlet("/WybierzPiwo.do")
public class WyborPiwa extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Porada piwna<br/>");
		*/
		String c = request.getParameter("kolor");
		
		EkspertPiwny doradca = new EkspertPiwny();
		ArrayList<String> marki = doradca.getMarki(c);
		/*out.println("<br/>Polecane piwa: <br>"); 
		
		for(String p : marki) {
			out.println(" - " + p + "<br>"); 
		}*/
		
		request.setAttribute("marki", marki);
		request.setAttribute("test", "wpisTestowy");
		RequestDispatcher view = request.getRequestDispatcher("wyniki.jsp");
		view.forward(request, response); 

	}

}
