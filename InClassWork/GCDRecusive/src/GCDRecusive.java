/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
* Author: Benjamin Gillmore
* Date: Oct 15, 2018
* Assignment: GCDRecusive
* Description: 
*/
import java.util.Scanner;  //import Scanner class 

public class GCDRecusive
{
   public static void main(String [] args)
   {
         //create an object of Scanner class
      Scanner console = new Scanner(System.in);
      
         //declare variables
      int m, n, r, answer;
      
         //input
      System.out.print("Enter a positive integer for m: ");
      m = console.nextInt();
      
      while( m <= 0 )
      {
          System.out.println("Invalid,try again.");
          System.out.print("Enter a positive integer for m: ");
          m = console.nextInt();
      }
      
      System.out.print("Enter a positive integer for n: ");
      n = console.nextInt();
      
      while( n <= 0 )
      {
          System.out.println("Invalid,try again.");
          System.out.print("Enter a positive integer for n: ");
          n = console.nextInt();
      }

      if(m == n)
      {
          System.out.println("GCD = " + n);
          
          return;   //The main method is ended.
          
          //System.exit(0);
      }
      
      if( m < n )  //swap m with n
      {
          int temp = m;
          m = n;
          n = temp;
      }
      
      System.out.println(gcd(m,n));
            
   } //end main
   
   public static int gcd(int m, int n){
       int r;
       r = m % n;
       if(r == 0){
           return n;
       }
       return gcd(n, r);
   }
} //end class
