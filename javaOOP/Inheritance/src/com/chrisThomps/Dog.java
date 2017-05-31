package com.chrisThomps;

/**
 * Created by Christian Thompson on 5/18/2017.
 */
public class Dog extends Animal {
    //Animal is the base class while Dog is the derived class
    //use the reserved word "extends" to inherit from another class
    //use the reserved word "super" to call the constructor, methods, and
    //properties of parent class

    public Dog(int size, int weight, String name, int eyes, int legs,
               int tail, int teeth, String coat) {
        super(1, 1, size, weight, name);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        super.eat();
        chew();
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move called()");
        moveLegs(speed);
        super.move(speed);
    }

    private int eyes, legs, tail, teeth;
    private String coat;

    private void chew(){
        System.out.println("Dog.chew() called");
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }
}
