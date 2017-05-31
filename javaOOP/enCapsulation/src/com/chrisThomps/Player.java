package com.chrisThomps;

/**
 * Created by Christian Thompson on 5/26/2017.
 */
public class Player {

    public String name, weapon;
    public int health;

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0)
            System.out.println("Player knocked out");
        //Reduce number of lives remaining for the player
    }

    public int healthRemaining(){
        return this.health;
    }

}
