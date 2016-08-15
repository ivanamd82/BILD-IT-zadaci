package projekat2;

import java.util.Scanner;
	/*(Game: craps) Craps is a popular dice game played in casinos. Write a program
	 * to play a variation of the game, as follows:
	 * Roll two dice. Each die has six faces representing values 1, 2, …, and 6, respectively.
	 * Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you
	 * lose; if the sum is 7 or 11 (called natural), you win; if the sum is another value
	 * (i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until either
	 * a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise, you win.
	 * Your program acts as a single player. Here are some sample runs.
	 */

public class CrapsGame {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		app();
	}
	//metoda koja poziva igru
	public static void app() {
		
		int sum = sumDice();
		roll1(sum);
	}
	//metoda koja generise dva broja i provraca sumu
	public static int sumDice() {
		
		System.out.println("Unesite bilo koji karakter da bi bacili bacili kockice: ");
		String start = input.nextLine();
		int num1 = (int)(1 + Math.random()*6);	//generisanje brojeva
		int num2 = (int)(1 + Math.random()*6);
		int sum = num1 + num2;
		System.out.printf("Dobili ste %d + %d = %d\n",num1,num2,sum);		
		return sum;
	}
	//metoda provjerava sumu, prema pravilima igre
	public static void roll1(int sum) {
		if (sum == 7 || sum == 11) {
			System.out.println("Pobjedili ste.");	//ako je suma 7 ili 11 pobjeda
		}
		else if (sum == 2 || sum == 3 || sum == 12) {	//ako je 2, 3 ili 12 izgubili
			System.out.println("Izgubili ste.");
		}
		else {	
			roll2(sum);	//ako nije nista od tih brojeva pozvati metodu roll2
		}		
	}
	//metoda koja na osnovu dobijene sume odredjuje koji se zbir mora dobiti sa novim bacanjem
	public static void roll2(int sum) {
		int point = sum;	//zadana vrijednos koja se mora dobiti sa novim bacanjem kockica
		do {
		System.out.printf("Suma koju morate dobiti je %d.\nBacajte ponovo.\n",point);
		sum = sumDice();				//ponovno bacanje kockica i dobijanje sume
			if (sum == 7) {				//ako je suma 7 izgubili ste
				System.out.println("Izgubili ste.");
				System.exit(1);;		//izlazak iz igre
			}
		} while(point != sum);			//ponovno bacanje sve dok suma ne odgovara zadanoj vrijednosti
		System.out.println("Pobjedili ste.");		
	}
}
