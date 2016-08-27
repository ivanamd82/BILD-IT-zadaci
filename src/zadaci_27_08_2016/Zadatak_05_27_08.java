package zadaci_27_08_2016;
/* 11.14 
 * (Combine two lists) Write a method that returns the union of two array lists of integers using 
 * the following header: public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2)
 * For example, the union of two array lists {2, 3, 1, 5} and {3, 4, 6} is {2, 3, 1, 5, 3, 4, 6}. 
 * Write a test program that prompts the user to enter two lists, each with five integers, and displays their union.
 * The numbers are separated by exactly one space in the output.
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_05_27_08 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter five integers for list1: ");	//unos podataka u listu1 i provjera tipa pomocu metode
		ArrayList<Integer> list1 = new ArrayList<>(); 
		for(int i = 0; i < 5; i++) {
			list1.add(inputCheckI());
		}
		input.nextLine();	// ocistiti input u slucaju da korisnik unese vise od 5 brojeva razmaknuti spaceom, da se ne prenose u sl listu
		
		System.out.println("Enter five integers for list2: "); //unos podataka u listu2 i provjera tipa pomocu metode
		ArrayList<Integer> list2 = new ArrayList<>(); 
		for(int i = 0; i < 5; i++) {
			list2.add(inputCheckI());
		}
		System.out.println("The combined list is: ");
		ArrayList<Integer> list3 = union(list1, list2);		//treca lista kao kombinacija prve dvije, ispis
		for (int i : list3) {
			System.out.print(i+" ");
		}
	}
	//metoda koja kreira tecu listu kao kombinaiju prve dvije
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		ArrayList<Integer> list3 = new ArrayList<>();	//inicijalizacija
		for (int i : list1) {			//svaki elemenat liste 1 dodaj u novu listu
			list3.add(i);
		}
		for (int i : list2) {			//svaki elemenat liste 2 dodaj u novu listu
			list3.add(i);
		}
		return list3;
	}

	//metoda za provjeru unosa
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
