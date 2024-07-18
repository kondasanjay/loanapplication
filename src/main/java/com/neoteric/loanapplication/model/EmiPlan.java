package com.neoteric.loanapplication.model;

public class EmiPlan {

    public String noOfyears;

    public String yearplan;
  public long   yearmonthlyEmi;
   public String yearinstrestRate;

    @Override
    public String toString() {
        return "EmiPlan{" +
                "noOfyears='" + noOfyears + '\'' +
                ", yearplan='" + yearplan + '\'' +
                ", yearmonthlyEmi=" + yearmonthlyEmi +
                ", yearinstrestRate='" + yearinstrestRate + '\'' +
                '}';
    }
}
