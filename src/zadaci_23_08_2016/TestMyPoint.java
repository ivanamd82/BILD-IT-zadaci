package zadaci_23_08_2016;
/*
 * Write a test program that creates the two points (0, 0) and (10, 30.5) and displays the distance between them.
 */

public class TestMyPoint {

	public static void main(String[] args) {
		
		//kreiranje objekata
		MyPoint pointA = new MyPoint();
		MyPoint pointB = new MyPoint(10, 30.5);
		
		//ispis koordinata tacaka
		System.out.println("Tacka A koordinate: ("+pointA.getX()+", "+pointA.getY()+")");
		System.out.println("Tacka B koordinate: ("+pointB.getX()+", "+pointB.getY()+")");
		
		//ispis udaljenosti, poziva metodu
		System.out.println("Udaljenost izmedju tacaka A i B: "+pointA.distance(pointB));}

}
