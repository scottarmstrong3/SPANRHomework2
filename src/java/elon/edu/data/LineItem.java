/*
 * Copyright (c) 2016 Scott Armstrong & Aidan Draper
 */
package elon.edu.data;

import java.io.Serializable;

public class LineItem implements Serializable{

  private int year;
  private double value;
  
  public LineItem() {
    year = 0;
    value = 0;
  }
  
  public LineItem(int year, double value) {
    
    this.year = year;
    this.value = value;
  }

  /**
   * @return the year
   */
  public int getYear() {
    return year;
  }

  /**
   * @param year the year to set
   */
  public void setYear(int year) {
    this.year = year;
  }

  /**
   * @return the value
   */
  public double getValue() {
    return value;
  }

  /**
   * @param value the value to set
   */
  public void setValue(double value) {
    this.value = value;
  }
  
  
  
}
