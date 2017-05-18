package com.chrisThomps;

/**
 * Created by Christian Thompson on 5/18/2017.
 */
public class dispenserType {

    public void sellProduct(int custChoice){
        switch (custChoice){
            case 1:
                if(orangeJuice > 0)
                    decrOrangeJuice();
                else
                    isProductAvailable = false;
                break;
            case 2:
                if (appleJuice > 0)
                    decrAppleJuice();
                else
                    isProductAvailable = false;
                break;
            case 3:
                if(mangoJuice > 0)
                    decrMangoJuice();
                else
                    isProductAvailable = false;
                break;
            case 4:
                if(strawBerryBananana > 0)
                    decrStrawBerryBanana();
                else
                    isProductAvailable = false;
                break;
        }
    }

    public boolean isProductAvailable(int custChoice){
        sellProduct(custChoice);
        return isProductAvailable;
    }

    public void decrOrangeJuice(){
        orangeJuice--;
    }

    public void decrAppleJuice(){
        appleJuice--;
    }

    public void decrMangoJuice(){
        mangoJuice--;
    }

    public void decrStrawBerryBanana(){
        strawBerryBananana--;
    }

    private int orangeJuice = 5, appleJuice = 5;
    private int mangoJuice = 5, strawBerryBananana = 5;
    boolean isProductAvailable = true;
}
