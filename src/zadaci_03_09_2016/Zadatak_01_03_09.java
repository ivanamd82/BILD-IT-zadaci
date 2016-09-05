package zadaci_03_09_2016;
/* 13.9
 * (Enable Circle comparable) Rewrite the Circle class in Listing 13.2 to extend 
 * GeometricObject and implement the Comparable interface. Override the
equals method in the Object class. Two Circle objects are equal if their radius
are the same. Draw the UML diagram that involves Circle, GeometricObject,
and Comparable.
 */

public class Zadatak_01_03_09 {

	public static void main(String[] args) {
		
		// kreiramo dva objekta
		Circle c1 = new Circle(7);
		Circle c2 = new Circle(5, "red", true);
		
		// poredimo objekte
		if (c1.compareTo(c2) == 0) { // ako su jednaki
			System.out.println("Circles are equal!");
		} else if (c1.compareTo(c2) > 0) {
			// ako je prvi veci od drugog
			System.out.println("Circle c1 is larger than c2");
		} else { // ako je drugi veci od prvog
			System.out.println("Circle c2 is larger than c1");
		}

		System.out.println(c1);
		System.out.println(c2);


	}

}
