package com.chrisThomps;

/**
 * Created by Christian Thompson on 5/22/2017.
 */
public class Cooker {

    public Cooker(String model, String manufacturer, String type,
                  int slots, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.type = type;
        this.slots = slots;
        this.dimensions = dimensions;
    }

    public void showCooker(){
        System.out.println("Cooker model: " + model +
                "\nCooker manucfacture: " + manufacturer +
                "\nCooker has " + slots + " slots" +
                "\nCooker dimensions: " + dimensions);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSlots() {
        return slots;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    private String model, manufacturer, type;
    private int slots;
    private Dimensions dimensions;
}
