package com.neoteric.loanapplication.model;

public class Address {
    public String StreetName;

    public String Area;

    public String City;

    public String District;

    public int PinCode;

    @Override
    public String toString() {
        return "Address{" +
                "StreetName='" + StreetName + '\'' +
                ", Area='" + Area + '\'' +
                ", City='" + City + '\'' +
                ", District='" + District + '\'' +
                ", PinCode=" + PinCode +
                '}';
    }
}
