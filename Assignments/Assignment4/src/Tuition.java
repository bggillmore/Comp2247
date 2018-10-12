
/*
* Author: Benjamin Gillmore
* Date: 10/03/2018
* Assignment: Assignment #5 Tuition.java
* Description: Parent class for FullTimeTuition, PartTimeStrudent, AuditTuition
*               Part 2: Added abstract and polymorphic printing
*/

public abstract class Tuition {
    private int studentId;
    private String firstName, lastName;
    private boolean residentStatus;
    public enum EnrollmentStatus{
        FULL_TIME, PART_TIME, AUDIT
    };
    private EnrollmentStatus enrollmentStatus;
    
    //constructors
    public Tuition() {
    }

    public Tuition(int studentId, String firstName, String lastName, boolean residentStatus, EnrollmentStatus enrollmentStatus) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.residentStatus = residentStatus;
        this.enrollmentStatus = enrollmentStatus;
    }
    

    //setters and getters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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

    public boolean isResidentStatus() {
        return residentStatus;
    }

    public void setResidentStatus(boolean residentStatus) {
        this.residentStatus = residentStatus;
    }

    public EnrollmentStatus getEnrollmentStatus() {
        return enrollmentStatus;
    }

    public void setEnrollmentStatus(EnrollmentStatus enrollmentStatus) {
        this.enrollmentStatus = enrollmentStatus;
    }

    //placeholder function
    public abstract double calculateTuitionCost();
    
    //toString
    @Override
    public String toString() {
        return String.format("Student ID: %d\nFirst Name: %s\nLast Name: %s\n"
                + "Resident Status: %s\nEnrollment Status: %s\n", 
                studentId, firstName, lastName, residentStatus? "True":"False", enrollmentStatus);
    }
    
}
