package zadaci_04_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_03_04_08 {
	/*
	 * Napisati metodu sa sljedecim headerom koja ispisuje tri broja u rastucem redosljedu: 
	 * public static void displaySortedNumbers(double num1, double num2, double num3). 
	 * Napisati program koji pita korisnika da unese tri broja te ispise ta tri broja u rastucem redosljedu. 
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Unesite tri decimalna broja broja: ");	//unos od strane korisnika
			double num1 = input.nextDouble();
			double num2 = input.nextDouble();
			double num3 = input.nextDouble();
			input.close();
		
			displaySortedNumbers(num1, num2, num3);
		}
		catch (InputMismatchException ex) {
			System.out.println("Pogresan unos.");
		}

	}
	//metoda poredi tri broja i sortira u rastucem redosledu
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		double temporary = 0;		// pomocna promjenljiva
		if (num1 > num2) {			// poredimo prvi i dr broj, ako je prvi veci zamjeniti mjesta
			temporary = num1;
			num1 = num2;
			num2 = temporary;			
		}
		if (num1 > num3) {			//poredimo prvi i treci broj, ako je prvi veci zamjeniti mjesta
			temporary = num1;		//nakon ove provjere prvi broj je najmanji
			num1 = num3;
			num3= temporary;
		}
		if (num2 > num3) {			//ostalo je uporediti i druga dva broja
			num2= num3;				//ako je num2 veci zamjeniti mjeste
			num3= temporary;
		}
		System.out.print(num1+" "+num2+" "+num3+" "); //ispis


	}

}
