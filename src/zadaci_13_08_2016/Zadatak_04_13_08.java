package zadaci_13_08_2016;

public class Zadatak_04_13_08 {
	/* Palindrome prime je prosti broj koji je takodjer i palindrom. 
	 * Na primjer, 131 je palindrome prime, kao i brojevi 313 i 757. 
	 * Napisati program koji ispisuje prvih 100 palindrome prime brojeva, 10 brojeva po liniji. 
	 */

	public static void main(String[] args) {
		
		final int LIMIT = 100;		//konstanta definise koliko brojeva treba ispisati
		int number = 1;				//pocetni broj
		int counter = 0;			//brojac ispisanih brojeva
		
		/* dok je brojac manji ili jednak limitu(100) treba provjeriti da li je broj primaran i da li je palindrom 
		 * Ako jeste ispisati ga, povecati brojac i ako je ispisano 10 brojeva preci u novi red.
		 * Povecati broj za 1 i ponoviti provjeru
		 */	
		System.out.println("Prvih "+LIMIT+" palindrom prime brojeva: ");
		while (counter < LIMIT) {	
			if (isPrime(number) && isPalindrome(number)) {
				System.out.print(number+" ");
				counter++;
				if (counter % 10 == 0) System.out.println();
			}
			number++;
		}
	}
	//metoda koja vraca broj ispisan naopako
	public static int reverse(int number) {
		int reverseNum = 0;		//pocetna vrijednost 0
		/* ostatak dijeljenja broja sa 10 se u svakom krugu mnozi sa 10
		 * i tako pomjera za jedno mjesto naprijed. 
		 * A pri svakom krugu broju se dodaje ostatak djeljenja broja sa 10,
		 * a sam broj se djeli sa 10 sve dok broj ne bude 0
		 */
		while (number != 0) {
			reverseNum = (reverseNum * 10) + number % 10;
			number = number / 10;
		}
		return reverseNum;
	}
	
	// metoda za provjeru da i je broj palindrom
	public static boolean isPalindrome(int number) {
		if (number == reverse(number)) 	//broj je palindrom ako je isti kad se napise naopako
			return true;
		else return false;
	}
	
	// metoda za provjeru da li je broj primaran
	public static boolean isPrime(int number) { 
		// provjera da li je broj djeljiv sa brojevima u rangu od 2 do tog broja/2
		// jer su u pitanju cijeli brojevi, pa def nije djeljiv sa brojem vecim od number/2
		if (number == 1) return false;	//// 1 nije prost broj
		for (int i = 2; i <= number/2; i++) { 			
			if (number % i == 0) 	// ako je ostatak djeljenja tog broja sa nekim od brojem jednak nuli znaci da nije primaran
				return false;
		}
		return true;
	}

}
