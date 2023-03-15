package com.incture.interview.P25_02_2023;

import java.util.HashSet;

public class UnicElementfilter {
    public static void main(String[] args) {
        String s1 = "This apple is sweet";
        String str2 = "This apple is sour";
        StringBuffer sb = new StringBuffer();
        sb.append(s1);
        sb.append(" "+str2);
        String [] arr = sb.toString().split(" ");
        HashSet<String> str = new HashSet<>();
        for (String s: arr){
            if (str.contains(s)){
                str.remove(s);
            }else{
                str.add(s);
            }
        }
        System.out.println(str);

    }
}
