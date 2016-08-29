package zadaci_23_08_2016;
/* 10.6
 * Displaying the prime numbers) Write a program that displays all the prime numbers
 * less than 120 in decreasing order. Use the StackOfIntegers class to store 
 * the prime numbers (e.g., 2, 3, 5, ...) and retrieve and display them in reverse order.
 */

public class Zadatak_05_23_08 {

	public static void main(String[] args) {
		
		final int MAX = 120;	//broj do kojeg treba provjeriti brojeve da li su primarni
		StackOfIntegers primes = new StackOfIntegers();	//kreiranje objekta koji ce cuvati sve primarne brojeve manje od MAX
		
		//ispitivanje da li su brojevi primarni pomocu metode
		for(int i = 2; i <= MAX; i++) {
			if (isPrime(i))						//ako je primaran ubaci ga u niz
				primes.push(i);
		}
		//ispis primarnih brojeva
		System.out.println("Primarni brojevi do "+MAX);
		while(!primes.empty()) {
			System.out.print(primes.pop()+" ");
		}

	}
	// metoda za provjeru da li je broj primaran
	public static boolean isPrime(int num) { 
		// provjera da li je broj djeljiv sa brojevima u rangu od 2 do tog broja
		for (int i = 2; i < num; i++) { 
			if (num % i == 0) 	// ako je ostatak djeljenja tog broja sa nekim od brojem jednak nuli znaci da nije primaran
				return false;
		}
		return true;
	}

}
