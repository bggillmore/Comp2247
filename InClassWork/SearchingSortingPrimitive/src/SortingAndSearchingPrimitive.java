/*
* Author: Benjamin Gillmore
* Date: Oct 17, 2018
* Assignment: SortingAndSearchingPrimitive
* Description: 
*/
import java.util.*;

public class SortingAndSearchingPrimitive {

   public static void main(String [] args) {
   
      Scanner console = new Scanner(System.in);
   	  
      Random rand = new Random();
   	  
      int [] list = new int[25];
   
      for (int i = 0; i < list.length; i++) {
            //list[i] = (int)(Math.random() * 500 +1);
         list[i] = rand.nextInt(500) + 1;    //0 to 499, 1 to 500
      }
   	  
      System.out.println("\nAll Elements:");
      printArray( list );  
      //selectionSort(list);
      //bubbleSort(list);
      quickSort(list, 0, list.length - 1);
      System.out.println("\nSorted array:");
      printArray(list);
      
   }//end main

   public static void printArray(int[] list) {
      for (int i = 0; i < list.length; i++) {
         System.out.print(list[i] + " ");
      }
   }
   
   //basic selection sort algorithm
    public static void selectionSort(int[] list) {
        int minIndex, temp;
        for(int x = 0; x < list.length - 1; x++){
            minIndex = x;
            for (int i = x +1; i < list.length; i++) {
                if(list[i] < list[minIndex]){
                    minIndex = i;
                }
            }

            //swap 
            temp = list[x];
            list[x] = list[minIndex];
            list[minIndex] = temp;
        }
    }
    
    //basic bubble sort algoritm
    /*
    public static void bubbleSort(int[] list){
        int temp;
        for(int i = 0; i < list.length - 1; i++){
            if(list[i] > list[i+1]){
                temp = list[i];
                list[i] = list[i+1];
                list[i+1] = temp;
                i = -1;
            }
        }
    }*/
    public static void bubbleSort(int[] list){
        int temp;
        for(int i = 0; i < list.length - 1; i++){
            if(list[i] > list[i+1]){
                for(int j = i+1; j > 0; j--){
                    if(list[j] > list[j-1]){
                        temp = list[j-1];
                        list[j-1] = list[j];
                        list[j] = temp;
                    }
                }
            }
        }
    }
    //quick sort
    public static int partition(int[] list, int p, int r){
        int x = list[p]; // pivot
        int i = p - 1;
        int j = r + 1;
        
        int temp;
        while(true){
            do{
                j--;
            }while(list[j] > x);
            do{
                i++;
            }while(list[i] < x);
            
            if(i < j){
                temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
            else{
                return j;
            }
        }
    }
    
    public static void quickSort(int[] list, int p, int r){
        if(p < r){
            int q = partition(list, p, r);
            quickSort(list, p ,q);
            quickSort(list, q+1, r);
        }
    }
} //end class
