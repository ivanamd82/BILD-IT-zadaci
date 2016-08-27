package zadaci_27_08_2016;
/* 11.13
 * (Remove duplicates) Write a method that removes the duplicate elements from
 * an array list of integers using the following header:
 * public static void removeDuplicate(ArrayList<Integer> list)
 * Write a test program that prompts the user to enter 10 integers to a list and displays
 * the distinct integers separated by exactly one space. Here is a sample run:
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_04_27_08 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Unesite 10 cijelih brojeva: ");		//unos podataka u array listu
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(inputCheckI());
		}
		System.out.println("Lista bez duplih elemenata: ");		//ispis
		removeDuplicate(list);
	}
	
	//metoda koja izbacuje duplikate iz liste
	public static void removeDuplicate(ArrayList<Integer> list) {
		
		for (int i = 0; i < list.size()-1; i++) {			//poredi element sa sledecim 
			for (int j = i+1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {		//ako su jednaki izbacuje dupli element
					list.remove(j);							//i dekrementira j jer su indeksi u listi dinamicni (ili kako se vec to zove)
					j--;								
				}
			}
		}
		for (int i : list) {
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
