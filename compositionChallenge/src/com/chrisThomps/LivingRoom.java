package com.chrisThomps;

/**
 * Created by Christian Thompson on 5/22/2017.
 */
public class LivingRoom {

    public LivingRoom(int chairs, int tables, int windows, Television television) {
        this.chairs = chairs;
        this.tables = tables;
        this.windows = windows;
        this.television = television;
    }

    public void showLivingRoom(){
        System.out.println("Living room has " + chairs +
                "chairs, " + tables + "tables, " + windows
                + "windows" + "\nTelevision\n\t");
                    television.showTelevision();
    }

    public int getChairs() {
        return chairs;
    }

    public int getTables() {
        return tables;
    }

    public Television getTelevision() {
        return television;
    }

    private int chairs, tables, windows;
    private Television television;
}
