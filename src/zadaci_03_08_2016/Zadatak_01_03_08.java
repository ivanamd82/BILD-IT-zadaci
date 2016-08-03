package zadaci_03_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_01_03_08 {
	/*
	 * Metoda prima dva argumenta pocetni i krajni broj i printa sve proste brojeve u tom rangu.
	 * Metoda moze primati i treci argument, broj brojeva po liniji
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // kreiranje skenera i unos od strane korisnika
		try {
			System.out.println("Unesite pocetni broj: ");
			int startNum = input.nextInt();
			inputCeck(startNum);	// provjera da li je broj negativan
			System.out.println("Unesite krajnji broj: ");
			int endNum = input.nextInt();
			inputCeck(endNum);
			System.out.println("Koliko brojeva po liniji prikazati: ");
			int numPerLine = input.nextInt();		// provjera da li je broj negativan
			inputCeck(numPerLine);
			input.close();		
			primeNumbers(startNum,endNum,numPerLine); // pozivanje metode za printanje prostih brojeva
		}
		catch (InputMismatchException ex) {
			System.out.println("Pogresan unos. Morate unijeti pozitivan cijeli broj.");
		}		
	}
	
	public static int inputCeck(int num) { // metoda za provjeru unosa, u slucaju unosa negativnog broja
		if (num <= 0)
			throw new InputMismatchException ("Negativan broj.");
		return num;		
	}
	// metoda za provjeru da li je broj primaran
	public static boolean isPrime(int num) { 
		// provjera da li je broj djeljiv sa brojevima u rangu od 2 do tog broja
		// moglo bi i do num/2 jer su u pitanju cijeli brojevi, pa def nije djeljiv sa brojem vecim od num/2
		for (int i = 2; i < num; i++) { 
			if (num % i == 0) 	// ako je ostatak djeljenja tog broja sa nekim od brojem jednak nuli znaci da nije primaran
				return false;
		}
		return true;
	}
	// metoda za prikaz primarnih brojeva
	public static void primeNumbers(int start, int end, int numPerLine) {
		int counter = 0;	// inicijalizacija brojaca prikazanih brojeva po liniji
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {	// ako je primaran prikazi broj, formatiran ispis, brojac inkrementiran
				System.out.printf("%-5d",i);
				counter++;
				if (counter % numPerLine == 0)	// ako je brojac djeljiv zadanim brojem brojeva po liniji predji u novi red
					System.out.println();
			}
		}
	}

}
