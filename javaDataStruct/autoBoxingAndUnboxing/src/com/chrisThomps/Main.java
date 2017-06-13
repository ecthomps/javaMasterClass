package com.chrisThomps;

import java.util.ArrayList;

class IntClass{

    public IntClass(int myInt) {
        this.myInt = myInt;
    }

    public int getMyInt() {
        return myInt;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }

    private int myInt;

}

public class Main {

    public static void main(String[] args) {
	// write your code here

        //String is not a primitive type, but a class
        ArrayList<String> myString = new ArrayList<String>();


        //a type ARGUMENT cannot be of a primitive type
        //ArrayList <int> intArrray = new ArrayList<int>(); is illegal
            //int is a primitive type

        //one way to solve is to create an int class
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(99));

        //Another option is autoBoxing
        //Autoboxing is the automatic conversion between the primitive types and
        //their corresponding object wrapper classes

        Integer integer = new Integer(100);
        Double doubleValue = new Double(99.9);

        ArrayList<Integer> myInteger = new ArrayList<Integer>();
        for(int i = 0; i < 7; i++)
            myInteger.add(Integer.valueOf(i*2));    //Autoboxing
        //taking a primitive type (int) and converting to an object wrapper (Integer)

        for(int i = 0; i < 7; i++)
            System.out.println(i + " --> " + myInteger.get(i).intValue()); //Unboxing
        //taking a class type and converting it to  a primitive type

        Integer myIntValue = 56; //Integer.valueOf(56); Java compiler does the AutoBoxing
        int myInt = myIntValue; //myIntValue.inValue(); Java compiler does the UnBoxing

        System.out.println();
        System.out.println();

        ArrayList<Double> myDouble = new ArrayList<Double>();
        for(double dbl = 0; dbl <= 10.0; dbl+=0.5)
            myDouble.add(Double.valueOf(dbl));

        for(int i = 0; i < myDouble.size(); i++)
            System.out.println(i + " --> " + myDouble.get(i).doubleValue());
    }
}
