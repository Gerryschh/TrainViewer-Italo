package com.servlets;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ChainResponsibility.CheckChain;
import com.ChainResponsibility.CheckChainBuilder;
import com.beans.Train;
import com.strategy.Strategy;
import com.strategy.StrategyDB;

@WebServlet("/SearchTrainServlet")
public class SearchTrainServlet extends HttpServlet{

	public SearchTrainServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		Strategy s= new StrategyDB();
		Map<String, List<String>> map= s.dataMap();
		CheckChain chain=CheckChainBuilder.getChain(s);
		
		int idFactory = Integer.parseInt(request.getParameter("idFactory"));
		String departure = request.getParameter("departure");
		String arrival = request.getParameter("arrival");
		String correctDeparture = chain.check(departure);
		String correctArrival = chain.check(arrival);
		
		HttpSession session = request.getSession(true);
		
		if(correctDeparture == null) {
			session.setAttribute("errorDeparture", "Paese di partenza inesistente");
		}
		if(correctArrival == null) {
			session.setAttribute("errorArrival", "Paese di arrivo inesistente");
		}
		
		if(correctDeparture != null && correctArrival != null) {
			Collection<Train> trains = s.getTrainsWithParameter(idFactory, departure, arrival);
			session.setAttribute("trainList", trains);
		}
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/admin.jsp");
		dispatcher.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


}