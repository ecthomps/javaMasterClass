package com.chrisThomps;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //linkedList is an alternative to an array
        //it stores the actual link to the next item in the list
        //as well as the data...each element in the list holds a linked to the other
        //item that follows it including the value you want to store as well

        //java implemented the linkedList as a double list
        //allows you to go to the next item in a forward motion
        //as well as it allows you to return back to the previous items
        //stores reference to the previous item as well as a link (or reference)
        // to the next entry
        //java allocates four bytes of Integer for each linkedList address

        //psvm -> public static void main

        Customer customer = new Customer("Chris",
                                         100.00);
        Customer anotherCustomer = customer;    //this causes shallow copy

        anotherCustomer.setCustomerBalance(1000.00);
        System.out.println("Balance for customer " + customer.getCustomerName()
                            + " is " + customer.getCustomerBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for (int i = 0; i < intList.size(); i++)
            System.out.println(i + " - " + intList.get(i));

        System.out.println();
        intList.add(1, 2);
        for (int i = 0; i < intList.size(); i++)
            System.out.println(i + " - " + intList.get(i));

        System.out.println();
        intList.remove(1);
        for (int i = 0; i < intList.size(); i++)
            System.out.println(i + " - " + intList.get(i));

        System.out.println();
        intList.set(1, 2);
        for (int i = 0; i < intList.size(); i++)
            System.out.println(i + " - " + intList.get(i));
    }
}
