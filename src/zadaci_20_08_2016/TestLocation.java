package zadaci_20_08_2016;
/* Write a test program that prompts the user to enter a two-dimensional array
 * and displays the location of the largest element in the array.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestLocation {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		//unoos podataka
		System.out.println("Enter the number of rows and columns in the array: ");
		int row = inputCheckI();
		int column = inputCheckI();
		double[][] array = new double[row][column];
		
		//unos podataka u niz
		System.out.println("Enter the array: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = inputCheckD();
			}
		}
		input.close();
		
		//kreiranje instance
		Location location = Location.locateLargest(array);
		//ispis
		System.out.println("The location of the largest element is "+location.maxValue+" at ("+location.row+", "+location.column+")");

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
	//metoda za provjeru unesenih podataka
	public static double inputCheckD() {
		
		double unos = 0;	// pocetna vrijednost
		boolean inputCheck = true;	//kontrolna promjenljiva
		do {
			try {
				unos = input.nextDouble();	//ucitavanje unosa 
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
