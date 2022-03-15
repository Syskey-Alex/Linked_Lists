package com.company;

import java.awt.*;
import java.util.Iterator;

public class LinkedList {
    public Node head; //keep this private but public just for now
    private Node cursor;

    public LinkedList() {
        head = null;
        cursor = null;
    }

    //The method LinkedList() loops through the list, creates a new node, links it to the previous value node, then takes another value and repeats the process again
    public LinkedList(int[] values) {
        head = new Node(values[0]);
        cursor = head;
        Node n = head;
        for (int i = 1; i < values.length; i++) {
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
            head = n;
            cursor = head;
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
        //returns as true if there is a valid node at the cursor.
        return (cursor != null);

        Iterator itr = myList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        return false;
    }

    public int size() {
        int myList = myList.size();
        for (int i = 0; i < items.length; i++) {
            //printing size of the array
            System.out.println();
        }
        return myList;
    }

    public int getNext() {
        int v = cursor.getValue();
        cursor = cursor.getNext();
        return v;
    }

    public void resetNext() {
        cursor = head;
    }

    //tells you that there is nothing in the list and can save you from going to the specified value in the list and finding out that there is nothing there.
    public boolean isEmpty() {
//return true if the list has no elements
        return (head == null);
    }
}


//massive code dump over here:




//  if (head == null) {
//     head = n;
//   } else {
//  n = n.getNext();
//    if(n ==null) {
//     head = n;
