package zadaci_07_09_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/* 18.13
 * (Find the largest number in an array) Write a recursive method that returns the
 * largest integer in an array. Write a test program that prompts the user to enter a
 * list of eight integers and displays the largest element.
 */

public class Zadatak_05_07_09 {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		//kreiranje liste
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Unesite 5 cijelih brojeva: ");
		for(int i = 0; i < 5; i++) {
			int num = inputCheckI();
			list.add(num);
		}
			
		System.out.println(list);
		System.out.println("Najveci broj koji ste unijeli je "+max(list));

	}
	//metoda trazi max element u listi
	public static int max(ArrayList<Integer> list) {
		//postavlja prvi element kao max
		int max = list.get(0);
		int temp = 0;
		//ako lista ima jedan elementa on je max
		if (list.size() == 1) {
			return list.get(0);
		}
		else {
			/*
			 * poredi sve elemente sa trenutnim max, ako nadje veci dodjeljije njegovu vrijednost temp
			 * ako je najveci broj trenutni max njega vraca
			 */
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) > max) {
					temp = list.get(i);
				}
			}
				if (max > temp)
					return max;
			
		}
		//ako nije nadjen max, izbacuje element iz liste i ponovo poziva metodu
		list.remove(0);
		return max(list);
	}
	//metoda za provjeru unosa
	public static int inputCheckI() {
		
		int unos = 0;	// pocetna vrijednost
		boolean inputCheck = true;	//kontrolna promjenljiva
		do {
			try {
				unos = input.nextInt();	//ucitavanje unosa i provjera da ok tip
				inputCheck = false;	//ako je sve ok, kontrolna promjenljiva false, vrati unos									
			}
			catch (InputMismatchException ex) {	//u slucaju pogresnog unosa
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				input.nextLine();
			}
		} while (inputCheck);
		return unos;
	}


}
