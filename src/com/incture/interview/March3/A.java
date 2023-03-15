package com.incture.interview.March3;

class A {
    public static int a = 20;

    public static int print() {
        return a;
    }
    public static void main(String arg[]) {
        A a1 = new A();
		A a2 = null;

        System.out.println(a1.print()); //10
        int b = a2.a=30;
        System.out.println(b);//10
    }
}