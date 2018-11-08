/*
* Author: Benjamin Gillmore
* Date: Nov 7, 2018
* Assignment: MyArrayListStackClient
* Description: 
*/
import java.util.*;

public class MyArrayListStackClient {

    public static void main(String[] args) {

        MyArrayListStack<String> stack = new MyArrayListStack<String>();

        stack.push("iphone");
        stack.push("iPad");
        stack.push("Surface");
        stack.push("Mac");
        stack.push("Linux");

        System.out.print("Top object: " + stack.peek());
        System.out.print("\nNumber of objects: " + stack.size());
        System.out.print("\n" + stack.pop() + " is removed");
        System.out.print("\n" + stack);

    }//end of main()

}//end of class
