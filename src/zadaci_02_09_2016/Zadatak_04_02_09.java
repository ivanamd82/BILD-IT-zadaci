package zadaci_02_09_2016;
/*
 * *13.7 (The Colorable interface) Design an interface named Colorable with a void
method named howToColor(). Every class of a colorable object must implement
the Colorable interface. Design a class named Square that extends
GeometricObject and implements Colorable. Implement howToColor to
display the message Color all four sides.
Draw a UML diagram that involves Colorable, Square, and GeometricObject.
Write a test program that creates an array of five GeometricObjects. For each
object in the array, display its area and invoke its howToColor method if it is
colorable.
 */

import java.util.ArrayList;

public class Zadatak_04_02_09 {

	public static void main(String[] args) {
		
		//keriramo listu i dodajemo 5 objekata
		ArrayList<Square> list = new ArrayList<>();
		list.add(new Square(3, true));
		list.add(new Square());
		list.add(new Square(4, false));
		list.add(new Square(8, true));
		list.add(new Square(1.5, true));
		
		//ispis
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Square" + (i) + " color: \n"
					+ list.get(i));
		}
	}

}
