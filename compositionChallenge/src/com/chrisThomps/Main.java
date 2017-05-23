package com.chrisThomps;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimensions theDimensions = new Dimensions(25, 40);
        Television theTelevision = new Television("samBest", "Samsung",
                               "Black", new Resolution(1400, 250),
                                theDimensions);
        Kitchen theKitchen = new Kitchen(5, 3, 1,
                             new Cooker("700New", "whirlpool",
                            "Gas Cooker", 5, theDimensions),
                             new Zinc("2000", "goodWill",
                             theDimensions), new Refrigerator("sam400",
                            "Samsung",2, 110,
                             new Dimensions(40, 90)));
        Bathroom theBathroom = new Bathroom(2, 1, 1,
                               new Toilet("tRex", theDimensions),
                               new Zinc("2000", "goodWill",
                               theDimensions), new Shower("bShow",
                               new Dimensions(40, 90)));
        LivingRoom theLivingroom = new LivingRoom(5, 1, 3,
                                   theTelevision);
        Bedroom theBedroom = new Bedroom(2, 1, 1, 1, 3,
                                         4, theTelevision, theBathroom);
        Diningroom theDiningRoom = new Diningroom(1, 7, 5);
        House theHouse = new House(2, theLivingroom, theKitchen, theDiningRoom,
                                  theBedroom);

        System.out.println("Welcome to my house");
        System.out.println("My house has a bedroom\n\t");
        theHouse.getBedroom().showBedroom();
        System.out.println("My house has a Living Room\n\t");
        theHouse.getLivingRoom().showLivingRoom();
    }
}
