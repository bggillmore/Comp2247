/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author su7613rx
 */
public class EmergencyService extends Service {
    private double emergencyFee;

    public EmergencyService() {
    }

    public EmergencyService(double emergencyFee, int serviceInvoiceNum, String firstName, String lastName, double hoursRequired, double baseCost) {
        super(serviceInvoiceNum, firstName, lastName, hoursRequired, baseCost);
        this.emergencyFee = emergencyFee;
    }

    public double getEmergencyFee() {
        return emergencyFee;
    }

    public void setEmergencyFee(double emergencyFee) {
        this.emergencyFee = emergencyFee;
    }

    @Override
    public String toString() {
        return super.toString() + "Emergency Fee: $" + emergencyFee;
    }
    
    @Override
    public double calculateCost() {
        return super.getHoursRequired() * ( super.getBaseCost() + this.emergencyFee);
    }
}
