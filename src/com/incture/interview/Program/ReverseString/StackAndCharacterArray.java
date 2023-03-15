package com.incture.interview.Program.ReverseString;

import java.util.Stack;

public class StackAndCharacterArray {// Method to reverse a string in Java using a stack and character array
    public static String reverse(String str) {// base case: if the string is null or empty
        if (str == null || str.equals("")) {
            return str;
        }
        Stack<Character> stack = new Stack<Character>();// create an empty stack of characters
        char[] ch = str.toCharArray();// push every character of the given string into the stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(ch[i]);
        }
        // start from index 0
        int k = 0;
        while (!stack.isEmpty()) { // pop characters from the stack until it is empty
            ch[k++] = stack.pop(); // assign each popped character back to the character array
        }
        return String.copyValueOf(ch);// convert the character array into a string and return it
    }

    public static void main(String[] args) {
        String str = "erolagnaB morf naidnI era eW ";
        str = reverse(str);        // string is immutable
        System.out.println("The reverse of the given string is: " + str);
    }
}
