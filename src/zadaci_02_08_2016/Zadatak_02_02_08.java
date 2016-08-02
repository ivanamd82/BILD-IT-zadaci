package zadaci_02_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_02_02_08 {
	/* 
	 * Napisati metodu koja prima jedan argument, broj pitanja, generise toliko nasumicnih pitanja oduzimanja
	 * „Koliko je 5 - 2 ?“. Metoda broji tacne i netacne odgovore i ispise korisniku.
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj pitanja: ");
		try {
			int numOfQ = input.nextInt();
			inputCeck(numOfQ); // provjera da li je broj pitanja veci od 0
			oduzimanje(numOfQ);
			input.close();
		}
		catch (InputMismatchException ex) { // u slucaju pogresnog unosa
			System.out.println("Pogresan unos.");
		}		
	}
	
	public static void oduzimanje(int numOfQ) {
		Scanner input = new Scanner(System.in);  // inicijalizacija promjenljivih
		int answer = 0;
		int num1 = 0;
		int num2 = 0;
		int correct = 0;
		for (int i = 0; i < numOfQ; i++) {
			num1 = (int)(Math.random() * 10); // random generisanje brojeva
			num2 = (int)(Math.random() * 10);
			if (num1 < num2) {		// ako je bprvi broj manji od drugog zamjenimo mjesta
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}
			System.out.printf("Koliko je %d - %d ?", num1,num2); // ucitavanje odgovora od strane korisnika
			answer = input.nextInt();
			if (answer == num1 - num2) 	// ako je odgovor tacan povecati brojac
				correct++;				
		}
		System.out.printf("Tacno: %d\nNetacno: %d",correct,numOfQ-correct);
	}
	
	public static int inputCeck(int num) { // metoda za provjeru unosa, u slucaju unosa negativnog broja
		if (num <= 0)
			throw new InputMismatchException ("Negativan broj.");
		return num;		
	}

}
