/*
 * Copyright (c) 2016 Scott Armstrong & Aidan Draper
 */
package elon.edu.calculator;

import elon.edu.data.Investment;
import java.io.IOException;
import java.text.NumberFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculate extends HttpServlet {

  @Override
  protected void doPost(HttpServletRequest request,
          HttpServletResponse response)
          throws ServletException, IOException {

    String action = request.getParameter("action");
    String url = "";
      
    if (action != null) {
        
    int interestRate = Integer.parseInt(request.getParameter("interest-rate"));
    int years = Integer.parseInt(request.getParameter("years"));
    int investmentAmount = Integer.parseInt(request.getParameter("investment-amount"));
   
    System.out.println(investmentAmount);
    
    Investment investment = new Investment(investmentAmount, interestRate, years);

    request.setAttribute("investment", investment);

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
