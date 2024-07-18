package com.neoteric.loanapplication.model;

public class LoanApplication {

   public String firstName;
    public String lastName;
    public int  age;
    public long  phoneNumber;
    public Address  address;


    public String designation;
    public  int Salary;
    public int monthlyExpenses;
    public int   remainingsalaryamount;
    public String companyName;

    public int   loanAmountrequired;
    public String  EmiPlan;

 @Override
 public String toString() {
  return "LoanApplication{" +
          "firstName='" + firstName + '\'' +
          ", lastName='" + lastName + '\'' +
          ", age=" + age +
          ", phoneNumber=" + phoneNumber +
          ", address=" + address +
          ", designation='" + designation + '\'' +
          ", Salary=" + Salary +
          ", monthlyExpenses=" + monthlyExpenses +
          ", remainingsalaryamount=" + remainingsalaryamount +
          ", companyName='" + companyName + '\'' +
          ", loanAmountrequired=" + loanAmountrequired +
          ", EmiPlan='" + EmiPlan + '\'' +
          '}';
 }
}
