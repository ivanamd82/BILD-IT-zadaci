package zadaci_10_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_01_10_08 {
	/* Napisati metodu koja vraca broj dana u godini. Metoda koristi sljedeci header: 
	 * public static int numberOfDayInAYear(int year). 
	 * Napisati program koji pita korisnika da unese pocetnu godinu, 
	 * krajnju godinu te ispisuje broj dana za svaku godinu u rasponu.
	 */
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Unesite pocetnu godinu: ");	//unos podataka i provjera ispravnosti pomocu metode
		int firstYear = inputCheckI();
		System.out.println("Unesite krajnju godinu: ");
		int lastYear = inputCheckI();
		if (firstYear > lastYear) {	//ako korisnik unese prvo manji broj zamjeni mjesta godinama
			int temp = firstYear;
			firstYear = lastYear;
			lastYear = temp;
		}
		for (int i = firstYear; i <= lastYear; i++) {	//ispis svih godina i br dana u rasponu
			System.out.println(i+ " godina ima "+numberOfDayInAYear(i)+" dana.");
		}	
	}
	//metoda vraca broj dana u godini
	public static int numberOfDayInAYear(int year) {	//ako je god prestupna ima 366, inace 365
		if(isLeap(year)) return 366;
		else return 365;
	}
	//metoda za odredjivanje prestupne godine, vraca true ako je god prestupna
	public static boolean isLeap (int year) {
		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) // uslov za prestupnu godinu
			return true;
		else return false;
	}
	//metoda za provjeru unosa, broj treba biti tipa int i veci od 0
	public static int inputCheckI() {
		int unos = 0;	// pocetna vrijednost
		boolean inputCheck = true;	//kontrolna promjenljiva
		do {
			try {
				unos = input.nextInt();	//ucitavanje unosa i provjera da li je negativan broj
				if (unos <= 0) {
					System.out.println("Pogresan unos. Pokusajte ponovo: ");	//ako jeste ispisi poruku
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
