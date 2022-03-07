package com.company;

public class LinkedList {
    public Node head; //keep this private but public just for now

    public LinkedList() {
        head = null;
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
}







//  if (head == null) {
//     head = n;
//   } else {
//  n = n.getNext();
//    if(n ==null) {
//     head = n;
