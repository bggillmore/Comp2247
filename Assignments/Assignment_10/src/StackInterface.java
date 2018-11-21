/*
* Author: Benjamin Gillmore
* Date: Nov 7, 2018
* Assignment: Stack Interface
* Description: 
*/

public interface StackInterface<E> {
    public void push(E element);
    
    public E pop() throws EmptyStackException;
    
    public E peek() throws EmptyStackException;
    
    public int size();
    
    public boolean isEmpty();
}
