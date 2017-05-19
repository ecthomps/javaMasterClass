package com.chrisThomps;

/**
 * Created by Christian Thompson on 5/18/2017.
 */
public class Vehicle {

    public Vehicle(String name, int size) {
        this.name = name;
        this.size = size;
        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public void steer(int currentDirection){
        this.currentDirection += currentDirection;
        System.out.println("Vehicle.steer() : Steering "
                           + " at " + currentDirection);
    }

    public void move(int velocity, int direction){
        currentDirection = direction;
        currentVelocity = velocity;
        System.out.println("Vehicle.move() : Moving at "
                           + currentVelocity + " in a direction "
                           + currentDirection);
    }

    public void stop(){
        this.currentVelocity = 0;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    private String name;
    private int currentDirection, currentVelocity, size;


}
