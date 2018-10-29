
import java.util.*;

public class CountUno
{
   static Scanner console = new Scanner(System.in);

   public static void main(String[] args)
   {
      int[][] table ={
             {1,1,1,1,1,1,1,0},
             {1,1,1,1,1,0,0,0},
             {1,1,1,1,0,0,0,0},
             {1,1,1,1,0,0,0,0},
             {1,1,1,0,0,0,0,0},
             {1,1,1,0,0,0,0,0},
             {1,0,0,0,0,0,0,0},
             {0,0,0,0,0,0,0,0},
         };
         System.out.println(count(table));
   }
   public static int count(int[][] table){
      int i = 7, j = 0;
      int count = 0;
      while(i >= 0 && j < 8){
         if(table[i][j] == 1){
            count += i + 1;
            j++;
         }
         else{
            i--;
         }
      }
      return count;
   }

}