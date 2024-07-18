package com.neoteric.loanapplication.service;

import com.neoteric.loanapplication.model.EmiPlan;
import com.neoteric.loanapplication.model.LoanAmount;
import com.neoteric.loanapplication.model.LoanApplication;

import java.util.UUID;

public class LoanAmountService {

public LoanAmount getLoanAmount(LoanApplication customer){


    LoanAmount loanAmount=null;

    if(customer.remainingsalaryamount>18000){

        loanAmount=new LoanAmount();

        loanAmount.loanNumber=1232425;
        loanAmount.statuss="approval";
        loanAmount.loanAmountSanctioned=300000;


    }

    return loanAmount;
}

//public EmiPlan getEmiPlan(LoanApplication customer,int year){


   // EmiPlan EmiPlan=null;

  //  if(customer.EmiPlan>){




    }



   // return EmiPlan;
//}
//}
