package zadaci_17_08_2016;
/* Napisati program koji prima ASCII kod (cijeli broj izmedju 0 i 127) 
 * te ispisuje koji je to karakter. Na primjer, ukoliko korisnik unese 69 kao ASCII kod,
 * program mu ispisuje da je karakter sa tim brojem karakter E.
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Zadatak_01_17_08 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Unesite ASCII kod (broj od 0 do 127): ");	//unos podataka i provjera unesenih podataka pomocu metode
		char number = (char)inputCheckI();								//kastovanje u char
		input.close();
		System.out.printf("Znak koji ste unijeli je: %c",number);		//ispis
	}
	
	//metoda provjerava da li je broj odgovarajuceg tipa 
	public static int inputCheckI() {
		
		int unos = 0;	// pocetna vrijednost
		boolean inputCheck = true;	//kontrolna promjenljiva
		do {
			try {
				unos = input.nextInt();	//ucitavanje unosa i provjera da li je broj u ASCII kodova za karaktere
				if (unos < 0 || unos > 127) {
					System.out.println("Pogresan unos. Pokusajte ponovo: ");	//ako nije ispisi poruku
					inputCheck = true;
				}				
				else inputCheck = false;	//ako je sve ok, kontrolna promjenljiva false, vrati unos									
			}
			catch (InputMismatchException ex) {	//u slucaju pogresnog unosa
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				input.nextLine();
			}
		} while (inputCheck);
		return unos;
	}

}
