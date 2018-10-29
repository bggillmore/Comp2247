/*
* Author: Benjamin Gillmore
* Date: Oct 29, 2018
* Assignment: BigONotations
* Description: 
 */
import java.util.*;

public class BigONotations {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        int n, k;
        System.out.print("Enter the size of array: ");
        n = console.nextInt();

        long before, after;

        int[] list = new int[n];

        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 100 + 1);
        }

        System.out.println("\n" + n + " random numbers were generated in an array.");

        boolean flag = true;

        while (flag) {
            System.out.println();
            System.out.println("******************");
            System.out.println("1 - Big O(n)");
            System.out.println("2 - Big O(n^2)");
            System.out.println("3 - Big O(n^3)");
            System.out.println("4 - Big O(2^n)");
            System.out.println("5 - Big O(log n)");
            System.out.println("6 - Big O(n * long n)");
            System.out.println("0 - Exit");
            System.out.println("*******************");

            System.out.print("\nEnter your selection: ");
            k = console.nextInt();

            switch (k) {
                case 1:

                    before = System.currentTimeMillis();
                    linearMethod(list);
                    after = System.currentTimeMillis();

                    System.out.println("\nTime spent: " + (after - before) + " milliseconds");

                    break;

                case 2:
                    before = System.currentTimeMillis();
                    quadraticMethod(list);
                    after = System.currentTimeMillis();
                    
                    System.out.println("\nTime spent: " + (after - before) + " milliseconds");
                    break;

                case 3:
                    before = System.currentTimeMillis();
                    cubicMethod(list);
                    after = System.currentTimeMillis();
                    
                    System.out.println("\nTime spent: " + (after - before) + " milliseconds");
                    break;

                case 4:
                    before = System.currentTimeMillis();
                    exponentialMethod(list);
                    after = System.currentTimeMillis();
                    
                    System.out.println("\nTime spent: " + (after - before) + " milliseconds");
                    break;
                    
                case 5:
                    before = System.currentTimeMillis();
                    binarySearch(list, 0, list.length-1, 25689);
                    after = System.currentTimeMillis();
                    
                    System.out.println("\nTime spent: " + (after - before) + " milliseconds");
                    break;
                    
                case 6:
                    before = System.currentTimeMillis();
                    quickSort(list, 0, list.length-1);
                    after = System.currentTimeMillis();
                    
                    System.out.println("\nTime spent: " + (after - before) + " milliseconds");
                    break;
                case 0:

                    flag = false;

                    break;

                default:
                    System.out.println("Invalid, try again");

            }//end switch
        }//end while

    }//end main             

    //linear method
    public static void linearMethod(int[] list) {
        for (int i = 0; i < list.length; i++) {
            list[i]++;
        }
    }

    //quadric method
    public static void quadraticMethod(int[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int x = 0; x <= i; x++) {
                list[x]++;
            }
        }

    }

    //cubic method
    public static void cubicMethod(int[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int x = 0; x <= i; x++) {
                for(int z = 0; z<=x; z++){
                    list[z]++;
                }
            }
        }
    }

    //logN method
    public static void logNMethod(int[] list, int key) {
        
    }
    public static int binarySearch(int[] list, int left, int right, int key){
        //variables
        int foundInt = -1;
        int middle = (left + right)/2;
        
        //search
        if(list[middle] == key) {
            foundInt = list[middle];
        }
        else if(list[middle] > key){
            if(left <= middle -1){
                foundInt = binarySearch(list, left, middle-1, key);
            }
        }
        else{
            if(right >= middle +1){
                foundInt = binarySearch(list, middle+1, right, key);
            }
        }
        return foundInt;
    }

    //exponential method
    public static void exponentialMethod(int[] list) {
        long count = 0;
        for (int i = 0; i < Math.pow(2,list.length); i++) {
            count ++;
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
}//end class
