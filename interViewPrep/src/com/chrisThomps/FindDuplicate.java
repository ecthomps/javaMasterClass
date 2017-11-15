package com.chrisThomps;

import java.util.ArrayList;

import static java.lang.Math.abs;

public class FindDuplicate {

    /*
    *   int[] arr = {2, 3, 3, 1, 5, 2};
        findDuplicate duplicate = new findDuplicate();
        duplicate.printDuplicate(arr, arr.length);
        duplicate.printDup(arr);

        returns 3 & 2
    * */

    public void printDuplicate(int[] arr, int size){

//        traverse the list from 0 to n-1 elements
//        {
//            check for sign of A[abs(A[i])];
//            if positive then
//            make it negative by A[abs(A[i])] = -A[abs(A[i])];
//             else  // i.e., A[abs(A[i])] is negative
//            this element(ith element of list) is a repetition
//        }

        for(int i = 0; i < size; i++){
            if(arr[abs(arr[i])] >= 0){
                arr[abs(arr[i])] = -arr[abs(arr[i])];
            } else{
                System.out.print(abs(arr[i]) + " ");
            }
        }
    }

    public void printDup(int[] arr){

        ArrayList<Integer> myInts = new ArrayList<Integer>();
        for(int elem : arr){
            if(!myInts.contains(elem))
                myInts.add(elem);
            else
                System.out.print(elem + " ");
        }
    }
}
