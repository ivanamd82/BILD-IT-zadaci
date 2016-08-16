package zadaci_16_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Napisati program koji pita korisnika da unese cijeli broj
 * te ispisuje piramidu svih brojeva do tog broja. 
 * (Na primjer, ukoliko korisnik unese 7 vrh piramide je broj 1,
 * red ispod vrha piramide je 2 1 2, red ispod je 3 2 1 2 3, red ispod 4 3 2 1 2 3 4 itd.)
 */

public class Zadatak_05_16_08 {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Unesite broj: ");	//unos domenzija, odnosno broj redova piramide
		int number = inputCheckI();
		input.close();
		
		for (int i = 1; i <= number; i++) { //redovi
			
			for(int j = 1; j <= number-i; j++)	// prazna polja
				System.out.print("  ");
			
			for(int z = i; z >= 1; z--)			//lijeva strana piramide
				System.out.print(z+" ");
			
			for(int x = 1; x <= i-1; x++)		//desna strana
				System.out.print(x+1+" ");
			
			System.out.println();		//nakon svakog zavrsenog reda predji u novi red
		}	
	}
	//metoda za provjeru unosa
	public static int inputCheckI() {	
		int unos = 0;		//pocetna vrijednost
		boolean inputCheck = true;		//kontrolna promjenljiva
		do {							// dok nije unesen broj odgovarajuceg tipa ponavljati
			try {
				unos = input.nextInt();		
				if (unos <= 0) {			//ako je unesen negativan broj ili 0
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
