package zadaci_20_08_2016;
/* 8.28
 * (Strictly identical arrays) The two-dimensional arrays m1 and m2 are strictly
 * identical if their corresponding elements are equal. Write a method that returns
 * true if m1 and m2 are strictly identical, using the following header:
 * public static boolean equals(int[][] m1, int[][] m2)
 * Write a test program that prompts the user to enter two 3 * 3 arrays of
 * integers and displays whether the two are strictly identical. 
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_02_20_08 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int[][] m1 = new int[3][3];			//inicijalizacija nizova
		int[][] m2 = new int[3][3];
		
		System.out.println("Enter list1:  ");		//unos elemenata u matricu1 i provjera
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				m1[i][j] = inputCheckI();
			}
		}
		input.nextLine();						//ocisti unos			
		System.out.println("Enter list2:  ");	//unos elemenata u matricu2 i provjera
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[i].length; j++) {
				m2[i][j] = inputCheckI();
			}
		}
		//ispis da li su nizovi potpuno identicni
		System.out.println(equals(m1,m2)? "The two arrays are strictly identical" : "The two arrays are not strictly identical");

	}
	//metoda za provjeru da li su potpuno identicni nizovi/matrice
	//ako su svi elementi na odgovarajucim mjestima jednaki onda su potpuno identicni
	public static boolean equals(int[][] m1, int[][] m2) {
		
		for (int i = 0; i < m1.length; i++) {		
			for (int j = 0; j < m1[i].length; j++) {
				if (m1[i][j] != m2[i][j])
					return false;
			}
		}
		return true;
	}
	
	//metoda za provjeru unesenih podataka
	public static int inputCheckI() {
		
		int unos = 0;	// pocetna vrijednost
		boolean inputCheck = true;	//kontrolna promjenljiva
		do {
			try {
				unos = input.nextInt();	//ucitavanje unosa
				inputCheck = false;		//ako je sve ok, kontrolna promjenljiva false, vrati unos									
			}
			catch (InputMismatchException ex) {	//u slucaju pogresnog unosa
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				input.nextLine();
			}
		} while (inputCheck);
		return unos;
	}

}
