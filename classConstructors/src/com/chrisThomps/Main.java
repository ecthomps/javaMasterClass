package com.chrisThomps;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BankAcct bankTrans = new BankAcct("Christian Thompson",
                "myemail@gmail.com","419-290-3250",
                "3426477845", 10000d);

//        bankTrans.setCustName("Christian Thompson");
//        bankTrans.setEmail("cyoung1117@gmail.com");
//        bankTrans.setBankNumber("3426477845");
//        bankTrans.setCustPhoneNumber("419-290-3250");
//        bankTrans.setBalance(10000d);

        System.out.println();
        System.out.println("Name: " + bankTrans.getCustName() + "\nBank Number:" +
                            bankTrans.getBankNumber() + "\nBalance: " + bankTrans.getBalance()
                           + "\nPhone Number: " + bankTrans.getCustPhoneNumber()
                           + "\nEmail: " + bankTrans.getEmail());

        //transaction
        bankTrans.depAmt(15000.98);
        System.out.println();
        System.out.println("Name: " + bankTrans.getCustName() + "\nBank Number:" +
                bankTrans.getBankNumber() + "\nBalance: " + bankTrans.getBalance()
                + "\nPhone Number: " + bankTrans.getCustPhoneNumber()
                + "\nEmail: " + bankTrans.getEmail());
        bankTrans.withdrawAmt(1300.58);
        System.out.println();
        System.out.println("Name: " + bankTrans.getCustName() + "\nBank Number:" +
                bankTrans.getBankNumber() + "\nBalance: " + bankTrans.getBalance()
                + "\nPhone Number: " + bankTrans.getCustPhoneNumber()
                + "\nEmail: " + bankTrans.getEmail());
        System.out.println("-------------------------");
        System.out.println();
        BankAcct chrisAcct = new BankAcct("Chris", "myemail.com",
                "290-3250");
        System.out.println(chrisAcct.getCustPhoneNumber() + " name " + chrisAcct.getCustName());

        //VIPAcct
        System.out.println("*************************");
        System.out.println();
        VIPAcct topTrans = new VIPAcct();
        System.out.println("VIP Name: " + topTrans.getName() + "\nVIP Email: "
                           + topTrans.getEmail() + "\nVIP Credit: " +
                           topTrans.getCreditLimit());
        System.out.println();
        VIPAcct person2 = new VIPAcct("Bob", 2000.00);
        System.out.println("VIP Name: " + person2.getName() + "\nVIP Email: "
                + person2.getEmail() + "\nVIP Credit: " +
                person2.getCreditLimit());
        System.out.println();
        VIPAcct person3 = new VIPAcct("James", 1000.00,
                                      "james@email.com");
        System.out.println("VIP Name: " + person3.getName() + "\nVIP Email: "
                + person3.getEmail() + "\nVIP Credit: " +
                person3.getCreditLimit());



    }
}
