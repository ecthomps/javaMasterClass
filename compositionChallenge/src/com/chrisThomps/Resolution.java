package com.chrisThomps;

/**
 * Created by Christian Thompson on 5/22/2017.
 */
public class Resolution {

    public Resolution(int xRes, int yRes) {
        this.xRes = xRes;
        this.yRes = yRes;
    }

    public void showResolution(){
        System.out.println(xRes + "x" + yRes + " resolution");
    }
    public int getxRes() {
        return xRes;
    }

    public int getyRes() {
        return yRes;
    }

    private int xRes, yRes;
}
