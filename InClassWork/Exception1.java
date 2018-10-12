
import java.util.*;

public class Exception1
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        int dividend, divisor, quotient, remainder;           

        System.out.print("Enter the dividend: ");            
        dividend = console.nextInt();              
                            

        System.out.print("Enter the divisor: ");             
        divisor = console.nextInt();               
                         

        quotient = dividend / divisor; 
		  remainder = dividend % divisor;            

        System.out.println("\nQuotient = " + quotient); 
		  System.out.println("Remainder = " + remainder);             
    }
}

