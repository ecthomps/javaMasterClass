package com.chrisThomps;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Bank bank = new Bank("National Australian Bank");

        bank.addNewBranch("Adelaide");
        bank.addCustomer2Branch("Adelaide", "Tim", 50.05);
        bank.addCustomer2Branch("Adelaide", "Chris", 200.00);
        bank.addCustomer2Branch("Adelaide", "Mary", 105.05);

        bank.addNewBranch("Sydney");
        bank.addCustomer2Branch("Sydney", "Bob", 174.85);

        bank.addTransaction("Adelaide", "Tim", 44.56);
        bank.addTransaction("Adelaide", "Chris", 80.56);
        bank.addTransaction("Adelaide", "Mary", 105.96);
        bank.addTransaction("Adelaide", "Chris", 300.90);
        bank.addTransaction("Adelaide", "Mary", 190.99);

        bank.listCustomers("Adelaide", false);
        bank.listCustomers("Sydney", true);

        bank.addNewBranch("Melbourne");
        if(!bank.addCustomer2Branch("Melbourne", "Yesh",
                                    300.56)){
            System.out.println("Error: Branch doesn't exist");
        }

    }
}
