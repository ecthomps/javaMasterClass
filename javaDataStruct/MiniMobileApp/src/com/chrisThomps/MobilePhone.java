package com.chrisThomps;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Christian Thompson on 6/7/2017.
 */
public class MobilePhone {

    public MobilePhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        contactList = new ArrayList<Contacts>();
    }

    public boolean addNewContact(Contacts contacts){
        int foundPosition = findContacts(contacts);

        if (foundPosition < 0) {
            System.out.println("Contact already exist");
            return false;
        }

        contactList.add(contacts);
        return true;
    }

    public boolean updateContact(Contacts oldContacts, Contacts newContacts){
        int foundPosition = findContacts(oldContacts);

        if (foundPosition < 0) {
            System.out.println(oldContacts.getContactName() + " was not found!");
            return false;
        }
        else {
            this.contactList.set(contactList.indexOf(oldContacts), newContacts);
            System.out.println(oldContacts.getContactName() + " was replaced " +
                               "with " + newContacts.getContactName());
            return true;
        }
    }

    public String queryContact(Contacts contacts){
        if(findContacts(contacts) >= 0)
            return contacts.getContactName();
        return null;
    }

    public Contacts queryContact(String name){
        int position = findContacts(name);
        if(position >= 0)
            return this.contactList.get(position);
        return null;
    }

    public boolean removeContact(Contacts contacts){
        int foundPosition = findContacts(contacts);

        if (findContacts(contacts.getContactName()) < 0) {
            System.out.println(contacts.getContactName() + " was not found!");
            return false;
        }
        else{
            contactList.remove(foundPosition);
            System.out.println(contacts.getContactName() + " was deleted");
            return true;
        }
    }

    public void printContacts(){
        System.out.println("Contact List");
        for(int i = 0; i < contactList.size(); i++){
            System.out.println((i+1) + ". " + this.contactList.get(i).getContactName()
                               + "->" + this.contactList.get(i).getPhoneNumber());
        }
    }


    private String phoneNumber;
    private ArrayList<Contacts> contactList;
    private int findContacts(Contacts contacts){
        return contactList.indexOf(contacts);
    }

    private int findContacts(String contactName){
        for(int i = 0; i < this.contactList.size(); i++){
            Contacts contacts = this.contactList.get(i);
            if(contacts.getContactName().equals(contactName))
                return i;
        }

        return -1;
    }
}
