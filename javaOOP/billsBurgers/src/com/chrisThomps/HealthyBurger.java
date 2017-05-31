package com.chrisThomps;

import java.util.Scanner;

/**
 * Created by Christian Thompson on 5/30/2017.
 */
public class HealthyBurger extends Hamburger {

    public HealthyBurger(String meat) {

        super("Brown Rye Roll Type", meat);
    }

    @Override
    public void additionalItems(int items) {
        int choice;
        super.additionalItems(items);

        System.out.println("Please select an additional 2 items");
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        switch (choice){
            case 1:case 2:
                setTotalPrice(1.50);
        }
    }

    @Override
    public void setTotalPrice(double price) {
        super.setTotalPrice(price);
    }

    @Override
    public double getTotalPrice() {
        return super.getTotalPrice();
    }

    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double healthyPrice = super.itemizeHamburger();
        if(healthyExtra1Name != null){
            healthyPrice += healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name
                               + " for an extra " + this.healthyExtra1Price);
        }

        if(healthyExtra2Name != null){
            healthyPrice += healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name
                    + " for an extra " + this.healthyExtra2Price);
        }
        return healthyPrice;
    }

    @Override
    public void print() {
        super.print();
    }

    private String choice1, choice2;
    private double total;

    private String healthyExtra1Name, healthyExtra2Name;
    private double healthyExtra1Price, healthyExtra2Price;
}
