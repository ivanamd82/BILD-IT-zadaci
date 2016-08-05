package zadaci_05_08_2016;

import java.util.Scanner;

public class Zadatak_05_05_08 {
	/*
	 * Napisati metodu koja broji slova u stringu. Metoda treba koristiti sljedeci header: 
	 * public static int countLetters(String s). 
	 * Napisati program koji pita korisnika da unese neki string te mu vrati koliko taj string ima slova.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		//unos podataka
		System.out.println("Unesite string: ");	
		String s = input.nextLine();
		input.close();
		System.out.println("Broj slova u stringu je "+countLetters(s));	//ispis	

	}
	// metoda za brojanje slova u stringu
	public static int countLetters(String s) {	
		int letters = 0;						//brojac slova, pocetna vrijednost 0
		for (int i = 0; i < s.length(); i++) {	//prolazi kroz sve karaktere u stringu
			if(Character.isLetter(s.charAt(i)))	//ako je karakter string brojac inkrementirati
				letters++;
		}
		return letters;
	}

}
