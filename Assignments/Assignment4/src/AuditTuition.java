/*
* Author: Benjamin Gillmore
* Date: 10/03/2018
* Assignment: Assignment #5 AuditTuition.java
* Description: Defines tuition audit students
*               Part 2: Added abstract and polymorphic printing
*/

public class AuditTuition extends Tuition{
    private double auditCost = this.calculateTuitionCost();
    private final double auditResidentTuition = 60.00;
    private final double auditNonResidentTuition = 100.00;
    
    //constructors
    public AuditTuition() {
    }

    //audit cost is left out because there is no need for it to be passed in considering it is a hard coded
    public AuditTuition(int studentId, String firstName, String lastName, boolean residentStatus) {
        super(studentId, firstName, lastName, residentStatus, EnrollmentStatus.AUDIT);
    }

    public double getAuditCost() {
        return auditCost;
    }
    public void setAuditCost(double auditCost) {
        this.auditCost = auditCost;
    }
    
    //returns tuition based on resident status
    @Override
    public double calculateTuitionCost(){
        return this.isResidentStatus()?(auditResidentTuition):(auditNonResidentTuition);
    }
    
    //toString
    @Override
    public String toString() {
        return super.toString() + String.format("Tuition Cost: $%.2f\n", auditCost);
    }
}
