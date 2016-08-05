package zadaci_05_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_01_05_08 {
	/*
	 *  Pretpostavimo da uplatimo $100 svaki mjesec na stedni racun koji ima godisnju interesnu stopu od 5%.
	 *  Mjesecna interesna stopa je stoga 0.05 / 12 = 0.00417. 
	 *  Nakon prvog mjeseca vrijednost na racunu postaje 100 * (1 + 0.00417) = 100.417.
	 *  Nakon drugog mjeseca, vrijednost na racunu postaje (100 + 100.417) * (1 + 0.00417) = 201.252.
	 *  Nakon treceg mjeseca, vrijednost na racunu postaje (100 + 201.252) * (1 + 0.00417) = 302.507
	 *  i tako dalje. Napisati program koji pita korisnika da unese mjesecni
	 *  iznos stednje te broj mjeseci nakon kojeg bi zelio znati stanje racuna. 
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Unesite mjesecni iznos stednje: ");	//unos podataka
			double amount = input.nextDouble();
			System.out.println("Unesite broj mjeseci nakon kojih bi zeljeli znati ustedjevinu: ");
			int months = input.nextInt();
			iznosStednje(amount,months);
			input.close();
		}
		catch (InputMismatchException ex) {
			System.out.println("Pogresan unos.");
		}
	}
	// metoda za izracunavanje iznosa na racunu za odredjeni broj mjeseci
	public static void iznosStednje(double amount, int months) {
		double interest = 0;		// ukupan iznos na racunu, pocetna vrijednost 0
		for (int i = 0; i < months; i++) {		// uslov za petlju od 0 do br mjeseci, ukupan iznos izracunava se po formuli
			interest = (amount + interest) * ((1 + 0.00417));
		}
		System.out.printf("Nakon %d mjeseca/i vasa ustedjevina iznosi: %.3f",months,interest);
	}

}
