
import java.util.InputMismatchException;
import java.util.Scanner;

/*
* Author: Benjamin Gillmore
* Date: Oct 15, 2018
* Assignment: Assignment7_Part1
* Description: First asks user to enter two numbers and finds the product of them recursevly.
* Then asks the user for 1 number and returns the sum off all the numbers from 1 - n recursevly.
*/
interface Product{
    int run(int n, int r);
}
interface Sum{
    int run(int n);
}
public class Assignment7_Part1 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int userInt1, userInt2;
        
        //get user input for finding product
        do{
            try{
                System.out.print("\nEnter the First Integer: ");
                userInt1 = console.nextInt();
                System.out.print("\nEnter the second Integer: ");
                userInt2 = console.nextInt();
                if(userInt1 < 0 | userInt2 < 0){
                    throw new InputMismatchException();
                }
                break;
            }
            catch(InputMismatchException e1){
                System.out.print("Enter an integer 0 or greater " + e1.toString());
            }
            catch(Exception e){
                System.out.print(e.toString());
            }
        }while(true);
        
        //print out product of number
        System.out.print(String.format("\nThe product of %d and %d is: %d\n", 
                userInt1, userInt2, product.run(userInt1, userInt2)));
        
        //get user input for sum
        do{
            try{
                System.out.print("\nEnter an integer to sum to: ");
                userInt1 = console.nextInt();
                if(userInt1 < 1){
                    throw new InputMismatchException();
                }
                break;
            }
            catch(InputMismatchException e1){
                System.out.print("\nEnter an inter 1 or greater " + e1.toString());
            }
            catch(Exception e){
                System.out.print(e.toString());
            }
        }while(true);
        
        //print out sum of all number between 1 and n
        System.out.print(String.format("\nThe sum of the numbers between 1 and %d is: %d\n", 
                userInt1, sum.run(userInt1)));
        
    }
    //recursive lambda expressions to find product (n * r) and sum (1 - n)
    static final Product product = (n,r) ->
    {
        return r==0 ? 0 : n + Assignment7_Part1.product.run(n, r-1);
    };
    
    static final Sum sum = (n) ->
    {
        return n==1 ? 1 : n + Assignment7_Part1.sum.run(n - 1);
    };

    //regular recursive functions to find product (n * r) and sum (1 - n)
    /*
    public static int product(int int1, int int2){
        if(int2 == 0){
            return 0;
        }
        return int1 + product(int1, int2-1);
    }
    
    public static int sum(int int1){
        if(int1 == 1){
            return 1;
        }
        return int1 + sum(int1 - 1);
    }
    */
}
