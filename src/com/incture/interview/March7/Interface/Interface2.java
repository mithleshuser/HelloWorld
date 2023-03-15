package com.incture.interview.March7.Interface;

@FunctionalInterface
public interface Interface2
{
   public boolean display2();
    default void test(){
        System.out.println("hi Interface2 ");
        System.out.println("hi Interface2");
        System.out.println("hi  Interface2");
    }
}
