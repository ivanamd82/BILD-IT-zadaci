package zadaci_16_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;
/* Napisati program koji pita korisnika da unese cijeli trocifreni broj
 * te provjerava da li je unijeti broj palindrom. 
 * Broj je palindrom ukoliko se cita isto i sa lijeva na desno
 * i sa desna na lijevo npr. 121, 131, itd.
 */

public class Zadatak_01_16_08 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Unesite trocifreni cijeli broj: ");		//ucitavanje podataka i provjera da li je trocifren pomocu metode
		int number = inputCheckI();
		System.out.println(isPalindrome3DigitNumber(number) ? "Broj "+number+" je palindrom." : "Broj "+number+" nije palindrom.");
	}
	
	/* metoda provjerava da li je trocifren broj palindrom
	 * prva i zadnja cifra moraju biti jednake, cifre se dobijaju djeljenjem sa sto i kao ostatak djeljena sa 10
	 */
	public static boolean isPalindrome3DigitNumber(int number) {
		if (number / 100 == number % 10) 
			return true;
		else return false;
	}
	
	//metoda provjerava da li je broj odgovarajuceg tipa 
	public static int inputCheckI() {
		
		int unos = 0;	// pocetna vrijednost
		boolean inputCheck = true;	//kontrolna promjenljiva
		do {
			try {
				unos = input.nextInt();	//ucitavanje unosa i provjera da li je trocifren broj
				if (unos < 100 || unos >= 1000) {
					System.out.println("Pogresan unos. Pokusajte ponovo: ");	//ako nije ispisi poruku
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
