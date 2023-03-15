package com.incture.interview.P25_02_2023;

import javax.sql.rowset.serial.SerialStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class HashMap1 {
    public static void main(String[] args) {
        String s1 = "This apple is sweet";
        String str2 = "This apple is sour";
        StringBuffer sb = new StringBuffer();
        sb.append(s1);
        sb.append(" "+str2);
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        String[] strArr = sb.toString().split(" ");

        for(String s: strArr){
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }else{
                map.put(s,1);
            }
        }
        Iterator it  = map.keySet().iterator();
        List list =new ArrayList();
        while(it.hasNext()){
            String key = (String) it.next();
            if(map.get(key)==1){
                list.add(key);
            }
        }
        System.out.println(list);
    }
}
