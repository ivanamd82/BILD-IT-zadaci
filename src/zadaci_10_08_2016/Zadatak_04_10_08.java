package zadaci_10_08_2016;

import java.util.Scanner;

public class Zadatak_04_10_08 {
	/* Napisati metodu koja pronalazi broj ponavljanja odredjenog karaktera u stringu. 
	 * Metoda treba da koristi sljedeci header: 
	 * public static int count(String str, char a). 
	 * Na primjer, ukoliko pozovemo metodu na sljedeci nacin: count("Welcome", e) metoda treba da vrati 2.
	 * Napisati program koji pita korisnika da unese string i koji karakter zeli da prebroji u datom stringu
	 * te mu ispise koliko se puta odredjeni karakter ponovio u zadatom stringu.
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		//unosa podataka
		System.out.println("Unesite string: ");
		String str = input.nextLine();
		System.out.println("Unesite karakter za koji zelite da provjerite koliko se puta ponavlja u stringu: ");
		char a = input.next().charAt(0);		//ucitavanje prvog karaktera
		input.close();
		System.out.println("Broj pojavljivanja karaktera \""+a+"\" u stringu koji ste unijeli je "+count(str,a)+".");
	}
	//metoda za brojanje pojavljivanja karaktera u stringu
	public static int count(String str, char a) {
		int counter = 0;							//brojac postavljen na 0
		for (int i = 0; i < str.length(); i++) {	//provjerava sve karaktere u stringu da li su jednaki trazenom karakteru
			if (a == str.charAt(i))					//ako jest povecati brojac za 1  
				counter++;
		}
		return counter;	
	}

}
