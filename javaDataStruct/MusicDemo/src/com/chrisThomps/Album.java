package com.chrisThomps;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Christian Thompson on 6/25/2017.
 */
public class Album {


    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songAlbum = new ArrayList<Song>();
    }

   public boolean addSongstoAlbums(String songTitle, double songDuration){
        //find songs first to see if it's already in playList

       if(findSong(songTitle) == null){
           songAlbum.add(new Song(songTitle, songDuration));
           return true;
       }
       System.out.println("Song already exist");
       return false;
    }

    // public boolean addSongstoPlaylist(int trackNumber, LinkedList<Song> songLinkedList)
    public boolean addSongstoPlaylist(int trackNumber, List<Song> songLinkedList){
       int index = trackNumber - 1;
       if(index >= 0 && index <= this.songAlbum.size()){
           songLinkedList.add(this.songAlbum.get(index));
           return true;
       }
        System.out.println("This playlist does not have a track " + trackNumber);
       return false;
    }

    // public boolean addSongstoPlaylist(String songTitle, LinkedList<Song> songLinkedList)
    public boolean addSongstoPlaylist(String songTitle, List<Song> songLinkedList){
        Song checkedSong = findSong(songTitle);
        if(checkedSong != null){
            songLinkedList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + songTitle + " is not in the playlist");
        return false;
    }

    private String name, artist;
    private ArrayList<Song> songAlbum;
    private int findSong(Song song){
        return songAlbum.indexOf(song);
    }
    private Song findSong(String songName){ //for each same normal for loop
        for(Song checkedSong : this.songAlbum){
            if(checkedSong.getSongTitle().equals(songName))
                return checkedSong;
        }
        return null;
    }
}
