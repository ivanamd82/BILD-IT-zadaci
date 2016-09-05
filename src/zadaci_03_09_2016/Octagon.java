package zadaci_03_09_2016;

import zadaci_02_09_2016.GeometricObject;

public class Octagon extends GeometricObject implements Cloneable, Comparable<GeometricObject>{
	
	//private data fields
	private double side;
	
	//no-arg constructor
	public Octagon() {
		
	}
	//constructor with side
	public Octagon (double side) {
		this.side = side;
	}
	//constructor with side, filled, and color
	public Octagon (double side, String color, boolean filled) {
		this(side);
		setColor(color);
		setFilled(filled);
	}
	//getter and setter
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	//Implement the getArea() method
	@Override
	public double getArea() {
		return (2 + (4 / Math.sqrt(2)) * side * side);
	}

	//Implement getPerimeter() method
	@Override
	public double getPerimeter() {
		return 8 * side;
	}
	//Implement clone method
	@Override
	public Octagon clone() {
		// kreira se novi objekat
		Octagon o = new Octagon();
		// kopira se vrijednost stranice
		o.side = getSide();
		// kopira se vrijdnost boje
		o.setColor(this.getColor());
		// popjunjenosti
		o.setFilled(this.isFilled());
		// datum kreiranja
		o.setDateCreated(this.getDateCreated());
		// vracamo novi klonirani objekat
		return o;
	}
	//Implement compateTo
		@Override
		public int compareTo(GeometricObject o) {
	        if (getArea() == o.getArea())
	            return 0;
	        else if (getArea() > o.getArea())
	            return 1;
	        else
	            return -1;
		}
	//ToString
	@Override
	public String toString() {
		return "\nPerimeter is: " + getPerimeter() + "\nArea is: " + getArea();
	}	
	

}
