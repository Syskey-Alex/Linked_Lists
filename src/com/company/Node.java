package com.company;
//in ia you could use this to link to different rooms in the game
public class Node {
    private int value;
    private Node next;

    public Node(int v) {
        value = v;
        //null by default but good to initialise it anyway for readability
        next = null;
    }
    public void setNext(Node n) {
        next = n;
    }
    public Node getNext() {
        return next;
    }
    public void display() {
        System.out.println(value);
    }
}