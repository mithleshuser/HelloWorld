package com.incture.interview.Program;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Hello {
    public static void main(String args[]) {
        List<Integer> withDupes = Arrays.asList(10, 10, 20, 20, 30, 30, 40, 50);
        System.out.println("List with duplicates: " + withDupes);

        List<Integer> withoutDupes = withDupes.stream().distinct().collect(Collectors.toList());
        System.out.println("List without duplicates: " + withoutDupes);

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        map1.put("a", 1);
        map1.put("b", 2);
        map2.put("a", 1);
        map2.put("b", 2);

        List<Map<String, Integer>> mapList = Arrays.asList(map1, map2);

        System.out.println("remove duplicat from map : "+mapList.stream().distinct().collect(Collectors.toList()));


    }
}

