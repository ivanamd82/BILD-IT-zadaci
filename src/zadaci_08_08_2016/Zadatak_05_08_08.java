package zadaci_08_08_2016;

import java.util.Scanner;

public class Zadatak_05_08_08 {
	/* Neke web stranice forsiraju odredjena pravila za passworde. 
	 * Napisati metodu koja provjerava da li je unijeti string validan password. 
	 * Pravila da bi password bio validan su sljedeca: 
	 * 1. Password mora biti sacinjen od najmanje 8 karaktera.
	 * 2. Password smije da se sastoji samo od slova i brojeva. 
	 * 3. Password mora sadrzati najmanje 2 broja. 
	 * Napisati program koji pita korisnika da unese password te mu ispisuje "password je validan" 
	 * ukoliko su sva pravila ispostovana ili "password nije validan" ukoliko pravila nisu ispostovana. 
	 */

	public static void main(String[] args) {
		
		final int length = 8;	//duzina passworda
		Scanner input = new Scanner(System.in);		//unos podataka
		System.out.println("Unesite password: ");
		String password = input.nextLine();
		input.close();
		//uslov za provjeru: duzina 8, ima samo slova i brojeve, ima bar 2 broja
		if (password.length() == length && passLetterOrDigit(password) && passHave2Digit(password))
			System.out.println("password je validan");
		else System.out.println("password nije validan");

	}
	//metoda provjerava da li password sadrzi samo slova ili brojeve
	public static boolean passLetterOrDigit(String s) {
		
		for (int i = 0; i < s.length(); i++) {	//provjerava od pocetnog indeksa do zadnjeg
			if (!(Character.isLetterOrDigit(s.charAt(i)))) {	//ako karakter nije broj ili slovo return false
				return false;
			}
		}
		return true;	//ako sadrzi samo slova i brojeve
	}
	//metoda provjerava da li password sadrzi bar 2 slova
	public static boolean passHave2Digit(String s) {
		
		final int NUM_OF_DIGIT = 2; 	//konstanta koliko mora ima min brojeva
		int counter = 0;				//brojac postavljen na 0
		for (int i = 0; i < s.length(); i++) {	//provjera svih karaktera
			if (Character.isDigit(s.charAt(i))) {	//da li je karakter broj, ako jeste inkrementiraj brojac
				counter ++;					
			if (counter == NUM_OF_DIGIT)	//ako je brojac jednak 2, vrati true
				return true;		
			}
		}
		return false;
	}
}
