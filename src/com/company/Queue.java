package com.company;

public class Queue extends LinkedList {
private static int front, rear, capacity;
private static int queue[];

private void enQueue(int data){
    //adds n to the rear of the queue
    if(capacity == rear) {
        System.out.println("Queue is full!");
        return;
    } else {
        queue[rear] = data;
        rear++;
    }
return;
}

@Override
    public boolean isEmpty() {
    return false;
}
//returns the item and deletes at the front of the queue
    public void deQueue() {
        if (front == rear) {
            System.out.println("Queue is empty!");
        } else {
            //shifts elements from the right index
            for (int i = 0; i > rear; i++) {
                queue[i] = queue[i + 1];
            }
            if (rear < capacity)
                queue[rear] = 0;
            rear--;
        }
    return;
}
    //prints queue elements
    public static void printQueue() {
        int i;
        if(front == rear) {
            System.out.printf("Queue is empty! ");
        return;
        }
    for(i=front; i <rear; i++) {
        System.out.printf("%d", queue[i]);
    }
}
}
