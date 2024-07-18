package com.neoteric.loanapplication.model;

public class LoanAmount {

   public long loanNumber;
   public String statuss ;
  public long  loanAmountSanctioned;

    @Override
    public String toString() {
        return "LoanAmount{" +
                "loanNumber=" + loanNumber +
                ", statuss='" + statuss + '\'' +
                ", loanAmountSanctioned=" + loanAmountSanctioned +
                '}';
    }
}
