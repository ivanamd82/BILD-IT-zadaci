package zadaci_02_09_2016;
/* 13.6
 * (The ComparableCircle class) Define a class named ComparableCircle
that extends Circle and implements Comparable. Draw the UML diagram and
implement the compareTo method to compare the circles on the basis of area.
Write a test class to find the larger of two instances of ComparableCircle objects.
 */

public class Zadatak_03_02_09 {

	public static void main(String[] args) {
		
		ComparableCircle cCircle1 = new ComparableCircle(5);
		ComparableCircle cCircle2 = new ComparableCircle(3.6);
		
		if(cCircle1.compareTo(cCircle2) == 0) {
			System.out.println("equals");
		} else if(cCircle1.compareTo(cCircle2) > 0) {
			System.out.println("The largest circle is circle1.");
		} else {
			System.out.println("The largest circle is circle2.");
		}

	}

}
