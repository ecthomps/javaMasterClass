package com.chrisThomps;

/**
 * Created by Christian Thompson on 5/18/2017.
 */
public class Car extends Vehicle{
    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }

    private int doors, engineCapacity;
}
