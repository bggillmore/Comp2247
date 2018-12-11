/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
* Author: Benjamin Gillmore
* Date: Dec 10, 2018
* Assignment: MyArrayList
* Description: 
*/
public class MyArrayList <E> {
    int capacity = 32;
    int size;

    public void set(int index, E element){
        
    }
    public E remove(int index){
        return 
    }
    public void checkIndex(){
        
    }
    
    public void int add(int i, E newObj) throws IndexOutOfBoundsException{
        checkIndex(i, size + 1);
        
        if(size == capacity){
            capacity += 2;
            
            E[] newArray = (E []) new Object[capacity];
            
            for(int k = 0; k < size; k++){
                newArray[k] = myArray[k];
            }
            
            myArray = newArray;
        }
        
        for(int k = size - 1; k >= i;)
    }
    
    public String toString(){
        String result = "[";
        for(int i = 0; i < size; i++){
            result += " " + myArray[i];
        }
    }
}
