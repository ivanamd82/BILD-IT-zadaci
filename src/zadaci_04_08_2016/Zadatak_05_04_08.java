package zadaci_04_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_05_04_08 {
	/*
	 * Napisati program koji ucitava neodredjeni broj cijelih brojeva (nula prekida unos)
	 * te ispisuje koliko je brojeva bilo iznad ili jednako prosjeku svih unesenih brojeva
	 * a koliko je bilo brojeva ispod prosjeka. 
	 * Pretpostavimo da je maksimalan niz brojeva koje korisnik moze unijeti 100.
	 */

	public static void main(String[] args) {
		int[] array = new int[100];	// inicijalizacija promjenljivih, brojevi ce biti uneseni u niz
		double sum = 0;				// suma svih brojeva koje korisnik unese
		int counter = 0;			//broja koliko je unijeto brojeva
		double average = 0;			// prosjek brojeva
		int counterDown = 0;		// broj brojeva ispod prosjeka
		
		Scanner input = new Scanner(System.in);		
		System.out.println("Unesite cijele brojeve, 0 prekida unos: ");
		try {		
			for (int i = 0; i < array.length; i++) {	//uslov od 0 do max broja elemenata (100)
				array[i] = input.nextInt();			//dodavanje brojeva u niz
				if( array[i] == 0) 					//ako je broj 0, izadji iz petlje i prekini unos
					break;
				counter++;					// ako broj nije 0, povecaj brojac za 1
				sum += array[i];			// sumi dodati uneseni broj
			}
			input.close();
		
			average = sum/counter;		//izracunavanje prosjeka
						
			for (int i = 0; i < counter; i++) {		//petlja za izracunavanje brojeva ispod prosjeka
				if (array[i] < average)
					counterDown ++;
			}
			//ispis
			System.out.printf("Prosjek: %.2f\nBrojeva ispod prosjeka ima %d."
					+ "\nBrojeva iznad ili jednakih prosjeku ima %d.",average,counterDown,counter - counterDown);
		}
		catch (InputMismatchException ex) {
			System.out.println("POgresan unos.");
		}
	}

}
