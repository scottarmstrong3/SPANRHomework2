/*
 * Copyright (c) 2016 Scott Armstrong & Nicholas Richu
 */
package elon.edu.data;

import java.io.Serializable;

/**
 * @author scottarmstrong, nickrichu
 */
public class Investment implements Serializable{
  
  private String investmentAmount;
  private int interestRate;
  private int years;
  private String futureValue;
  
  public Investment() {
    investmentAmount = "";
    interestRate = 0;
    years = 0;
    futureValue = "";
  }
  
  public Investment(String investmentAmount, int interestRate, int years, String futureValue) {
    this.investmentAmount = investmentAmount;
    this.interestRate = interestRate;
    this.years = years;
    this.futureValue = futureValue;
  }

  public String getInvestmentAmount() {
    return investmentAmount;
  }

  public void setInvestmentAmount(String investmentAmount) {
    this.investmentAmount = investmentAmount;
  }

  public int getInterestRate() {
    return interestRate;
  }
  
  public String getFutureValue(){
    return futureValue;
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
  public void setFutureValue(String futureValue){
    this.futureValue= futureValue;
  }
}
