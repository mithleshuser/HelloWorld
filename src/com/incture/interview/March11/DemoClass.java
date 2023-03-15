package com.incture.interview.March11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoClass {


    public static void main(String[] args) {
        List<String> lst = Arrays.asList("system","mithlesh","incture");
        lst.stream().filter(x->x.startsWith("s")).forEach(System.out::println);
    }

}
