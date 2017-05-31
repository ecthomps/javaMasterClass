package com.chrisThomps;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //char has a width of 16 (2 byte)
        char myChar = 'A';

        //follow link to create a unicode character
        //https://unicode-table.com/en/#control-character
        //e.g of how to create a copyright unicode
        char myUniCode = '\u00A9';
        char registerUniCode = '\u00AE';

        System.out.println("Unicode character was " + myUniCode);
        System.out.println("Register unicode = " + registerUniCode);

        boolean isMale = true;
        boolean isFemale = false;


    }
}
