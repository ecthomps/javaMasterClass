package com.chrisThomps;

/**
 * Created by Christian Thompson on 5/22/2017.
 */
public class Kitchen {

    public Kitchen(int drawers, int windows, int counter, Cooker cooker,
                   Zinc zinc, Refrigerator refrigerator) {
        this.drawers = drawers;
        this.windows = windows;
        this.counter = counter;
        this.cooker = cooker;
        this.zinc = zinc;
        this.refrigerator = refrigerator;
    }

    public int getDrawers() {
        return drawers;
    }

    public int getWindows() {
        return windows;
    }

    public int getCounter() {
        return counter;
    }

    public Cooker getCooker() {
        return cooker;
    }

    public Zinc getZinc() {
        return zinc;
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    private int drawers, windows, counter;
    private Cooker cooker;
    private Zinc zinc;
    private Refrigerator refrigerator;
}
