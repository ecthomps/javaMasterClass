package com.chrisThomps;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int results = 1 + 2;
        System.out.println("1 + 2 = " + results);

        int prevResults = results;
        results = results - 1;
        System.out.println(prevResults + " - 1 = " + results);

        prevResults = results;
        results = results * 10;
        System.out.println(prevResults + " * 10 = " + results);

        prevResults = results;
        results = results / 5;
        System.out.println(prevResults + " / 5 = " + results);

        prevResults = results;
        results = results % 3;
        System.out.println(prevResults + " % 3 = " + results);

        prevResults = results;
        results += 1;
        System.out.println("Result is now = " + results);
        results *= 10;
        System.out.println("Result is now = " + results);
        results -= 10;
        System.out.println("Result is now = " + results);
        results /= 5;
        System.out.println("Result is now = " + results);

        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is not an Alien");

        int topScore = 80;
        if (topScore == 100) //use '<, >, <=, >=, != to test
            System.out.println("You got the highest score");

        int secondTopScore = 81;
        if(topScore > secondTopScore && topScore < 100)
            System.out.println("Score greater than second best and " +
                               "less than 100");
        if (topScore > secondTopScore || topScore <= 90)
            System.out.println("One of these test is true");

        boolean isCar = false;
        if(isCar)
            System.out.println("This is not supposed to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        System.out.println("wasCar is true");

        //challenge
        double firstNum = 20d;
        double secondNum = 80d;
        double total = (firstNum + secondNum) * 25d;
        System.out.println("my total = " + total);

        double totRem = total % 40d;
        System.out.println("total % 40 = " + totRem);

        if(totRem <= 20)
            System.out.println("Total was over the limit");

    }
}
