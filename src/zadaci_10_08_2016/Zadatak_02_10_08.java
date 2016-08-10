package zadaci_10_08_2016;

public class Zadatak_02_10_08 {
	/* Twin prime brojevi su par prostih brojeva koji se razlikuju za 2. 
	 * Na primjer, brojevi 3 i 5 su twin primes, brojevi 5 i 7 i 11 i 13 su takodjer twin primes. 
	 * Napisati program koji ispisuje sve twin prime brojeve manje od 10000, 10 parova po liniji. 
	 */

	public static void main(String[] args) {
		
		final int MAX_NUM = 10000;		//granica za provkeru brojeva
		int numPerLine = 0;			//broji parove po liniji
			
		System.out.println("Twin prime brojevi: ");
		for (int i = 3; i < MAX_NUM; i++) {			//provjerava sve brojeve od 3 do najveceg postavljenog broja tj 10000
			if (isPrime(i) && isPrime(i + 2)) {		//ako je broj primaran i ako je broj za 2 veci od njega primaran oni su twin prime
				System.out.print(i+" "+(i+2)+"  ");	//ispisati oba broja
				numPerLine++;						//povecati brojac
				if (numPerLine % 10 == 0)	// ako je brojac djeljiv sa 10 predji u novi red
					System.out.println();
			}
		}
	}
	//metoda za provjeru da li je broj primaran
	public static boolean isPrime(int num) { 
		// provjera da li je broj djeljiv sa brojevima u rangu od 2 do tog broja
		// moglo bi i do num/2 jer su u pitanju cijeli brojevi, pa sigurno nije djeljiv sa brojem vecim od num/2
		for (int i = 2; i < num; i++) { 
			if (num % i == 0) 	// ako je ostatak djeljenja tog broja sa nekim brojem jednak nuli znaci da nije primaran
				return false;
		}
		return true;
	}

}
