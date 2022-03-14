package com.company;

import java.awt.*;
import java.util.Iterator;

public class LinkedList {
    public Node head; //keep this private but public just for now
    private Node cursor;

    public LinkedList() {
        head = null;
    }
//The method LinkedList() loops through the list, creates a new node, links it to the previous value node, then takes another value and repeats the process again
    public LinkedList(int[] values){
        head = new Node(values[0]);
        Node n = head;
        for(int i = 1;i<values.length; i++) {
            //this is a new node (called adding) that has the value we want.
            Node adding = new Node(values[i]);
            //this is setting the next link from previous node which links the new node into the linked-list chain.
            n.setNext(adding);
            n = n.getNext();

        }
    }

    public void addItem(int v) {
        Node n = new Node(v);
    //this is to make sure that the head isn't pointing to each node individually and that the linked list always refers back to the chain of command.
       //we need to do this iteratively therefore we use a while loop
        Node current = head;
        if (head == null) {
            head= n;
        } else {
            //make the list parse to the end
            current = head;
            Node previous = null;
            while (current != null) {
                previous = current;
                current = current.getNext();
            }
            //this adds the node to the list
            previous.setNext(n);
        }


    }
    //TODO fix hasNext so that its a boolean and that it checks whether the pointer is at the value.
public boolean hasNext() {
    Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    return false;
}
public int size() {
        int myList = myList.size();
        for(int i = 0; i <items.length; i ++) {
            //printing size of the array
            System.out.println();
        }
}
public int getNext() {
        cursor = cursor.getNext();
        return cursor.getValue();
    }
}







//  if (head == null) {
//     head = n;
//   } else {
//  n = n.getNext();
//    if(n ==null) {
//     head = n;
