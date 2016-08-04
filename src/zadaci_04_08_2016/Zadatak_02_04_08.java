package zadaci_04_08_2016;

import java.util.Scanner;

public class Zadatak_02_04_08 {
	/*
	 * SBN-10 (International Standard Book Number) se sadrzi od 10 brojeva: d1 d2 d3 d4 d5 d6 d7 d8 d9 d10. 
	 * Posljednji broj, d10, sluzi kao checksum i njega izracunavamo iz prvih devet brojeva koristeci se sljedecom formulom:
	 * (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11. 
	 * Ukoliko je checksum 10, zadnji broj oznacavamo sa X u skladu sa ISBN-10 konvencijom. 
	 * Napisati program koji pita korisnika da unese prvih 9 brojeva te ispise desetocifreni ISBN-10 broj.
	 * (Primjer: ukoliko unesemo, kao prvih 9 brojeva, 013601267 program nam ispisuje 0136012671 kao ISBN-10 broj. 
	 * Ukoliko unesemo 013031997 kao prvih 9 brojeva, program nam ispisuje 013031997X kao ISBN-10 broj)
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite prvih 9 cifara ISBN broja: ");	//unos podataka od strane korisnika
		String number = input.next();
		input.close();
		if(checkNum(number)) {		//poziv metode za provjeru ispravnosti broja
			lastDigit(number);
		}
		else System.out.println("Unijeli ste pogresan ISBN.");		
	}
	//metoda za provjeru ispravnosti ISBN broja
	public static boolean checkNum(String s) { 
		if (s.length() == 9) {			//provjera duzine
			for (int i = 0; i < s.length(); i++) {	//petlja za provjeru da li su uneseni samo brojevi
				if(!Character.isDigit(s.charAt(i)))	
					return false;
			}
			return true;
		}
		return false;
	}
	// metoda za izracunavanje zadnje cifre
	public static void lastDigit(String num) {
		int sum = 0;		
		for (int i = 0; i < num.length(); i++) {	//petlja za izracunavanje zadnje cifre po formuli 
			sum += ((num.charAt(i) - 48) * (i + 1));	// i konverzija iz char u int
		}
		sum = sum % 11;
		if (sum == 10) {		// ako je zadnji br 10 dodaj broju X
			System.out.print(num+"X");
		}
		else {			//ako nije dodaj vrijednost promjenljive sum
			System.out.print(num+sum);
		}
	}

}
