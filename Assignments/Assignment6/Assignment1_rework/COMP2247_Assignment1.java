
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFileChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author su7613rx
 */
public class COMP2247_Assignment1{

    /**
     * @param args the command line arguments
     */
    static final int SIZE = 40;
    
    public static void main(String[] args) throws IOException {
        //create array of country objects of given size (40) 
        Country[] countryList = new Country[SIZE];
        
        //get name of input file from user
        String inputFileName;
        
        while(true){
            JFileChooser open = new JFileChooser("./");
            int status = open.showOpenDialog(null);
            
            if(status == JFileChooser.APPROVE_OPTION){
                //open button is clicked
                inputFileName = open.getSelectedFile().getAbsolutePath();
                break;
            }
        }
        //read data
        Scanner inFile = new Scanner(new FileReader(inputFileName));
        
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
        
        //Display menu and call functions to display info
        boolean flag = true;
        int userCommand;
        Scanner console = new Scanner(System.in);
        
        while(flag){
            showMenu();
            userCommand = console.nextInt();
            
            switch(userCommand){
                case 1: //output all the countries information
                    OutputCountryInfo(countryList);
                    break;
                case 2: //output average gdp
                    AverageGDP(countryList);
                    break;
                case 3: //output highest gdp country name
                    HighestGDP(countryList);
                    break;
                case 4: //call search method and output its return
                    System.out.println("\nEnter a country to search: ");
                    String key = console.next();
                    Search(countryList, key);
                    break;
                case 5: //output each UNStatistical region
                    StatisticalRegion(countryList);
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
                         "5 - Output countries in each UN statistical region\n" +
                         "0 - Exit\n"
                );
    }
    
    //output data for all countrys output properly
    private static void OutputCountryInfo(Country[] countryList){
        System.out.printf("%-25s %-20s %-20s %-20s %-20s %-20s\n", 
                "Name", "Continental Region", "Statistical Region", "Population", "GDP (Millions)", "GDP Per Capita");
        for(Country country:countryList){
            System.out.println(country.toString());
        }
    }
    
    //
    private static void AverageGDP(Country[] countryList) {
        double gdpTotal = 0;
        for(Country country: countryList){
            gdpTotal += country.getGdp();
        }
        System.out.printf("Average GDP: $%,.2f (Millions)", gdpTotal/SIZE);
    }
    
    //
    private static void HighestGDP(Country[] countryList){
        Country highestGDP = new Country();
        for(Country country : countryList){
            if(highestGDP.getGdp() < country.getGdp()){
                highestGDP = country;
            }
        }
        System.out.printf("%-25s %-20s %-20s %-20s %-20s %-20s \n", 
                "Name", "Continental Region", "Statistical Region", "Population", "GDP (Millions)", "GDP Per Capita");
        System.out.println(highestGDP.toString());
    }
    
    //
    private static void Search(Country[] countryList, String key){
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
    private static void StatisticalRegion(Country[] countryList) {
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
            System.out.println(region.numberInRegion + " countries\n5");
        }
    }
}
