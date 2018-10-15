
import java.util.InputMismatchException;
import java.util.Scanner;

/*
* Author: Benjamin Gillmore
* Date: 10/03/2018
* Assignment: Assignment #6 
* Description: 
*/

public class Assignment6 {
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean exceptionFlag;
        int creditHours = 0, gradePoints = 0;
        while(true){
            //get user input for credit hours
            do{
                try{
                    exceptionFlag = false;
                    System.out.print("Enter the total credit hours attempted (-1 to exit): ");
                    creditHours = console.nextInt();
                    if(creditHours < -1 | creditHours == 0){
                        throw new InvalidIntException();
                    }
                }
                catch(InputMismatchException e1){
                    exceptionFlag = true;
                    console.next();
                    System.out.println(e1.toString() + " Enter an integer");
                }
                catch(InvalidIntException e2){
                    exceptionFlag = true;
                    System.out.println(e2.toString());
                }
                catch(Exception e){
                    exceptionFlag = true;
                    console.next();
                    System.out.println(e.toString());
                }
            }while(exceptionFlag);
            System.out.println("The total credits are valid.\n");
            
            //if user entered -1 break main loop
            if(creditHours == -1){
                break;
            }
            
            //get user input for grade points
            do{
                try{
                    exceptionFlag = false;
                    System.out.print("Enter the total grade points earned (-1 to exit): ");
                    gradePoints = console.nextInt();
                    if(gradePoints < -1){
                        throw new InvalidIntException();
                    }
                }
                catch(InputMismatchException e1){
                    exceptionFlag = true;
                    console.next();
                    System.out.println(e1.toString() + " Enter an integer");
                }
                catch(InvalidIntException e2){
                    exceptionFlag = true;
                    System.out.println(e2.toString());
                }
                catch(Exception e){
                    exceptionFlag = true;
                    console.next();
                    System.out.println(e.toString());
                }
            }while(exceptionFlag);
            System.out.println("The total grade points are valid.\n");
            
            //if user entered -1 break main loop
            if(gradePoints == -1){
                break;
            }
            System.out.print(String.format("GPA: %.2f", ((double)gradePoints/ creditHours)));
            break;
        }
    }
    
}
