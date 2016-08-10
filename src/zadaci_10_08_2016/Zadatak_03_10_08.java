package zadaci_10_08_2016;

public class Zadatak_03_10_08 {
	/* Napisati program koji ispisuje sve moguce kombinacije za biranje dva broja u rasponu od 1 do 7.
	 * Takodjer, program ispisuje broj svih mogucih kombinacija.  
	 * Dakle, program treba da ispise sve moguce parove brojeva u datom rasponu,
	 * krenuvsi sa 1 2, 1 3, 1 4, itd. Broj mogucih kombinacija je 21. 
	 */

	public static void main(String[] args) {
		
		final int START = 1; // pocetni broj od koga se provjeravaju kombinacija
		final int END = 7; // krajnji broj
		int counter = 0; // brojac kombinacija
		
		for (int i = START; i < END; i++) {		//petlja ide od prvog do zadnjeg broja (ne racunajuci zadnji br)
			for (int j = i+1; j <= END; j++) {	//drugi broj krece od i+1 do zadnjeg broja
				System.out.print(i+" "+j+", ");	//ispis kombinacije
				counter++;						// inkrementiramo brojac
				if (counter % 5 == 0) System.out.println();	//ako je broj kombinacija u tom redu 5, predji u novi red (ne trazi se u zadatku)
			}
		}
		System.out.println("\nBroj kombinacija je: " + counter);	//ispis ukupnog broja kombinacija
	}

}
