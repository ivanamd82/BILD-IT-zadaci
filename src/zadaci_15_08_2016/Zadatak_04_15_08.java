package zadaci_15_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;
/* Napisati metodu koja izracunava zbir svih brojeva u cijelom broju.
 * Koristite sljedeci header: public static int sumDigits(long n). 
 * Na primjer, ako pozovemo metodu i proslijedimo joj broj 234 (sumDigits(234))
 * metoda treba da vrati 9. (2 + 3 + 4 = 9)
 */

public class Zadatak_04_15_08 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Unesite cijleli broj: ");	//unos podataka
		long number = input.nextLong();
		input.close();
		System.out.println("Zbir cifara broja "+number+" je "+sumDigits(number));

	}
	//metoda koja vraca sumu cifara broja
	public static int sumDigits(long n) {
		int sum = 0;			//pocetna vrijednost sume
		n = Math.abs(n);		//kao broj se uzima apsolutna vrijednost, u slucaju da je broj negativan
		
		while (n != 0) {	//sve dok n je razlicito od nule sumi dodahj ostatak djeljenja broja sa 10
			sum += n % 10;
			n = n / 10;		//broju dodjeli vrijednost broja podjeljenog sa 10
		}
		return sum;
	}
	//metoda za provjeru unosa podatakaa
	public static long inputCheckL() {	
		long unos = 0;		//pocetna vrijednost
		boolean inputCheck = true;		//kontrolna promjenljiva
		do {							// dok nije unesen broj tip int ponavljati
			try {
				unos = input.nextLong();		
				inputCheck = false;
			} catch (InputMismatchException ex) {		//u slucaju pogresnog formata ulaznog podataka
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				input.nextLine();
			}
		} while (inputCheck);
		return unos;
	}

}
