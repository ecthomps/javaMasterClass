package com.chrisThomps;

/**
 * Created by Christian Thompson on 5/18/2017.
 */
public class Car extends Vehicle{

    public Car(String name, int size, int wheels, int doors,
               int gear, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gear = gear;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear){
        this.currentGear = currentGear;
        System.out.println("Car.changeGear(): Changed to gear "
                           + this.currentGear);
    }

    public void changeVelocity(int speed, int direction){
        System.out.println("Car.changeVelocity(): Velocity "
                           + speed + " direction " + direction);
        move(speed, direction);
    }

    private int wheels, doors, gear;
    private boolean isManual;
    private int currentGear;
}
