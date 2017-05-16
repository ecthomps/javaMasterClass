package com.chrisThomps;

public class Main {

    public static void main(String[] args) {
	// write your code here

       int newScore = calculateScore("Chris", 500);
        System.out.println("New Score is " + newScore);
        calculateScore(75);
        calculateScore();

       //challenge
        double results = calcFeetAndInchesToCentimeters(6, 0);
        if(results < 0.0)
            System.out.println("Invalid parameters");

        calcFeetAndInchesToCentimeters(157);
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score
                           + " points ");
        return score * 1000;
    }
    //overLoading is having the same function name
    //but different parameters
    public static int calculateScore(int score){
        System.out.println("Unnamed Player scored " + score
                + " points ");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player name, no player score");
        return 0;
    }
    //changing the return type doesn't make the function unique
    //you must have to change the parameter
    public static void calculateScore(int score, int newScore){
        System.out.println("Player 1 score: " + score + "\tPlayer 2 score: "
                           + newScore);
    }

    //challenge
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){

        if(feet < 0 || (inches < 0 || inches > 12)) {
            System.out.println("Invalid feet or inches");
            return -1;
        }

        double centimeter = (feet * 12) * 2.54d;
        centimeter += inches * 2.54d;
        System.out.println(feet + " feet, " + inches + " inches = " +
                           centimeter + " cm");
        return centimeter;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0) {
            System.out.println("Invalid inches parameter");
            return -1;
        }

        double feet = (int) inches / 12;
        double modInches = (int) inches % 12;
        System.out.println("Inches = " + feet + " feet and " + modInches +
                           " inches");
        return calcFeetAndInchesToCentimeters(feet, modInches);
    }
}
