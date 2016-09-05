package zadaci_03_09_2016;
/* 13.11
 * (The Octagon class) Write a class named Octagon that extends GeometricObject
 * and implements the Comparable and Cloneable interfaces. Assume that all eight sides
 * of the octagon are of equal length. The area can be computed using the following formula:
 * area = (2 + 4/22)* side * side
Draw the UML diagram that involves Octagon, GeometricObject,
Comparable, and Cloneable. Write a test program that creates an Octagon
object with side value 5 and displays its area and perimeter. Create a new object
using the clone method and compare the two objects using the compareTo
method.
 */

public class Zadatak_03_03_09 {

	public static void main(String[] args) {
		
		// kreiramo objekat
				Octagon o1 = new Octagon(5, "blue", true);
				
				System.out.println("Area: "+o1.getArea());
				System.out.println("Perimeter: "+o1.getPerimeter());
				// kloniramo objekat
				Octagon o2 = o1.clone();

				// poredimo ta dva objekta
				if (o1.compareTo(o2) == 0) {
					System.out.println("Ocragons are equal");
				} else if (o1.compareTo(o2) > 0) {
					System.out.println("o1 is bigger!");
				} else {
					System.out.println("o2 is bigger!");
				}
	}

}
