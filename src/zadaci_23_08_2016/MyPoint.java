package zadaci_23_08_2016;
/* 10.4
 * (The MyPoint class) Design a class named MyPoint to represent a point with x- and y-coordinates. 
 * The class contains:
 * The data fields x and y that represent the coordinates with getter methods.
 * A no-arg constructor that creates a point (0, 0).
 * A constructor that constructs a point with specified coordinates.
 * A method named distance that returns the distance from this point to a specified point of the MyPoint type.
 * A method named distance that returns the distance from this point to another point with specified x- and y-coordinates.
 */

public class MyPoint {
	
	//private data fields - coordinates
	private double x;
	private double y;
	
	//no-arg constructor that creates a point (0, 0)
	public MyPoint() {
		x = 0;
		y = 0;
	}
	/* constructor that constructs a point with specified coordinates
	 * @param x koordinata
     * @param y koordinata
    */
	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	//getters
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	/*
	 * returns the distance from this point to a specified point of the MyPoint type.
	 * @param pointB
	 * @return distance
	 */
	public double distance(MyPoint pointB) {
		return Math.sqrt(Math.pow(getX() - pointB.x, 2) + Math.pow(getY() - pointB.y,2));
	}
	/* returns the distance from this point to another point with specified x- and y-coordinates
	 * @param x
	 * @param y
	 * @return distance
	 */
	 public double distance(double x, double y) {
		 return Math.sqrt(Math.pow(getX() - x, 2) + Math.pow(getY() - y,2));
	 }

}
