package zadaci_05_08_2016;

import java.util.Scanner;

public class Zadatak_03_05_08 {
	/*
	 * Napisati program koji pita korisnika da unese 2 stringa te ispisuje najveci zajednicki prefix za ta dva stringa,
	 * ukoliko isti postoji. Na primjer, ukoliko korisnik unese sljedeca dva stringa 
	 * "Dobrodošli u Dubai" i "Dobrodosli u Vankuver" program treba da ispise: 
	 * Najveci zajednicki prefix za dva stringa je "Dobrodosli u". 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		System.out.println("Unesite prvi string: ");	//unos podataka
		String s1 = input.nextLine();
		System.out.println("Unesite drugi string: ");
		String s2 = input.nextLine();
		input.close();
		String prefix = prefix(s1,s2);	//poziv metode
		System.out.println((prefix == "") ? "Nemaju zajednicki prefix." : "Zajednicki prefix je "+prefix);	//ispis
		
	}
	//metoda za odredjivanje zajednickog prefiksa
	public static String prefix(String s1, String s2) {	
		String prefix = "";		//promljenljiva koja ce cuvati prefiks, pocetna vrijednost ""
		int length = (s1.length() <= s2.length()) ? s1.length() : s2.length();	//provjera duzine stringa, za uslov u for petlji
		for (int i = 0; i < length; i++) {	//petlja koja provjerava da li su karakteri na istim pozicijama jednaki
			if(s1.charAt(i) == s2.charAt(i))
				prefix += s1.charAt(i);		// ako jesu dodaj karakter promjenljivoj
			else break;				//ako nisu izadji iz petlje
		}
		return prefix;
	}

}
