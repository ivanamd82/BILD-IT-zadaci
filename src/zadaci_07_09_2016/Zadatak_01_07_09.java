package zadaci_07_09_2016;

import java.util.InputMismatchException;
import java.util.Scanner;
/* 18.8
 * (Print the digits in an integer reversely) Write a recursive method that displays
 * an int value reversely on the console using the following header:
 * public static void reverseDisplay(int value)
 * For example, reverseDisplay(12345) displays 54321. Write a test program
 * that prompts the user to enter an integer and displays its reversal.
 */

public class Zadatak_01_07_09 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		//unos i ispis obrnutog broja
		System.out.println("Unesite cijeli broj: ");
		int num = inputCheckI();
		reverseDisplay(num);

	}
	//metoda za ispis obrnutog broja ako je vrijednost veca od nule ispisati
	//ostatak dijeljenja a 10 i pozvati opet metodu sa argumentom broj podjeljen sa 10
	public static void reverseDisplay(int value) {
		if (value > 0) {
			System.out.print(value%10);
			reverseDisplay(value/10);
		}
	}
	//metoda za provjeru unosa
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
