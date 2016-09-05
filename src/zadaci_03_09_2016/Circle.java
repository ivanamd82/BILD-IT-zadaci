package zadaci_03_09_2016;

import zadaci_02_09_2016.GeometricObject;

public class Circle extends GeometricObject implements Comparable<GeometricObject> {
	
	//private data fields
	private double radius;
	
	//no-arg constructor
	public Circle() {
		radius = 1;
	}
	//constructor with radius
	public Circle(double radius) {
		this.radius = radius;
	}
	//constructor with radius, filled, and color
	public Circle (double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}
	//getter and setter
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	//Implement the getArea() method defined in GeometricObject
	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}
	//Implement getPerimeter() method defined in GeometricObject
	@Override
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	//compare area of circles
	@Override
	public int compareTo(GeometricObject o) {
        if (getArea() == o.getArea())
            return 0;
        else if (getArea() > o.getArea())
            return 1;
        else
            return -1;
	}
	//check if they are equals
	public boolean equals(Circle o) {
		return (this.radius == o.getRadius())? true : false;
	}
	//To String
	@Override
    public String toString() {
        return "radius: " + radius;
    }	


}
