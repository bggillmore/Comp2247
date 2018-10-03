
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Graham
 */
public class StockClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create array list of country objects
        ArrayList<Stock> stockList = new ArrayList<>();
        
        //create scanner for user input
        Scanner console = new Scanner(System.in);
        
        //get input from user
        String inputString;
        Double inputDouble;
        int flagInput;
        
        boolean flag = true;
        while(flag){
            System.out.print("Enter Stock Symbol: ");
            inputString = console.next();
            System.out.print("\nEnter Stock Price: ");
            inputDouble = console.nextDouble();
            
            //create new object and add to array
            stockList.add(new Stock(inputString, inputDouble));
            
            //check to see if user is done entering stocks
            System.out.print("\nEnter another stock? (0 to quit): ");
            flagInput = console.nextInt();
            if(flagInput == 0){
                flag = false;
            }
        }
        
        printAll(stockList);
        Stock highestStock = highestSharePrice(stockList);
        System.out.println("The Highest stock price: ");
        System.out.println(highestStock.toString());
        System.out.printf("\nThe average share price: $%.2f", averageSharePrice(stockList));
        System.out.println("\nThe stocks valued less than average: ");
        lessThanAvg(stockList);
        System.out.println("The stocks valued greater than or equal to average: ");
        greaterOrEqThanAvg(stockList);
    }
    
    //prints out all the stock symbols and prices
    private static void printAll(ArrayList stockList){
        for(int i = 0; i < stockList.size(); i++){
            Stock stock = (Stock) stockList.get(i);
            System.out.println(stock.toString());
        }
    }
    
    //Find the stock with the highest share price and output its symbol and share price
    private static Stock highestSharePrice(ArrayList stockList){
        Stock highestStock = new Stock();
        for(int i = 0; i < stockList.size(); i++){
            Stock stock = (Stock) stockList.get(i);
            if(stock.getSharePrice() > highestStock.getSharePrice()){
                highestStock = stock;
            }
        }
        return highestStock;
    }
    
    //Calculate and output the average share price
    private static double averageSharePrice(ArrayList stockList){
        double average = 0;
        for(int i = 0; i < stockList.size(); i++){
            Stock stock = (Stock) stockList.get(i);
            average += stock.getSharePrice();
        }
        return average/stockList.size();
    }
    
    //Output the symbols of all the stocks whose share prices are less than the aveerage
    private static void lessThanAvg(ArrayList stockList){
        double average = averageSharePrice(stockList);
        for(int i = 0; i < stockList.size(); i++){
            Stock stock = (Stock) stockList.get(i);
            if(stock.getSharePrice() < average){
                System.out.println(stock.getSymbol());
            }
        }
    }
    
    //Output the symbols of all the stocks whose share prices are greater than or equal to the average
    private static void greaterOrEqThanAvg(ArrayList stockList){
        double average = averageSharePrice(stockList);
        for(int i = 0; i < stockList.size(); i++){
            Stock stock = (Stock) stockList.get(i);
            if(!(stock.getSharePrice() < average)){
                System.out.println(stock.getSymbol());
            }
        }
    }
}
