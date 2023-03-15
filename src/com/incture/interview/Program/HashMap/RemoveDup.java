package com.incture.interview.Program.HashMap;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;

public class RemoveDup {
    
    
    
    public static void main (String[] args) {
        int arr[] = {10,70,30,90,20,20,30,40,70,50};//unsorted array
        Arrays.sort(arr);//sorting array
        int length = arr.length;
        length = removeDuplicateElements(arr, length);
        //printing array elements
        for (int i=0; i<=length; i++)
            System.out.print(arr[i]+" ");
    }

    private static int removeDuplicateElements(int[] arr, int length) {

        if(length==0||length==1) {
            return length;
        }
        int k=0;
        int temp[] = new int[length];
        for (int i=0;i<length-1;i++){
            if(arr[i] != arr[i+1]){
                temp[k] = arr[i];
                k=k+1;
            }
        }
        temp[k] = arr[length-1];
        for (int j=0; j<=k; j++){
            arr[j] =temp[j];
        }
        return k;
    }
}
