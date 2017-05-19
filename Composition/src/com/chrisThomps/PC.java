package com.chrisThomps;

/**
 * Created by Christian Thompson on 5/18/2017.
 */
public class PC {

    public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherBoard;
}
