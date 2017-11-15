package com.chrisThomps;

public class ReverseString {

    public void printReverseString(String myString) {

        /*
        *  String readLine = "";
           Scanner scanner = new Scanner(System.in);

           System.out.print("Please enter a string to reverse: ");
           readLine = scanner.nextLine();
           reverseString rev = new reverseString();
           rev.printReverseString(readLine);

        */

        String reverse = new StringBuilder(myString).reverse().toString();
        System.out.println("The reversed of " + myString + "\nis\n"
                + reverse);
    }
}
