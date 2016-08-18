package zadaci_18_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;
/* 8.1 (Sum elements column by column) Write a method that returns the sum of all the
 * elements in a specified column in a matrix using the following header:
 * public static double sumColumn(double[][] m, int columnIndex)
 * Write a test program that reads a 3-by-4 matrix and displays the sum of each
 * column. Here is a sample run:
 * Enter a 3-by-4 matrix row by row:
 * 1.5 2 3 4
 * 5.5 6 7 8
 * 9.5 1 3 1
 * Sum of the elements at column 0 is 16.5
 * Sum of the elements at column 1 is 9.0
 * Sum of the elements at column 2 is 13.0
 * Sum of the elements at column 3 is 13.0
 */

public class Zadatak_04_18_08 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int row = 3;							//broj redova i kolona
		int column = 4;
		System.out.println("Enter a 3-by-4 matrix row by row: ");	//unos elemenata matrice pomocu metode
		double[][] matrix = createMatrix(row, column);
		displaySumColumn(matrix);									//ispis sume po kolonama
	}
	
	//metoda za unos elemenata matrice
	public static double[][] createMatrix(int row, int column) {
		double[][] matrix = new double[row][column];			//inicijalizacija
		for (int i = 0; i < matrix.length; i++) {				//redovi
			for (int j = 0; j < matrix[i].length; j++) {		//kolone u datom redu
				matrix[i][j] = inputCheckD();					//unos elemnta
			}
		}
		return matrix;
	}
	//metoda racuna sumu elemenata u koloni
	public static double sumColumn(double[][] m, int columnIndex) {
		int sum = 0;							//pocetna vrijednost
		for (int i = 0; i < m.length; i++) {	//petlja ide od redovima
			sum += m[i][columnIndex];			//sumi se dodaje svaki elemenat u koloni
		}
		return sum;		
	}
	
	//ispis svih suma u matrici
	public static void displaySumColumn(double[][] matrix) {
		for (int i = 0; i < matrix[0].length; i++) 
			System.out.println("\nSum of the elements at column "+i+" is "+sumColumn(matrix,i));
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

