package com.chrisThomps;

/**
 * Created by Christian Thompson on 5/18/2017.
 */
public class Monitor {

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixel(int x, int y, String color){
        System.out.println("Drawing pixel for " + x + ", "
                           +  y + " in color " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }

    private String model, manufacturer;
    private int size;
    private Resolution nativeResolution; //declaring a composition (has-a relationship)
}
