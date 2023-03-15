package com.incture.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class bubbbleShort {
    public static void main(String[] args) {
        int[] arr1 = {2432, 456, 467, 456, 214, 345, 678};
        int[] arr2 = {456, 789, 123, 56, 67235};
        List list = new ArrayList(Collections.singleton(arr1));
        for (int i : arr2) {
            list.add(i);
        }
        int[] arr3 = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr3[i] = (int) list.get(i);
        }
        System.out.println(bubbleSort(arr3));
    }

    private static boolean bubbleSort(int[] arr3) {

        int n = arr3.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr3[j - 1] > arr3[j]) {
                    //swap elements
                    temp = arr3[j - 1];
                    arr3[j - 1] = arr3[j];
                    arr3[j] = temp;
                }
            }
        }
        return false;
    }
}
