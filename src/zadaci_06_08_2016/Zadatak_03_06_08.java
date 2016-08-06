package zadaci_06_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_03_06_08 {
	/*
	 * Napisati metode sa sljedecim headerima: public static int reverse(int number) i 
	 * public static boolean isPalindrome(int number). 
	 * Prva metoda prima cijeli broj kao argument i vraca isti ispisan naopako. (npr. reverse(456) vraca 654.) 
	 * Druga metoda vraca true ukoliko je broj palindrom a false ukoliko nije. 
	 * Koristite reverse metodu da implementirate isPalindrome metodu. 
	 * Napisite program koji pita korisnika da unese broj te mu vrati da li je broj palindrome ili ne.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		//unos podataka
		boolean inputCheck = true;
		do {
			System.out.println("Unesite cijeli broj: ");
			try {
				int number = input.nextInt();
				if (number < 0)					//ako je broj negativan koristiti apsolutnu vrijednost broja
					number = Math.abs(number);
				//ispis
				System.out.println(isPalindrome(number) ? "Broj koji ste unijeli je palindrom." : "Broj koji ste unijeli nije palindrom.");
				inputCheck = false;
			}
			catch (InputMismatchException ex) {
				System.out.println("Pogresan unos.");
				input.nextLine();
			}
		} while (inputCheck);
		input.close();

	}
	//metoda za dobijanje broja ispisanog naopako
	public static int reverse(int number) {
		int reverseNum = 0;		//pocetna vrijednost 0
		/* ostatak dijeljenja broja sa 10 se u svakom krugu mnozi sa 10
		 * i tako pomjera za jedno mjesto naprijed. 
		 * A pri svakom krugu broju se dodaje ostatak djeljenja broja sa 10,
		 * a sam broj se djeli sa 10 sve dok broj ne bude 0
		 */
		while (number != 0) {
			reverseNum = (reverseNum * 10) + number % 10;
			number = number / 10;
		}
		return reverseNum;
	}
	// metoda za provjeru da i je broj palindrom
	public static boolean isPalindrome(int number) {
		if (number == reverse(number)) 	//broj je palindrom ako je isti kad se napise naopako
			return true;
		else return false;
	}
}
