/*
* Author: Benjamin Gillmore
* Date: 10/22/2018
* Assignment: Assignment #8 Assignment1Rework.java
* Description: This is the second Rework of assignment 1 that impliments new 
* searching and sorting algoritms.
*/

import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class Assignment1Rework {
static final int SIZE = 40;
    
    public static void main(String[] args)  {
        //create array of country objects of given size (40) 
        Country[] countryList = new Country[SIZE];
        
        boolean exceptionFlag;
        //get name of input file from user
        String inputFileName;
        Scanner inFile;
        
        //open jFile chooser
        do{
            try{
                while(true){
                    JFileChooser open = new JFileChooser("../");
                    int status = open.showOpenDialog(null);

                    if(status == JFileChooser.APPROVE_OPTION){
                        //open button is clicked

                        inputFileName = open.getSelectedFile().getAbsolutePath();
                        break;
                    }
                }
            
                exceptionFlag = false;
                inFile = new Scanner(new FileReader(inputFileName));
                
                //remove the data file headings
                for(int i = 0; i<5; i++){
                    inFile.next();
                }//end for

                //read data, create object, and place objects into array
                int x = 0;
                while(inFile.hasNext()){
                    String countryName = inFile.next();
                    String UNContinentalRegion = inFile.next();
                    String UNStatisticalRegion = inFile.next();
                    int population = inFile.nextInt();
                    int gdp = inFile.nextInt();

                    countryList[x] = new Country(countryName, UNContinentalRegion, UNStatisticalRegion, population, gdp);
                    x++;
                }//end while
            }
            catch(InputMismatchException inputMismatchException){
                    exceptionFlag = true;
                    System.out.print(inputMismatchException.toString());
                }
            catch(IOException iOException){
                exceptionFlag = true;
                System.out.print(iOException.toString());
            }
            catch(Exception e){
                exceptionFlag = true;
                System.out.print(e.toString());
            }
        }while(exceptionFlag);
        
        
        //Display menu and call functions to display info
        boolean flag = true;
        int userCommand = 0;
        Scanner console = new Scanner(System.in);
        String key = "";
        
        while(flag){
            //get user input, non integer inputs handled by try-catch,
            //non menue integers handled by default case in switch statement.
            do{
               exceptionFlag = false;
               try{
                    showMenu();
                    userCommand = console.nextInt();
               }
               catch(InputMismatchException e1){
                    exceptionFlag = true;
                    console.next();
                    System.out.println(e1.toString());
                }
                catch(Exception e){
                    exceptionFlag = true;
                    console.next();
                    System.out.print(e.toString());
                }
            }while(exceptionFlag);
            
            switch(userCommand){
                case 1: //output all the countries information
                    outputCountryInfo(countryList);
                    break;
                case 2: //output average gdp
                    averageGDP(countryList);
                    break;
                case 3: //output highest gdp country name
                    highestGDP(countryList);
                    break;
                case 4: //call search method and output its return
                    System.out.println("\nEnter a country to search: ");
                    //get user input, exceptions handled by try catch
                    do{
                        try{
                            exceptionFlag = false;
                            key = console.next(); 
                        }
                        catch(Exception e){
                            exceptionFlag = true;
                            console.next();
                            System.out.print(e.toString());
                        }
                    }while(exceptionFlag);
                    
                    search(countryList, key);
                    break;
                case 5: //output each UNStatistical region
                    statisticalRegion(countryList);
                    break;
                case 6: //population quick sort
                    quickSort(countryList, 0, countryList.length -1, false);
                    break;
                case 7: //selection sort population
                    selectionSort(countryList, false);
                    break;
                case 8: //quick sort names
                    quickSort(countryList, 0, countryList.length -1, true);
                    break;
                case 9:
                    selectionSort(countryList, true);
                    break;
                case 10:
                    System.out.println("\nEnter a country to search: ");
                    //get user input, exceptions handled by try catch
                    do{
                        try{
                            exceptionFlag = false;
                            key = console.next(); 
                        }
                        catch(Exception e){
                            exceptionFlag = true;
                            console.next();
                            System.out.print(e.toString());
                        }
                    }while(exceptionFlag);
                    
                    System.out.print(binarySearch(countryList, 0, countryList.length, key));
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    break;
                
            }
        }//end while
        
    }
    
    //prints the programs menu to the screen
    private static void showMenu() {
        System.out.print("\n\n" +
                        "1 - Output the country information\n" +
                        "2 - Output the average GDP\n" +
                        "3 - Output the country with the highest GDP per Capita\n" +
                        "4 - Search a country and output its information\n" +
                        "5 - Output countries in each UN statistical region\n\n" +
                        "6 - Sort the list based on the population in ascending order (quick sort)\n" +
                        "7 - Sort the list based on the population in descending order (selection sort)\n" +
                        "8 - Sort the list based on the country name in ascending order (quick sort)\n" +
                        "9 - Sort the list based on the country name in descending order (selection sort)\n" +
                        "10 - Search the list based on the country name (binary search) and output the country information\n" +
                        "0 - Exit\n"
                );
    }
    
    //output data for all countrys output properly
    private static void outputCountryInfo(Country[] countryList){
        System.out.printf("%-25s %-20s %-20s %-20s %-20s %-20s\n", 
                "Name", "Continental Region", "Statistical Region", "Population", "GDP (Millions)", "GDP Per Capita");
        for(Country country:countryList){
            System.out.println(country.toString());
        }
    }
    
    //
    private static void averageGDP(Country[] countryList) {
        double gdpTotal = 0;
        for(Country country: countryList){
            gdpTotal += country.getGdp();
        }
        System.out.printf("Average GDP: $%,.2f (Millions)", gdpTotal/SIZE);
    }
    
    //
    private static void highestGDP(Country[] countryList){
        Country highestGDP = new Country();
        for(Country country : countryList){
            if(highestGDP.gdpPerCapita() < country.gdpPerCapita()){
                highestGDP = country;
            }
        }
        System.out.printf("%-25s %-20s %-20s %-20s %-20s %-20s \n", 
                "Name", "Continental Region", "Statistical Region", "Population", "GDP (Millions)", "GDP Per Capita");
        System.out.println(highestGDP.toString());
    }
    
    //searches through the countries in country list and returns any match.
    private static void search(Country[] countryList, String key){
        for(Country country : countryList){
            if(country.getCountryName().equals(key)){
                System.out.printf("%-25s %-20s %-20s %-20s %-20s %-20s \n", 
                        "Name", "Continental Region", "Statistical Region", "Population", "GDP (Millions)", "GDP Per Capita");
                System.out.println(country.toString());
                return;
            }
        }
        System.out.println("Country not found.");
    }
    
    /* I am aware that there is a much simpler way to complete this task with out using enum. 
    I was just bored after class and wanted to try this. If there is anything im not using correctly here
    please let me know. */
    
    //create enumeration of objects
    static enum Region{
        Northern_Europe("", 0), Eastern_Europe("", 0), Western_Europe("", 0), Southern_Europe("", 0);
            
        private String countriesInRegion;
        private int numberInRegion;
        
        Region(String countriesInRegion, int numberInRegion){
            this.countriesInRegion = countriesInRegion;
            this.numberInRegion = numberInRegion;
        }
        
        public void addToCIR(String country){
            this.countriesInRegion += country + " ";
            this.numberInRegion++;
        }
    }
    
    //itterate through countries and add data to enums accordingly
    private static void statisticalRegion(Country[] countryList) {
        for(Country country: countryList){
            switch(country.getUNStatisticalRegion()){
            case "Northern_Europe":
                Region.Northern_Europe.addToCIR(country.getCountryName());
                break;
            case "Eastern_Europe":
                Region.Eastern_Europe.addToCIR(country.getCountryName());
                break;
            case "Western_Europe":
                Region.Western_Europe.addToCIR(country.getCountryName());
                break;
            case "Southern_Europe":
                Region.Southern_Europe.addToCIR(country.getCountryName());
                break;
            default:
                break;
            }
        }
        
        //make list of all regions and print data seperately
        Region[] regionList = Region.values();
        for(Region region : regionList){
            System.out.println(region.name() + ":");
            System.out.println(region.countriesInRegion);
            System.out.println(region.numberInRegion + " countries\n");
        }
    }
    
    //Sorting/sorting algoritms
    
    //quick sort
    public static int partition(Country[] list, int p, int r, boolean name){
        Country x = list[p]; // pivot
        int i = p - 1;
        int j = r + 1;
        
        Country temp;
        while(true){
            
            //right side itterator
            do{
                j--;
            }
            //if name boolean is true, sort by name, else sort by population
            while(name ? 
                    list[j].getCountryName().compareToIgnoreCase(x.getCountryName()) > 0:
                    list[j].getPopulation() > x.getPopulation());
            
            //left side itterator
            do{
                i++;
            }
            //if name boolean is true, sort by name, else sort by population
            while(name ? 
                    list[i].getCountryName().compareToIgnoreCase(x.getCountryName()) < 0:
                    list[i].getPopulation() < x.getPopulation());
            
            //do the swaps
            if(i < j){
                temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
            //return partition if nothing left to swap
            else{
                return j;
            }
        }
    }
    
    public static void quickSort(Country[] list, int p, int r, boolean name){
        if(p < r){
            int q = partition(list, p, r, name);
            quickSort(list, p ,q, name);
            quickSort(list, q+1, r, name);
        }
    }
    
    
    //selection sort by population by decending order
    public static void selectionSort(Country[] list, boolean name){
        Country temp;
        int maxIndex;
        
        for(int j = 0; j < list.length -1; j++){
            maxIndex = j;
            for(int i = j+1; i < list.length; i++){
                //if name bool is true sort by name, if false sort by population
                if(name? 
                        list[i].getCountryName().compareToIgnoreCase(list[maxIndex].getCountryName()) > 0: 
                        list[i].getPopulation() > list[maxIndex].getPopulation()){
                    maxIndex = i;
                }
            }
            temp = list[j];
            list[j] = list[maxIndex];
            list[maxIndex] = temp;
        }
    }
    
    //binary search
    public static Country binarySearch(Country[] list, int left, int right, String key){
        //variables
        Country foundCountry = new Country();
        int middle = (left + right)/2;
        
        //sort array for searching
        quickSort(list, 0, list.length -1, true);
        
        //search
        if(list[middle].getCountryName().equalsIgnoreCase(key)) {
            foundCountry = list[middle];
        }
        else if(key.compareToIgnoreCase(list[middle].getCountryName())  < 0){
            if(left <= middle -1){
                foundCountry = binarySearch(list, left, middle-1, key);
            }
        }
        else{
            if(right >= middle +1){
                foundCountry = binarySearch(list, middle+1, right, key);
            }
        }
        return foundCountry;
    }
    
}

