/*
 * Copyright (c) 2016 Scott Armstrong & Aidan Draper
 */
package elon.edu.tags;

import java.io.IOException;
import java.text.NumberFormat;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CurrencyFormat extends TagSupport{
  
  private String numberToFormat;
  
  public void setNumberToFormat(String numberToFormat) {
    this.numberToFormat = numberToFormat;
  }
  
  @Override
  public int doStartTag() throws JspException {
    
    NumberFormat numFormatter = NumberFormat.getCurrencyInstance();
    String formattedNum = numFormatter.format(Double.parseDouble(numberToFormat));
    
    try {
      JspWriter out = pageContext.getOut();
      out.print(formattedNum);
    } catch (IOException ioe) {
      System.out.println(ioe);
    }
    
    return SKIP_BODY;
  }
  
}
