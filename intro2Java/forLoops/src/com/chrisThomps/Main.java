package com.chrisThomps;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("10000 at 2% interest = " + calculateInterest(10000,
                                                                         2));
        System.out.println("10000 at 3% interest = " + calculateInterest(10000,
                                                                         3));
        System.out.println("10000 at 4% interest = " + calculateInterest(10000,
                                                                         4));
        System.out.println("10000 at 5% interest = " + calculateInterest(10000,
                                                                         5));

        //the for loop allows you to loop through code a number of times
        //loops until a certain condition is satisfied
        //for(initialize, condition, increment/decrement)
        for(int i = 0; i < 5; i++)
            System.out.println("Loop " + i + " Hello World");
        System.out.println();

        for(int i = 2; i < 9; i++)
            System.out.println("10000 at " + i + "% interest rate = "
                               + String.format("%.2f",calculateInterest(10000, i)));
        System.out.println();

        for(int i = 8; i > 1; i--)
            System.out.println("10000 at " + i + "% interest rate = "
                    + String.format("%.2f",calculateInterest(10000, i)));
        System.out.println();

        //challenge
        int count = 0;
        for (int i = 1; i < 10; i++){
            if(isPrime(i)){
                count++;
                System.out.println(i + " is a Prime Number");
                if(count == 3) {
                    System.out.println("Exiting the for loop");
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interest){
        return (amount * (interest / 100));
    }

    //challenge
    public static boolean isPrime(int num){

        if (num == 1)
            return false;

        for(int i = 2; i <= (long) Math.sqrt(num); i++){    //condition n/2 will work
            if(num % i == 0)                                //but takes up more time
                return false;
        }
        return true;
    }
}
