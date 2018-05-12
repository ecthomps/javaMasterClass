package com.chrisThomps;

import java.util.Hashtable;

public class RansomNote {

    public boolean isWordsMatch(Hashtable<String, Integer> magazineW,
                                       Hashtable<String, Integer> ransomW){
        if(magazineW == null && ransomW == null)
            return true;

        for(String elem : ransomW.keySet()){
            if(!ransomW.get(elem).equals(magazineW.get(elem)))
                return false;
        }

        return true;
    }
}
