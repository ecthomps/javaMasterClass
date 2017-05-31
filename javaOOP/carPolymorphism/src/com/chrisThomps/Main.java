package com.chrisThomps;

class Car{

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
        this.doors = 4;
    }

    public String startEngine(){
        if(engine)
            return "Engine starting";
        return "No engine";
    }

    public String accelerate(int incSpeed){
        return "Car accelerate at " + incSpeed
                           + "mph";
    }

    public String brake(int decrSpeed){
        return "Brakes applied : Car decelerate to "
                           + decrSpeed + "mph";
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    private int wheels, doors, cylinders;
    private String name;
    private boolean engine;
}

class Ford extends Car{
    public Ford() {
        super(4, "Escape");
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " Escape starting";
    }

    @Override
    public String accelerate(int incSpeed) {
        return "Ford Escape accelerating at " + incSpeed + "mph";
    }

    @Override
    public String brake(int decrSpeed) {
        return "Ford Escape decelerating to " + decrSpeed + "mph";
    }
}

class GM extends Car{
    public GM() {
        super(6, "Equinox");
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " Equinox starting";
    }

    @Override
    public String accelerate(int incSpeed) {
        return "GM Equinox accelerating at " + incSpeed + "mph";
    }

    @Override
    public String brake(int decrSpeed) {
        return "GM Equinox decelerating to " + decrSpeed + "mph";
    }
}

class RangeRover extends Car{
    public RangeRover() {
        super(6, "Sports");
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " Sports starting";
    }

    @Override
    public String accelerate(int incSpeed) {
        return "RangeRover Sports accelerating at " + incSpeed + "mph";
    }

    @Override
    public String brake(int decrSpeed) {
        return "RangeRover Sports decelerating to " + decrSpeed + "mph";
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i = 1; i < 7; i++){
            Car car = randomCar();
            System.out.println("Car #" + i + " is a " +
                               car.getName() + " has a " + car.getCylinders()
                              + " cylinder" + "\n" + car.startEngine()
                              + "\n" + car.accelerate(70) + "\n"
                              + car.brake(35) + "\n");
        }
    }

    public static Car randomCar(){
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random Number is " + randomNumber);

        switch(randomNumber){
            case 1:
                return new Ford();
            case 2:
                return new GM();
            case 3:
                return new RangeRover();
        }
        return null;
    }
}
