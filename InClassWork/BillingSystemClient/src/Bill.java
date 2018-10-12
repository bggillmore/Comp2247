/*
* Author: Benjamin Gillmore
* Date: 09/19/2018
* Assignment: Assignment #3 Bill.java
* Description: Holds the data members for Bill and a method that returns the 
*              price of the bill before taxes.
*/
public class Bill {
    private int jobId;
    private double materialFee, contractorsFee, discountRate;

    //constructors
    public Bill() {
    }

    public Bill(int jobId, double materialFee, double contractorsFee, double discountRate) {
        this.jobId = jobId;
        this.materialFee = materialFee;
        this.contractorsFee = contractorsFee;
        this.discountRate = discountRate;
    }
    
    //setters and getters

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public double getMaterialFee() {
        return materialFee;
    }

    public void setMaterialFee(double materialFee) {
        this.materialFee = materialFee;
    }

    public double getContractorsFee() {
        return contractorsFee;
    }

    public void setContractorsFee(double contractorsFee) {
        this.contractorsFee = contractorsFee;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    
    //toString
    @Override
    public String toString() {
        return String.format("Job ID: %d\nMaterial Fee: $%.2f\nContractor Fee: "
                + "$%.2f\nDiscount: $%.2f\nTotal Charges Before Tax: $%.2f\n", 
                this.jobId, this.materialFee, this.contractorsFee, this.discountRate, 
                calculateTotalChargesBeforeTax());
    }
    
    //calculates and returns the total charges to coustomer before tax
    private double calculateTotalChargesBeforeTax(){
        return (this.contractorsFee + this.materialFee - this.discountRate);
    }
}
