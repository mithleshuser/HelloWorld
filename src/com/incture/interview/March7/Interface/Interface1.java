package com.incture.interview.March7.Interface;
@FunctionalInterface
public interface Interface1
{
    public boolean display1();
    default void test(){
        System.out.println("hi Interface1 ");
        System.out.println("hi Interface1 ");
        System.out.println("hi  Interface1");
    }
}
