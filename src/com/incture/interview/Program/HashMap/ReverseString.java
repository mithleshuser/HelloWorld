package com.incture.interview.Program.HashMap;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str ="i am indian";
       String reverseOfString = reverseOfString(str);
       System.out.print("reverseOfString = " + reverseOfString);
    }

    private static String reverseOfString(String str) {
        if (str==null|| str==""){
            return str;
        }
        Stack<Character> stack = new Stack<Character>();
        for(char c : str.toCharArray())
        stack.push(c);
        StringBuffer sb = new StringBuffer();
        for (int i=0 ;i<str.length();i++){
            sb.append(stack.pop());
        }

        return sb.toString();
    }
}
