/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heappriorityqueueclient;


public interface QueueInterface <E> {
    public void enqueue(E element);
    public E peek() throws EmptyQueueException;
    public E dequeue() throws EmptyQueueException;
    public boolean isEmpty();
    public int size();
}

