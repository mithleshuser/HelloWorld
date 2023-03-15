package com.incture.interview.Program.ReverseString;

public class ReverseString1 {

    public static void main(String[] args) {
        String str = "mith";
        str = getReverseStr1(str);
        System.out.println("Reverse string is: " + str);
    }

    private static String getReverseStr1(String str) {
        if (str == null || str == "") {
            return str;
        }
        StringBuffer sb = new StringBuffer();
        for (char c: str.toCharArray()) {
            sb.append(c);
        }
        return sb.reverse().toString();
    }
}
