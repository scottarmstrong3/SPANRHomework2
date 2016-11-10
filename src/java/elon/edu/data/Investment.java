/*
 * Copyright (c) 2016 Scott Armstrong & Aidan Draper
 */
package elon.edu.data;

import java.io.Serializable;
import java.util.ArrayList;

public class Investment implements Serializable{
  
  private double investmentAmount;
  private double interestRate;
  private int years;
  private ArrayList<LineItem> futureValues;
  
  public Investment() {
    investmentAmount = 0;
    interestRate = 0;
    years = 0;
    futureValues = new ArrayList<LineItem>();
  }
  
  public Investment(double investmentAmount, double interestRate, int years) {
    this.investmentAmount = investmentAmount;
    this.interestRate = interestRate;
    this.years = years;
  }

  public double getInvestmentAmount() {
    
    return investmentAmount;
  }

  public void setInvestmentAmount(double investmentAmount) {
    this.investmentAmount = investmentAmount;
  }

  public double getInterestRate() {
    return interestRate;
  }
  
  public ArrayList<LineItem> getFutureValues(){
    
    futureValues = new ArrayList<LineItem>();
        
    for (int i = 0; i < years; i ++) {
      
      futureValues.add(new LineItem(i+1, investmentAmount * interestRate * .01 * (i + 1) + investmentAmount));
    }
    
    return futureValues;
  }

  public void setInterestRate(double interestRate) {
    this.interestRate = interestRate;
  }
  
  public int getYears() {
    return years;
  }

  public void setYears(int years) {
    this.years = years;
  }
  public void setFutureValue(ArrayList<LineItem> futureValues){
    this.futureValues= futureValues;
  }
}
