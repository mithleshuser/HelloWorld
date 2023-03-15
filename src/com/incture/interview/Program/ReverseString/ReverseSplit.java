package com.incture.interview.Program.ReverseString;

import java.util.Scanner;

public class ReverseSplit {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        str = sc.nextLine();
        String[] token = str.split("");    //used split method to print in reverse order
        for(int i=token.length-1; i>=0; i--)
        {
            System.out.print(token[i] + "");
        }
         
    }
 
}