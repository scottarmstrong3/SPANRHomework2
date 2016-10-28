/*
 * Copyright (c) 2016 Scott Armstrong & Nicholas Richu
 */
package elon.edu.calculator;

import elon.edu.data.Investment;
import java.io.IOException;
import java.text.NumberFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author scottarmstrong
 */
public class Calculate extends HttpServlet {

  @Override
  protected void doPost(HttpServletRequest request,
          HttpServletResponse response)
          throws ServletException, IOException {

    String action = request.getParameter("action");
    String url = "";
      
    if (action != null) {
    
    NumberFormat numFormatter = NumberFormat.getCurrencyInstance();
    
    int interestRate = Integer.parseInt(request.getParameter("interest-rate"));
    int years = Integer.parseInt(request.getParameter("years"));
    int integerInvestmentAmount = Integer.parseInt(request.getParameter("investment-amount"));
    
    String futureValue = numFormatter.format(integerInvestmentAmount * interestRate * .01 * years + integerInvestmentAmount);
    String investmentAmount = numFormatter.format(integerInvestmentAmount);
   
    System.out.println(investmentAmount);
    
    Investment investment = new Investment(investmentAmount, interestRate, years, futureValue);

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
