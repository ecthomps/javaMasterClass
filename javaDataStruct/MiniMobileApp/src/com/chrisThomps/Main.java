package com.chrisThomps;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static int choice = 0;
    private static MobilePhone mobilePhone = new MobilePhone("000000");

    public static void main(String[] args) {
        // write your code here

        boolean quit = false;
        startUp();
        phoneActions();
        while(!quit){
            System.out.println("Enter choice: (6 to show all actions)");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    System.out.println("Shutting down...");
                    quit = true;
                    break;
                case 1: mobilePhone.printContacts(); break;
                case 2: addNewContact(); break;
                case 3: updateContact(); break;
                case 4: removeContact(); break;
                case 5: queryContact(); break;
                case 6: phoneActions();
            }
        }


    }

    public static void startUp(){
        System.out.println("Starting up phone...");
    }

    public static void addNewContact(){
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter contact number: ");
        String number = scanner.nextLine();
        Contacts contacts = Contacts.createContact(name, number);

        if(mobilePhone.addNewContact(contacts))
            System.out.println("New contact added\n\t" +
                                contacts.getContactName() + "->"
                               + contacts.getPhoneNumber());
        else
            System.out.println("Cannot add " + name + " already on file");
    }

    public static void updateContact(){
        System.out.print("Enter contact name to update: ");
        String name = scanner.nextLine();
        Contacts existingContacts = mobilePhone.queryContact(name);

        if(existingContacts == null) {
            System.out.println(name + " not found");
            return;
        }

        System.out.print("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter contact number: ");
        String number = scanner.nextLine();
        Contacts newContacts = Contacts.createContact(newName, number);

        if(mobilePhone.updateContact(existingContacts, newContacts))
            System.out.println("Successfully updated record");
        else
            System.out.println("Error updating record");
    }

    public static void removeContact() {
        System.out.print("Enter contact name to update: ");
        String name = scanner.nextLine();
        Contacts existingContacts = mobilePhone.queryContact(name);

        if (existingContacts == null) {
            System.out.println(name + " not found");
            return;
        }

        if(mobilePhone.removeContact(existingContacts))
            System.out.println("Contact deleted");
        else
            System.out.println("Error deleting contact");
    }

    public static void queryContact() {
        System.out.print("Enter contact name to update: ");
        String name = scanner.nextLine();
        Contacts existingContacts = mobilePhone.queryContact(name);

        if (existingContacts == null) {
            System.out.println(name + " not found");
            return;
        }

        System.out.println("Name: " + existingContacts.getContactName() + "->"
                           + existingContacts.getPhoneNumber());
    }


    public static void phoneActions(){
        System.out.println("Press");
        System.out.println("\t0 - to shutdown");
        System.out.println("\t1 - to print contact");
        System.out.println("\t2 - to add new contact");
        System.out.println("\t3 - to update an existing contact");
        System.out.println("\t4 - to remove an existing contact");
        System.out.println("\t5 - query if an existing contact exist");
        System.out.println("\t6 - to print a list of all available actions");
    }

    public static void addContact(){
        System.out.print("Enter contact name: ");
        String userName = scanner.nextLine();
        System.out.print("Enter contact number: ");
        String userNumber = scanner.nextLine();
    }
}
