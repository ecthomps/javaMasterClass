package com.chrisThomps;

import java.awt.*;

/**
 * Created by Christian Thompson on 5/22/2017.
 */
public class Toilet {

    public Toilet(String manufacturer, Dimensions dimensions) {
        this.manufacturer = manufacturer;
        this.dimensions = dimensions;
    }

    public void showToilet(){
        System.out.println("Toilet manucfacture: " + manufacturer +
                           "\nToilet dimensions: " + dimensions);
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
