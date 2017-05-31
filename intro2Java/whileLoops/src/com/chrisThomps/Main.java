package com.chrisThomps;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //for loop lets you loop for a specific number of times
        //while loop lets you loop until an expression becomes false
        //(in this case, you don't know how many times you want to loop)
        int count = 1;
        while(count != 6){
            System.out.println("Count is " + count);
            count++;
        }

        count = 1;
        System.out.println("********************");
        while(true){
            if(count == 6)
                break;
            System.out.println("Count is " + count);
            count++;
        }

        count = 1;
        System.out.println("********************");
        do{
            System.out.println("Count is " + count);
            count++;
        }while(count != 6);

        System.out.println("********************");
        count = 0;
        int number = 5;
        int finsih = 20;
        while(number <= finsih){
            if(!isEvenNumber(number)){
                number++;
                continue;
            }

            System.out.println(number + " is an Even Number");
            number++;
            count++;

            if(count == 5)
                break;
        }

        System.out.println("There are " + count + " even numbers");
    }

    public static boolean isEvenNumber(int num){
        if (num % 2 == 0)
            return true;
        return false;
    }
}
