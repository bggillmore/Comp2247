
import java.util.ArrayList;


/*
* Author: Benjamin Gillmore
* Date: Nov 26, 2018
* Assignment: MyArrayListQueue
* Description: Impliments queue interface and defines our array list queue
*/
public class MyArrayListQueue <E> implements QueueInterface<E>{
    
    private ArrayList<E> queue;
    private int front;
    private int rear;

    public MyArrayListQueue() {
        this.queue = new ArrayList<E>();
        this.front = this.rear = 0;
    }

    @Override
    public int size(){
        return queue.size();
    }
    @Override
    public Boolean isEmpty(){
        return this.size()==0;
    }
    public E peek() throws EmptyQueueException{
        if(isEmpty()){
            throw new EmptyQueueException("Empty queue");
        }
        return queue.get(front);
    }
    @Override
    public void enqueue(E element){
        queue.add(rear, element); 
        rear++;
    }
    @Override
    public E dequeue() throws EmptyQueueException{
        if( isEmpty()){
            throw new EmptyQueueException("Empty Queue");
        }
        rear --;
        return queue.remove(front);
    }
    
    @Override
    public String toString(){
        return "" + queue;
    }
}
