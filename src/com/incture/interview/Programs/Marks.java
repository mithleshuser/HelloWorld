package com.incture.interview.Programs;

// A Java program example for deep copy

import java.util.ArrayList;

class Marks {
    int x;
    int y;
}

class Marks2 implements Cloneable {
    int a;
    int b;
    Marks m = new Marks();

    public Object clone() throws CloneNotSupportedException {
        Marks2 m2 = (Marks2) super.clone();
        m2.m = new Marks();
        return m2;
    }

    public static void main(String args[]) throws CloneNotSupportedException {
        Marks2 mark_obj = new Marks2();
        mark_obj.a = 50;
        mark_obj.b = 60;
        mark_obj.m.x = 70;
        mark_obj.m.y = 80;

        Marks2 mark_obj2 = (Marks2) mark_obj.clone();
        mark_obj2.a = 100;
        mark_obj2.m.x = 500;
        System.out.println(
                mark_obj.a + " " + mark_obj.b + " " + mark_obj.m.x + " " + mark_obj.m.y
        );
        System.out.println(
                mark_obj2.a +
                        " " +
                        mark_obj2.b +
                        " " +
                        mark_obj2.m.x +
                        " " +
                        mark_obj2.m.y
        );
    }
}