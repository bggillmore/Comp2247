/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package heappriorityqueueclient;

import java.util.ArrayList;

/*
* Author: Benjamin Gillmore
* Date: Dec 5, 2018
* Assignment: HeapPriorityQueue
* Description: 
*/
public class HeapPriorityQueue <E extends Comparable> implements QueueInterface<E> {

    private ArrayList<E> priorityQ;
    private int lastIndex;

    public HeapPriorityQueue() {
        this.priorityQ = new ArrayList();
        this.lastIndex = 0;
    }
    
    
    
    @Override
    public int size(){
        return lastIndex;
    }
    
    @Override
    public boolean isEmpty(){
        return lastIndex == 0;
    }
    
    @Override
    public E peek() throws EmptyQueueException{
        if(isEmpty()){
            throw new EmptyQueueException("Empty queue");
        }
        return priorityQ.get(0);
    }
    
    @Override
    public void enqueue(E element){
        priorityQ.add(0, element); 
        if(lastIndex == 0){
            lastIndex++;
            return;
        }
        int parentIndex, currentIndex = lastIndex;
        while(true){
            //get parent index
            if(currentIndex % 2 == 0){
                parentIndex = (currentIndex / 1) - 2;
            }
            else{
                parentIndex = (currentIndex - 1) /2;
            }
            //swap
            if(priorityQ.get(currentIndex).compareTo(priorityQ.get(parentIndex)) < 0){
                this.swap(currentIndex, parentIndex);
            }
            //reset currentIndexafter swap
            currentIndex = parentIndex;
            //break at root
            if(currentIndex == 0){
                break;
            }
        }
        lastIndex++;
    }
    public void swap(int index1, int index2){
        E temp = priorityQ.get(index1);
        priorityQ.set(index1, priorityQ.get(index2));
        priorityQ.set(index2, temp);
    }
    
    @Override
    public E dequeue() throws EmptyQueueException{
        if( isEmpty()){
            throw new EmptyQueueException("Empty Queue");
        }
        E removedObj = priorityQ.get(0);
        
        //if heap is empty
        if(lastIndex == 1){
            priorityQ.set(0, null);
            lastIndex--;
            return removedObj;
        }
        //move last node to root
        priorityQ.set(0, priorityQ.get(lastIndex - 1));
        priorityQ.set(lastIndex - 1, null);
        lastIndex --;
        //no need to down heap bubble
        if(lastIndex == 2){
            
            return removedObj;
        }
        
        //down heap bubble
        int parentIndex = 0, currentIndex = 0;
        while(true){
            int rightChildIndex = 2 * (currentIndex + 1);
            int leftChildIndex = 2 * currentIndex + 1;
            int minChildIndex;
            
            if(leftChildIndex >= lastIndex && rightChildIndex >= lastIndex){
                break;
            }
            else if(rightChildIndex >= lastIndex){
                minChildIndex = leftChildIndex;
            }
            else{
                if(priorityQ.get(leftChildIndex).compareTo(priorityQ.get(rightChildIndex)) < 0){
                    minChildIndex = leftChildIndex;
                }
                else{
                    minChildIndex = rightChildIndex;
                }
            }
            if(priorityQ.get(currentIndex).compareTo(priorityQ.get(minChildIndex)) > 0){
                swap(currentIndex, minChildIndex);
                currentIndex = minChildIndex;
            }
        }
        return removedObj;
    }
    
    @Override
    public String toString(){
        return "" + priorityQ;
    }

}
