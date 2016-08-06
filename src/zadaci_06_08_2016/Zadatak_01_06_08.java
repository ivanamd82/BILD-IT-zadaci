package zadaci_06_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_01_06_08 {
	/*
	 * Napisati program koji ucitava iznos investicije, godisnju interesnu stopu i broj godina
	 * te vraca buducu vrijednost investicije koristeci se sljedecom formulom: 
	 * buducaVrijednostInvesticije = iznosInvesticije * (1 + mjesecnaInteresnaStopa)^brojGodina*12.
	 * Na primjer, ukoliko uneste kao iznos investicije 1000, 3.25 kao godisnju interesnu stopu
	 * i 1 kao broj godina program vam vraca 1032.98 kao buducu vrijednost investicije.
	 */
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Unesite iznos investicije: ");		//unos podataka
		double iznosInvesticije = inputCheckD();				//provjera ispravnosti
		System.out.println("Unesite godisnju iteresnu stopu: ");
		double godisnjaInteresnaStopa = inputCheckD();
		System.out.println("Unesite broj godina: ");
		int brojGodina = inputCheckI();
		System.out.printf("Buduca vrijednos investicije iznosi: "
				+ "%.2f",futureInvestment(iznosInvesticije,godisnjaInteresnaStopa,brojGodina));
	}
	//metoda za izracunavanje buduce vrijednosti investicije
	//godisnja kamatna stopa je pretvorena u mjesecnu po formuli godisnjaInteresnaStopa/(100 * 12)
	public static double futureInvestment(double iznosInvesticije, double godisnjaInteresnaStopa, double brojGodina) {
		double buducaVrijednostInvesticije = iznosInvesticije * Math.pow(1 + (godisnjaInteresnaStopa/(100 * 12)), brojGodina*12);
		return buducaVrijednostInvesticije;
	}
	//metoda za provjeru ispravnosti unijetih podatakaa double tip
	public static double inputCheckD() {	
		double unos = 0;		//pocetna vrijednost
		boolean inputCheck = true;		//kontrolna promjenljiva
		do {							// dok nije unesen broj tia doble ponavljati
			try {
				unos = input.nextDouble();		
				if (unos <= 0) {			//ako je unesen negativan broj
					System.out.println("Pogresan unos. Pokusajte ponovo: ");
					inputCheck = true;
				}				
				else inputCheck = false;	//ako je unos ok kontrolna promjenljiva postavljena na false								
			}
			catch (InputMismatchException ex) {		//u slucaju pogresnog formata ulaznog podataka
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				input.nextLine();
			}
		} while (inputCheck);
		return unos;
	}
	// metoda za provjeru ispravnosti unijetih podatakaa int tip
	//isto kao i za double samo je ovde u pitanju int tip podataka
	public static int inputCheckI() {
		int unos = 0;
		boolean inputCheck = true;
		do {
			try {
				unos = input.nextInt();
				if (unos <= 0) {
					System.out.println("Pogresan unos. Pokusajte ponovo: ");
					inputCheck = true;
				}				
				else inputCheck = false;									
			}
			catch (InputMismatchException ex) {
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				input.nextLine();
			}
		} while (inputCheck);
		return unos;
	}
}
