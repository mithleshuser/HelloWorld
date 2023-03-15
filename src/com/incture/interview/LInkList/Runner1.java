package com.incture.interview.LInkList;

public class Runner1 {
    public static void main(String[] args) {
        Llist lst = new Llist();
        lst.addFirstDataHead(1);
        lst.addFirstDataHead(2);
        lst.addFirstDataHead(3);
        lst.addFirstDataHead(4);
        lst.addFirstDataHead(5);
        lst.addMidNodeByindex(50, 3);
        lst.deleteFirst();
        lst.deleteLast();
        lst.displayData();
    }
}
