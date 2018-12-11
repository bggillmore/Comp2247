/*
* Author: Benjamin Gillmore
* Date: Dec 5, 2018
* Assignment: QueueInterface
* Description: Defines required methods for queue.
*/
public interface QueueInterface<E> {
    public void enqueue(E element);
    public E dequeue() throws EmptyQueueException;
    public Boolean isEmpty() throws EmptyQueueException;
    public int size();
}
