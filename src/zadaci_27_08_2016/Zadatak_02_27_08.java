package zadaci_27_08_2016;
/* 11.11
 * (Sort ArrayList) Write the following method that sorts an ArrayList of numbers:
 * public static void sort(ArrayList<Integer> list)
 * Write a test program that prompts the user to enter 5 numbers, stores them in an
 * array list, and displays them in increasing order.
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_02_27_08 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>(); 		//unos
		System.out.println("Unesite 5 brojeva u listu: ");
		for(int i = 0; i < 5; i++) {
			list.add(inputCheckI());
		}
		System.out.println("Sortirana lista: ");	//ispis i pozivanje metode za sortiranje
		sort(list);

	}
	/*metoda za sortiranje elemenata u listi u rastucem redosledu
	 * prvo prvi element poredi sa sledecim i ako je manji zamjeniti mjesta i tako za sve elemente
	 */	
	public static void sort(ArrayList<Integer> list) {
		for (int i = 0; i < list.size()-1; i++) {
			for (int j = 0; j < list.size()-1; j++) {
				if (list.get(j) > list.get(j+1)) {
					int temp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, temp);
				}					
			}			
		}
		//ispis
		for(int i : list) {
			System.out.print(i+" ");
		}
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
