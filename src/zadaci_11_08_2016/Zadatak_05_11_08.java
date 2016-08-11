package zadaci_11_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_05_11_08 {
	/* Napisati program koji ucitava neodredjen broj cijelih brojeva, 
	 * odredjuje koliko je pozitivnih brojeva korisnik unio, 
	 * koliko negativnih te izracunava ukupnu sumu i prosjek svih unesenih brojeva.
	 * (Korisnik prekida unos tako što unese nulu). 
	 * Na primjer, ukoliko korisnik unese 1 2 -1 3 0 program treba da ispise
	 * da je broj pozitivnih brojeva 3, negativnih brojeva 1, suma ili zbir su 5.0 a prosjek svih brojeva je 1.25.
	 */
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Unesite cijele brojeve, 0 prekida unos: ");
		int number = inputCheckI();		//unos podataka i provjera da li je int
		int counter = 0;				//brojac  pocetna vrijednost 0
		int counterP = 0;				//brojac pozitivnih brojeva
		double sum = 0;					
		double average = 0;
		while(number != 0) {			//sve dok je uneseni broj razlicit od 0 povecavaj brojac brojeva
			counter++;
			sum += number;				//sumi dodaj unijeti broj
			if (number > 0)			//ako je broj pozitivan povecaj brojac koji broji pozitivne brojeve
				counterP++;				
			number = inputCheckI();		//unos novog broja
			}
		input.close();
		if (counter == 0) 	//ako je samo nula unesena ispis
			System.out.println("Niste unijeli ni jedan broj osim 0.");
		else {
			average = sum / counter;	//prosjek
			//ispis
			System.out.println("Unijeli ste ukupno brojeva: "+counter+"\nPozitivniih je "+counterP+"\nNegativnih je "+(counter-counterP)
				+"\nSuma svih brojeva je "+sum+"\nProsjek je "+average);
		}
	}
	
	//metoda za provjeru unesenog tipa podataka, da ne bi doslo do greske prilikom izvrsavanja programa
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
