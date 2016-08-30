package zadaci_24_08_2016;
/* 10.18
 * (Large prime numbers) Write a program that finds five prime numbers larger than Long.MAX_VALUE.
 */

import java.math.BigInteger;

public class Zadatak_03_24_08 {

	public static void main(String[] args) {
		
		BigInteger number = new BigInteger(Long.MAX_VALUE+"");	//postavljanje pocetne vrijednosti
		System.out.println("Primarni brojevi veci od "+number);
		//brojac pocetna vrijednost 0
		int counter = 0;	
		//petlja dok je brojac manji od 5
		while(counter < 5) {
			if (isPrimeBig(number)) {			//provjera da li je broj primaran pomocu metode
				System.out.println(number);		//ako jeste ispisi ga i povecaj brojac za 1
				counter++;
			}
			number = number.add(BigInteger.ONE);		//povecati broj koji se provjerava za jedan
		}
	}
	//metoda za provjeru dda li je broj primaran
	public static boolean isPrimeBig(BigInteger number) {
		//broj 2 konvertovan u BigInteger
		BigInteger dva = new BigInteger("2");
		//ako je broj 2 ispisi ga
		if (number.equals(dva))
			System.out.println("number");
		//ako je broj razlicit od 2, provjeri da je broj djeljiv sa 2, ako jeste nije primaran
		else {
			if (number.remainder(dva).equals(BigInteger.ZERO))
				return false;
			//postavljanje novog pocetnog broja djelioca na 3
			BigInteger i = new BigInteger("3");
			//petlja sve dok je i manje od number/2
			while(i.compareTo(number.divide(dva)) == -1) {
				if(number.remainder(i).equals(BigInteger.ZERO))		//ako je djeljiv sa i nije primaran
					return false;	
				i = i.add(dva);		//preskociti parne djelioce
			}
		}
		return true;		
	}

}
