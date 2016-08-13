package zadaci_13_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_05_13_08 {
	/* Pretpostavimo da kupujemo rizu ili neki drugi proizvod u dva razlicita pakovanja. 
	 * Zelimo napisati program koji uporedjuje cijene ta dva pakovanja. 
	 * Program pita korisnika da unese tezinu i cijenu oba pakovanja
	 * te ispisuje koje pakovanje ima bolju cijenu.
	 */
	static Scanner input = new Scanner(System.in);	

	public static void main(String[] args) {
		
		System.out.println("Unesite tezinu prvog pakovanja: ");	//unos podataka i provjera da li je odgovarajuci tip
		double weight1 = inputCheckD();
		System.out.println("Unesite cijenu prvog pakovanja: ");
		double price1 = inputCheckD();
		System.out.println("Unesite tezinu drugog pakovanja: ");
		double weight2 = inputCheckD();
		System.out.println("Unesite cijenu drugog pakovanja: ");
		double price2 = inputCheckD();
		input.close();
		
		betterPrice(price1, price2, weight1, weight2);
	}
	// metoda koja provjerava koja je cijena bolja	
	public static void betterPrice(double price1, double price2, double weight1, double weight2) {
		
		if (price1/weight1 > price2/weight2)	//provjera da li  prvi paket ima bolji odnos cijena/tezina
			System.out.println("Bolju cijenu ima drugi paket.");
		else if (price1/weight1 == price2/weight2)			//ako imaju isti odnos cijena /tezina
			System.out.println("Oba paketa imaju istu cijenu srazmjerno svojim tezinama.");
		else System.out.println("Bolju cijenu ima prvi paket.");	//ili ako drugi ima bolji odnos cijena/tezina
	}
	//metoda za provjeru unosa podatakaa
	public static double inputCheckD() {	
		double unos = 0;		//pocetna vrijednost
		boolean inputCheck = true;		//kontrolna promjenljiva
		do {							// dok nije unesen broj tip doble ponavljati
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

}
