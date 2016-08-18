package zadaci_18_08_2016;
/* 8.5 (Algebra: add two matrices) Write a method to add two matrices. 
 * The header of the method is as follows:
 * public static double[][] addMatrix(double[][] a, double[][] b)
 * In order to be added, the two matrices must have the same dimensions and the
 * same or compatible types of elements. Let c be the resulting matrix.
 * Write a test program that prompts the user to enter two 3 * 3 matrices and
 * displays their sum. 
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Zadatak_05_18_08 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int row = 3;
		int column = 3;		
		
		System.out.println("Enter matrix1: ");				//unos elemenata pomocu metode
		double[][] matrix1 = createMatrix(row, column);
		System.out.println("Enter matrix2: ");
		double[][] matrix2 = createMatrix(row, column);
		
		double[][] matrix3 = addMatrix(matrix1, matrix2);	//rezultat sabiranja matrice
		
		printAddMatrix(matrix1, matrix2, matrix3);		//ispis

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
	//metoda koja sabir dvije matrice
	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] c = new double[a.length][a[0].length];		//inicijalizacija nove matrice
		for(int i = 0; i < a.length; i++) {						
			for(int j = 0; j < a[i].length; j++) 
				c[i][j] = a[i][j] + b[i][j];					//element nove matrice se dobija kao zbir elemenaya na istom mjestu
		}
		return c;
		
	}
	//ispis rezultata
	public static void printAddMatrix(double[][] a, double[][] b, double[][] c) {
		for(int i = 0; i < a.length; i++) {		 	//petlja po redovima
			for (int j = 0; j < a[i].length; j++)	//stampa prvo red prve matrice
				System.out.print(a[i][j]+" ");
			if(i == 1)								//ako je indeks reda 1, ispisi "+"
				System.out.print("\t+\t");			//ako nije ispisi razmak
			else System.out.print("\t\t");
			for (int j = 0; j < b[i].length; j++)	//stampanje reda druge matrice
				System.out.print(b[i][j]+" ");
			if(i == 1)								//ako je indeks reda 1, ispisi "="
				System.out.print("\t=\t");
			else System.out.print("\t\t");			//ako nije ispisi razmak
			for (int j = 0; j < c[i].length; j++)	//ispisi red matrice rezultata
				System.out.print(c[i][j]+" ");
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
