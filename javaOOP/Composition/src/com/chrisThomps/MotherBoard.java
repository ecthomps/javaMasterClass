package com.chrisThomps;

/**
 * Created by Christian Thompson on 5/18/2017.
 */
public class MotherBoard {

    public MotherBoard(String model, String manufactutrer, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufactutrer = manufactutrer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName){
        System.out.println("Program " + programName + " is now loading");
    }

    public String getModel() {
        return model;
    }

    public String getManufactutrer() {
        return manufactutrer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }

    private String model, manufactutrer;
    private int ramSlots, cardSlots;
    private String bios;
}
