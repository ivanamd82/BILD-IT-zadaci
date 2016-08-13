package zadaci_13_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_02_13_08 {
	/* Napisite metodu sa sljedecim headerom koja
	 * vraca naopako ispisan broj koji joj je proslijedjen kao argument:
	 * public static void reverse(int number). 
	 * Na primjer, reverse(3456) treba da vrati 6543. 
	 * Napisati program koji pita korisnika da unese neki cijeli broj te mu vrati isti ispisan naopako. 
	 */
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Unesite cijeli broj: "); //unos podataka
		int number = inputCheckI();
		input.close();
		System.out.print("Broj koji ste unijeli ispisan naopako je ");
		reverse(number);
		
	}
	
	public static void reverse(int number) {
		
		int reverseNum = 0;		//pocetna vrijednost 0
		/* ostatak dijeljenja broja sa 10 se u svakom krugu mnozi sa 10
		 * i tako pomjera za jedno mjesto naprijed. 
		 * A pri svakom krugu broju se dodaje ostatak djeljenja broja sa 10,
		 * a sam broj se djeli sa 10 sve dok broj ne bude 0
		 */
		if (number < 0) {		//ako je broj negativan koristiti apsolutnu vrijednost i ispisati "-"
			number = Math.abs(number);
			System.out.print("-");
		}
		while (number != 0) {	
			reverseNum = (reverseNum * 10) + number % 10;
			number = number / 10;
		}
		System.out.print(reverseNum);;
	}
	
	//metoda za provjeru unosa podatakaa
	public static int inputCheckI() {	
		int unos = 0;		//pocetna vrijednost
		boolean inputCheck = true;		//kontrolna promjenljiva
		do {							// dok nije unesen broj tip int ponavljati
			try {
				unos = input.nextInt();		
				inputCheck = false;
			} catch (InputMismatchException ex) {		//u slucaju pogresnog formata ulaznog podataka
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				input.nextLine();
			}
		} while (inputCheck);
		return unos;
	}

}
