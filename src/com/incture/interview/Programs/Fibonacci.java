package com.incture.interview.Programs;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        int c = 1;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of times");

        int num = in.nextInt();

        System.out.println("Fibonacci Series of the number is:");
        for (int i = 0; i < num; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a + ",");    //if you want to print on the same line, use print()
        }
    }
}