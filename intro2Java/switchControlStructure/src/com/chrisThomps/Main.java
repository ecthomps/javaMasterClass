package com.chrisThomps;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int value = 2;
        if(value == 1)
            System.out.println("Value was 1");
        else if(value == 2)
            System.out.println("Value was 2");
        else
            System.out.println("Value was not 1 or 2");

        //there are four control structures in Java
        //switch, for, while, do while
        //break exits the statement in within the block
        //to the next statement...switch is good to use
        //if you test a single variable and different values
        //on that variable
        int switchValue = 10;
        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:case 4:case 5:
                System.out.println("Value was 3, or 4, or 5");
                System.out.println("Actually it was a " +
                                   switchValue);
                break;
            default:
                    System.out.println("Value was not 1, 2, 3, 4, 5");
        }

        String month = "November";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "november":
                System.out.println("Nov");
                break;
            default:
                System.out.println("Not sure");
        }

        //challenge
        char letter = 'Z';
        switch(letter){
            case 'A':case 'B':case 'C':case 'D':case 'E':
                System.out.println("Found letter " + letter);
                break;
            default:
                System.out.println("Could not find A, B, C, D, or E");
        }
    }
}
