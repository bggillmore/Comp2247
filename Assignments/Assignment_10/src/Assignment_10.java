
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
* Author: Benjamin Gillmore
* Date: Nov 21, 2018
* Assignment: Assignment_10
* Description: 
*/
public class Assignment_10 {

    public static void main(String[] args) {
        //declare variables
        boolean running = true, exception;
        int userInt = 0;
        String userString = "";
        
        //declare objects
        MyArrayListStack<String> stack = new MyArrayListStack<String>();
        Scanner console = new Scanner(System.in);
        
        while(running){
            userInt = -1;
            //print menu
            System.out.print("1 --- Enter a Formula\n");
            System.out.print("2 --- Evaluate a Formula\n");
            System.out.print("3 --- Exit\n");
            
            //get user input
            if(userInt == -1){
                try{
                     userInt = console.nextInt();
                }
                catch(InputMismatchException e1){
                     System.out.print(e1.toString() + " \n");
                     //console.next();
                }
                catch(Exception e){
                     System.out.print(e.toString() + "\n");
                     //console.next();
                }
                finally{
                    console.nextLine();
                }
            }
            
            
            //proceed to menu selection
            switch(userInt){
                case 1:
                    try{
                        System.out.print("Enter a formula: \n");
                        userString = console.nextLine();
                        userString = userString.replaceAll("\\s", "");

                    }
                    catch(InputMismatchException e1){
                        System.out.print(e1.toString());
                        console.next();
                    }
                    catch(Exception e){
                        System.out.print(e.toString());
                        console.next();
                    } 
                    
                    break;
                case 2:
                    try{
                        for(int i = 0; i < userString.length(); i++){
                            if(userString.charAt(i) == '('){
                                stack.push("(");
                            }
                            else if(userString.charAt(i) == ')'){
                                stack.pop();
                            }
                        }
                        if(stack.size() == 0){
                            System.out.print("Parenthises in formula are balenced.\n");
                        }
                        else{
                            System.out.print("Parenthises in formula are not balenced.\n");
                        }
                    }catch(EmptyStackException e1){
                        System.out.print("Parenthises in formula are not balenced.\n");
                    }
                    catch(FullStackException e2){
                        System.out.print(e2.toString() + "\n");
                        System.out.print("Stack full, please re-enter formula.\n");
                    }
                    catch(Exception e){
                        System.out.print(e.toString());
                    }
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    break;
            }
        }
    }

}
