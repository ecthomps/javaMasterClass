package com.chrisThomps;

/**
 * Created by Christian Thompson on 5/18/2017.
 */
public class Fish extends Animal{

    public Fish(int size, int weight, String name,
                int gills, int eyes, int fins) {
        super(1, 1, size, weight, name);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    public void rest(){
        System.out.println("Fish.rest() called");
    }

    public void moveMuscle(int speed){
        System.out.println("Fish.moveMuscle() called");
    }

    public void moveBackFin(int speed){
        System.out.println("Fish.moveBackFin() called");
    }

    public void swim(int speed){
        moveMuscle(speed);
        moveBackFin(speed);
        super.move(speed);
        System.out.println("Fish.swim() called");
    }

    private int gills, eyes, fins;
}
