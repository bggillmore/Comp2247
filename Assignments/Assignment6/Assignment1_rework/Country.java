/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author su7613rx
 */
public class Country {
    //data members
    private String countryName, UNContinentalRegion, UNStatisticalRegion;
    private int population, gdp;
    
    //constructors
    public Country(){
        
    }

    public Country(String countryName, String UNContinentalRegion, String UNStatisticalRegion, int population, int gdp) {
        this.countryName = countryName;
        this.UNContinentalRegion = UNContinentalRegion;
        this.UNStatisticalRegion = UNStatisticalRegion;
        this.population = population;
        this.gdp = gdp;
    }
    
    
    //setters and getters
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getUNContinentalRegion() {
        return UNContinentalRegion;
    }

    public void setUNContinentalRegion(String UNContinentalRegion) {
        this.UNContinentalRegion = UNContinentalRegion;
    }

    public String getUNStatisticalRegion() {
        return UNStatisticalRegion;
    }

    public void setUNStatisticalRegion(String UNStatisticalRegion) {
        this.UNStatisticalRegion = UNStatisticalRegion;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getGdp() {
        return gdp;
    }

    public void setGdp(int gdp) {
        this.gdp = gdp;
    }
    
    //method for gdp per capita
    public double gdpPerCapita(){
        return (double)this.gdp * 1000000 / this.population;
    }
    
    //toString
    @Override
    public String toString() {
        return String.format("%-25s %-20s %-20s %,-20d $%,-20d $%,-20.2f", 
                countryName, UNContinentalRegion, UNStatisticalRegion, population, gdp, this.gdpPerCapita());
    }
    
}
