package com.chrisThomps;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Encapsulation is ensuring that your fields/states
        //in a class are not accessible by other classes
//
//        Player player = new Player();
//        player.name = "Tim";
//        player.weapon = "Sword";
//        player.health = 20;
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining Health = " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining Health = " + player.healthRemaining());

        enhancedPlayer player = new enhancedPlayer("Tim",
                               "Sword", 200);
        System.out.println("Initial Health: " + player.getHealth());

    }
}
