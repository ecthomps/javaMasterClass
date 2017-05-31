package com.chrisThomps;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Inheritance: is creating a new object(class) from an
        //existing object (class)
        //Encapsulation: is the ability to combe data and operation
        //on that single unit
        //Polymorphism: the ability to use the same expression to denote
        //a different operations

        Animal animal = new Animal(1, 1, 5, 10,
                                   "Animal");
        Dog dog = new Dog(10, 40, "Bingo", 2,
                          4, 1, 20, "long silk");
        dog.eat();
        dog.walk();
        dog.run();
        System.out.println("_______________________");
        Fish fish = new Fish(2, 4, "Dory", 30,
                             2, 6);
        fish.swim(100);
    }
}
