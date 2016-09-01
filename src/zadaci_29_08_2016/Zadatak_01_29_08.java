package zadaci_29_08_2016;
/* 11.15
 * (Area of a convex polygon) A polygon is convex if it contains any line segments
 * that connects two points of the polygon. Write a program that prompts the user to
 * enter the number of points in a convex polygon, then enter the points clockwise,
 * and display the area of the polygon. Here is a sample run of the program: 
 */
import java.util.ArrayList;
import java.util.Scanner;

import zadaci_23_08_2016.MyPoint;

public class Zadatak_01_29_08 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		//
		System.out.println("Enter a number of points: ");
		int size = input.nextInt();
		
		// unos tacaka poligona
		System.out.println("Enter the coordinates of the points: ");
		ArrayList<MyPoint> points = new ArrayList<>();
		for (int i = 0; i < size; i++) {			
			points.add(new MyPoint(input.nextDouble(), input.nextDouble()));	        
		}
		// poziv metoda za izracunavanje povrsine i prikaz rezultata
		System.out.println("The total area is: " + areaPolygon(points));

	}
	public static double areaPolygon(ArrayList<MyPoint> points) {
		double area = 0;
		double sum1 = 0;
        double sum2 = 0;
        for (int i = 0; i < points.size(); i++) {
            int limitIndex = (i + 1) % points.size();
            MyPoint p1 = points.get(i);
            MyPoint p2 = points.get(limitIndex);
            System.out.println("P1 index = " + i);
            System.out.println("P2 index =" + limitIndex);
            sum1 += (p1.getX() * p2.getY());
            sum2 += (p1.getY() * p2.getX());
        }

        return area = Math.abs(0.5 * (sum1 - sum2));
 	}

}
