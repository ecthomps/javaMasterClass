package com.chrisThomps;

/**
 * Created by Christian Thompson on 5/18/2017.
 */
public class Dimensions {

    public Dimensions(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }

    private int width, height, depth;
}
