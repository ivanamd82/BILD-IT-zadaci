package zadaci_11_08_2016;

public class Zadatak_02_11_08 {
	/* Napisati program koji ispisuje sve proste brojeve od 2 do 1000, ukljucujuci i 2 i 1000. 
	 * Program treba da ispise 8 brojeva po liniji te razmak izmedju brojeva treba da bude jedan space.
	 */

	public static void main(String[] args) {
		
		final int FIRST = 2;		// pocetni podaci uneseni kao konstante
		final int LAST = 1000;
		final int NUM_PER_LINE = 8;
		
		primeNumbers(FIRST, LAST, NUM_PER_LINE);	//pozivanje metode za ispis prostih brojeva

	}
	public static boolean isPrime(int num) { 
		// provjera da li je broj djeljiv sa brojevima u rangu od 2 do tog broja
		// moglo bi i do num/2 jer su u pitanju cijeli brojevi, pa def nije djeljiv sa brojem vecim od num/2
		for (int i = 2; i < num; i++) { 
			if (num % i == 0) 	// ako je ostatak djeljenja tog broja sa nekim od brojem jednak nuli znaci da nije primaran
				return false;
		}
		return true;
	}
	// metoda za prikaz primarnih brojeva
	public static void primeNumbers(int start, int end, int numPerLine) {
		int counter = 0;	// inicijalizacija brojaca prikazanih brojeva po liniji
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {	// ako je primaran prikazi broj, brojac inkrementiran
				System.out.print(i +" ");
				counter++;
				if (counter % numPerLine == 0)	// ako je brojac djeljiv zadanim brojem brojeva po liniji predji u novi red
					System.out.println();
			}
		}
	}

}
