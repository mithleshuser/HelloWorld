package com.incture.interview.LInkList;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

    public static void main(String args[]) {
        int arr[] = new int[]{12, 34, 54, 67, 67, 4, 87, 98, 34,};
        // using linear search to find max number
        int maxNumber = Search(arr.length, arr);
        // printing result
        System.out.println("The array is as follows:\n" + Arrays.toString(arr));
        System.out.println("The largest element in this array is :  " + maxNumber);
    }
    public static int Search(int N, int[] arr) {
        // using for loop to traverse the array
        int max = arr[0];
        for (int i = 0; i < N; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}