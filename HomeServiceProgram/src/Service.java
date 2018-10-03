/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author su7613rx
 */
public abstract class Service {
    private int serviceInvoiceNum;
    private String firstName, lastName;
    private double hoursRequired;
    private double baseCost;

    //constructors
    public Service() {
    }

    public Service(int serviceInvoiceNum, String firstName, String lastName, double hoursRequired, double baseCost) {
        this.serviceInvoiceNum = serviceInvoiceNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hoursRequired = hoursRequired;
        this.baseCost = baseCost;
    }

    //setters getters
    public int getServiceInvoiceNum() {
        return serviceInvoiceNum;
    }

    public void setServiceInvoiceNum(int serviceInvoiceNum) {
        this.serviceInvoiceNum = serviceInvoiceNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getHoursRequired() {
        return hoursRequired;
    }

    public void setHoursRequired(double hoursRequired) {
        this.hoursRequired = hoursRequired;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }
    
    //
    public abstract double calculateCost();

    @Override
    public String toString() {
        return String.format("Service Invoice Number: %d\nFirst Name: %s\nLast Name: %s\nHours required: %.2f\nBase Cost: %.2f\n",serviceInvoiceNum, firstName, lastName, hoursRequired, baseCost);
    }
    
}
