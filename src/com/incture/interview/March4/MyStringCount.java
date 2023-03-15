package com.incture.interview.March4;

import java.util.HashMap;
import java.util.Iterator;

public class MyStringCount {

    public static void main(String[] args) {
        String str1 = "abc abc def ghi def";
        String[] strArr = str1.split(" ");
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for( String s :strArr )
        {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            }else{
                map.put(s,1);
            }

        }
        System.out.println("map: "+ map);
 //       Iterator it = map.keySet().iterator();

      /*  while(it.hasNext()){
            String key = (String) it.next();
            System.out.println("Key:"+key +" value occur :" +map.get(key));
        }*/

    }

}
