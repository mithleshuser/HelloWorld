package com.incture.interview.Program.ReverseString;

import java.util.Stack;

public class ReversForLoop {
    public static void main(String[] args) {
        String str = "mith asd";
        str = getReverseStr(str);
        System.out.println("Reverse string is: " + str);
    }
    private static String getReverseStr(String str) {
        if (str == null || str == "") {
            return str;
        }
        StringBuffer sb = new StringBuffer();
        for (int i = str.length()-1;i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();

    }
}
