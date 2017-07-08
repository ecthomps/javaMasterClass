package com.chrisThomps;

/**
 * Created by Christian Thompson on 6/26/2017.
 */
public class DeskPhone implements ITelephone {

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerON() {
        System.out.println("No action taken, desk phone has no power on button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Dialing " + phoneNumber + " on desk phone");
    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Answering the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(this.myNumber == phoneNumber){
            isRinging = true;
            System.out.println("Ring Ring");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    private int myNumber;
    private boolean isRinging;
}
