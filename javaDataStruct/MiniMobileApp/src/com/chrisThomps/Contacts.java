package com.chrisThomps;

/**
 * Created by Christian Thompson on 6/7/2017.
 */
public class Contacts {

    public Contacts(String contactName, String phoneNumber) {
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contacts createContact(String name, String number){
        return new Contacts(name, number);
    }

    private String contactName;
    private String phoneNumber;

}
