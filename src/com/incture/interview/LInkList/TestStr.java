package com.incture.interview.LInkList;

public class TestStr {
    public static void main(String[] args) {
        String str = "Mithlesh";
        String str1 ="Mithlesh";
        String str2 = new String("Mithlesh");

        System.out.println(str1.equals(str));
        System.out.println(str==str1);
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
    }
}
