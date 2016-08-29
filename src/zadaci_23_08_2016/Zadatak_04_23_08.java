package zadaci_23_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/* 10.5
 * (Displaying the prime factors) Write a program that prompts the user to enter 
 * a positive integer and displays all its smallest factors in decreasing order. 
 * For example, if the integer is 120, the smallest factors are displayed as 5, 3, 2, 2, 2. 
 * Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5) 
 * and retrieve and display them in reverse order.
 */

public class Zadatak_04_23_08 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		StackOfIntegers factors = new StackOfIntegers();	//kreiranje objekta koji ce cuvati sve faktore unesenog broja
		
		//unos		
		System.out.println("Unesite cijeli broj: ");
		int number = inputCheckI();
		input.close();
		
		System.out.print("Faktori broja "+number+": ");
		int i = 2;						//// promjenljiva koja predstavlja potencijalne faktore, pocetna vrijednost 2
		while (number > 1) {			// uslov za ponavljanje petlje
			if (number % i == 0) {		// ako je broj djeljiv sa brojem i, onda je i faktor tog broja
				number /= i;			// promjenljiivoj dodjeli vrijednost broj podjeljen sa faktorom
				factors.push(i);;		// ubaciti faktor u niz
			}
			else i++;			// ako broj nije djeljiv sa i povecaj vrijednos i za 1
								// i ispituj ponovo da li je taj broj djeljiv sa novim brojem i
		}
		
		//ispis faktora
		while(!factors.empty()) {
			System.out.print(factors.pop()+" ");
		}
	}
	
	//metoda provjerava da li je broj odgovarajuceg tipa 
	public static int inputCheckI() {
		
		int unos = 0;	// pocetna vrijednost
		boolean inputCheck = true;	//kontrolna promjenljiva
		do {
			try {
				unos = input.nextInt();	//ucitavanje unosa i provjera da li je pozitivan
				if (unos < 0) {
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
