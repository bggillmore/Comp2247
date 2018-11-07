/*
* Author: Benjamin Gillmore
* Date: Oct 31, 2018
* Assignment: Node
* Description: 
*/
public class Node <E>{
    //data members
    private E element;
    private Node<E> next;
    
    //constructors
    public Node(){
        this(null, null);
    }
    public Node (E element, Node<E> next){
        this.element = element;
        this.next = next;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
    
}
