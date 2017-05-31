package com.chrisThomps;

/**
 * Created by Christian Thompson on 5/22/2017.
 */
public class Television {

    public Television(String model, String manufacturer, String color,
                      Resolution resolution, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.color = color;
        this.resolution = resolution;
        this.dimensions = dimensions;
    }

    public void showTelevision(){
        System.out.println("Television model: " + model +
                "\nTelevision manufacturer: " + manufacturer +
                "\nTelevision resolutiomn\n\t");
                 resolution.showResolution();
        System.out.println("\nTelevision dimensions\n\t" + dimensions);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    private String model, manufacturer, color;
    private Resolution resolution;
    private Dimensions dimensions;
}
