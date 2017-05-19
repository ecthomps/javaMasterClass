package com.chrisThomps;

/**
 * Created by Christian Thompson on 5/18/2017.
 */
public class SUV extends Car{

    public SUV(int roadServiceMonth) {

        super("SUV", 5, 4, 4, 1, false);
        this.roadServiceMonth = roadServiceMonth;
    }

    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;

        if(newVelocity == 0) {
            stop();
            changeGear(1);
        }
        else if (newVelocity > 0 && newVelocity <= 10)
            changeGear(1);
        else if (newVelocity > 10 && newVelocity <= 10)
            changeGear(2);
        else if (newVelocity > 20 && newVelocity <= 30)
            changeGear(3);
        else
            changeGear(4);

        if(newVelocity > 0)
            changeVelocity(newVelocity, getCurrentDirection());
    }

    private int roadServiceMonth;
}
