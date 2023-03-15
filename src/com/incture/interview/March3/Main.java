package com.incture.interview.March3;

import java.sql.SQLOutput;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        int numThreads = 4;
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(numThreads);

        for (int i = 0; i < 5; i++) fixedThreadPool.submit(() -> System.out.println("Hello Educative"));


        System.out.println("fixedThreadPool    :   " + fixedThreadPool);
        fixedThreadPool.shutdown();
    }

}