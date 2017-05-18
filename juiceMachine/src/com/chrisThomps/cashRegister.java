package com.chrisThomps;

/**
 * Created by Christian Thompson on 5/18/2017.
 */
public class cashRegister extends VenMachine {

    cashRegister(double amount){
        if (amount > total)
            total = amount;
        else
            total = 500;
    }

    public double getBalance(){
        return balance;
    }

    public void calcBalance(int custChoice, double custAmoutIn){
        switch(custChoice){
            case 1:
                if(custAmoutIn >= costOrangeJuice) {
                    balance = custAmoutIn - costOrangeJuice;
                    total += (custAmoutIn - balance);
                }
                else
                    isSufficientFund = false;
                break;
            case 2:
                if(custAmoutIn >= costAppleJuice){
                    balance = custAmoutIn - costAppleJuice;
                    total += (custAmoutIn - balance);
                }
                else
                    isSufficientFund = false;
                break;
            case 3:
                if(custAmoutIn >= costMangoJuice){
                    balance = custAmoutIn - costMangoJuice;
                    total += (custAmoutIn - balance);
                }
                else
                    isSufficientFund = false;
                break;
            case 4:
                if(custAmoutIn >= costStrawBerryBanana){
                    balance = custAmoutIn - costStrawBerryBanana;
                    total += (custAmoutIn - balance);
                }
                else
                    isSufficientFund = false;
                break;
        }
    }

    public boolean isSufficientFund(int custChoice, double custAmountIn){
        calcBalance(custChoice, custAmountIn);
        return isSufficientFund;
    }

    @Override
    public void print() {
        System.out.println("Your balance is " + getBalance());
        super.print();
    }

    private double balance, total;
    private boolean isSufficientFund = true;
    private double costOrangeJuice = 1.50, costAppleJuice = 2.00;
    private double costMangoJuice = 1.00, costStrawBerryBanana = 2.50;
}
