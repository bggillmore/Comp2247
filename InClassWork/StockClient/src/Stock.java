/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Graham
 */
public class Stock {
    private String symbol;
    private double sharePrice;
    
    //constructors
    public Stock() {
    }

    public Stock(String symbol, double sharePrice) {
        this.symbol = symbol;
        this.sharePrice = sharePrice;
    }
    
    //setters and getters
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }
    
    //toString
    @Override
    public String toString() {
        return String.format("Stock Symbol: %-10s \nShare Price: $%-10.2f\n", symbol, sharePrice);
    }
    
}
