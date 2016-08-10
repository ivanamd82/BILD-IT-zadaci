package zadaci_09_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_01_09_08 {
	/* Napisati program koji pita korisnika da unese cijeli broj za danasnji dan u sedmici
	 * (0 za ponedjeljak, 1 za utorak...) i da unese broj dana nakon danasnjeg dana 
	 * te mu ispise koji je to dan u buducnosti. 
	 * (Primjer: ako korisnik unese 1 kao danasnji dan a 3 kao dan u buducnosti 
	 * program mu ispisuje da je danas utorak a dan u buducnosti je petak.) 
	 */
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		//unosa podatak i provjera da li je broj int i od 0 do 6
		System.out.println("Unesite danasnji dan (0 za ponedjeljak, 1 za utorak...): ");
		int danas = inputCheckI();
		do {
			System.out.println("Pogresan unos. Pokusajte ponovo.");
			danas = inputCheckI();
		} while (danas > 6);
		System.out.println("Unesite broj dana nakon danasnjeg dana: ");
		int dani = inputCheckI();
		input.close();
		
		int buduciDan = (danas + dani) % 7;	//izracunavanje buduceg dana
		System.out.println("Danas je "+dan(danas)+". Za "+dani+" dana ce biti "+dan(buduciDan)+".");
	}
	//metoda koja vraca ime dana na osnovu broja
	public static String dan(int num) {
		
		switch (num) {
		case 0: return "ponedjeljak";
		case 1:	return "utorak";
		case 2:	return "srijeda";
		case 3:	return "cetvratak";
		case 4:	return "petak";
		case 5:	return "subota";
		case 6:	return "nedelja";
		default: return "Invalid day";
		}
	}
	//metoda za provjeru unesenih podataka
	public static int inputCheckI() {
		int unos = 0;	// pocetna vrijednost
		boolean inputCheck = true;	//kontrolna promjenljiva
		do {
			try {
				unos = input.nextInt();	//ucitavanje unosa i provjera da li je negativan broj
				if (unos < 0) {
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
