package zadaci_27_08_2016;
/* 11.12 
 * (Sum ArrayList) Write the following method that returns the sum of all numbers
 * in an ArrayList: public static double sum(ArrayList<Double> list)
 * Write a test program that prompts the user to enter 5 numbers, stores them in an
 * array list, and displays their sum.
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_03_27_08 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		ArrayList<Double> list = new ArrayList<>(); 		//unos
		System.out.println("Unesite 5 brojeva u listu: ");
		for(int i = 0; i < 5; i++) {
			list.add(inputCheckD());
		}
		System.out.println("Suma brojeva u listi: "+sum(list));		//ispis
	}
	
	//metoda za sumu elemenata u listi
	public static double sum(ArrayList<Double> list) {
		double sum = 0;			//pocetna vrijednost promjenljive koja cuva sumu
		for (double i : list) {		//za svaki elemenat liste dodaj ga sumi
			sum += i;
		}
		return sum;		//vratiti sumu
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
