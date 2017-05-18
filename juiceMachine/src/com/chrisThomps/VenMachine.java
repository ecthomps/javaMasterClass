package com.chrisThomps;

/**
 * Created by Christian Thompson on 5/18/2017.
 */
public class VenMachine {

    public void showSelection(){
        System.out.println("***Welcome to Chris's Juice Shop***" +
                "\nTo select an item, enter" + "\n1 for ORANGE JUICE"
                +"\n2 for APPLE JUICE" + "\n3 for MANGO JUICE" +
                "\n4 for STRAWBEERY BANANA" + "\n9 to exit");
    }

    public void custSelection(int custChoice){
        switch(custChoice){
            case 1:
                System.out.println("Please deposit $1.50");
                break;
            case 2:
                System.out.println("Please deposit $2.00");
                break;
            case 3:
                System.out.println("Please deporsit $1.00");
                break;
            case 4:
                System.out.println("Please deposit $2.50");
                break;
            case 9:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid Data entered");
        }
    }

    public void print(){
        System.out.println("Collect your item at the bottom and enjoy");
    }


}
