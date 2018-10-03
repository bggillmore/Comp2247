/*
* Author: Benjamin Gillmore
* Date: 09/19/2018
* Assignment: Assignment #3 Person.java
* Description: Holds the data members of the Person object.
*/

public class Person {
    private String firstName, lastName;

    //constructors
    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    //setters and getters
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
    
    //toString
    @Override
    public String toString() {
        return String.format("%s %s", firstName, lastName);
    }
    
}
