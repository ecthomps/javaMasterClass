package com.chrisThomps;

/**
 * Created by Christian Thompson on 5/22/2017.
 */
public class House {

    public House(int garage, LivingRoom livingRoom, Kitchen kitchen, Diningroom diningroom, Bedroom bedroom) {
        this.garage = garage;
        this.livingRoom = livingRoom;
        this.kitchen = kitchen;
        this.diningroom = diningroom;
        this.bedroom = bedroom;
    }

    public int getGarage() {
        return garage;
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public Diningroom getDiningRoom() {
        return diningroom;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }



    private int garage;
    private LivingRoom livingRoom;
    private Kitchen kitchen;
    private Diningroom diningroom;
    private Bedroom bedroom;
}
