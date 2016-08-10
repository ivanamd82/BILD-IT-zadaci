package zadaci_09_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_04_09_08 {
	/* Napisite program koji ucitava neodredjen broj cijelih brojeva (unos prekida nula),
	 * pronalazi najveci od unijetih brojeva te ispisuje koliko se najveci broj puta ponovio.  
	 * Na primjer, ukoliko unesemo 3 5 2 5 5 5 0 program ispisuje da je najveci broj 5 te ispisuje da se isti ponavlja 4 puta.
	 */
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Unesite cijele brojeve, 0 prekida unos: ");
		int number = inputCheckI();		//unos podataka i provjera da li je int
		int max = number;				//broj postavljamo kao trenutni najveci
		int counter = 0;				//brojac  pocetna vrijednost 0
		while(number != 0) {			//sve dok je uneseni broj razlicit od 0 radi
			if (number > max) {			//ako je broj veci od trenutnog max
				max = number;			//max i uneseni broj jednak postavi brojac na 1
				counter = 1;	
			}
			else if (number == max)		//ako su jednaki povecaj brojac za 1
				counter++;
			number = inputCheckI();		//unos novog broja
			}
		input.close();
		if (max == 0) 	//ako je samo nula unesena ispis
			System.out.println("Niste unijeli ni jedan broj osim 0.");
		else System.out.println("Najveci broj je "+max+", a pojavljuje se "+counter+" puta."); //ispis
	}
	//metoda za provjeru unesenih podataka
	public static int inputCheckI() {
		int unos = 0;	// pocetna vrijednost
		boolean inputCheck = true;	//kontrolna promjenljiva
		do {
			try {
				unos = input.nextInt();	//ucitavanje unosa i provjera da li je int
				inputCheck = false;	//ako je sve ok, kontrolna promjenljiva false, vrati unos									
			}
			catch (InputMismatchException ex) {	//u slucaju pogresnog unosa
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				input.nextLine();
			}
		} while (inputCheck);
		return unos;
	}

}
