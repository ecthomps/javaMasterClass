package com.chrisThomps;

/**
 * Created by Christian Thompson on 5/22/2017.
 */
public class Bedroom {

    public Bedroom(int bed, int table, int closet, int door,
                   int chair, int window, Television television, Bathroom bathroom) {
        this.bed = bed;
        this.table = table;
        this.closet = closet;
        this.door = door;
        this.chair = chair;
        this.window = window;
        this.television = television;
        this.bathroom = bathroom;
    }

    public void showBedroom(){
        System.out.println("Bedroom has " + bed + "bed(s), "
                           + door + "door(s), " + chair + "chair(s), "
                           + table + "table(s)\n\t" + closet +"closet, "
                           + window + "\nwindow(s)" + "\nTelevision\n\t");
                           television.showTelevision();
        System.out.println("\nBathroom\n\t");
                           bathroom.showBathroom();
    }

    public int getBed() {
        return bed;
    }

    public int getTable() {
        return table;
    }

    public int getCloset() {
        return closet;
    }

    public int getDoor() {
        return door;
    }

    public int getChair() {
        return chair;
    }

    public int getWindow() {
        return window;
    }

//    public Bathroom getBathroom() {
//        bathroom.showBathroom();
//    }

    private int door, chair, window;
    private int bed, table, closet;
    private Television television;
    private Bathroom bathroom;

}
