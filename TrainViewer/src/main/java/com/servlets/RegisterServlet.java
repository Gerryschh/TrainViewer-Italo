package com.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.strategy.StrategyDB;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet{
	
	public RegisterServlet() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		StrategyDB s = new StrategyDB();
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		s.addUser(email, password, username);
		HttpSession session = request.getSession(true);
		System.out.println(session);
		session.setAttribute("email", email);
		session.setAttribute("username", username);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
		dispatcher.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	
}