package com.company;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	//creating new nodes
        int[] data = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Linked List here: ");

        LinkedList myList = new LinkedList(data);
       // myList.addItem(14);
       // myList.addItem(6);
       // myList.addItem(67);
        // TODO create display method that skips ahead automatically until it gets to the end without having to manually add each .getNext() pointer.
        // add if statement with a (while) or (for) loop

        myList.head.display();//first int
        myList.head.getNext().display();//second number
        myList.head.getNext().getNext().display();//third int
        myList.head.getNext().getNext().getNext().display();//fourth int
        myList.head.getNext().getNext().getNext().getNext().display();//fifth int
        myList.head.getNext().getNext().getNext().getNext().getNext().display();// sixth int
        myList.head.getNext().getNext().getNext().getNext().getNext().getNext().display();//seventh int
        myList.head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().display();//eight int
    }
}



//        Node n = new Node(13);
//       Node n1 = new Node(100);
//      Node n2 = new Node(99);
//     Node n3 = new Node(16);
//    Node n4 = new Node(14);
//   Node n5 = new Node(20);
//      n1.setNext(n2);
//     n2.setNext(n3);
//    n1.display();
