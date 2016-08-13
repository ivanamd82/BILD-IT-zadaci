package zadaci_12_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_02_12_08 {
	/* Napisati program koji pita korisnika da unese dva cijela, pozitivna broja
	 * te ispisuje najveci i najmanji zajednicki djelilac za ta dva broja.
	 */
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
			
		System.out.println("Unesite dva cijela pozitivna broja: ");	//unos podataka i provjera tipa
		int num1 = inputCheckI();
		int num2 = inputCheckI();
		//ispis
		System.out.printf("Najmanji zajednicki djelilac za brojeve %d i %d je %d."
				+ "\nNajveci zajednicki djelilac je %d.",num1, num2,scd(num1,num2),gcd(num1,num2));
		
	}
	//metoda za odredjivanje najmanjeg zajednickog djelioca(osim 1, ako postoji)
	public static int scd (int num1, int num2) {
		for (int i = 2; i <= num1 || i <= num2; i++) {	//provjera da li su brojevi djeljivi sa nekim brojem u rasponu
			if (num1 % i == 0 && num2 % i == 0)		// od 2 do manjeg od ta dva broja cim naidje na 
				return i;							// prvi vraca taj broj, kao najmanji zd
		}
		return 1;				//inace vraca 1
	}
	//metoda za odredjivanje najveceg zajednickog djelioca
	public static int gcd (int num1, int num2) {
		int gcd = 1;									//pocetna vrijednost najveceg zajednickog djeloica
		for (int i = 2; i <= num1 || i <= num2; i++) {	//provjera da li su brojevi djeljivi sa nekim brojem u rasponu
			if (num1 % i == 0 && num2 % i == 0)			//od 2 do manjeg od ta dva broja 
				gcd = i;								//i ako ga nadje postavlja taj br kao trenutni gcd
		}
		return gcd;
	}
	//metoda za provjeru ispravnosti unesenih podataka
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
