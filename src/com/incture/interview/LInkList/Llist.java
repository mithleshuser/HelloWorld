package com.incture.interview.LInkList;

public class Llist {

    private Node head;
    private Node tell;
    private int size;

    public Llist() {
        this.size = 0;
    }

    public void addFirstDataHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        if (tell == null) {
            tell = head;
        }
        size += 1;
    }

    public void addlastDataHead(int data) {
        if (tell == null) {
            addFirstDataHead(data);
        }
        Node newNode = new Node(data);
        tell.next = newNode;
        newNode = tell;
        size += 1;
    }

    public void addMidNodeByindex(int data, int index) {
        Node temp = head;
        if (index == 0) {
            addFirstDataHead(data);
        } else if (index == size) {
            addlastDataHead(data);
        }
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(data, temp.next);
        temp.next = newNode;
        size++;
    }

    public int deleteFirst() {
        int data = head.data;
        if (head == null) {
            tell = null;
        }
        head = head.next;
        return data;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = getNode(size - 2);
        int val = tell.data;
        tell = secondLast;
        tell.next = null;
        return val;
    }

    public int deleteByIndex(int index) {
        if (index == 0) {
            return deleteFirst();
        } else if (index == size) {
           return deleteLast();
        }
        Node prev = getNode(index-1);
        int val = prev.next.data;
        prev.next = prev.next.next;
        return val;
    }


    public Node getNode(int index) {
        Node newNode = head;
        for (int i = 0; i < index; i++) {
            newNode = newNode.next;
        }
        return newNode;
    }

    public void displayData() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "   ->  ");
            temp = temp.next;
        }
        System.out.print("    END NODE     ");
    }

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
