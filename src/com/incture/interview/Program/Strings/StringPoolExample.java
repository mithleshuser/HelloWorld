package com.incture.interview.Program.Strings;
/*
Memory management is the most important aspect of any programming language. Memory management in case of string in Java is a little bit different than
any other class. To make Java more memory efficient, JVM introduced a special memory area for the string called String Constant Pool.
When we create a string literal it checks if there is identical string already exist in string pool or not. If it is there
then it will return the reference of the existing string of string pool. Let’s have a look at the below example program.
 */

public class StringPoolExample {

    public static void main(String[] args) {

        String a = "abc";
        String b = "abc";
        String c = "def";

        //same reference
        if (a == b) {
            System.out.println("a==b : Both string refer to the same object");
        }

        //different reference
        if (a == c) {
            System.out.println("Both strings refer to the same object");
        } else {
            System.out.println(" a==c : Both strings refer to the different object");
        }

    }

}