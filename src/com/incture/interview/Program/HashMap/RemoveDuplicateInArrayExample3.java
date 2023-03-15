package com.incture.interview.Program.HashMap;

import java.util.Arrays;
public class RemoveDuplicateInArrayExample3{
public static int removeDuplicateElements(int arr[], int n){
        if (n==0 || n==1){
            return n;
        }

        int[] temp = new int[n];
        int K = 0;
        for (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                temp[K++] = arr[i];
            }
         }
        temp[K++] = arr[n-1];
        // Changing original array
        for (int i=0; i<K; i++){
            arr[i] = temp[i];
        }
        return K;
    }
     
    public static void main (String[] args) {
        int arr[] = {10,70,30,90,20,20,30,40,70,50};//unsorted array
        Arrays.sort(arr);//sorting array
        int length = arr.length;
        length = removeDuplicateElements(arr, length);
        //printing array elements
        for (int i=0; i<length; i++)
           System.out.print(arr[i]+" ");
    }
}
