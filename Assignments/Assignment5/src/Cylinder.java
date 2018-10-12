/*
* Author: Benjamin Gillmore
* Date: 10/03/2018
* Assignment: Assignment #5 Cylinder.java
* Description: Subclass of ThreeDimensionalShape, impliments methods defined in parent.
*/

public class Cylinder implements ThreeDimensionalShape{
    private double radius, height;

    //constructors
    public Cylinder() {
    }

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    //setters nad getters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //implimented methods
    @Override
    public double getArea() {
        return (2 * Math.PI * this.height * this.radius) + 
                (2 * Math.PI * (Math.pow(this.radius, 2)));
    }

    @Override
    public double getVolume() {
        return Math.PI * this.height * Math.pow(this.radius, 2);
    }
    
    //toString

    @Override
    public String toString() {
        return String.format("Radius: %.2f\nHeight: %.2f\nSurfaceArea: %.2f\nArea: %.2f\n",
                this.radius, this.height, this.getArea(), this.getVolume());
    }
    
}
