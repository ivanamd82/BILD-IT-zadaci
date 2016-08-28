package zadaci_22_08_2016;
/*
 * Write a test program that creates three RegularPolygon objects, created using the 
 * no-arg constructor, using RegularPolygon(6, 4), and using RegularPolygon(10, 4, 5.6, 7.8). 
 * For each object, display its perimeter and area.
 */

public class TestRegularPolygon {

	public static void main(String[] args) {
		
		//kreiranje objekata
		RegularPolygon polygon1 = new RegularPolygon();
		RegularPolygon polygon2 = new RegularPolygon(6,4);
		RegularPolygon polygon3 = new RegularPolygon(10,4,5.6,7.8);
		
		//ispis obima i povrsine za svaki poligon
		System.out.println("Polygon1:\nPerimeter: "+polygon1.getPerimeter()+"\nArea: "+polygon1.getArea());
		System.out.println("\nPolygon2:\nPerimeter: "+polygon2.getPerimeter()+"\nArea: "+polygon2.getArea());
		System.out.println("\nPolygon3:\nPerimeter: "+polygon3.getPerimeter()+"\nArea: "+polygon3.getArea());
	}

}
