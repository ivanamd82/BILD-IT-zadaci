package zadaci_22_08_2016;
/*
 * Write a test program that prompts the user to enter a, b, c, d, e, and f and displays the result.
 * If ad - bc is 0, report that “The equation has no solution.” See Programming Exercise 3.3 for sample runs.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestLinearEquation {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		//unos podataka
		System.out.println("Unesite vrijednosti za koeficijente a, b, c, d, e, i f: ");
		double a = inputCheckD();
		double b = inputCheckD();
		double c = inputCheckD();
		double d = inputCheckD();
		double e = inputCheckD();
		double f = inputCheckD();
		
		//kreiranje instance
		LinearEquation linEquation = new LinearEquation(a, b, c, d, e, f);
		
		//ispis u zavisnosti da li jednacina ima rijesenje
		if(!linEquation.isSolvable())
			System.out.println("Jednacina nema rijesenje.");
		else System.out.println("Rijesenje jednacine:\nx = "+linEquation.getX()+"\ny = "+linEquation.gety());		
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
