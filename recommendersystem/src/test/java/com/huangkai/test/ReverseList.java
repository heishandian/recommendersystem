package com.huangkai.test;


public class ReverseList {
    static Node head = null;
    static Node reverseHead = null;

    public static void main(String[] args) {
        generateList();//生成
       //printList(head);//打印原链表
        reverseList(head);
        printList(reverseHead);//打印反转链表
    }

    private static void generateList() {
        int[] data = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        head = new Node(0);
        Node temp = head;
        for (int i : data) {
            Node node = new Node(i);
            temp.setNext(node);
            temp = node;
        }
    }

    private static void printList(Node node) {
        Node temp = node;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
    }

    private static void reverseList( Node node ) {
        Node temp = node;
        reverseHead = new Node(node.getData());
        while (temp != null) {
            temp = temp.getNext();
            if ( temp != null ) {
                Node temp1 = new Node(temp.getData());
                temp1.setNext(reverseHead);
                reverseHead = temp1;
            }
        }

    }
}

class Node {
    private int data;
    private Node next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
    public Node() {
        super();
    }

}
