package zadaci_03_09_2016;
/*
 * *13.10 (Enable Rectangle comparable) Rewrite the Rectangle class in Listing 13.3 to
extend GeometricObject and implement the Comparable interface. Override
the equals method in the Object class. Two Rectangle objects are equal
if their areas are the same. Draw the UML diagram that involves Rectangle,
GeometricObject, and Comparable.
 */

public class Zadatak_02_03_09 {

	public static void main(String[] args) {
		
		//kreiranje objekata
		Rectangle r1 = new Rectangle(3, 4);
		Rectangle r2 = new Rectangle(2, 4, "red", true);
		// poredjenje
		if(r1.compareTo(r2) == 0) {  // ako su jednaki
			System.out.println("Rectangles are equals");
			// ako je prvi veci od drugog
		} else if(r1.compareTo(r2) > 0) {
			System.out.println("r1 is bigger than r2");
		} else {
			// ako je drugi veci od prvog
			System.out.println("r2 is bigger tha r1");
		}
		// ispis
		System.out.println("R1 "+r1);
		System.out.println("R2 "+r2);
		

	}

}
