/*
 * Copyright (c) 2016 Scott Armstrong & Aidan Draper
 */
package elon.edu.tags;

import elon.edu.data.LineItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class FutureValueDisplay extends BodyTagSupport{
  
  private ArrayList<LineItem> futureValues;
  private Iterator iterator;
  private LineItem lineItem;
  
  public void setFutureValueList(ArrayList<LineItem> futureValues) {
    this.futureValues = futureValues;
  }
  
  @Override
  public int doStartTag() {
    
   if (futureValues.isEmpty()) {
     return SKIP_BODY;
   } else {
     return EVAL_BODY_BUFFERED;
   }
  }
  
  @Override
  public void doInitBody() throws JspException {
    
      iterator = futureValues.iterator();
      
      if (iterator.hasNext()) {
        
        lineItem = (LineItem) iterator.next();
      }
      this.setFutureYearAttributes(lineItem);
  }

private void setFutureYearAttributes(LineItem item) {
      pageContext.setAttribute("year", item.getYear());
      pageContext.setAttribute("value", item.getValue());
  } 
  
  @Override
  public int doAfterBody() throws JspException{
    try {
      if (iterator.hasNext()) {
        lineItem = (LineItem) iterator.next();
        this.setFutureYearAttributes(lineItem);
        return EVAL_BODY_AGAIN;
      } else {
        JspWriter out = bodyContent.getEnclosingWriter();
        bodyContent.writeOut(out);
        return SKIP_BODY;
      }
    } catch (IOException ioe) {
       System.err.println("error in doAfterBody" + ioe.getMessage());
      return SKIP_BODY;
   }
}
  
}
