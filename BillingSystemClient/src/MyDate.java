
/*
* Author: Benjamin Gillmore
* Date: 09/19/2018
* Assignment: Assignment #3 MyDate.java
* Description: Holds the data members of MyDate objects.
*/

public class MyDate {
    private int month, day, year;

    //constructors
    public MyDate() {
    }

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }
    
    //setters and getters
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    //toString
    @Override
    public String toString() {
        return String.format("%d/%d/%d", this.month, this.day, this.year);
    }
    
}
