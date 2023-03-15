package com.incture.interview.Program.Strings;

public class SubString {
    public static void main(String[] args)
    {
        String str ="abc";
        System.out.println(testString(str));
    }
    private static boolean testString(String str) {
        boolean flage=true;
    for(int i =0; i<str.length();i++){

        if(str.charAt(i)=='a' && str.charAt(i+1)=='b'){
            return flage=false;
        }
    }
        return flage;
    }
}
