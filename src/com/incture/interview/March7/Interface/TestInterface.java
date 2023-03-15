package com.incture.interview.March7.Interface;

public class TestInterface implements Interface1, Interface2{


    public static void main(String[] args) {

        TestInterface a1 = new TestInterface();
        a1.test();
    }

    @Override
    public boolean display1() {
        return false;
    }

    @Override
    public boolean display2() {
        return false;
    }

    @Override
    public void test() {
        Interface1.super.test();
    }


}
