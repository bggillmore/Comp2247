/*
* Author: Benjamin Gillmore
* Date: Nov 7, 2018
* Assignment: MyArrayListStack
* Description: 
*/
import java.util.*;

//@SuppressWarnings("unchecked")

public class MyArrayListStack<E> implements StackInterface<E> {

    private ArrayList<E> stack;
    private int top;
    public static final int CAPACITY =12;

    public MyArrayListStack() {
        this.stack = new ArrayList<E>(CAPACITY);
        this.top = -1;
    }
    
    @Override
    public int size() {
        return top + 1;
    }
    
    @Override
    public boolean isEmpty() {
        return top == -1;
    }
    
    @Override
    public void push(E element) throws FullStackException{
        if(this.size() > CAPACITY){
            throw new FullStackException("Stack full");
        }
        top++;
        
        stack.add(top, element);
    }

    @Override
    public E pop() throws EmptyStackException {
        if(isEmpty()){
            throw new EmptyStackException("Empty Stack");
        }
        E temp = stack.remove(top);
        top--;
        return temp;
    }

    @Override
    public E peek() throws EmptyStackException {
        if(isEmpty()){
            throw new EmptyStackException("Empty Stack");
        }
        return stack.get(top);
    }

    @Override
    public String toString() {
        int count = top;
        String result = "";
        
        while(count >= 0){
            result += stack.get(count) + ", ";
            count--;
        }
        
        return result;
    }

    

    

  
  
  
     
}//end of class



