/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
* Author: Benjamin Gillmore
* Date: Nov 9, 2018
* Assignment: MyLinkedList
* Description: 
*/
public class MyLinkedList<E extends Comparable> {

    //data members
    private  Node<E> head;
    private  Node<E> tail;
    private int size;//number of nodes

    //constructors
    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int getSize(){
        return size;
    }
    
    public boolean isEmpty(){
        return (head == null);
    }
    
    //add new node as the first node
    public void addFirst( E element){
        
        //create new node for the element
        Node<E> temp = new Node(element, null);
        
        if(isEmpty()){
            head = tail = temp;
        }
        else{
            //temps next = head
            temp.setNext(head);
            head = temp;
        }
        size ++;
    }
    
    //remoce the first node and return the element in the removed node
    public E removeFirst() throws EmptyListException{
        if(isEmpty()){
            throw new EmptyListException("Empty List");
        }
        
        Node<E> temp = head;
        
        head = head.getNext();
        
        temp.setNext(null);
        
        size--;
        
        if(size == 0){
            tail = null;
        }
        
        return temp.getElement();
    }
    
    public void addLast(E element){
        //create new node for the element
        Node<E> temp = new Node(element, null);
        
        if(isEmpty()){
            head = tail = temp;
        }
        else{
            //temps next = head
            tail.setNext(temp);
            tail = temp;
        }
        size ++;
    }
    
    //search method - search the list for a key, return true or false
    public boolean search(E key) throws EmptyListException{
        Node<E> node = head;
        
        if(isEmpty()){
            throw new EmptyListException("List empty");
        }
        
        for(int i = 0; i < size; i++){
            if(node.getElement().compareTo(key) == 0){
                return true;
            }
            node = node.getNext();
        }
            
        return false;
    }
    
    //selection sort
    public void selectionSort() throws EmptyListException{
        if(isEmpty()){
            throw new EmptyListException("Empty List");
        }
        Node<E> minNode, tempHead, tempHeadNext;
        tempHead = head;
        tempHeadNext = head.getNext();
        
        for(int x = 0; x < size - 1; x++){
            minNode = tempHead;
            
            for (int i = x +1; i < size; i++) {
                if(tempHeadNext.getElement().compareTo(minNode.getElement()) < 0){
                    minNode = tempHeadNext;
                }
                //move to the next node
                tempHeadNext = tempHeadNext.getNext();
            }

            //swap 
            E temp = tempHead.getElement();
            tempHead.setElement(minNode.getElement());
            minNode.setElement(temp);
            
            tempHead = tempHead.getNext();
            tempHeadNext = tempHead.getNext();
        }
    }
    
    public String traverse() throws EmptyListException{
        
        if(isEmpty()){
            throw new EmptyListException("Empty List");
        }
        String result = "-->";
        Node<E> temp = head;
        while(temp != null){
            result += temp.getElement() + "-->";
            temp = temp.getNext();
        }
        return result;
    }
}