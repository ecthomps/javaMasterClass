package com.chrisThomps;

import java.util.ArrayList;

/**
 * Created by Christian Thompson on 7/8/2017.
 */
public class GearBox {

    //inner class is a class within another class
    public GearBox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
    }

    private ArrayList<Gear> gears;
    private int maxGears, gearNumber = 0;
}
