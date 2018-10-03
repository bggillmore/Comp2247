
import java.util.Scanner;

/*
* Author: Benjamin Gillmore
* Date: 09/19/2018
* Assignment: Assignment #3 BillingSystemClient.java
* Description: This is the client program for assignment 3.
*/

public class BillingSystemClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        boolean quit = false;
        String firstName, lastName, specialty, date;
        String[] dateArray;
        int jobId ;
        double materialFee, contractorFee, discount;
                
        // create scanner to read user input
        Scanner console = new Scanner(System.in);
        
        //main program loop
        System.out.println("Contractor Billing System Program\n");
        while(!quit){
            //coustomer data
            System.out.print("\nEnter customer job's ID: ");
            jobId = console.nextInt();
            System.out.print("Enter customer's first name: ");
            firstName = console.next();
            System.out.print("Enter customer's last name: ");
            lastName = console.next();
            Person coustomer = new Person(firstName, lastName);
            
            //contractor data
            System.out.print("\nEnter contractor's first name: ");
            firstName = console.next();
            System.out.print("Enter contractor's last name: ");
            lastName = console.next();
            System.out.print("Enter contractor's specialty: ");
            specialty = console.next();
            Contractor contractor = new Contractor(specialty, new Person(firstName, lastName));
            
            //date info
            do{
                System.out.print("\nEnter the date (xx/xx/xxxx) the customer called: ");
                date = console.next(); 
            }while(!date.matches("^\\d{2}\\/\\d{2}\\/\\d{4}$"));
            dateArray = date.split("/");
            MyDate calledDate = new MyDate(Integer.parseInt(dateArray[0]), 
                    Integer.parseInt(dateArray[1]), Integer.parseInt(dateArray[2]));
            
            do{
                System.out.print("Enter the job's starting date (xx/xx/xxxx): ");
                date = console.next(); 
            }while(!date.matches("^\\d{2}\\/\\d{2}\\/\\d{4}$"));
            dateArray = date.split("/");
            MyDate startedDate = new MyDate(Integer.parseInt(dateArray[0]), 
                    Integer.parseInt(dateArray[1]), Integer.parseInt(dateArray[2]));
            
            do{
                System.out.print("Enter the job's completion date (xx/xx/xxxx): ");
                date = console.next(); 
            }while(!date.matches("^\\d{2}\\/\\d{2}\\/\\d{4}$"));
            dateArray = date.split("/");
            MyDate completionDate = new MyDate(Integer.parseInt(dateArray[0]), 
                    Integer.parseInt(dateArray[1]), Integer.parseInt(dateArray[2]));
            
            //create costomer job object
            CustomerJob job = new CustomerJob(jobId, coustomer, contractor, 
                    calledDate, startedDate, completionDate);
            
            //enter bill info
            System.out.print("\nEnter the material fee: ");
            materialFee = console.nextDouble();
            System.out.print("Enter the contractor's fee: ");
            contractorFee = console.nextDouble();
            System.out.print("Enter the discount amount: ");
            discount = console.nextDouble();
            Bill bill = new Bill(jobId, materialFee, contractorFee, discount);
            
            //print out results
            System.out.println("\n******************\nCoustomer Job Info\n******************");
            System.out.print(job.toString());
            System.out.println("\n******************\nContractor Bill Info\n******************");
            System.out.print(bill.toString());
            
            //ask if you wish to continue and set flag
            System.out.println("\nType q to quit: ");
            if(console.next().equals("q")){
                quit = true;
            }
            
        }//end while
        
    }//end main
    
}//end program
