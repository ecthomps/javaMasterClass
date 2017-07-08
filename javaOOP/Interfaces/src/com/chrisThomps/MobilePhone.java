package com.chrisThomps;

/**
 * Created by Christian Thompson on 7/8/2017.
 */
public class MobilePhone implements ITelephone {

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerON() {
        isOn = true;
        System.out.println("Mobile phone powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){
            System.out.println("Dialing " + phoneNumber + " on mobile phone");
        } else{
            System.out.println("Mobile phone is off");
        }
    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(this.myNumber == phoneNumber && isOn){
            isRinging = true;
            System.out.println("Melody Ring");
        } else {
            isRinging = false;
            System.out.println("Mobile phone is off or number different");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    private int myNumber;
    private boolean isRinging, isOn = false;
}
