/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
* Author: Benjamin Gillmore
* Date: Nov 9, 2018
* Assignment: Node
* Description: defines the nodes for MyLinkedList class. Nodes are generic so anything can be put into it.
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

