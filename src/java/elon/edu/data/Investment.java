/*
 * Copyright (c) 2016 Scott Armstrong & Aidan Draper
 */
package elon.edu.data;

import java.io.Serializable;

public class Investment implements Serializable{
  
  private double investmentAmount;
  private int interestRate;
  private int years;
  private double futureValue;
  
  public Investment() {
    investmentAmount = 0;
    interestRate = 0;
    years = 0;
    futureValue = 0;
  }
  
  public Investment(double investmentAmount, int interestRate, int years) {
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

  public int getInterestRate() {
    return interestRate;
  }
  
  public double getFutureValue(){
    
    return investmentAmount * interestRate * .01 * years + investmentAmount;
  }

  public void setInterestRate(int interestRate) {
    this.interestRate = interestRate;
  }
  
  public int getYears() {
    return years;
  }

  public void setYears(int years) {
    this.years = years;
  }
  public void setFutureValue(double futureValue){
    this.futureValue= futureValue;
  }
}
