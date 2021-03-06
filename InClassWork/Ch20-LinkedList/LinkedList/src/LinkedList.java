
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
* Author: Benjamin Gillmore
* Date: Oct 31, 2018
* Assignment: LinkedList
* Description: 
*/
public class LinkedList {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        MyLinkedList<String> airportList = new MyLinkedList<String>();
        
        airportList.addFirst("MSP");
        airportList.addFirst("RST");
        airportList.addLast("ORD");
        airportList.addFirst("ATL");
        airportList.addFirst("JFK");
        airportList.addLast("STL");
        
        System.out.println(airportList.traverse());
        
        System.out.println(airportList.removeFirst() + " is removed");
        System.out.println(airportList.removeFirst() + " is removed");
        
        System.out.println(airportList.traverse());
        
        airportList.selectionSort();
        System.out.println(airportList.traverse());
        
        airportList.addSecondNode("blaa");
        System.out.println(airportList.traverse());
        
        System.out.println("removed value: " + airportList.removeSecondNode());
        System.out.println(airportList.traverse());
        
        System.out.print("Enter item to search: ");
        String key = console.next();
        if(airportList.search(key)){
            System.out.print(key + " is in the linked list");
        }
        else{
            System.out.print(key + " is not in the linked list");
        }
    }

}
