package com.chrisThomps;

/**
 * Created by Christian Thompson on 5/22/2017.
 */
public class Zinc {

    public Zinc(String model, String manufacturer, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.dimensions = dimensions;
    }

    public void showZinc(){
        System.out.println("Zinc model: " + model +
                          "\nZinc manucfacture: " + manufacturer +
                          "\nZinc dimensions: " + dimensions);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    private String model, manufacturer;
    private Dimensions dimensions;
}
