package com.chrisThomps;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //interface specifies method that a particular class
        //must implements --- the interface itself is abstract
        //this means there is no code in the method, but you supply
        //the method name and parameters...the actual code goes in
        //the class that you're creating

        //you use an interface to provide a common behavior
        //that can be used by several classes,  but having them all
        //implement the same interfaces

        ITelephone iTelephone = new DeskPhone(123456);
        iTelephone.powerON();
        iTelephone.dial(123456);
        iTelephone.answer();
    }
}
