package zadaci_13_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_01_13_08 {
	/* (Izracunavanje napojnice) Napisati program koji ucitava ukupan iznos racuna
	 * koji treba uplatiti kao i procenat tog racuna kojeg zelimo platiti kao napojnicu
	 * te izracunava ukupan racun i napojnicu. 
	 * Na primjer, ukoliko korisnik unese 10 kao racun i 15 % kao procenat za napojnicu
	 * program treba da ispise da je ukupan racun za uplatiti 11.5 a napojnica 1.5. 
	 */
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Unesite iznos racuna u KM: ");	//unos podataka i provjera tipa
		double bill = inputCheckD();
		System.out.print("Unesite napojnicu u procentima: ");
		double tip = inputCheckD();
		input.close();	
		tip = tip/100 * bill;		//izracunavanje napojnice
		bill = bill + tip;			//izracunavanje ukupnog racuna
		
		System.out.printf("Ukupan racun za uplatiti: %.2f.\nNapojnica: %.2f ", bill,tip );	//ispis

	}
	//metoda za provjeru unosa podatakaa
	public static double inputCheckD() {	
		double unos = 0;		//pocetna vrijednost
		boolean inputCheck = true;		//kontrolna promjenljiva
		do {							// dok nije unesen broj tip doble ponavljati
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
