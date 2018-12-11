package heappriorityqueueclient;

import java.util.Scanner;

/*
* Author: Benjamin Gillmore
* Date: Dec 5, 2018
* Assignment: HeapPriorityQueueClient
* Description: 
*/
public class HeapPriorityQueueClient {

    static final Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
        HeapPriorityQueue<Integer> pq1 = new HeapPriorityQueue<>();
        
        pq1.enqueue(12);
        pq1.enqueue(8);
        pq1.enqueue(23);
        pq1.enqueue(5);
        pq1.enqueue(1);
        pq1.enqueue(17);
        
        System.out.println(pq1);
        
        System.out.println(pq1.dequeue() + " is removed.");
        
        System.out.println(pq1);
    }

}
