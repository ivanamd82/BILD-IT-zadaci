package zadaci_02_09_2016;

public class Circle extends GeometricObject {
	
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
	//To String
	@Override
    public String toString() {
        return "radius: " + radius;
    }	

}
