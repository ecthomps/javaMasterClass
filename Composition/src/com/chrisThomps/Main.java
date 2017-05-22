package com.chrisThomps;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Composition is creating objects within an objects
        //as a RULE, look at composition first before creating Inheritance
        //Dimension, case are reserved words

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell",
                      "240", dimensions);

        Monitor theMonitor = new Monitor("27in beast", "Acer",
                            27, new Resolution(2540, 1440));
        MotherBoard theMotherBoard = new MotherBoard("BJ-200", "Asus",
                                    4, 6, "v2.44");
        PC thePC = new PC(theCase, theMonitor, theMotherBoard);
//        thePC.getMonitor().drawPixel(1500, 1200, "red");
//        thePC.getMotherBoard().loadProgram("Windows 1.0");
//        thePC.getTheCase().pressPowerButton();
        thePC.powerUp();
    }
}
