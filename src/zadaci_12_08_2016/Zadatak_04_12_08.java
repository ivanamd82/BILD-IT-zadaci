package zadaci_12_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_04_12_08 {
	/* Napisati program koji pita korisnika da unese 3 cijela broja
	 * te mu ispise ta ista tri broja u rastucem redosljedu. 
	 * Bonus: Napisati metodu koja prima tri cijela broja kao argumente
	 * te vraca brojeve u rastucem redosljedu. 
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		do {
			try {
				System.out.println("Unesite tri cijela broja broja: ");	//unos podataka i provjera da li su int
				int num1 = input.nextInt();
				int num2 = input.nextInt();
				int num3 = input.nextInt();
				
				displaySortedNumbers(num1, num2, num3);
			} catch (InputMismatchException ex) {	//ako je u unesen pogresan tip podataka
				System.out.println("Pogresan unos. Pokusajte ponovo.");	//ispis
				input.nextLine();							// ocisti input
			}
		} while(!input.hasNextInt());	//ponavljati sve dok uneseni broj nije int
		input.close();		
	}
	//metoda za sortiranje 3 broja u rastecem redosledu
	public static void displaySortedNumbers(int num1, int num2, int num3) {
		int temporary = 0;		// pomocna promjenljiva
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
			temporary = num2;
			num2= num3;				//ako je num2 veci zamjeniti mjeste
			num3= temporary;
		}
		System.out.print(num1+" "+num2+" "+num3+" "); //ispis
	}
}
