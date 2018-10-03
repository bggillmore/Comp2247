/*
* Author: Benjamin Gillmore
* Date: 09/19/2018
* Assignment: Assignment #3 Contractor.java
* Description: Holds the data members for the Contractor object.
*/
public class Contractor {
    private String specialty;
    private Person thisIsMe;

    //constructors
    public Contractor() {
    }

    public Contractor(String specialty, Person thisIsMe) {
        this.specialty = specialty;
        this.thisIsMe = thisIsMe;
    }
    
    //setters and getters
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Person getThisIsMe() {
        return thisIsMe;
    }

    public void setThisIsMe(Person thisIsMe) {
        this.thisIsMe = thisIsMe;
    }
    
    //toString

    @Override
    public String toString() {
        return String.format("%s, %s", this.thisIsMe.toString(), this.specialty);
    }
    
}
