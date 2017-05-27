package com.chrisThomps;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double num, max, large = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 10 numbers below");
        num = scanner.nextDouble();
        max = num;

        for(int i = 0; i < 10; i++) {
            num = scanner.nextDouble();
            max = larger(num, max);
        }
        System.out.println("The maximum number is: " +
                          String.format("%.2f", max));

    }


    public static double larger (double num, double max){
        if(num > max)
            max = num;

        return max;
    }

}
