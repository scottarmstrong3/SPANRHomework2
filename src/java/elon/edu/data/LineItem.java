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

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public double getValue() {
    return value;
  }

  public void setValue(double value) {
    this.value = value;
  }
}
