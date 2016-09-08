package zadaci_07_09_2016;

import java.util.InputMismatchException;
/* 18.11
 * (Sum the digits in an integer using recursion) Write a recursive method that
 * computes the sum of the digits in an integer. Use the following method header:
 * public static int sumDigits(long n)
For example, sumDigits(234) returns 2 + 3 + 4 = 9. Write a test program
that prompts the user to enter an integer and displays its sum.
 */
import java.util.Scanner;

public class Zadatak_04_07_09 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Unesite cijeli broj: ");
		//u obzir uzeti samo pozitivni cijeli brojevi
		int num = inputCheckI();
		System.out.println("Zbir cifara broja "+num+" je "+sumDigits(num));

	}
	//metoda koja sabita cifre broja
	public static int sumDigits(long n) {
		//ako je n mani <= 0 (tj = 0) vrati 0
		if (n <= 0) {
			return 0;
		}
		//inace vrata ostatak djeljenja sa 10 i sabira sa vrijednoscu dobijenom ponovnim pozivanjem sume
		else { 
			return (int)(n % 10) + sumDigits(n/10);
			
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
