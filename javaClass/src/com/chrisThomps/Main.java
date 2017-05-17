package com.chrisThomps;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //real-world object have two main characteristics
        //state and behavior
        //state is how much ram a computer has, the OS it's running
        //hard drive size
        //behavior for a computer is shutting down, restarting, outputting sound

        Car porsche = new Car();    //all class objects must be initialized
        Car holden = new Car();     //when creating an object always use keyWord new

        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}
