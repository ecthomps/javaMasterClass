package com.chrisThomps;

public class LeftRotation {

    public void shiftArr(int arr[], int numShift, int size){

        for (int i = 0; i < numShift; i++)
            rotateArr(arr, size);

        for (int elem : arr)
            System.out.print(elem + " ");
    }

    public void rotateArr(int arr[], int arrSize){
        int i, temp = arr[0];

        for(i = 0; i < arrSize - 1; i++)
            arr[i] = arr[i+1];
        arr[i] = temp;
    }
}
