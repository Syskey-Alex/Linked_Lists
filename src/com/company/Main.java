package com.company;

public class Main {

    public static void main(String[] args) {
	//creating new nodes
        System.out.println("Linked List here: ");
        Node n = new Node(13);
        Node n1 = new Node(100);
        Node n2 = new Node(99);
        Node n3 = new Node(16);
        Node n4 = new Node(14);
        Node n5 = new Node(20);
        n1.setNext(n2);
        n2.setNext(n3);
        n1.display();
    }
}
