package com.chrisThomps;

import java.util.ArrayList;
import java.util.HashSet;

public class firstDuplicate {

    /*
    *  int[] arr = {2, 3, 1, 3, 4, 5, 2};
       firstDuplicate duplicate = new firstDuplicate();
       duplicate.firstDuplicate(arr);
    * */

    public void firstDuplicate(int[] arr){

        //traverse through the array
        //if set contains the num return num
        //else add num to set

        boolean noDupFound = true;
        HashSet<Integer> dup = new HashSet<>();

        for (int elem : arr){
            if(!dup.contains(elem))
                dup.add(elem);
            else {
                System.out.print("the first duplicate is: " + elem);
                noDupFound = false;
                break;
            }
        }

        if(noDupFound)
            System.out.print("No Duplicate found: " + -1);
    }
}
