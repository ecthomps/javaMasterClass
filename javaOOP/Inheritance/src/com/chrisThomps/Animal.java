package com.chrisThomps;

/**
 * Created by Christian Thompson on 5/18/2017.
 */
public class Animal {

    public Animal(int brains, int body, int size, int weight, String name) {
        this.brains = brains;
        this.body = body;
        this.size = size;
        this.weight = weight;
        this.name = name;
    }

    public void eat(){
        System.out.println("Animal.eat() called");
    }

    public void move(int speed){
        System.out.println("Animal is moving at " + speed + " mph");
    }

    public int getBrains() {
        return brains;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    private int brains, body, size, weight;
    private String name;
}
