package zadaci_07_09_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/* 18.9
 * (Print the characters in a string reversely) Write a recursive method that displays
 * a string reversely on the console using the following header:
 * public static void reverseDisplay(String value)
For example, reverseDisplay("abcd") displays dcba. Write a test program
that prompts the user to enter a string and displays its reversal.
 */


public class Zadatak_02_07_09 {
	

	public static void main(String[] args) {
		
		//unos i ispis obrnutog stringa
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite string: ");
		String s = input.nextLine();
		reverseDisplay(s);
		input.close();
	}
	//metoda vraca karakter na zadnjem indeksu zatim ponpovo poziva sebe i radi isto,
	//sve dok je duzina stringa veca od 0, kao argument se uzima substring od 0 do predposednjeg indeksa
	public static void reverseDisplay(String value) {
		if (value.length() > 0) {
			System.out.print(value.charAt(value.length() - 1));
			value = value.substring(0, value.length()-1);
			reverseDisplay(value);
		}
	}

}
