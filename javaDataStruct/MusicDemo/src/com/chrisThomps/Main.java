package com.chrisThomps;

import com.sun.javafx.collections.ListListenerHelper;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums= new ArrayList<Album>();
    public static void main(String[] args) {
	// write your code here

        Album album = new Album("WayMaker", "Sinach");
        album.addSongstoAlbums("Way Maker", 4.51);
        album.addSongstoAlbums("I live for you", 3.51);
        album.addSongstoAlbums("He Reigns", 5.12);
        album.addSongstoAlbums("You are so good", 4.02);
        album.addSongstoAlbums("God Alone", 4.37);
        album.addSongstoAlbums("For Me", 3.50);
        album.addSongstoAlbums("Great and Mighty God", 3.42);
        album.addSongstoAlbums("I adore you", 4.35);
        albums.add(album);

        album = new Album("The Son of God", "Nathaniel Bassey");
        album.addSongstoAlbums("Imela", 3.51);
        album.addSongstoAlbums("Take Your Glory", 5.12);
        album.addSongstoAlbums("Someone at the door", 4.02);
        album.addSongstoAlbums("No other God", 4.37);
        album.addSongstoAlbums("This God is too Good", 3.50);
        album.addSongstoAlbums("God of Love", 3.42);
        album.addSongstoAlbums("Glorious God", 4.35);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addSongstoPlaylist("Way Maker", playList);
        albums.get(0).addSongstoPlaylist("I live for you", playList);
        albums.get(0).addSongstoPlaylist("My God", playList); //does not exist
        albums.get(0).addSongstoPlaylist(3, playList);
        albums.get(1).addSongstoPlaylist(1, playList);
        albums.get(1).addSongstoPlaylist(2, playList);
        albums.get(1).addSongstoPlaylist(4, playList);
        albums.get(1).addSongstoPlaylist(10, playList); //does not exist

        play(playList);
    }

    private static void play(LinkedList<Song> playList){
        ListIterator<Song> listIterator = playList.listIterator();
        boolean quit = false;
        boolean isForward = true;
        Scanner scanner = new Scanner(System.in);

        if(playList.size() == 0){
            System.out.println("No songs in the playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0: System.out.println("Playlist completed");
                    break;
                case 1:
                    if(!isForward) {
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        isForward = true;
                    }

                    if(listIterator.hasNext()){
                        System.out.println("Now playing " +
                                listIterator.next().toString());
                    } else {
                        System.out.println("We are at the end of the playList");
                        isForward = false;
                    }
                    break;
                case 2:
                    if(isForward) {
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        isForward = false;
                    }

                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing " +
                                listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playList");
                        isForward = true;
                    }
                    break;
                case 3:
                    if(isForward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now replaying " +
                                        listIterator.previous().toString());
                            isForward = false;
                        } else{
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying " +
                                        listIterator.next().toString());
                            isForward = true;
                        } else{
                            System.out.println("We are at the end of the list");
                        }
                    }
                    break;
                case 4: printList(playList);
                    break;
                case 5: printMenu();
                    break;
                case 6:
                    if(playList.size() > 0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " +
                                                listIterator.next());
                        } else if(listIterator.hasPrevious()){
                            System.out.println("Now playing " +
                                                listIterator.previous());
                        }
                    }
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions\npress " +
                    "0 - to complete playList\n" +
                    "1 - to play next song\n" +
                    "2 - to play previous song\n" +
                    "3 - replay the current song\n" +
                    "4 - to show songs in the playlist\n" +
                    "5 - to show option menu");
    }

    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("=======================");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
