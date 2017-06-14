package com.chrisThomps;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Christian Thompson on 6/13/2017.
 */
public class Bank {

    public Bank(String name) {
        this.name = name;
        this.myBranch = new ArrayList<Branch>();
    }

    public boolean addNewBranch(String branchName){
        if (findBranch(branchName) == null) {
            myBranch.add(new Branch(branchName));
            return true;
        }
        else{
            System.out.println(branchName + " is an existing branch");
            return false;
        }
    }

    public boolean addCustomer2Branch(String branchName, String customerName,
                                      double amount){
        Branch branch = findBranch(branchName);
        if(branch != null)
            return branch.addNewCustomer(customerName, amount);
        return false;
    }

    public boolean addTransaction(String branchName, String customerName,
                                  double amount){
        Branch branch = findBranch(branchName);
        if(branch != null)
            return branch.customerTransaction(customerName, amount);
        return false;
    }

    public boolean listCustomers(String branchName, boolean showTransaction){
        Branch branch = findBranch(branchName);

        if(branch != null){
            ArrayList<Customers> branchCustomers = branch.getMyCustomers();
            System.out.println("Customers details for branch " + branch.getBranchName());
            for(int i = 0; i < branchCustomers.size(); i++){
                Customers customer = branchCustomers.get(i);
                System.out.println("Customer: " + customer.getCustName() + "["
                                   + (i+1) + "]");
                if (showTransaction){
                    System.out.println("Transactions");
                    ArrayList<Double> branchTransaction = customer.getMyTrans();
                    for(int j = 0; j < branchTransaction.size(); j++)
                        System.out.println("[" + (j+1) + "] Amount " +
                                           branchTransaction.get(j));
                }
            }
            return true;
        }
        return false;
    }

    private String name;
    private ArrayList<Branch> myBranch;
    private Branch findBranch(String branchName){
        for (int i = 0; i < myBranch.size(); i++){
            Branch existingBranch = this.myBranch.get(i);
            if(existingBranch.getBranchName().equals(branchName))
                return existingBranch;
        }

        return null;
    }



}
