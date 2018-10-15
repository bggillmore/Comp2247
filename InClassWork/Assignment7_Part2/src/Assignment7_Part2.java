
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
* Author: Benjamin Gillmore
* Date: Oct 15, 2018
* Assignment: Assignment7_Part2
* Description: 
*/
public class Assignment7_Part2 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n, x;
        
        //get user input for finding product
        do{
            try{
                System.out.print("\nEnter number of activities to choose from: ");
                n = console.nextInt();
                System.out.print("\nEnter number of activities to attend: ");
                x = console.nextInt();
                if(n <= 0 | x <= 0){
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
        System.out.print("Combinations: " + combo(n, x));
        
    }
    public static int combo(int n, int x){
        if(n == x){
            return 1;
        }
        if(x <= 1){
            return n;
        }
        return combo(n-1, x) + combo(n-1, x-1);
    }
}