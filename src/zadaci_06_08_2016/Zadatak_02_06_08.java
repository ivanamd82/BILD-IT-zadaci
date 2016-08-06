package zadaci_06_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_02_06_08 {
	/*
	 * Napisati program koji ispisuje sve prijestupne godine, 10 po liniji, u rasponu godina koje korisnik unese.
	 * Program pita korisnika da unese pocetnu godinu, krajnju godinu te ispisuje sve godine u tom rasponu. 
	 * Razmak izmedu godina treba biti jedan space. 
	 */
	public static void main(String[] args) {
		final int yearPerLine = 10;			//broj godina po liniji, konstanta
		Scanner input = new Scanner(System.in);
		boolean inputCheck = true;
		do {
			try {
				System.out.println("Unesite pocetnu godinu: ");		//unos podataka
				int firstYear = input.nextInt();
				while (firstYear < 0) {
					System.out.println("Pogresan unos.\nUnesite pozitivan cijeli broj za pocetnu godinu: ");
					firstYear = input.nextInt();
				}				
				System.out.println("Unesite krajnju godinu: ");
				int lastYear = input.nextInt();
				while (lastYear < 0) {
					System.out.println("Pogresan unos.\nUnesite pozitivan cijeli broj za krajnj godinu: ");
					lastYear = input.nextInt();
				}				
				if (firstYear > lastYear) {	//ako korisnik unese prvo manji broj zamjeni mjesta godinama
					int temp = firstYear;
					firstYear = lastYear;
					lastYear = temp;
				}
				System.out.printf("Prestupne godine u rasponu %d - %d:\n",firstYear,lastYear);
				leapYears(firstYear,lastYear,yearPerLine);
				inputCheck = false;
			}
			catch (InputMismatchException ex) {		//u slucaju pogresnog unosa ispisi poruku
				System.out.println("Pogresan unos.");
				input.nextLine();
			}
		} while (inputCheck);
			input.close();
	}
	//metoda za ispis prestupnih godina u zadanom rangu
	public static void leapYears(int firstYear, int lastYear, int yearPerLine) {
		int counter = 0;			//brojac ispisanih godina, pocetna vrijednost 0
		for (int i = firstYear; i <= lastYear; i++) {
			if ((i % 400 == 0) || (i % 4 == 0 && i % 100 != 0)) { // uslov za prestupnu godinu
				System.out.print(i+" "); // ako je prestupna ispisati je
				counter++;				// brojac se povecava
				if (counter % yearPerLine == 0) 	// ako je ispisano 10(yearPerLine) godina preci u novi red
					System.out.println();
			}
		}
	}

}
