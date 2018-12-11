
/*
* Author: Benjamin Gillmore
* Date: Nov 26, 2018
* Assignment: MyArrayListQueueClient
* Description: 
*/
public class MyArrayListQueueClient {

    public static void main(String[] args) {
        MyArrayListQueue<String> customerQ = new MyArrayListQueue<String>();
        
        customerQ.enqueue("Tom");
        customerQ.enqueue("Anna");
        customerQ.enqueue("Betty");
        customerQ.enqueue("Ross");
        customerQ.enqueue("Jimmy");
        customerQ.enqueue("Bob");
        
        System.out.println("Customer Line: " + customerQ);
        System.out.println("Front Customer:  " + customerQ.peek());
        
        System.out.println(customerQ.dequeue() + " is being served");
        System.out.println(customerQ.dequeue() + " is being served");
        
        System.out.println("Customer Line: " + customerQ);
    }

}
