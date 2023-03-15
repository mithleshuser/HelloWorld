package com.incture.interview.Program.ReverseString;

import java.util.Stack;

class Main {
    public static void main(String[] args) {
        String str = "we are indian From bangalore.";
        str = getReverseString(str);
        System.out.println("Reverse string is: " +str);
    }

    private static String getReverseString(String str) {
        if(str==null || str==""){
            return str;
        }
        // code here
        char[]ch = str.toCharArray();
       // Stack stackContainer = new Stack();
        Stack<Character> stackContainer = new Stack<Character>();
        for(char c :ch){
            stackContainer.push(c);
        }
        char[] chars = new char[ch.length];
        int k=0;
        while(!stackContainer.isEmpty()){
            ch[k++] = stackContainer.pop();
        }
        return String.copyValueOf(ch);
    }

}