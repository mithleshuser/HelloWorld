package com.incture.interview.March6;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapSorting {
    public static void main(String args[]) throws ParseException {

        // let's create a map with key as temple name in Delhi and there are number of Priests
        HashMap<String, Integer> templePriests = new HashMap<String, Integer>();
        templePriests.put("Pragati Maidan", 5);
        templePriests.put("Akshardham Temple", 14);
        templePriests.put("Bhairon Mandir or Sri Kilkari Bhairav Temple", 12);
        templePriests.put("Hanuman Mandir", 23);
        templePriests.put("Lakshmi Narayan Temple", 44);
        templePriests.put("Hanuman Mandir", 34);
        templePriests.put("Mahabodhi Temple", 65);
        templePriests.put("Ladakh Buddhist Vihara", 3);
        templePriests.put("Mahabodhi Temple", 2);
        templePriests.put("Kalkaji Mandir", 4);
        templePriests.put("Kali Mandir", 33);
        templePriests.put("Mahabodhi Temple", 11);
        templePriests.put("Yogmaya Mandir", 13);

        System.out.println("-----------HashMap before sorting, random order-------- ");
        Set<Entry<String, Integer>> entries = templePriests.entrySet();

        for (Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        // *Now let's sort HashMap by keys first, all you need to do is create a TreeMap with mappings of HashMap, TreeMap keeps all entries in sorted order*/
        TreeMap<String, Integer> sorted = new TreeMap<>(templePriests);
        Set<Entry<String, Integer>> mappings = sorted.entrySet();
        System.out.println("-----------------HashMap after sorting by keys in ascending order ---------------");
        for (Entry<String, Integer> mapping : mappings) {
                System.out.println(mapping.getKey() + " ==> " + mapping.getValue());
        }

        // Now let's sort the HashMap by values
        // there is no direct way to sort HashMap by values but you
        // can do this by writing your own comparator, which takes
        // Map.Entry object and arrange them in order increasing
        // or decreasing by values.

        Comparator<Entry<String, Integer>> valueComparator = new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                Integer v1 = o1.getValue();
                Integer v2 = o2.getValue();
                return v1.compareTo(v2);
            }
        };
        Comparator<Entry<String, Integer>> KeyComparator = new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                String v1 = o1.getKey();
                String v2 = o2.getKey();
                return v1.compareTo(v2);
            }
        };
        // Sort method needs a List, so let's first convert Set to List in Java
        List<Entry<String, Integer>> listOfEntries = new ArrayList<Entry<String, Integer>>(entries);

        System.out.println("----------------HashMap after sorting entries by Kay----------------------- ");
        // sorting HashMap by Key using comparator
        Collections.sort(listOfEntries, KeyComparator);
        LinkedHashMap<String, Integer> sortedByKey = new LinkedHashMap<String, Integer>(listOfEntries.size());
        // copying entries from List to
        for (Entry<String, Integer> entry : listOfEntries) {
            sortedByKey.put(entry.getKey(), entry.getValue());
        }
        Set<Entry<String, Integer>> entrySetSortedByKay = sortedByKey.entrySet();
        for (Entry<String, Integer> mapping : entrySetSortedByKay) {
            System.out.println(mapping.getKey() + " ==> " + mapping.getValue());
        }


        System.out.println("----------------HashMap after sorting entries by Value----------------------- ");
        // sorting HashMap by Value using comparator
        Collections.sort(listOfEntries, valueComparator);
        LinkedHashMap<String, Integer> sortedByValue = new LinkedHashMap<String, Integer>(listOfEntries.size());
        // copying entries from List to
        for (Entry<String, Integer> entry : listOfEntries) {
            sortedByValue.put(entry.getKey(), entry.getValue());
        }

        Set<Entry<String, Integer>> entrySetSortedByValue = sortedByValue.entrySet();
        for (Entry<String, Integer> mapping : entrySetSortedByValue) {
            System.out.println(mapping.getKey() + " ==> " + mapping.getValue());
        }



    }

}

