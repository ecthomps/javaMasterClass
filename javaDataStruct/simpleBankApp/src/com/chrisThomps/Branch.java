package com.chrisThomps;

import java.util.ArrayList;

/**
 * Created by Christian Thompson on 6/13/2017.
 */
public class Branch {

    public Branch(String branchName) {
        this.branchName = branchName;
        this.myCustomers = new ArrayList<Customers>();
    }

    public boolean addNewCustomer(String customerName, double customerAmount){
        Customers existingCustomer = findCustomer(customerName);

        if(existingCustomer == null){
           myCustomers.add(new Customers(customerName, customerAmount));
           return true;
        }
        else{
            System.out.println(customerName + " already exists");
            return false;
        }

    }


    public boolean customerTransaction(String customerName, double amtTrans){

        Customers existingCustomers = findCustomer(customerName);
        if(existingCustomers != null){
            existingCustomers.addCustTrans(amtTrans);
            return true;
        }
        return false;
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customers> getMyCustomers() {
        return myCustomers;
    }

    private String branchName;
    private ArrayList<Customers> myCustomers;
    private Customers findCustomer(String custName){
        for (int i = 0; i < this.myCustomers.size(); i++) {
            Customers customers = this.myCustomers.get(i);
            if(customers.getCustName().equals(custName))
                return customers;
        }
        return null;
    }
}
