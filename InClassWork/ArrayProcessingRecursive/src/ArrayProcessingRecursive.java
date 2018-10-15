
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
* Author: Benjamin Gillmore
* Date: Oct 15, 2018
* Assignment: ArrayProcessingRecursive
* Description: 
*/
public class ArrayProcessingRecursive {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        Random rand = new Random();
        
        int[] list = new int[5];
        
        for(int i = 0; i < list.length; i++){
            list[i] = rand.nextInt(20) + 1;
        }
        
        System.out.print("\nSum of all Elements: ");
        System.out.print(sumArray(list, list.length));
    }
    
    public static int sumArray(int[] list, int n){
        if(n == 1){
            return list[0];
        }
        return  list[n-1] + sumArray(list, n-1);
    }

}
