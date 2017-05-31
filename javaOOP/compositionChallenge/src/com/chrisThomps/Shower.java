package com.chrisThomps;

/**
 * Created by Christian Thompson on 5/22/2017.
 */
public class Shower {

    public Shower(String manufacturer, Dimensions dimensions) {
        this.manufacturer = manufacturer;
        this.dimensions = dimensions;
    }

    public void showShower(){
        System.out.println("Shower manucfacture: " + manufacturer +
                           "\nShower dimensions: " + dimensions);
    }
    public String getManufacturer() {
        return manufacturer;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    private String manufacturer;
    private Dimensions dimensions;
}
