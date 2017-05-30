package com.chrisThomps;

/**
 * Created by Christian Thompson on 5/30/2017.
 */
public class Printer {

    public Printer(int tonerLevel, int noOfPages) {
        if(tonerLevel > 0 && tonerLevel < 100)
            this.tonerLevel = tonerLevel;
        else
            this.tonerLevel = 100;

        if(noOfPages > 0 && noOfPages < 200)
            this.noOfPages = noOfPages;
        else
            this.noOfPages = 200;
    }

    public void incrPages(int amount){
        if(noOfPages < 200) {
            this.noOfPages += amount;
            incrTonerLevel(amount/2);
        }
        else
            this.noOfPages = 200;
    }

    public void decrPages(int amount, boolean isDuplex){
        if(noOfPages > 0 && isDuplex) {
            this.noOfPages -= (amount/2);
            decrTonerLevel(amount/2);
        }
        else if(noOfPages > 0) {
            this.noOfPages -= amount;
            decrTonerLevel(amount/2);
        }
        else
            this.noOfPages = -10;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void isDuplexPrinter(boolean isDuplex){
           if(isDuplex)
               System.out.println("Printing information on double side");
           else
               System.out.println("Printer can't print information on "
                                  + "double side");
    }

    private int tonerLevel, noOfPages;
    private void incrTonerLevel(int percentageAmount){
        if(tonerLevel < 100)
            this.tonerLevel += percentageAmount;
        else
            this.tonerLevel = -1;
    }

    private void decrTonerLevel(int percentageAmount){
        if(tonerLevel > 0)
            this.tonerLevel -= percentageAmount;
        else
            this.tonerLevel = -1;
    }
}
