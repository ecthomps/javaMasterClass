package com.chrisThomps;

/**
 * Created by Christian Thompson on 5/17/2017.
 */
public class BankAcct {

    BankAcct(){
        //use the "this" operator to call another constructor
        //the "this" operator must be the first statement in constructor body
        //in constructors don't call any other method other than a constructor
        this("Default Name", "Default email",
             "00000000", "123456789", 0.00);
    }
    BankAcct(String custName, String email, String custPhoneNumber,
             String bankNumber, double balance){
        this.custName = custName;
        this.email = email;
        this.custPhoneNumber = custPhoneNumber;
        this.bankNumber = bankNumber;
        this.balance = balance;
    }

    public BankAcct(String custName, String email, String custPhoneNumber) {
        //alt + insert to generate new constructor
        this(custName, email, custPhoneNumber, "123456789", 0.00);
    }
//    public void setBankNumber(String bankNumber){
//        this.bankNumber = bankNumber;
//    }
//
//    public void setCustPhoneNumber(String custPhoneNumber){
//        this.custPhoneNumber = custPhoneNumber;
//    }
//
//    public void setBalance(double balance){
//        this.balance = balance;
//    }
//
//    public void setCustName(String custName){
//        this.custName = custName;
//    }
//
//    public void setEmail(String email){
//        this.email = email;
//    }

    public String getBankNumber(){
       return bankNumber;
    }

    public String getCustPhoneNumber(){
        return custPhoneNumber;
    }

    public double getBalance(){
        return balance;
    }

    public String getCustName(){
        return custName;
    }

    public String getEmail(){
        return email;
    }

    public void depAmt(double amt){
        balance += amt;
    }

    public void withdrawAmt(double amt){
        if (balance < 0 || amt > balance)
            System.out.println("Insufficient funds");
        else
            balance -= amt;
    }

    private double balance;
    private String custName, email, bankNumber, custPhoneNumber;
}
