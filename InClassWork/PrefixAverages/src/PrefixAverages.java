
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
* Author: Benjamin Gillmore
* Date: Oct 29, 2018
* Assignment: PrefixAverages
* Description: 
*/
public class PrefixAverages {
    public static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        int n, k;
        System.out.print("Enter the size of array: ");
        n = console.nextInt();

        long before, after;

        int[] list = new int[n];

        
        int[] array = new int[n];
                
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 100 + 1);
        }

        System.out.println("\n" + n + " random numbers were generated in an array.");

        boolean flag = true;

        while (flag) {
            System.out.println();
            System.out.println("******************");
            System.out.println("1 - PrefixAverages1");
            System.out.println("2 - PrefixAverages1");
            System.out.println("0 - Exit");
            System.out.println("*******************");

            System.out.print("\nEnter your selection: ");
            k = console.nextInt();

            switch (k) {
                case 1:

                    before = System.currentTimeMillis();
                    array = prefixAverages1(list);
                    after = System.currentTimeMillis();
                    for(int i = 0; i < array.length; i++){
                        if(i % 25 == 0){
                            System.out.print("\n");
                        }
                        if(i == 0){
                            System.out.print(array[i]);
                        }
                        else if(i == array.length -1){
                            System.out.print(array[i] + "\n");
                        }
                        else{
                            System.out.print(array[i] + ", ");
                        }
                        
                    }
                    
                    System.out.println("\nTime spent: " + (after - before) + " milliseconds");

                    break;

                case 2:
                    before = System.currentTimeMillis();
                    array = prefixAverages2(list);
                    after = System.currentTimeMillis();
                    
                    for(int i = 0; i < array.length; i++){
                        if(i % 25 == 0){
                            System.out.print("\n");
                        }
                        if(i == 0){
                            System.out.print(array[i]);
                        }
                        else if(i == array.length -1){
                            System.out.print(array[i] + "\n");
                        }
                        else{
                            System.out.print(array[i] + ", ");
                        }
                        
                    }
                    
                    System.out.println("\nTime spent: " + (after - before) + " milliseconds");
                    break;

                case 0:

                    flag = false;

                    break;

                default:
                    System.out.println("Invalid, try again");

            }//end switch
        }//end while

    }
    
    public static int[] prefixAverages1(int[] list){
        int s;
        int[] listOut = new int[list.length];
        for(int i = 0; i < list.length; i++){
            s = list[0];
            for(int j = 1; j<=i; j++){
                s = s + list[j];
            }
            listOut[i] = s / (i + 1);
        }
        return listOut;
    }
    
    public static int[] prefixAverages2(int[] list){
        int s = 0;
        int[] listOut = new int[list.length];
        for(int i = 0; i < list.length; i++){
            s = s + list[i];
            listOut[i] = s / (i + 1);
        }
        return listOut;
    }
}
