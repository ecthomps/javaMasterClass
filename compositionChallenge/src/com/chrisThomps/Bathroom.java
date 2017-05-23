package com.chrisThomps;

/**
 * Created by Christian Thompson on 5/22/2017.
 */
public class Bathroom {

    public Bathroom(int window, int mirror, int door,
                    Toilet toilet, Zinc zinc, Shower shower) {
        this.window = window;
        this.mirror = mirror;
        this.door = door;
        this.toilet = toilet;
        this.zinc = zinc;
        this.shower = shower;
    }

    public void showBathroom(){
        System.out.println("Bathroom has " + window + " window(s), "
                          + door + " doors, " + mirror + " mirrors"
                          + "\nBathroom zinc\n\t");
                        zinc.showZinc();
        System.out.println("\nBathroom shower:\n\t");
                        shower.showShower();
        System.out.println("\nBathroom toilet:\n\t");
                        toilet.showToilet();
    }

    public int getWindow() {
        return window;
    }

    public Toilet getToilet() {
        return toilet;
    }

    public Zinc getZinc() {
        return zinc;
    }

    public int getMirror() {
        return mirror;
    }

    public int getDoor() {
        return door;
    }

    public Shower getShower() {
        return shower;
    }

    private int window, mirror, door;
    private Toilet toilet;
    private Zinc zinc;
   private Shower shower;
}
