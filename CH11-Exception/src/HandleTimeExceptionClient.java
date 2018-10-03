
import java.util.*;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class HandleTimeExceptionClient {

    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        int hours, minutes, seconds;
        
        //call a method to read hours
        hours = readHours();
        
    }
    public static int readHours(){
        int hr = 0;
        do{
            try{
                System.out.print("Enter hours (0-12): ");
                hr = console.nextInt();
                if(hr < 0 | hr > 12){
                    throw new InvalidHourException();
                }
            }
            catch(InputMismatchException e1){
                System.out.println(e1.toString());
            }
            catch(InvalidHourException e2){
                System.out.print(e2.toString());
            }
            catch(Exception e){
                System.out.print(e.toString());
            }
            break; //do while break;
        }while(true);
        return hr;
    }
    
}
