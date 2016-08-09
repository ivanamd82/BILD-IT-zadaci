package zadaci_08_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_02_08_08 {
	/*
	 * Napisati program koji pita korisnika da unese mjesec i godinu te mu ispise broj dana u datom mjesecu.
	 * Na primjer, ukoliko korisnik unese kao godinu 2012 a kao mjesec 2, 
	 * program treba ispisati da je Februar 2012 imao 29 dana. 
	 * Ukoliko korisnik unese kao godinu 2015 a kao mjesec 3, program treba ispisati da je Mart 2015 imao 31 dan. 
	 */
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Unesite godinu: ");	//unos podataka i provjera ispravnosti pomocu metode
		int year = inputCheckI();
		System.out.println("Unesite mjesec: ");
		int month = inputCheckI();
		while (month > 12) {				//ako je unesen veci broj od 12, ispis greske, ponovo omogucen unos
			System.out.println("Pogresan unos! Unesite broj od 1 do 12: ");
			month = inputCheckI();
		}
		
		switch (month) {		//ispis br dana za odgovarajuci mjesec
		case 1: System.out.println("Januar " +year+" ima 31 dan"); break;
		case 2: {
				if (isLeap(year))		//ako je godina prestupna	
					System.out.println("Februar "+year+" ima 29 dana");
				else System.out.println("Februar "+year+" ima 28 dana");
				break;
		}
		case 3: System.out.println("Mart " +year+" ima 31 dan."); break;
		case 4: System.out.println("April " +year+" ima 30 dana."); break;
		case 5: System.out.println("Maj " +year+" ima 31 dan."); break;
		case 6: System.out.println("Jun " +year+" ima 30 dana"); break;
		case 7: System.out.println("Jul " +year+" ima 31 dan"); break;
		case 8: System.out.println("Avgust " +year+" ima 31 dan"); break;
		case 9: System.out.println("Septembar " +year+" ima 30 dana"); break;
		case 10: System.out.println("Oktobar " +year+" ima 31 dan."); break;
		case 11: System.out.println("Novembar " +year+" ima 30 dana."); break;
		case 12: System.out.println("Decembar " +year+" ima 31 dan."); break;
		}		
	}
	//metoda za odredjivanje prestupne godine, vraca true ako je god prestupna
	public static boolean isLeap (int year) {
		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) // uslov za prestupnu godinu
			return true;
		else return false;
	}
	//metoda za provjeru unosa, broj treba biti tipa int i veci od 0
	public static int inputCheckI() {
		int unos = 0;	// pocetna vrijednost
		boolean inputCheck = true;	//kontrolna promjenljiva
		do {
			try {
				unos = input.nextInt();	//ucitavanje unosa i provjera da li je negativan broj
				if (unos <= 0) {
					System.out.println("Pogresan unos. Pokusajte ponovo: ");	//ako jeste ispisi poruku
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
