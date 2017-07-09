package com.chrisThomps;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Player chris = new Player("Chris", 10, 15);
        System.out.println(chris.toString());
        saveObject(chris);

        chris.setHitPoints(8);
        System.out.println(chris);
        chris.setWeapon("Stormbringer");
        saveObject(chris);
        //loadObject(chris);
        System.out.println(chris);

        ISaveable werewolf = new Monster("Werewolf", 25, 10);
        System.out.println(werewolf);
        //Note you can't do werewolf.getStrength(); below is how to get it
        System.out.println("Strength = " + ((Monster)werewolf).getStrength());
        saveObject(werewolf);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int choice, index = 0;
        boolean quit = false;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while(!quit){
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0: quit = true;
                        break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave){
        for (int i = 0; i < objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) +
                               " to storage device");
        }
    }

    public static void loadObject(ISaveable loadObject){
        ArrayList<String> values = readValues();
        loadObject.read(values);
    }
}
