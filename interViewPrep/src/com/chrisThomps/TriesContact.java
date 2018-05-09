package com.chrisThomps;

import java.util.HashMap;

public class TriesContact {

    private HashMap<String, Integer> contactList = new HashMap<>();

    public int numOfFounds(String nameToFind){
        int result = 0;
        if(contactList.containsKey(nameToFind))
            result = contactList.get(nameToFind);
        return result;
    }

    public void addNameToContact(String contactName){
        String parseString;
        for(int i = 1; i < contactName.length(); i++){
            parseString = contactName.substring(0, i);
            if(contactList.containsKey(parseString))
                contactList.put(parseString, contactList.get(parseString) + 1);
            else
                contactList.put(parseString, 1);
        }
    }
}
