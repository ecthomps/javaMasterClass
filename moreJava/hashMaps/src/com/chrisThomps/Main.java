package com.chrisThomps;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //a map is an associative data structure
            //key1->value, key2->value, key3->value...
        // a hashMap is a dictionary which holds key value pair

        HashMap myHashMap = new HashMap();
        myHashMap.put(1, "Bunny");
        myHashMap.put("Lady", "Beautiful");
        //myHashMap.value();  returns the value in the key
        //returns true or false

        if (myHashMap.containsKey(1))
            System.out.println("Yes " + myHashMap.values());
        else
            System.out.println("Nope");

        //myHashMap.remove("Lady");
        //System.out.println("Value: " + myHashMap.values());

       // System.out.println("Value: " + myHashMap.get(1));
    }
}
