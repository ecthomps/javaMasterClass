package com.chrisThomps;

/**
 * Created by Christian Thompson on 5/16/2017.
 */
public class Car {
    //a class is a blueprint for an object
    //there are four access levels (Access modifiers)
        /**
         * public - everyone can access these instance variables
         * private - only this class can access these variables
         * protected - within the same package and/or derived class
         *default - this is the default - if any other modifiers are missing
         *          Java uses this one which means accessible within a package
         * */
    //encapsulation in Java is used to hide the methods from being accessed publicly

    //behavior components
    public void setModel(String model){ //mutuator
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore"))
            this.model = model;
        else
            this.model = "Unknown";
    }

    public String getModel(){
        return this.model;
    }

    //state components
    private int door, wheels;
    private String model, engine, color;

}
