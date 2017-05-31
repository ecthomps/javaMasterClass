package com.chrisThomps;

import java.util.Scanner;

/**
 * Created by Christian Thompson on 5/30/2017.
 */
public class DeluxeBurger extends Hamburger {

    public DeluxeBurger(String rollType, String meat) {

        super(rollType, meat);
    }

    @Override
    public void additionalItems(int items) {
        super.additionalItems(items);
//        System.out.println("Please select an additional 2 items");
//            choice1 = "chips";
//            choice2 = "drinks";
            setTotalPrice(2.50);
    }

    @Override
    public void setTotalPrice(double price) {
        super.setTotalPrice(price);
    }

    @Override
    public double getTotalPrice() {
        return super.getTotalPrice();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Meal comes with Chips and Drinks");
    }

    private String choice1, choice2;
}
