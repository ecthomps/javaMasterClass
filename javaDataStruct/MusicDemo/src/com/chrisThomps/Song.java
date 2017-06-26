package com.chrisThomps;

/**
 * Created by Christian Thompson on 6/25/2017.
 */
public class Song {

    public Song(String songTitle, double duration) {
        this.songTitle = songTitle;
        this.duration = duration;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return this.songTitle + ": " + this.duration;
    }

    private String songTitle;
    private double duration;
}
