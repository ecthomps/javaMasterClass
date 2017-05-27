package com.chrisThomps;

/**
 * Created by Christian Thompson on 5/26/2017.
 */
public class enhancedPlayer {

    public enhancedPlayer(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;

        if(health > 0 && health <= 100)
            this.hitpoints = health;
    }

    public void loseHealth(int damage){
        this.hitpoints = this.hitpoints - damage;
        if(this.hitpoints <= 0)
            System.out.println("Player knocked out");
        //Reduce number of lives remaining for the player
    }

    public int getHealth() {
        return hitpoints;
    }

    private String name, weapon;
    private int hitpoints = 100;

}
