
import java.util.InputMismatchException;
import java.util.Scanner;

/*
* Author: Benjamin Gillmore
* Date: Nov 9, 2018
* Assignment: Assignment9
* Description: Text driven menue for a linked list of team records
*/
public class Assignment9 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        MyLinkedList<TeamRecord> teamRecordList = new MyLinkedList<>();
        
        boolean running = true;
        int userInputInt = 0, userInputInt1, userInputInt2;
        String userInputString1;
        
        while(running){
            //resetting userInputInt to 0 to signify completeion of menu selection
            //if not completed userInputInt is not reset and goes back to orignal selection
            if(userInputInt == 0){
                System.out.println("\n1 ------- Add First (create a new TeamRecord object and add it to the head of the linked list)");
                System.out.println("2 ------- Remove First (remove and return the first object, then print it)");
                System.out.println("3 ------- Add Last (create a new TeamRecord object and add it to the tail of the linked list)");
                System.out.println("4 ------- Traverse (print all the objects in the linked list)");
                System.out.println("5 ------- Search (search a team by its name)");
                System.out.println("6 ------- Selection Sort (sort the linked list by the team name)");
                System.out.println("0 ------- Exit");

                try{
                    userInputInt = console.nextInt();
                }
                catch(InputMismatchException e1){
                    System.out.print(e1.toString());
                    console.next();
                }
                catch(Exception e){
                    System.out.print(e.toString());
                }
            }
            
            switch (userInputInt) {
                case 1:
                    try{
                        System.out.print("Enter Team Name: ");
                        userInputString1 = console.next();

                        System.out.print("Enter Number of Wins: ");
                        userInputInt1 = console.nextInt();

                        System.out.print("Enter Number of Losses: ");
                        userInputInt2 = console.nextInt();

                        teamRecordList.addFirst(
                                new TeamRecord(userInputString1, userInputInt1, userInputInt2)
                        );
                        userInputInt = 0;
                    }
                    catch(InputMismatchException e1){
                        System.out.print("Enter valid data. " + e1.toString() + "\n");
                        console.next();
                    }
                    catch(Exception e){
                        System.out.print(e.toString());
                    }
                    break;
                    
                case 2:
                    try{
                        System.out.print(teamRecordList.removeFirst().toString() + 
                                " is removed from the list.\n");
                    }
                    catch(EmptyListException e1){
                        System.out.print("List is Empty, enter data first.\n");
                        System.out.print(e1.toString());
                    }
                    catch(Exception e){
                        System.out.print(e.toString());
                    }
                    finally{
                        userInputInt = 0;
                    }
                    break;
                case 3:
                    try{
                        System.out.print("Enter Team Name: ");
                        userInputString1 = console.next();

                        System.out.print("Enter Number of Wins: ");
                        userInputInt1 = console.nextInt();

                        System.out.print("Enter Number of Losses: ");
                        userInputInt2 = console.nextInt();

                        teamRecordList.addLast(
                                new TeamRecord(userInputString1, userInputInt1, userInputInt2)
                        );
                        userInputInt = 0;
                    }
                    catch(InputMismatchException e1){
                        System.out.print("Enter valid data. " + e1.toString() + "\n");
                        console.next();
                    }
                    catch(Exception e){
                        System.out.print(e.toString());
                    }
                    break;
                    
                case 4:
                    try{
                        System.out.print(teamRecordList.traverse());
                    }
                    catch(EmptyListException e1){
                        System.out.print("List is Empty, enter data first.\n");
                        System.out.print(e1.toString());
                    }
                    catch(Exception e){
                        System.out.print(e.toString());
                    }
                    finally{
                        userInputInt = 0;
                    }
                    break;
                    
                case 5:
                    try{
                        System.out.print("Enter a team name to search for: ");
                        userInputString1 = console.next();
                        TeamRecord temp = new TeamRecord(userInputString1, -1, -1);
                        if(teamRecordList.search(temp)){
                            System.out.print(userInputString1 + " is in the list.");
                        }
                        else{
                            System.out.print(userInputString1 + " is not in the list.");
                        }
                    }
                    catch(InputMismatchException e1){
                        System.out.print("Enter valid data. " + e1.toString() + "\n");
                        console.next();
                    }
                    catch(Exception e){
                        System.out.print(e.toString());
                    }
                    finally{
                        userInputInt = 0;
                    }
                    break;
                case 6:
                    try{
                        teamRecordList.selectionSort();
                        System.out.print("List is sorted.\n");
                    }
                    catch(EmptyListException e1){
                        System.out.print("List is Empty, enter data first.\n");
                        System.out.print(e1.toString());
                    }
                    catch(Exception e){
                        System.out.print(e.toString());
                    }
                    finally{
                        userInputInt = 0;
                    }
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    break;
            }

        }
        
    }

}
