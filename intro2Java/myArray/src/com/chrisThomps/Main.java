package com.chrisThomps;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int [] myArray = new int[10];
        int [] arrIndex = getArray(10);
        String [] arrString = {"Hey", "I", "Love", "Android"};

        //has a lot of power when used compared to traditional
        //use of array
        ArrayList<String> myString = new ArrayList<String>();

        for (int i = 0; i < arrIndex.length; i++)
            System.out.println(i + " * " + arrIndex[i] + " = "
                               + (i*arrIndex[i]));
        System.out.println();
        for(int i = 0; i < arrString.length; i++)
            System.out.println("At index: " + i + " Array value: "
                               + arrString[i]);
        System.out.println();
        myString.add("Android is amazing");
        myString.add("I love programming");
        myString.add("This is great");

        for(int i = 0; i < myString.size(); i++)
            System.out.println("Items: " + myString.get(i));
        System.out.println();

        //myString.remove(0);
        //String.remove("This is great");

        //enhanced for loop
        for(String items : myString)
            System.out.println("My Items: " + items);

    }

    public static int [] getArray(int number){
        System.out.println("Enter " + number + " integer values");
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[number];

        for(int i = 0; i < values.length; i++)
            values[i] = scanner.nextInt();

        return values;
    }

    public static double getAverage(int[] values){
        int sum = 0;
        for (int i = 0; i < values.length; i++)
            sum += values[i];

        return (double) sum / (double) values.length;
    }
}
