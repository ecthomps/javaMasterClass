package com.chrisThomps;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        int [] myArray;
        int numInt;

        System.out.println("Number of integers to be sorted: ");
        numInt = scanner.nextInt();

        myArray = new int [numInt];
        System.out.println("\nEnter " + numInt + " integers to sort: ");
        getIntegers(scanner, myArray);

        //Sort Array in dexcending order
        sortArray(myArray);

        System.out.println("Sorted array in Descending order: \n");
        printArray(myArray);
    }

    public static void getIntegers(Scanner scanner, int [] intArr){

        for(int i = 0; i < intArr.length; i++)
            intArr[i] = scanner.nextInt();
    }

    public static void sortArray(int [] intArr){
        int temp;

//        for(int i = 0; i < intArr.length; i++){
//
//            for(int j = i + 1; j < intArr.length; j++){
//                if(intArr[i] < intArr[j]){
//                    temp = intArr[i];
//                    intArr[i] = intArr[j];
//                    intArr[j] = temp;
//                }
//            }
//        }

        //Arrays.sort(intArr, Collections.reverseOrder());
    }

    public static void printArray(int [] intArr){

        for(int i = 0; i < intArr.length; i++)
            System.out.print(intArr[i] + " ");
    }
}
