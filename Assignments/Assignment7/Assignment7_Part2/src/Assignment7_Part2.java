
import java.util.InputMismatchException;
import java.util.Scanner;

/*
* Author: Benjamin Gillmore
* Date: Oct 15, 2018
* Assignment: Assignment7_Part2
* Description: Recursively finds how many possible combines of activities you can attend, 
* n represents the number of total activities, and x is the number of activities 
* you are attending.
*/
public class Assignment7_Part2 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n, x;
        
        //get user input for finding number of combinations
        do{
            try{
                System.out.print("\nEnter number of activities to choose from: ");
                n = console.nextInt();
                System.out.print("\nEnter number of activities to attend: ");
                x = console.nextInt();
                if(n < 0 | x < 0 | x < n){
                    throw new InputMismatchException();
                }
                break;
            }
            catch(InputMismatchException e1){
                System.out.print("Enter an integer greater than 0 " + e1.toString());
            }
            catch(Exception e){
                System.out.print(e.toString());
            }
        }while(true);
        
        //print out number of combinations
        System.out.print("Combinations: " + combo(n, x));
        
    }
    //recursive function to find possible number of combinations
    public static int combo(int n, int x){
        if(n == x){
            return 1;
        }
        if(x == 1){
            return n;
        }
        return combo(n-1, x) + combo(n-1, x-1);
    }
}