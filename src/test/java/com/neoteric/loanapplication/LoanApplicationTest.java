package com.neoteric.loanapplication;

import com.neoteric.loanapplication.model.Address;
import com.neoteric.loanapplication.model.EmiPlan;
import com.neoteric.loanapplication.model.LoanAmount;
import com.neoteric.loanapplication.model.LoanApplication;
import com.neoteric.loanapplication.service.LoanAmountService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoanApplicationTest {


    @Test

    public void test(){

        LoanApplication customer=new LoanApplication();

        customer.firstName="sampath";
        customer.lastName="Nandha";
        customer.age=28;
        customer.phoneNumber=9877665543l;
        customer.designation="software";
        customer.Salary=50000;
        customer.monthlyExpenses=20000;
        customer.remainingsalaryamount=30000;
        customer.loanAmountrequired=300000;
        customer.companyName="TCS";

        customer.EmiPlan="twoyearplan";



        Address Aaddress=new Address();

        Aaddress.StreetName = "manasa nagar";
        Aaddress.Area = "busstand backside";
        Aaddress.City = "suryapet";
        Aaddress.District = "suryapet";
        Aaddress.PinCode = 232222;

        customer.address=Aaddress;


        EmiPlan EmiPlan=new EmiPlan();

        EmiPlan.noOfyears="twoyears";

        EmiPlan.yearplan="3420000";
        EmiPlan.yearmonthlyEmi=28500;
        EmiPlan.yearinstrestRate="42000";


        LoanAmountService loanAmountService=new LoanAmountService();

        LoanAmount loanAmount=loanAmountService.getLoanAmount(customer);






        System.out.println(customer);
        System.out.println(loanAmount);


    }



}
