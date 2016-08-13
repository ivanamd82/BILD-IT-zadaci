package zadaci_12_08_2016;

public class Zadatak_03_12_08 {
	/* Napisati metodu sa sljedecim headerom: 
	 * public static int isPrime(int n) koja provjerava da li je broj prost/prime.
	 * Napsati test program koji poziva ovu metodu i ispisuje sve proste brojeve u rasponu od 0 do 100000.
	 */

	public static void main(String[] args) {
		
		final int FIRST = 0;				//pocetne vrijednosti raspon brojeva konstante
		final int LAST = 100000;
		int counter = 0;					//brojac pocetna vrijednost 0
		
		for (int i = FIRST; i < LAST; i++) {	//provjerava sve brojeve  od pocetnog do zadnjeg
			if(isPrime(i) != 0) {				//poziv funkcije za provjeru primarnih brojeva, broj ako je razlicit od 0 primaran je
				counter++;						//brojac povecati za  
				System.out.print((counter % 10 == 0) ? i+"\n" : i+" ");	//ispis ako je ispisano 10 brojeva preci u novi red
			}
		}
	}
	//metoda za provjeru da li je broj primaran, ako nije vraca 0
	public static int isPrime(int n) {
		if (n == 1) return 0;			//ako je broj 1 vrati 0
		for (int i = 2; i < n; i++) {	// petlaj za provjeru da li je broj djeljiv brojevima od 2 do tog broja
			if (n % i == 0) 		//ako jeste nije primaran, vratiti 0
				return 0;
		}
		return n;			// vrati taj broj ako je primaran
	}
}
