package com.incture.interview.March3;

import java.util.HashMap;
import java.util.Iterator;

public class Demo3 {
    /*
    Input: aaaabbbcc Output: 4a3b2c
     */
    public static void main(String[] args) {

        String str = "aaaabbbcc";
        char ch[] = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (char c : ch) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Character key = (Character) iterator.next();
            System.out.print( map.get(key)+""+key);

        }
    }
}
