package zadaci_22_08_2016;
/*
 * Write a test program that prompts the user to enter values for a, b, and c and displays the result
 * based on the discriminant. If the discriminant is positive, display the two roots. 
 * If the discriminant is 0, display the one root. Otherwise, display 
 * “The equation has no roots.” See Programming Exercise 3.1 for sample runs.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestQuadraticEquation {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		//unos podataka
		System.out.println("Unesite vrijednosti za koeficijente a, b, i c: ");
		double a = inputCheckD();
		double b = inputCheckD();
		double c = inputCheckD();
		
		//kreiranje objekta
		QuadraticEquation qEquation = new QuadraticEquation(a, b, c);
		
		//ispis u zavisnosti od diskriminante
		if (qEquation.getDiscriminant() == 0) 
			System.out.println("Rijesenje jednacine je "+qEquation.getRoot1()+"\nJednacina ima samo jedno rijesenje.");
		else if (qEquation.getDiscriminant() > 0) 
			System.out.println("Rijesenja jednacine su :"+qEquation.getRoot1()+" i "+qEquation.getRoot2());
		else System.out.println("Jednacina nema realnih resanja.");
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
