package com.chrisThomps;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created by Christian Thompson on 6/25/2017.
 */
public class Demo {

    //iterator is a way of accessing entry or going through an array
    //or arrayList altogether

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();

        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);

        addInOrder(placesToVisit, "Alice Springs");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);
        visit(placesToVisit);

//        placesToVisit.add("Sydney");
//        placesToVisit.add("Melbourne");
//        placesToVisit.add("Brisbane");
//        placesToVisit.add("Perth");
//        placesToVisit.add("Canberra");
//        placesToVisit.add("Adelaide");
//        placesToVisit.add("Darwin");
//        printList(placesToVisit);
//        //now insert a String to the list
//        placesToVisit.add(1, "Alice Springs");
//        printList(placesToVisit);
//        //remove a String from the list
//        placesToVisit.remove(4);
//        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();

        while(i.hasNext()){ //works as a for loop
            System.out.println("Now visiting: " + i.next());    //i.next == i++
        }

        System.out.println("=================================");
    }

    //inserting a list in order  --> used ListIterator
    //ListIterator made for sorting list
    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> listIterator = linkedList.listIterator();

        while(listIterator.hasNext()){
            int cityComparison = listIterator.next().compareTo(newCity);
            if(cityComparison == 0) {
                //cities are equal, so do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if(cityComparison > 0){
                //add newCity before current city
                //current city == Brisbane --> newCity == Adelaide
                //note: listIterator.next has already moved the position to
                //the next position in the list --> you want to go back to
                //add newCity before the previous city

                //listIterator lets you go back vs the normal iterator
                listIterator.previous();
                listIterator.add(newCity);
                return true;
            } else if(cityComparison < 0){
                //move on to next city
            }
        }

        //gone through entire list without finding a suitabke outcome
        listIterator.add(newCity);
        return true;
    }

    private static boolean visit(LinkedList<String> cities){
        Scanner scanner = new Scanner(System.in);
        ListIterator<String>  listIterator = cities.listIterator();
        boolean quit = false;
        boolean goingForward = true;

        if(cities.isEmpty()){
            System.out.println("No cities in the itenerary");
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0: System.out.println("Vacation is over");
                            break;
                case 1:
                    if(!goingForward){  //let's you go next, then go next to the nextEntry
                        if(listIterator.hasNext()){ //to allow you to start from where you
                            listIterator.next();    // left of --> !!!avoids infinite loop
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else{
                        System.out.println("Reached end of our list");
                        goingForward = false;
                        //printMenu();
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting " + listIterator.previous());
                    } else{
                        System.out.println("We are at the start of our list");
                        goingForward = true;
                        //printMenu();
                    }
                    break;
                case 3: printMenu();
                    break;
            }
        }
        return true;
    }

    private static void printMenu(){
        System.out.println("Available options\nPress");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - show menu options");
    }
}
