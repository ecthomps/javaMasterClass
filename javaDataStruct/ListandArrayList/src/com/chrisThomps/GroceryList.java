package com.chrisThomps;

import java.util.ArrayList;

/**
 * Created by Christian Thompson on 6/7/2017.
 */
public class GroceryList {

    public void addGroceryItem(String item){
        myGrocery.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have " + myGrocery.size() + " grocery items");

        for(int i = 0; i < myGrocery.size(); i++)
            System.out.println((i+1) + ". " + myGrocery.get(i));
    }

//    public void modifyGroceryItem(String item){
//        int position = findItem(item);
//        modifyGroceryItem(position, item);
//    }

    public void modifyGroceryItem(String repItem, String item) {
        int position = findItem(repItem);

        if(position > 0) {
            myGrocery.set(position, item);
            System.out.println("Grocery item " + (position + 1) + " " +
                    "has been modified");
        }
    }

    public void removeGroceryItem(String item){
        //String delItem = myGrocery.get(position);
        int position = findItem(item);
        if(position > 0)
         myGrocery.remove(position);
    }

    public ArrayList<String> getMyGrocery() {
        return myGrocery;
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);

        if(position > 0)
            return true;
        return false;
    }

    private ArrayList<String> myGrocery = new ArrayList<String>();
    private int findItem(String searchItem){
        //boolean isItem = myGrocery.contains(searchItem);
        return myGrocery.indexOf(searchItem);
    }

}
