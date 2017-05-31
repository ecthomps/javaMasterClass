package com.chrisThomps;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int tonerLevel = 100, noOfPages = 200;
        boolean isDuplex;
        Printer printer = new Printer(tonerLevel, noOfPages);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Using Konica Printer");
        System.out.println();

        System.out.print("Is the printer a duplex: ");
        isDuplex = scanner.nextBoolean();

        System.out.print("\nHow many pages do you want to print: ");
        noOfPages = scanner.nextInt();

        printer.isDuplexPrinter(isDuplex);
        printer.decrPages(noOfPages, isDuplex);


    }
}
