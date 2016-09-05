package zadaci_03_09_2016;

import zadaci_02_09_2016.GeometricObject;

/*
 * *13.12 (Sum the areas of geometric objects) Write a method that sums the areas of all the
 * geometric objects in an array. The method signature is:
 * public static double sumArea(GeometricObject[] a)
 * Write a test program that creates an array of four objects (two circles and two
 * rectangles) and computes their total area using the sumArea method.
 */

public class Zadatak_04_03_09 {

	public static void main(String[] args) {
		
		GeometricObject[] objects = new GeometricObject[4];
		objects[0] = new Circle(5);
		objects[1] = new Circle(3);
		objects[2] = new Rectangle(4,3);
		objects[3] = new Rectangle(3,3);
		
		System.out.println("Suma svih objekata u listi: "+sumArea(objects));
	}
	
	//metoda vraca sumu svih objekata u listi
	public static double sumArea(GeometricObject[] a) {
		
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i].getArea();
		}
		return sum;
	}
	

}
