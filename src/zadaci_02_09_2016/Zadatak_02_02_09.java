package zadaci_02_09_2016;
/*
 * (Enable GeometricObject comparable) Modify the GeometricObject class
to implement the Comparable interface, and define a static max method in the
GeometricObject class for finding the larger of two GeometricObject objects.
Draw the UML diagram and implement the new GeometricObject class. Write
a test program that uses the max method to find the larger of two circles and the
larger of two rectangles.
 */

public class Zadatak_02_02_09 {

	public static void main(String[] args) {
		
		Circle cir1 = new Circle(2);
		Circle cir2 = new Circle(2.3);
		Rectangle rec1 = new Rectangle(2,6);
		Rectangle rec2 = new Rectangle(3,4);
		
		System.out.println("Largest of two circle is circle with radius "+GeometricObject.max(cir1, cir2));
		System.out.println("Largest of two rectangle is rectangle with "+GeometricObject.max(rec1, rec2));
	}

}
