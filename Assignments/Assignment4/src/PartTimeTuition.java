/*
* Author: Benjamin Gillmore
* Date: 10/03/2018
* Assignment: Assignment #5 PartTimeTuition.java
* Description: Defines tuition for part time students
*               Part 2: Added abstract and polymorphic printing
*/

public class PartTimeTuition extends Tuition{
    private int creditHours;
    private final double costPerCredit = super.isResidentStatus()?(243.98):(442.95);

    //constructors
    public PartTimeTuition() {
    }

    public PartTimeTuition(int creditHours, int studentId, String firstName, String lastName, boolean residentStatus) {
        super(studentId, firstName, lastName, residentStatus, EnrollmentStatus.PART_TIME);
        this.creditHours = creditHours;
    }

    //setters and getters
    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public double getCostPerCredit() {
        return costPerCredit;
    }

    //hard coded value as final
    /*
    public void setCostPerCredit(double costPerCredit) {
        this.costPerCredit = costPerCredit;
    }
    */
    
    //calculates and returns tuition cost based on credit hours and cost per credit
    @Override
    public double calculateTuitionCost(){
        return this.creditHours * this.costPerCredit;
    }
    
    //toString
    @Override
    public String toString() {
        return super.toString() + String.format("Credit Hours: %d\nCost Per Credit: $%.2f\n"
                + "Tuition Cost: $%.2f\n", this.creditHours, this.costPerCredit, this.calculateTuitionCost());
    }
    
}
