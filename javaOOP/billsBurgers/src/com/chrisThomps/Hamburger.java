package com.chrisThomps;

/**
 * Created by Christian Thompson on 5/30/2017.
 */
public class Hamburger {

    public Hamburger(String rollType, String meat) {

        this.rollType = rollType;
        if(meat.equals("GroundBeef")) {
            this.basePrice = 4.25;
            this.meat = meat;
        }
        else if(meat.equals("GroundChuck")){
            this.basePrice = 6.50;
            this.meat = meat;
        }
        else{
            this.basePrice = 5.00;
            this.meat = meat;
        }
    }

    public void additionalItems(int items){
        this.items = items;
        switch (items){
            case 1: case 2: case 3: case 4:
                setTotalPrice(2.00);
        }
    }

    public void print(){

        System.out.println("Your " + meat + " " + getClass().getSimpleName()
                           + " is ready");
        System.out.println("You order " + rollType + " with "
                           + this.items + " additional items");
        System.out.println("The base price is: " + getBasePrice() +
                           " and your total cost is: " + getTotalPrice());
//        System.out.println("Enjoy!!!");
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger(){
        double hamburgerPrice = this.basePrice;
        System.out.println(this.name + " hamburger on a " + this.rollType
                           + " roll with " + this.meat + " price is "
                           + this.basePrice);
        if(this.addition1Name != null){
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1Name +
                               " for an extra " + this.addition1Price);
        }

        if(this.addition2Name != null){
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2Name +
                    " for an extra " + this.addition2Price);
        }

        if(this.addition3Name != null){
            hamburgerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3Name +
                    " for an extra " + this.addition3Price);
        }

        if(this.addition4Name != null){
            hamburgerPrice += this.addition4Price;
            System.out.println("Added " + this.addition4Name +
                    " for an extra " + this.addition4Price);
        }

        return hamburgerPrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getTotalPrice(){return totalPrice;}

    public  void setTotalPrice(double price){
        totalPrice = basePrice + price;
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeat() {
        return meat;
    }

    private double basePrice, totalPrice;
    private int items;
    private String rollType, meat, name;

    private String addition1Name, addition2Name,
                   addition3Name, addition4Name;
    private double addition1Price, addition2Price,
                   addition3Price, addition4Price;
}
