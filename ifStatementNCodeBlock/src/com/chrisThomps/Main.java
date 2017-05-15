package com.chrisThomps;

public class Main {

    public static void main(String[] args) {
        // write your code here

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000)
//            System.out.println("Your score was less than 5000"
//                               + ", but greater than 1000");
//        else if(score < 1000)
//            System.out.println("Your score was less than 1000");
//        else
//            System.out.println("Got here");

        //initializing a variable inside a block statement is
        //referred to a concept called scope

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        //challenge
        //duplicating of code is a bad practice!!!
        score = 10000;
        bonus = 200;
        levelCompleted = 8;

        if (gameOver) {
            int secondScore = score + (levelCompleted * bonus);
            System.out.println("Your second score is " + secondScore);
        }
    }
}
