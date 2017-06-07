package com.chrisThomps;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
	// write your code here

        //List are another way of looking at an array effectively
        //It is an ordered collection...
            // it extends the Collection interface in Java
        //an array is a list or it's a sequeance of items
            //an ArrayList inherits from an abstract list

        boolean quit = false;
        int choice = 0;

        printInstructions();

            while (!quit) {
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {

                    case 0: printInstructions(); break;
                    case 1: groceryList.printGroceryList(); break;
                    case 2: addItem(); break;
                    case 3: modifyItem(); break;
                    case 4: removeItem(); break;
                    case 5: searchforItem(); break;
                    case 6: quit = true;
                        break;
                }
            }
    }

    public static void printInstructions(){
        System.out.print("Press\n ");
        System.out.println("\t 0 - to print choice options.");
        System.out.println("\t 1 - to print list of grocery items.");
        System.out.println("\t 2 - to add an item to the list.");
        System.out.println("\t 3 - to modify an item in the list.");
        System.out.println("\t 4 - to remove an item from the list.");
        System.out.println("\t 5 - to search for an itme in the list.");
        System.out.println("\t 6 - to quit the application.");
    }

    public static void addItem(){
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
//        System.out.print("Enter item number: ");
//        int itemNumber = scanner.nextInt();
//        scanner.nextLine();
        System.out.println("Enter item to replace: ");
        String item = scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(item, newItem);
    }

    public static void removeItem(){
        System.out.print("Enter item to delete: ");
        String item = scanner.nextLine();

        groceryList.removeGroceryItem(item);
    }

    public static void searchforItem(){
        System.out.print("Enter search item: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem))
            System.out.println("Found " + searchItem + " in grocery list");
        else
            System.out.println(searchItem + " is not in grocery list");
    }

    public static void processArray(){
        //how to copy one arrayList into another
        ArrayList<String> newArrayList = new ArrayList<String>();
        newArrayList = groceryList.getMyGrocery();

        //or
        ArrayList<String> anotherArrayList = new ArrayList<String>
                                             (groceryList.getMyGrocery());

        //how to convert an ArrayList to an array
        String [] newArray = new String[groceryList.getMyGrocery().size()];
        newArray = groceryList.getMyGrocery().toArray(newArray);

    }
}
