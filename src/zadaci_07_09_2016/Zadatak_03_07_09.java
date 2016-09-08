package zadaci_07_09_2016;

import java.util.Scanner;

/* 18.10
 * (Occurrences of a specified character in a string) Write a recursive method that
 * finds the number of occurrences of a specified letter in a string using the following
 * method header:
 * public static int count(String str, char a)
For example, count("Welcome", 'e') returns 2. Write a test program that
prompts the user to enter a string and a character, and displays the number of
occurrences for the character in the string.
 */

public class Zadatak_03_07_09 {

	public static void main(String[] args) {
		
		//unos podataka
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite string: ");
		String str = input.nextLine();
		System.out.println("Unesite karakter: ");
		char a = input.next().charAt(0);
		input.close();
		//ispis
		System.out.println("Broj pojavljivanja karaktera "+a+" u stringu "+str+" je "+count(str,a));

	}
	//metoda broji koliko se karakter puta pojavljuje u stringu
	public static int count(String str, char a) {
		//pocetna vrijednost brojaca
		int n =  (a == str.charAt(0)) ? 1 : 0;
		//ako je duzina str 1 vrati brojac
        if (str.length() == 1)
            return n;
        else
        	//ako nije vrijednosti brojaca dodaj vrijednost koja se dobije ponovnim pozivanjem metode
            return n + count(str.substring(1), a);
	}

}
