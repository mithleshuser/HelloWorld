package com.incture.interview.LInkList;

public class Runner2 {
    public static void main(String[] args) {
        DLL ls = new DLL();
        ls.addFirst(1);
        ls.addFirst(2);
        ls.addFirst(3);
        ls.addFirst(4);

        ls.displayData();
        ls.addLast(232);
        ls.displayData();
    }

}
