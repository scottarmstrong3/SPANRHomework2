/*
 * Copyright (c) 2016 Scott Armstrong & Aidan Draper
 */
package elon.edu.data;

import java.io.Serializable;
import java.text.NumberFormat;

/**
 * @author scottarmstrong, nickrichu
 */
public class Investment implements Serializable{
  
  private int investmentAmount;
  private int interestRate;
  private int years;
  private int futureValue;
  
  public Investment() {
    investmentAmount = 0;
    interestRate = 0;
    years = 0;
    futureValue = 0;
  }
  
  public Investment(int investmentAmount, int interestRate, int years) {
    this.investmentAmount = investmentAmount;
    this.interestRate = interestRate;
    this.years = years;
  }

  public String getInvestmentAmount() {
    NumberFormat numFormatter = NumberFormat.getCurrencyInstance();
    
    return numFormatter.format(investmentAmount);
  }

  public void setInvestmentAmount(int investmentAmount) {
    this.investmentAmount = investmentAmount;
  }

  public int getInterestRate() {
    return interestRate;
  }
  
  public String getFutureValue(){
    
    NumberFormat numFormatter = NumberFormat.getCurrencyInstance();
    
    return numFormatter.format(investmentAmount * interestRate * .01 * years + investmentAmount);
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
  public void setFutureValue(int futureValue){
    this.futureValue= futureValue;
  }
}
