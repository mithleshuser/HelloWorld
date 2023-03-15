package com.incture.interview;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class Convert2Dto1D {
    public static void main(String[] args) {

        int k = 0;
        int[][][] arr = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};

        int arr1[] = new int[8];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int z = 0; z < 2; z++) {
                    arr1[k++] = arr[i][j][z];
                }

            }
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[1]);
        }


    }

}

