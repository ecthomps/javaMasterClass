package com.chrisThomps;

public class Main {

    //the following line blow is a method with the name "main"
    //in the method contains statements

    public static void main(String[] args) {
	// write your code here

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        System.out.println("Your final score was " + calculateScore(gameOver,
                            score, levelCompleted, bonus));
        System.out.println("Your final score was " + calculateScore(true,
                           10000, 8,200));

//        int highScore = calculateScore(true, 50,
//                                   8, 200);

        //challenge;;;score = 1500, 900, 400, 50
        int scorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Christian", scorePosition);

        scorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Joe", scorePosition);

        scorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Mel", scorePosition);

        scorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Mike", scorePosition);
    }

    //you can't put a new method inside another method
    //the new method created must be within the "public class Main"
    //when creating a new method you must include the words
    //"public" and "static"

    //void means no value is returned back
    //value (data type) means that a value is returned back
    public static int calculateScore(boolean gameOver, int score,
                                      int levelCompleted, int bonus){
        int finalScore = 0;

        if(gameOver){
            finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            //System.out.println("Your final score was " + finalScore);
        }
        else
            return -1;
        return finalScore;
    }

    //challenge
    public static void displayHighScorePosition(String playersName,
                                                int highScorePosition){

        System.out.println(playersName + " managed to get into position " +
                           highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int score){
        if (score >= 1000)
            return 1;
        else if(score >= 500 && score < 1000)
            return 2;
        else if (score >= 100 && score < 500)
            return 3;
        else
            return 4;
    }
}
