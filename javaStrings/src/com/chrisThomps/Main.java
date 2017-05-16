package com.chrisThomps;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //there are 8 primitive data types in Java
        //byte, short, int, long, float, double, char, boolean

        //string is not a primitive data type
        //it's actually a class

        String myString = "This is a string";
        System.out.println("my string is equal to " + myString);
        myString = myString + ", and this is more";
        System.out.println("my string is equal to " + myString);
        myString = myString + " \u00A9 2017";
        System.out.println("my string is equal to " + myString);

        String numString = "250.55";
        numString = numString + "49.95";
        System.out.println("my num string is equal to " + numString);
    }
}
