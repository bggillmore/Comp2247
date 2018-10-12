
import java.util.ArrayList;
import java.util.Scanner;

/*
* Author: Benjamin Gillmore
* Date: 10/03/2018
* Assignment: Assignment #5 Assignment4.java
* Description: Client program for adding and displaying tuition for school students
*               Part 2: Added abstract and polymorphic printing
*/

public class Assignment4 {

    public static void main(String[] args) {
        boolean quit, userBool;
        int userInt1, userInt2;
        String userString1, userString2, userString3;
        
        //arraylist for each student
        ArrayList<Tuition> tuitionList = new ArrayList<>();
        
        //input scanner
        Scanner console = new Scanner(System.in);
        
        //print intro mesage
        System.out.print("***********************\n\nTuition Program\n\n");
        
        //main execution loop
        quit = false;
        while(!quit){
            System.out.println("-----------------------");
            System.out.println("1: Full Time Student");
            System.out.println("2: Part Time Student");
            System.out.println("3: Audit Student");
            System.out.println("4: Loop through the array/ArrayList (Polymorphism)");
            System.out.println("0: Exit");
            System.out.println("***********************\n");
            
            //get selcetion repeat until valid answer
            do{
                System.out.print("Enter a command: ");
                userInt1 = console.nextInt();
            } while (!Integer.toString(userInt1).matches("^[0-4]$"));
            
            //execute selection
            switch(userInt1){
                case 1:
                    //get full time student info
                    System.out.print("\n\nEnter student ID: ");
                    userInt1 = console.nextInt();
                    System.out.print("\nEnter first name: ");
                    userString1 = console.next();
                    System.out.print("\nEnter last name: ");
                    userString2 = console.next();
                    do{
                        System.out.print("\nEnter resident status (Y or N): ");
                        userString3 = console.next();
                    }while(!userString3.matches("^(Y|N)$"));
                    userBool = userString3.equals("Y");
                    
                    //add full time student to arraylist
                    tuitionList.add(new FullTimeTuition(userInt1, userString1, userString2, userBool));
                    
                    //print resulting info
                    System.out.println("\n\n-----------------------\n");
                    System.out.print(tuitionList.get(tuitionList.size()-1).toString());
                    break;
                    
                case 2:
                    //get part time student info
                    System.out.print("\n\nEnter student ID: ");
                    userInt1 = console.nextInt();
                    System.out.print("\nEnter first name: ");
                    userString1 = console.next();
                    System.out.print("\nEnter last name: ");
                    userString2 = console.next();
                    do{
                        System.out.print("\nEnter resident status (Y or N): ");
                        userString3 = console.next();
                    }while(!userString3.matches("^(Y|N)$"));
                    userBool = userString3.equals("Y");
                    System.out.print("\nEnter credit hours: ");
                    userInt2 = console.nextInt();
                    
                    //add part time student to arraylist
                    tuitionList.add(new PartTimeTuition(userInt2, userInt1, userString1, userString2, userBool));
                    
                    //print resulting info
                    System.out.println("\n\n-----------------------\n");
                    System.out.print(tuitionList.get(tuitionList.size()-1).toString());
                    break;
                    
                case 3:
                    //get audit student info
                    System.out.print("\n\nEnter student ID: ");
                    userInt1 = console.nextInt();
                    System.out.print("\nEnter first name: ");
                    userString1 = console.next();
                    System.out.print("\nEnter last name: ");
                    userString2 = console.next();
                    do{
                        System.out.print("\nEnter resident status (Y or N): ");
                        userString3 = console.next();
                    }while(!userString3.matches("^(Y|N)$"));
                    userBool = userString3.equals("Y");
                    
                    //add audit student to arraylist
                    tuitionList.add(new AuditTuition(userInt1, userString1, userString2, userBool));
                    
                    //print resulting info
                    System.out.println("\n\n-----------------------\n");
                    System.out.print(tuitionList.get(tuitionList.size()-1).toString());
                    break;
                    
                case 4:
                    for(Tuition tuition : tuitionList){
                        System.out.println(tuition.toString());
                    }
                    break;
                    
                case 0:
                    quit = true;
                    break;
            }
        }
        System.out.print("\n\n\nThank you for using this program");
    }
    
}
