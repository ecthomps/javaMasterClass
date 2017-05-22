package com.chrisThomps;

/**
 * Created by Christian Thompson on 5/18/2017.
 */
public class PC {

    //you can only inherit from one class at a time
    //therefore you can use a composition(interface)
    //to inherit from multiple classes
    //to make a composition, create an object from a class
    public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public void powerUp(){
        getTheCase().pressPowerButton(); //monitor.pressButton() much better way
        drawBoard();
    }

    public void drawBoard(){
        //fancy graphics
        monitor.drawPixel(1200, 1400, "yellow");
    }

    private Case getTheCase() {
        return theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private MotherBoard getMotherBoard() {
        return motherBoard;
    }

    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherBoard;
}
