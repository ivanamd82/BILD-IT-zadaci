package zadaci_06_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_05_06_08 {
	/*
	 * Ako imamo ubrzanje aviona a te brzinu pri kojoj avion uzlijece v,
	 * mozemo izracunati minimalnu duzinu piste potrebne da avion uzleti koristeci se 
	 * sljedecom formulom: dužina = v * v / 2a. 
	 * Napisati program koji pita korisnika da unese v u m/s i a u m/s²
	 * te ispisuje korisniku minimalnu duzinu piste. 
	 * (Primjer: ukoliko unesemo 60 za brzinu i 3.5 za ubrzanje duzina piste je 514.286)
	 */
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite brzinu aviona u m/s: ");	//unos podataka
		double v = inputCheckD();
		System.out.println("Unesite urzanje aviona u m/s²: ");
		double a = inputCheckD();
		input.close();
		double s = v * v / (2 * a);		//izracunavanje duzine piste i ispis
		System.out.printf("Minimalna duzina piste iznosi %.3f m",s);
	}
	//metoda za provjeru unosa
	public static double inputCheckD() {
		double unos = 0;		//pocetna vrijednost
		boolean inputCheck = true;		//kontrolna promjenljiva
		do {							// dok nije unesen broj tia doble ponavljati
			try {
				unos = input.nextDouble();		
				if (unos <= 0) {			//ako je unesen negativan broj
					System.out.println("Pogresan unos. Pokusajte ponovo: ");
					inputCheck = true;
				}				
				else inputCheck = false;	//ako je unos ok kontrolna promjenljiva postavljena na false								
			}
			catch (InputMismatchException ex) {		//u slucaju pogresnog formata ulaznog podataka
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				input.nextLine();
			}
		} while (inputCheck);
		return unos;
	}


}
