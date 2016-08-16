package zadaci_16_08_2016;

import java.util.Scanner;
/* Napisati program koji pita korisnika da unese Social Security Number (SSN)
 * u formatu DDD-DD-DDDD gdje D predstavlja broj. 
 * Program treba da provjerava da li je broj unesesen u ispravnom formatu. 
 * Ukoliko nije, program pita korisnika da pokusa ponovo. 
 * Ukoliko jeste unesen u pravom formatu, program završava sa radom.
 */

public class Zadatak_03_16_08 {
	
	static final int LENGTH = 11; //duzina SSN broja,

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		//unos podataka
		System.out.println("Unesite broj osiguranja (DDD-DD-DDDD): ");
		String number = input.nextLine();
				
		while (!isValid(number)) {	//sve dok unos nije ispravan ponavljati unos
			System.out.println("Pogresan unos. Pokusajte ponovo");
			number = input.nextLine();
		}
		input.close();
		//ispis poruke ako je unos ispravan
		System.out.println("Ispravan unos.");
	}
	
	//metoda koja provjerava ispravnost unesenog broja
	public static boolean isValid(String s) {
		
		if(s.length() != LENGTH) 	//prvo se poredi duzina, ako nije odgovarajuca vratiti false
			return false;
		else {							//ako je duzina ok provjeriti svaki karakter u stringu
			for (int i = 0; i <= s.length()-1; i++) {	
				if (i==3 || i == 6) {					//karakteri na 3 i 6 indeksu moraju biti "-" ako nisu return false
					if (s.charAt(i) != '-') 
						return false;
				}				
				else if (!Character.isDigit(s.charAt(i)))	// za sve ostale karaktere provjerite da li su brojevi
					return false;	
			}
		}
		return true;
	}

}
