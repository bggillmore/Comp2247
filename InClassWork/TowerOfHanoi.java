import java.util.Scanner;
public class TowerOfHanoi
{
   
   public static void main(String[] args)
   {
   
      Scanner console = new Scanner(System.in);
      int n;
      int result;
      System.out.println("number of disks: ");
      n = console.nextInt();
      
      move(n, 1, 3, 2);
   }
   
   //recursive method
   public static void move( int n, int tower1, int tower3, int tower2 ){
   if(n==1){
      System.out.printf("Move a disk from %d to %d %n", tower1, tower3);
   }
   else{
      move(n-1, tower1, tower2, tower3);
      System.out.printf("Move a disk from %d to %d %n", tower1, tower3);
      move(n-1, tower2, tower3, tower1);
   }
   }
   
}