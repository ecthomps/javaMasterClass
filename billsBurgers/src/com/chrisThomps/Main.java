package com.chrisThomps;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String rollType, meat, burgerType;
        int noOfItems;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Bill Burger");
        System.out.println("What type of Hamburger do you want: ");
        System.out.println("Regular     HealthyBurger       DeluxeBurger" +
                           "(comes with Chips and Drinks)");

        burgerType = scanner.next();
        System.out.println("Select Roll Type you want: ");
        rollType = scanner.next();
        System.out.println("Select Meat you want: ");
        meat = scanner.next();

        switch (burgerType){

            case "Regular":
            {
                Hamburger hamburger = new Hamburger(rollType, meat);
                System.out.println("How many items would you like" +
                                   " added to your meal: ");
                noOfItems = scanner.nextInt();
                hamburger.additionalItems(noOfItems);
                hamburger.print();
            }
            case "HealthyBurger":
            {
                HealthyBurger healthyBurger = new HealthyBurger(meat);
                System.out.println("How many items would you like" +
                        " added to your meal: ");
                noOfItems = scanner.nextInt();
                healthyBurger.additionalItems(noOfItems);
                healthyBurger.print();
            }
            case "DeluxeBurger":
            {
                DeluxeBurger deluxeBurger = new DeluxeBurger(rollType, meat);
                System.out.println("How many items would you like" +
                        " added to your meal: ");
                noOfItems = scanner.nextInt();
                deluxeBurger.additionalItems(noOfItems);
                deluxeBurger.print();
            }
        }
        System.out.println("Enjoy!!!");
    }
}
