package zadaci_17_08_2016;
/* Napisati metodu sa sljedecim headerom: 
 * public static String format(int number, int width) 
 * koja vraca string broja sa prefiksom od jedne ili vise nula. 
 * Velicina stringa je width argument. Na primjer,
 * ukoliko pozovemo metodu format(34, 4) metoda vraca 0034, 
 * ukoliko pozovemo format(34, 5) metoda vraca 00034. 
 * Ukoliko je uneseni broj veci nego width argument, metoda vraca samo string broja. 
 * Npr. ukoliko pozovemo format(34, 1) metoda vraca 34.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_04_17_08 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Unesite pozitivan cijeli broj: ");		//unos podataka, provjera pomocu metode da li je odgovarajuci tip
		int number = inputCheckI();
		System.out.println("Unesite format: ");
		int width = inputCheckI();
		System.out.println(format(number,width));

	}
	//metoda vraca broj u odredjenom formatu, sa prefiksom 0, ako je broj manji od sirine(formata)
	public static String format(int number, int width) {
		String s = number+"";				//konvertujemo broj u string
		int length = width - s.length();	//razlika formata i duzine stringa(broja)		
		for(int i = 0; i < length; i++) {	//dodaj odredjen broj nula ispred broja, da se dobije string odredjene duzine(format)
			s = "0"+ s;
		}		
		return s;
	}
	//metoda provjerava da li je broj odgovarajuceg tipa 
	public static int inputCheckI() {
		
		int unos = 0;	// pocetna vrijednost
		boolean inputCheck = true;	//kontrolna promjenljiva
		do {
			try {
				unos = input.nextInt();	//ucitavanje unosa i provjera da li je pozitivan
				if (unos < 0) {
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
