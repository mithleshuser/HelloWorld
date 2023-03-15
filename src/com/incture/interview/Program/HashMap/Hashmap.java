package com.incture.interview.Program.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

public class Hashmap {
    public static void main(String[] args) {
        int arr[] = new int[]{10,20,20,30,30,40,50,50};
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i=0;i<=arr.length-1;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else {
                map.put(arr[i], 1);
            }
        }
        Iterator it = map.keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Key = " +key +"Value : " +map.get(key));
        }

    }
}
