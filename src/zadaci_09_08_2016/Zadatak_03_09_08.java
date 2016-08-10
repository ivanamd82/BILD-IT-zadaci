package zadaci_09_08_2016;

public class Zadatak_03_09_08 {
	/* Napisite program koji ispisuje sve brojeve, od 100 do 1000, 10 brojeva po liniji,
	 * koji su djeljivi i sa 5 i sa 6. Razmak izmedju brojeva treba biti tacno jedan space. 
	 */
	public static void main(String[] args) {
		
		int counter = 0;	//brojac pocetna vrijednost 0
		System.out.println("Brojevi koji su djeljivi sa 5 i 6, u rangu od 100 do 1000: ");
		for (int number = 100; number <= 1000; number++) {	//provjeravamo sve brojeve od 100 do 10000
			if (number % 5 == 0 && number % 6 ==0) {		//ako je broj djeljiv sa 5 i sa 6
				System.out.print(number+" ");			//ispisati broj i povecati brojac
				counter++;
				if (counter % 10 == 0)				//ako je ispisano 10 brojeva preci u novi red
					System.out.println();
			}
		}
	}
}
