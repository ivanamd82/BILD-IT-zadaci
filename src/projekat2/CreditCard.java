package projekat2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/* (Financial: credit card number validation) Credit card numbers follow certain patterns.
 * A credit card number must have between 13 and 16 digits. It must start with:
 * 4 for Visa cards
 * 5 for Master cards
 * 37 for American Express cards
 * 6 for Discover cards
 * In 1954, Hans Luhn of IBM proposed an algorithm for validating credit card
 * numbers. The algorithm is useful to determine whether a card number is entered
 * correctly or whether a credit card is scanned correctly by a scanner. Credit card
 * numbers are generated following this validity check, commonly known as the
 * Luhn check or the Mod 10 check, which can be described as follows (for illustration,
 * consider the card number 4388576018402626):
 * 1. Double every second digit from right to left. If doubling of a digit results in a
 * two-digit number, add up the two digits to get a single-digit number.
 * 2. Now add all single-digit numbers from Step 1.
 * 4 + 4 + 8 + 2 + 3 + 1 + 7 + 8 = 37
 * 3. Add all digits in the odd places from right to left in the card number.
 * 6 + 6 + 0 + 8 + 0 + 7 + 8 + 3 = 38
 * 4. Sum the results from Step 2 and Step 3.
 * 37 + 38 = 75
 * 5. If the result from Step 4 is divisible by 10, the card number is valid; otherwise,
 * it is invalid. For example, the number 4388576018402626 is invalid, but the
 * number 4388576018410707 is valid.
 */

public class CreditCard {
	
	static final int[] TYPE = {4,5,6,37};	//niz koji predstavlja podrzane prefikse kartica
	static final String[] CARD = {"Visa","Master card","Discover","American Express"};	//imena podrzanih kartica
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		//unos podataka i provjera tipa
		System.out.println("Unesite broj kreditne kartice: ");
		long number = inputCheckL();
		//pozivanje metode za provjeru validnosti broja i ispis
		System.out.println(	isValid(number) ?  "Broj je validan.\nKartica je "+typeOfCard(number) : "Broj nije validan.");
		input.close();	
	}
	//metoda za ispis imena tipa kartice
	public static String typeOfCard(long number) {
		for (int i = 0; i < TYPE.length; i++) {	//provjera da li prefiks broja odgovara nekom od podrzanih prefiksa kartica
			if (prefixMatched(number, i))
				return CARD[i];					//ako odgovara ispisati vratiti naziv kartice
		}
		return "Invalid type";
	}
	// metoda za provjeru da li je validan tip kartice
	public static boolean validType(long number) {
		for (int i = 0; i < TYPE.length; i++) {	//ako prefiks broja odgovara podrzanim tipovima vratiti true
			if (prefixMatched(number, i))
				return true;
		}
		return false;		
	}
	//metoda za pretvaranje broja u listu, lakse mi bilo neke napisati metode sa listom :)
	public static ArrayList<Integer> longNumToList(long number) {
		ArrayList<Integer> list = new ArrayList<>();	
		while (number != 0) {						//sve dok je broj razlicit od nule
			list.add((int)(number % 10));			//pojedinacne cifre se dobijaju kao ostatak djeljenja sa 10 i dodaj ih kao elemente liste
			number /= 10;							//broj podjeli sa 10
		}
		return list;
	}
	/*vraca true ako je broj validan
	 * ako broj ima izmedju 13 i 16 cifara, ako ima validan tip kartice, i ako je
	 * sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) djeljiva sa 10 (uslov iz zadatka)
	 * broj je validan
	 */
	public static boolean isValid(long number) {
		if ((getSize(number) >= 13 && getSize(number) <= 16) && validType(number) && 
				((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0))
			return true;		
		else return false;
	}
	
	//metoda vraca sumu svih elemenata na parnim pozicijama koji su pomnozeni sa 2
	public static int sumOfDoubleEvenPlace(long number) {
		int sum = 0;
		ArrayList<Integer> list = longNumToList(number);	//prebacen broj u listu
		for(int i = 1; i < list.size(); i+=2) {
			sum += getDigit(list.get(i) * 2) ;
		}
		return sum;		
	}
	// Vraca broj ako je broj jednocifren, a ako nije vraca sumu cifara tog broja
	public static int getDigit(int number) {
		if(number > 9) {
			int sum = number % 10 + number /10;
			return sum;
		}
		else return number;		
	}
	
	//vraca sumu cifara na neparnim pozicijama
	public static int sumOfOddPlace(long number) {
		int sum = 0;
		ArrayList<Integer> list = longNumToList(number);	//cifre broja prebacene u listu
		for(int i = 0; i < list.size(); i+=2) {	
			sum += list.get(i);					//svaki broj na neparnoj poziciji dodat sumi
		}
		return sum;		
	}
	// vraca true ako je prefiks broja jednak broju d
		public static boolean prefixMatched(long number, int d) {
		int k = getSize(d);
		if (getPrefix(number,k) == d)
			return true;
		else return false;		
	}
	
	//vraca broj cifara broja
	public static int getSize(long d) {
		int counter = 0;
		while (d != 0) {			
			counter++;
			d /= 10;
		}
		return counter;		
	}
	//vraca prvih k cifara broja, ako je broj cifara manji od k vraca taj broj
	public static long getPrefix(long number, int k) {
		if (getSize(number) <= k) 
			return number;
		else {
			while (getSize(number) > k)
				number /= 10;
		}
		return number;		
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
