package com.chrisThomps;

import java.util.ArrayList;

/**
 * Created by Christian Thompson on 6/13/2017.
 */
public class Customers {

    public Customers(String custName, double initialAmt) {
        this.custName = custName;
        this.myTrans = new ArrayList<Double>();
        addCustTrans(initialAmt);
    }

    public void addCustTrans(double transAmt){
        this.myTrans.add(transAmt);
    }

    public String getCustName() {
        return custName;
    }

    public ArrayList<Double> getMyTrans() {
        return myTrans;
    }

    private String custName;
    private ArrayList<Double> myTrans;
}
