package zadaci_11_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_04_11_08 {
	/* Napisati program koji pita korisnika da unese broj minuta (npr. 1 milijardu)
	 * te ispise korisniku koliko je to u godinama i danima. 
	 * Zbog jednostavnosti, pretpostavimo da godina ima 365 dana.  
	 */
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Unesite minute ");	//unos podata i provjera tipa i da li je vece od 0
		long min = inputCheckL();
		long years = min/(60 * 24 * 365);	//dobijnje godina
		long days = min/(60 * 24) % 365;	//dobijanje dana
		
		System.out.println(min+" minuta ima "+years+" godina i "+days+" dana.");	//ispis
		input.close();
	}
	//metoda za provjeru unesenih podataka
	public static long inputCheckL() {	
		long unos = 0;	// pocetna vrijednost
		boolean inputCheck = true;	//kontrolna promjenljiva
		do {
			try {
				unos = input.nextLong();	//ucitavanje unosa i provjera da li je negativan broj
				if (unos < 0) {
					System.out.println("Pogresan unos. Pokusajte ponovo: ");	//ako jeste ispisi poruku
					inputCheck = true;
				}				
				else inputCheck = false;	//ako je sve ok, kontrolna promjenljiva false, vrati unos									
			}
			catch (InputMismatchException ex) {	//u slucaju pogresnog unosa tipa posataka
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				input.nextLine();
			}
		} while (inputCheck);
		return unos;
	}
}
