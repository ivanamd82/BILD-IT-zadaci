package zadaci_03_09_2016;

import zadaci_02_09_2016.GeometricObject;

public class Rectangle extends GeometricObject implements Comparable<GeometricObject>{
	
	//private data fields
	private double width;
	private double height;
	
	//no-arg constructor
	public Rectangle() {
		
	}
	
	//constructor with width and height
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	//constructor with width, height, filled, and color
	public Rectangle(double width, double height, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.height = height;	
	}
	//getters and setters
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	//Implement the getArea() method defined in GeometricObject
	public double getArea() {
		return width * height;
	}
	//Implement getPerimeter() method defined in GeometricObject
	public double getPerimeter() {
		return 2 * (width * height);
	}
	//compare area
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
	public boolean equals(Rectangle o) {
		return (this.getArea() == o.getArea())? true : false;
	}
	//To String
	@Override
    public String toString() {
        return "width : " + width+"\nheight: "+height;
    }	
	
}
