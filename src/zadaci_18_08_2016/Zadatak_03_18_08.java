package zadaci_18_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;
/* (Pattern recognition: consecutive four equal numbers) Write the following
 * method that tests whether the array has four consecutive numbers with the same value.
 * public static boolean isConsecutiveFour(int[] values)
 * Write a test program that prompts the user to enter a series of integers and displays
 * if the series contains four consecutive numbers with the same value. Your
 * program should first prompt the user to enter the input size—i.e., the number of
 * values in the series. Here are sample runs:
 */

public class Zadatak_03_18_08 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter the number of values: ");	//unos podataka i provjera unosa
		int length = inputCheckI();
		System.out.println("Enter the values: ");	
		int[] array = createArray(length);				//kreiranje niza pomocu metode
		//ispis
		System.out.println(isConsecutiveFour(array)? "The list has consecutive fours" : "The list has no consecutive fours");

	}
	//metoda za kreiranje niza, duzina argument
	public static int[] createArray(int length) {
		int[] array = new int[length];				//inicijalizacij niza
		for (int i = 0; i < array.length; i++) {	//korisnik unosi podatke i provjera tipa
			array[i] = inputCheckI();
		}
		return array;
	}
	//metoda za provjeru da li niza sadrzi 4 uzastopna ista broja
	public static boolean isConsecutiveFour(int[] values) {
		int counter = 0;						//brojac postavljen na 0
		int element = values[0];				//prvi element niza uzet kao trenutna vrijednost za provjeru
		for(int i = 0; i < values.length; i++) {	//provjerava se od prvog elementa
			if(element == values[i]) {				//ako su elementi ist povecas brojac
				counter++;
				if(counter == 4)					//ako je brojac 4 vrati true
					return true;
			}
			else {							//ako nije isti postavi novi element za provjeru
				element = values[i];		//resetuj brojac
				counter = 1;
			}
		}
		return false;		//ako nemam uzastopna 4 ista elementa vrati false
		
	}
	
	//metoda za provjeru unesenih podataka
	public static int inputCheckI() {
		
		int unos = 0;	// pocetna vrijednost
		boolean inputCheck = true;	//kontrolna promjenljiva
		do {
			try {
				unos = input.nextInt();	//ucitavanje unosa 
				inputCheck = false;	//ako je odgovarajuceg tipa, kontrolna promjenljiva false, vrati unos									
			}
			catch (InputMismatchException ex) {	//u slucaju pogresnog unosa
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				input.nextLine();
			}
		} while (inputCheck);
		return unos;
	}
}
