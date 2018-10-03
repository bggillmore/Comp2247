/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author su7613rx
 */
public class Weekendservice extends Service{
    private double weekendRate;

    public Weekendservice() {
    }

    public Weekendservice(double weekendRate, int serviceInvoiceNum, String firstName, String lastName, double hoursRequired, double baseCost) {
        super(serviceInvoiceNum, firstName, lastName, hoursRequired, baseCost);
        this.weekendRate = weekendRate;
    }

    public double getWeekendRate() {
        return weekendRate;
    }

    public void setWeekendRate(double weekendRate) {
        this.weekendRate = weekendRate;
    }

    @Override
    public String toString() {
        return super.toString()+ "Weekend Rate: " + weekendRate;
    }
    
    @Override
    public double calculateCost(){
        return this.getHoursRequired() * super.getBaseCost() * this.weekendRate;
    }
    
    
}
