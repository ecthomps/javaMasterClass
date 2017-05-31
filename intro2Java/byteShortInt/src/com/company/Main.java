package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //int holds more memory space than short
        //short holds more memory space than byte
        //int, short, long, byte are four data types for processing whole numbers

        //int has a width of 32
        int myMinValue = -2_147_483_648; //minimum int value
        int myMaxValue = 2_147_483_647; //maximum int value
        int newVal = 150;
        int myTotal = (myMinValue / 2);

        System.out.println("my total = " + myTotal);

        //byte has a width of 8
        byte myByteValue = 127; //maximum byte value
        byte myByteTotal = (byte) (myByteValue / 2);
        byte newByte = 100;

        System.out.println("my byte total = " + myByteTotal);

        //short has a width of 16
        short myShortValue = 32767; //maximum short value
        short newShort = 200;

        //long has a width of 64
        //maximum long value = pow(2,63)
        long myLongValue = 100L;
        long newLong = 50000L + 10*(newVal + newByte + newShort);

        System.out.println("my new long total = " + newLong);
    }
}
