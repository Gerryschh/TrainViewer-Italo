package com.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.beans.User;
import com.strategy.StrategyDB;

@WebServlet("/TrainGameLeaderboardServlet")
public class TrainGameLeaderboardServlet extends HttpServlet{

	public TrainGameLeaderboardServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		StrategyDB s = new StrategyDB();
		
		
		
		
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		User u = s.checkUser(email,password);
		HttpSession session = request.getSession(true);
		session.setAttribute("email", email);
		
		session.setAttribute("username", u.getUserName());
		session.setAttribute("isAdmin", u.isAdmin());

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}


}