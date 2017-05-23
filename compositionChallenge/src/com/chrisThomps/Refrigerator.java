package com.chrisThomps;

/**
 * Created by Christian Thompson on 5/22/2017.
 */
public class Refrigerator {

    public Refrigerator(String model, String manufacturer, int doors,
                        int voltage, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.doors = doors;
        this.voltage = voltage;
        this.dimensions = dimensions;
    }

    public void showRefrigerator(){
        System.out.println("Refrigerator model: " + model +
                "\nRefrigerator manucfacture: " + manufacturer +
                "\nRefrigerator has " + doors + " doors" +
                "\nRefrigerator voltage: " + voltage + "V" +
                "\nZinc dimensions: " + dimensions);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getDoors() {
        return doors;
    }

    public int getVoltage() {
        return voltage;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    private String model, manufacturer;
    private int doors, voltage;
    private Dimensions dimensions;
}
