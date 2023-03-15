package com.incture.interview.March7;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupBuClaass {
    public static void main(String[] args) {
        String str = "Mithlesh Kumar Gupta Kumar gupta";

       Map<String,Long> map = Arrays.stream(str.split(" "))
                .collect(
                        Collectors.groupingBy(Function.identity(),Collectors.counting())
                );
        System.out.println("map : "+ map);

    }
}
