import java.util.Scanner;
public class Exponent
{
   
   public static void main(String[] args)
   {
   
      Scanner console = new Scanner(System.in);
      int n, r;
      int result;
      System.out.println("number base: ");
      n = console.nextInt();
      System.out.println("number exponent: ");
      r = console.nextInt();
      
      System.out.println(mult(n,r));
   }
   
   //recursive method
   public static int mult(int n, int r){
      if(r==0){
         return 1;
      }
      n *= mult(n, r-1);
      return n;
   }
   //java arrow function
   //(int n, int r) -> r?0:return 1, n*lambda(n,r-1) return n;
   () -> System.out.print("haha");
   //public static int mult(int n, int r) -> r?0 {return 1, return n} n*= mult(n, r-1);
}