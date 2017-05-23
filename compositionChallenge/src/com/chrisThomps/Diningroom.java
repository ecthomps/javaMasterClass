package com.chrisThomps;

/**
 * Created by Christian Thompson on 5/22/2017.
 */
public class Diningroom {

    public Diningroom(int tables, int chairs, int windows) {
        this.tables = tables;
        this.chairs = chairs;
        this.windows = windows;
    }

    public void showDiningRoom(){
        System.out.println("Dining room has " + tables + "tables, "
                           + chairs + "chairs, " + windows + "windows");
    }

    public int getTables() {
        return tables;
    }

    public int getChairs() {
        return chairs;
    }

    public int getWindows() {
        return windows;
    }

    private int tables, chairs;
    private int windows;
}
