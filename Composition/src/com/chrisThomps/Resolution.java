package com.chrisThomps;

/**
 * Created by Christian Thompson on 5/18/2017.
 */
public class Resolution {

    public Resolution(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    private int width, height;
}
