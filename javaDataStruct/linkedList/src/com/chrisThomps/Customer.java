package com.chrisThomps;

/**
 * Created by Christian Thompson on 6/25/2017.
 */
public class Customer {

    public Customer(String customerName, double customerBalance) {
        this.customerName = customerName;
        this.customerBalance = customerBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCustomerBalance() {
        return customerBalance;
    }

    public void setCustomerBalance(double customerBalance) {

        this.customerBalance = customerBalance;
    }

    private String customerName;
    private double customerBalance;
}
