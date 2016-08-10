package zadaci_09_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_05_09_08 {
	/* Napisati metodu koja pretavara milisekunde u sate, minute i sekunde.
	 * Metoda treba da koristi sljedeci header: public static String convertMillis(long millis).
	 * Metoda treba da vraca vrijeme kao string u formatu sati:minute:sekunde. 
	 * Na primjer convertMillis(100000) treba da vrati 0:1:40.
	 */
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Unesite vrijeme u mili sekundama: "); //unos podataka i provjera tipa i da li je negativan br
		long millis = inputCheckL();
		System.out.println("Milisekunde koje ste unijeli pretvorene u format sati:minute:sekunde");
		System.out.println(convertMillis(millis));
	}
	//pretvaranje miliseckundi u vrijeme u satima i min...
	public static String convertMillis(long millis) {
			int sec = (int)(millis / 1000);	//milisekunde u sek i kasting u int tip
			int min = sec / 60 % 60;		//dobijanje min
			int hour = sec / 60 / 60 % 24;		// dobijanje sati
			sec = sec % 60;					//dobijanje sekundi
			return hour+" : "+min+" : "+sec;		//vracanje kao string
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
			catch (InputMismatchException ex) {	//u slucaju pogresnog unosa
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				input.nextLine();
			}
		} while (inputCheck);
		return unos;
	}
}
