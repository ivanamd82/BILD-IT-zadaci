package zadaci_20_08_2016;
/* 8.26
 * (Row sorting) Implement the following method to sort the rows in a two-dimensional array.
 * A new array is returned and the original array is intact.
 * public static double[][] sortRows(double[][] m)
 * Write a test program that prompts the user to enter a 3 * 3 matrix of double
 * values and displays a new row-sorted matrix.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_01_20_08 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		double[][] matrix = new double[3][3];			//inicijalizacija i unosenje podataka
		System.out.println("Enter a 3-by-3 matrix row by row:  ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = inputCheckD();
			}
		}	
		sortRows(matrix);				//sortiranje i ispis
		printMatrix(matrix);

	}
	
	// metoda za sortiranje elemenata u redovima matrice, rastuci
	public static double[][] sortRows(double[][] m) {
		int z = 0;				//promjenljiva za uslov, redovi
		while (z < m.length) {		
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[i].length-1; j++) {
					if (m[i][j] > m[i][j+1]) {			//poredi svaki elemenat u nizu sa sl i ako je veci zamjeniti mjesta
						double temp = m[i][j];
						m[i][j] = m[i][j+1] ;
						m[i][j+1] = temp;
					}
				}
			}
			z++;	//inkrementirati z
		}
		return m;	// vratiti matricu
	}
	
	//metoda za ispis matrice
	public static void printMatrix(double[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
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
