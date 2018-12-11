
import java.util.InputMismatchException;
import java.util.Scanner;

/*
* Author: Benjamin Gillmore
* Date: Dec 10, 2018
* Assignment: Assignment12
* Description: Main client program for a binary tree of team records
*/
public class Assignment12 {
    
    public static void main(String[] args) {
        //variable declaration
        BinarySearchTree<TeamRecord> tree = new BinarySearchTree();
        Scanner console = new Scanner(System.in);
        int wins = 0, losses = 0;
        String teamName = "";
        int userInt = 0;
        
        //main loop
        while(true){
            //gets user input for menu selection, invalid input exits program
            try{
                printMenu();
                userInt = console.nextInt();
            }
            catch(InputMismatchException e1){
                System.out.print(e1.toString() + "\n");
                System.out.print("Exiting program.");
            }
            catch(Exception e){
                System.out.print(e.toString() + "\n");
                System.out.print("Exiting program.");
            }
            
            switch(userInt){
                //adds new team record to tree, invalid input exits program
                case 1:
                    try{
                        System.out.print("Enter team name: ");
                        teamName = console.next();
                        System.out.print("Enter total wins: ");
                        wins = console.nextInt();
                        System.out.print("Enter total losses: ");
                        losses = console.nextInt();
                    }
                    catch(InputMismatchException e1){
                        System.out.print(e1.toString() + "\n");
                        System.out.print("Exiting program.");
                        System.exit(0);
                    }
                    catch(Exception e){
                        System.out.print(e.toString() + "\n");
                        System.out.print("Exiting program.");
                        System.exit(0);
                    }
                    tree.insertNode(new TeamRecord(teamName, wins, losses));
                    break;
                //preorder traverse printing
                case 2:
                    if(tree.getRoot() != null){
                        tree.preOrderTraverse();
                    }
                    else{
                        System.out.print("Tree is empty.\n");
                    }
                    break;
                //inorder traverse printing
                case 3:
                    if(tree.getRoot() != null){
                        tree.inOrderTraverse();
                    }
                    else{
                        System.out.print("Tree is empty.\n");
                    }
                    break;
                //postorder traverse printing
                case 4:
                    if(tree.getRoot() != null){
                        tree.postOrderTraverse();
                    }
                    else{
                        System.out.print("Tree is empty.\n");
                    }
                    break;
                //searches for team name, invalid input exits program
                case 5:
                    System.out.print("Enter team name to search for: ");
                    if(tree.getRoot() != null){
                        try{
                            teamName = console.next();
                        }
                        catch(InputMismatchException e1){
                            System.out.print(e1.toString() + "\n");
                            System.out.print("Exiting program.");
                            System.exit(0);
                        }
                        catch(Exception e){
                            System.out.print(e.toString() + "\n");
                            System.out.print("Exiting program.");
                            System.exit(0);
                        }

                        if(tree.search(new TeamRecord(teamName, 0, 0)).getElement() != null){
                            System.out.println(tree.search(new TeamRecord(teamName, 0, 0)).getElement());
                        }
                        else{
                            System.out.print("Not Found\n");
                        }
                    }
                    else{
                        System.out.print("Tree is empty.\n");
                    }
                    break;
                //exits program
                case 0:
                    System.exit(0);
                    break;
            }
        }
        
        
    }
    
    //defines user menu
    public static void printMenu(){
        System.out.println("1.Insert a New Node");
        System.out.println("2.Pre-Order Traversal");
        System.out.println("3.In-Order Traversal");
        System.out.println("4.Post-Order Traversal");
        System.out.println("5.Search a Node");
        System.out.println("0.Exit");
    }

}
