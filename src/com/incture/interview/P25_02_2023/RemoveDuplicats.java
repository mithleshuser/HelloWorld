package com.incture.interview.P25_02_2023;

import jdk.internal.dynalink.linker.ConversionComparator;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicats {
    public static void main(String[] args) {
        int[] myIntArray = {1, 2, 2, 4, 4, 6, 67, 3};

        System.out.println(myIntArray.length);
        Arrays.sort(myIntArray);
        int[] temp = new int[myIntArray.length];

        if (myIntArray.length == 0 || myIntArray.length == 1) {
            return;
        }
        int k = 0;
        for (int i = 0; i < myIntArray.length - 1; i++) {
            if (myIntArray[i] != myIntArray[i + 1]) {
                temp[k] = myIntArray[i];
                k++;
            }
        }
        temp[k] = myIntArray[myIntArray.length - 1];

        for (int j = 0; j <=k; j++) {
            System.out.print(temp[j] + " ");
        }
    }


}

