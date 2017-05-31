package com.chrisThomps;

/**
 * Created by Christian Thompson on 5/17/2017.
 */
public class VIPAcct {
    public VIPAcct() {
        this("defaultName", 000000, "defaultemail@email.com");
    }

    public VIPAcct(String name, double creditLimit) {
        this(name, creditLimit, "unknownemail@email.com");
    }

    public VIPAcct(String name, double creditLimit, String email) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    private String name, email;
    private double creditLimit;
}
