package com.chrisThomps;

/**
 * Created by Christian Thompson on 6/26/2017.
 */
public interface ITelephone {
    //interfaces ---> just signatures and no methods
    public void powerON();
    public void dial(int phoneNumber);
    public void answer();
    public boolean callPhone(int phoneNumber);
    public boolean isRinging();
}
