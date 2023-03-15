package com.incture.interview.LInkList;

public class DLL {
    private int data;
    private Node head;
    private Node next;
    private Node prev;
    private int size;


    public void addFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void addLast(int data){
        Node node = new Node(data);
        Node last = head;
        if(head ==null){
            node.prev=null;
            head = node;
            return ;
        }
        while(last.next!=null){
            last = last.next;
        }
        last.next = node;
        node.prev=last;
    }
    public void displayData() {
        DLL.Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "   ->  ");
            temp = temp.next;
        }
        System.out.println("    END NODE     ");
    }


    private class Node {
        private Node head;
        private  Node next;
        private  Node prev;
        private int data;
        private int size;

        public Node(Node head, Node next, Node prev, int data) {
            this.head = head;
            this.next = next;
            this.prev = prev;
            this.data = data;
        }

        public Node(int data) {
            this.data = data;
        }


    }

}
