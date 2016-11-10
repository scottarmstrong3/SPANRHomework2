/*
 * Copyright (c) 2016 Scott Armstrong & Aidan Draper
 */
package elon.edu.calculator;

import elon.edu.data.Investment;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Calculate extends HttpServlet {

  @Override
  protected void doPost(HttpServletRequest request,
          HttpServletResponse response)
          throws ServletException, IOException {

    String action = request.getParameter("action");
    String url = "";
    
    if (action != null) {
        
    double interestRate = Double.parseDouble(request.getParameter("interest-rate"));
    int years = Integer.parseInt(request.getParameter("years"));
    double investmentAmount = Double.parseDouble(request.getParameter("investment-amount"));
       
    Investment investment = new Investment(investmentAmount, interestRate, years);
    
    request.setAttribute("investment", investment);
    
    Investment lastInvestment = new Investment(investmentAmount, interestRate, 0);
    HttpSession session = request.getSession();
    session.setAttribute("investment",lastInvestment);
    
    url = "/calculations.jsp";
    } else {
      
      url = "/index.jsp";
    }

    getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
  }

  @Override
  protected void doGet(HttpServletRequest request,
          HttpServletResponse response)
          throws ServletException, IOException {

    doPost(request, response);
  }
}
