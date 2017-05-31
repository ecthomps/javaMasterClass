package com.chrisThomps;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //width of int = 32 (4 bytes)
        int myIntVal = 5 / 3;

        //has a single presision
        //has up to 7 precision digits
        //width of float = 32 (4 bytes)
        float myFloatVal = 7f / 6f;

        //has double precision
        //has up to 16 decimal precision digits
        //width of double = 64 (8 bytes)
        double myDoubleVal = 7d / 6d;

        System.out.println("my int value = " + myIntVal);
        System.out.println("my float value = " + myFloatVal);
        System.out.println("my double value = " + myDoubleVal);

        //convert a given number of pounds to kilograms
        double numPounds = 200d;
        double convPounds2Kilo = numPounds * 0.453_592_37D;
        System.out.println(numPounds + "lbs = " + convPounds2Kilo
                           + "kilos");

        //convert fahrenheit to celsius
        double degFahrenheit = 78d;
        double convFahrenheit2Celsius =  ((degFahrenheit - 32) *
                                          (5/9d));
        System.out.println(degFahrenheit + " deg fahrenheit = " +
                           convFahrenheit2Celsius + " deg Celsius");

    }
}
