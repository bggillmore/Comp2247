/*
* Author: Benjamin Gillmore
* Date: 10/03/2018
* Assignment: Assignment #5 FullTimeTuition.java
* Description: Defines tuition for full time students
*               Part 2: Added abstract and polymorphic printing
*/

public class FullTimeTuition extends Tuition{
    private double tuitionCost = this.calculateTuitionCost();
    private final double fullResidentTuition = 3688.50;
    private final double fullNonResidentTuition = 6649.18;
    
    //constructors
    public FullTimeTuition() {
    }

    //tuition cost is left out because there is no need for it to be passed in considering it is a hard coded
    public FullTimeTuition(int studentId, String firstName, String lastName, boolean residentStatus) {
        super(studentId, firstName, lastName, residentStatus, EnrollmentStatus.FULL_TIME);
    }
    

    public double getTuitionCost() {
        return tuitionCost;
    }
    public void setTuitionCost(double tuitionCost) {
        this.tuitionCost = tuitionCost;
    }
    
    //returns tuition based on resident status
    @Override
    public double calculateTuitionCost(){
        return this.isResidentStatus()?(fullResidentTuition):(fullNonResidentTuition);
    }
    
    //toString
    @Override
    public String toString() {
        return super.toString() + String.format("Tuition Cost: $%.2f\n", tuitionCost);
    }
}
