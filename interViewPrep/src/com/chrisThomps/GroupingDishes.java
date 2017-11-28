package com.chrisThomps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class GroupingDishes {

    /*
    * String[][] dishes = new String[][]
                {{"Salad", "Tomato", "Cucumber", "Salad", "Sauce"},
                {"Pizza", "Tomato", "Sausage", "Sauce", "Dough"},
                {"Quesadilla", "Chicken", "Cheese", "Sauce"},
                {"Sandwich", "Salad", "Bread", "Tomato", "Cheese"}};

        GroupingDishes groupingDishes = new GroupingDishes();

        String[][] showDishes = groupingDishes.groupingDishes(dishes);

        for(String[] elem : showDishes){
            for(int i = 0; i < elem.length; i++){
                System.out.print(elem[i] + " ");
            }
            System.out.println();
        }
    * */
    public String[][] groupingDishes(String[][] dishes){
        Map<String, ArrayList<String>> ingr = new TreeMap();

        //iterate through the array to create hashMap
        for(String[] elem : dishes){
            for(int i = 1; i < elem.length; i++){
                ArrayList<String> dish = new ArrayList<>();
                if(!ingr.containsKey(elem[i])){
                    dish.add(elem[0]);
                    ingr.put(elem[i], dish);
                } else {
                    ingr.get(elem[i]).add(elem[0]);
                }
            }
        }

        //remove ingr with one dish else sort list
        for(String[] elem : dishes){
            for(int i = 1; i < elem.length; i++){
                if(ingr.get(elem[i]).size() < 2)
                    ingr.remove(elem[i]);
                else
                    Collections.sort(ingr.get(elem[i]));
            }
        }

        String[][] ingrDish = new String[ingr.size()][];
        int index = 0;

        for (Map.Entry<String, ArrayList<String>> elem : ingr.entrySet()){
            //add ingredient at the beginning of the list
            elem.getValue().add(0, elem.getKey());
            ingrDish[index++] = elem.getValue().toArray(new String[0]);
        }

        return ingrDish;
    }
}
