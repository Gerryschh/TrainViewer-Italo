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

@WebServlet("/TrainGameScoreServlet")
public class TrainGameScoreServlet extends HttpServlet{

	public TrainGameScoreServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		StrategyDB s = new StrategyDB();
		String username = request.getParameter("username");
		String score = request.getParameter("score");

		//metodo come checkuser
		//User u = s.checkUser(email,password);
		
		HttpSession session = request.getSession(true);
		
		//session.setAttribute("email", email);
		//session.setAttribute("username", u.getUserName());
		//session.setAttribute("isAdmin", u.isAdmin());

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/trainGame.jsp");
		dispatcher.forward(request, response);
		
	}


}