package com.chrisThomps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.StrictMath.abs;
import static java.lang.StrictMath.max;
import static java.util.Collections.sort;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter arrSize and numOfShifts: ");
        int arrSize = scanner.nextInt();
        int numOfShifts = scanner.nextInt();
        int arr[] = new int[arrSize];
        System.out.print("Please enter " + arrSize + " numbers: ");
        for(int i = 0; i < arrSize; i++)
            arr[i] = scanner.nextInt();

        LeftRotation leftRotation = new LeftRotation();
        leftRotation.shiftArr(arr, numOfShifts, arrSize);
//        shiftArr(num, numOfShifts, arrSize);
    }

    public static void shiftArr(int arr[], int numShift, int size){

        for(int i = 0; i < numShift; i++)
            leftRotate(arr, size);

        for(int elem : arr)
            System.out.print(elem + " ");
    }

    public static void leftRotate(int arr[], int size){
        int i, temp = arr[0];

        for(i = 0; i < size-1; i++)
            arr[i] = arr[i+1];
        arr[i] = temp;
    }

//    public static int numberNeeded(String first, String second) {
//
//        int[] freq1 = new int[26];
//        int[] freq2 = new int[26];
//        int deletions = 0;
//
//        if(first.length() != second.length())
//            return deletions;
//
//        for(int i = 0; i < first.length(); i++)
//            freq1[first.charAt(i) - 'a'] = freq1[first.charAt(i) - 'a'] + 1;
//        for (int i = 0; i < second.length(); i++)
//            freq2[second.charAt(i) - 'a'] = freq2[second.charAt(i) - 'a'] + 1;
//
//        for(int i = 0; i < 26; i++)
//        deletions += Math.abs(freq1[i] - freq2[i]);
//
//        return deletions;
//    }
}