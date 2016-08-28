package zadaci_22_08_2016;
/* 9.12
 * (Geometry: intersecting point) Suppose two line segments intersect. 
 * The two endpoints for the first line segment are (x1, y1) and (x2, y2) and for the second line
 * segment are (x3, y3) and (x4, y4). Write a program that prompts the user to enter
 * these four endpoints and displays the intersecting point. As discussed in Programming
 * Exercise 3.25, the intersecting point can be found by solving a linear equation.
 * Use the LinearEquation class in Programming Exercise 9.11 to solve this
 * equation. See Programming Exercise 3.25 for sample runs.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_05_22_08 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		//ucitavanje podataka
		System.out.println("Unesite x1, y1: ");
		double x1 = inputCheckD();
		double y1 = inputCheckD();
		System.out.println("Unesite x2, y2: ");
		double x2 = inputCheckD();
		double y2 = inputCheckD();
		System.out.println("Unesite x3, y3: ");
		double x3 = inputCheckD();
		double y3 = inputCheckD();
		System.out.println("Unesite x4, y4: ");
		double x4 = inputCheckD();
		double y4 = inputCheckD();

		double a = y1 - y2;
		double b = x2 - x1;
		double c = y3 - y4;
		double d = x4 - x3;
		double e = (y1 - y2) * x1 - ((x1 - x2) * y1);
		double f = (y3 - y4) * x3 - ((x3 - x4) * y3);
		
		//kreiranje objekta
		LinearEquation linEquation = new LinearEquation(a, b, c, d, e, f);
		
		//ako se jednacina poze rijesiti ispisi rijesenje
		if (linEquation.isSolvable()) {
			System.out.println("Tacka u kojoj se sjeku linije: "+linEquation.getX()+", "+linEquation.gety());
		} 
		//ako nema rijesenja
		else {
			System.out.println("Linije su paralelne!");
		}
	}
	
	//metoda za provjeru unesenih podataka
	public static double inputCheckD() {
		
		double unos = 0;	// pocetna vrijednost
		boolean inputCheck = true;	//kontrolna promjenljiva
		do {
			try {
				unos = input.nextDouble();	//ucitavanje unosa 
				inputCheck = false;	//ako je odgovarajuceg tipa, kontrolna promjenljiva false, vrati unos									
			}
			catch (InputMismatchException ex) {	//u slucaju pogresnog unosa
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				input.nextLine();
			}
		} while (inputCheck);
		return unos;
	}

}
