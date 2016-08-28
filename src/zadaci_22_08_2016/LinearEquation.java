package zadaci_22_08_2016;
/* 9.11
 * (Algebra: 2 * 2 linear equations) Design a class named LinearEquation for a 2 x 2 system of linear equations
 * The class contains:
 * Private data fields a, b, c, d, e, and f.
 * A constructor with the arguments for a, b, c, d, e, and f.
 * Six getter methods for a, b, c, d, e, and f.
 * A method named isSolvable() that returns true if ad - bc is not 0.
 * Methods getX() and getY() that return the solution for the equation.
 */

public class LinearEquation {
	
	//private data fields
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	//constructor with the arguments for a, b, c, d, e, and f
	public LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;				
	}
	//getters
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public double getD() {
		return d;
	}
	public double getE() {
		return e;
	}
	public double getF() {
		return f;
	}
	//method return true if ad - bc is not 0
	public boolean isSolvable() {
		if ((a * d - b * c) != 0) 
			return true;
		else return false;
	}
	//return the solution for the equation
	public double getX() {
		return ((e * d - b * f) / (a * d - b * c));
	}
	//return the solution for the equation
	public double gety() {
		return ((a * f - e * c) / (a * d - b * c));	
	}
}
