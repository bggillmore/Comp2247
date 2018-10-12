import java.util.Scanner;
public class Recursive_Factorials
{
   
   public static void main(String[] args)
   {
      int n;
      long result;
      Scanner console = new Scanner(System.in);
      System.out.println("enter an int: ");
      n = console.nextInt();
      result = getFactorial(n);
      
      System.out.print(n + "! = " + result);
      
   }
   
   //recursive method
   public static long getFactorial( int n){
   if(n == 1){
      return 1;
   }
   return n * getFactorial(n-1);
   }
}
