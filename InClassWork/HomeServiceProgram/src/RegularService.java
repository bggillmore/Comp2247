/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author su7613rx
 */
public class RegularService extends Service{
    private double flatFee;

    public RegularService() {
    }

    public RegularService(double flatFee, int serviceInvoiceNum, String firstName, String lastName, double hoursRequired, double baseCost) {
        super(serviceInvoiceNum, firstName, lastName, hoursRequired, baseCost);
        this.flatFee = flatFee;
    }

    public double getFlatFee() {
        return flatFee;
    }

    public void setFlatFee(double flatFee) {
        this.flatFee = flatFee;
    }

    @Override
    public String toString() {
        return super.toString() + "Flat Fee: " + flatFee;
    }
    
    @Override
    public double calculateCost(){
        return this.flatFee + (super.getHoursRequired() * super.getBaseCost());
    }
}
