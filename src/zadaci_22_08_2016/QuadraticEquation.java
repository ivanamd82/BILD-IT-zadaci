package zadaci_22_08_2016;
/* 9.10
 * (Algebra: quadratic equations) Design a class named QuadraticEquation for a quadratic equation ax2 + bx + x = 0. 
 * The class contains:
 * Private data fields a, b, and c that represent three coefficients.
 * A constructor for the arguments for a, b, and c.
 * Three getter methods for a, b, and c.
 * A method named getDiscriminant() that returns the discriminant, which is b2 - 4ac.
 * The methods named getRoot1() and getRoot2() for returning two roots of the equation
 * These methods are useful only if the discriminant is nonnegative. 
 * Let these methods return 0 if the discriminant is negative.
 */

public class QuadraticEquation {
	
	//Private data fields a, b, and c that represent three coefficients
	private double a;
	private double b;
	private double c;
	
	// A constructor for the arguments for a, b, and c
	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	// getters
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	//returns the discriminant, which is b2 - 4ac
	public double getDiscriminant() {
		return (b * b - 4 * a * c);
	}
	//returning root1 of the equation, return 0 if the discriminant is negative
	public double getRoot1() {
		if(getDiscriminant() < 0)
			return 0;
		else return (-b + Math.pow(b*b-4*a*c,0.5)) / 2*a;
	}
	//returning root2 of the equation, return 0 if the discriminant is negative
	public double getRoot2() {
		if(getDiscriminant() < 0)
			return 0;
		else return (-b - Math.pow(b*b-4*a*c,0.5)) / 2*a;
	}
}
