package zadaci_19_08_2016;
/* 8.6
 * (Algebra: multiply two matrices) Write a method to multiply two matrices. The
 * header of the method is:
 * public static double[][]
 * multiplyMatrix(double[][] a, double[][] b)
 * To multiply matrix a by matrix b, the number of columns in a must be the same as
 * the number of rows in b, and the two matrices must have elements of the same or
 * compatible types. Let c be the result of the multiplication. Assume the column size
 * of matrix a is n. Each element cij is ai1 * b1j + ai2 * b2j + ... + ain * bnj.
 * For example, for two 3 * 3 matrices a and b, c is cij = ai1 * b1j + ai2 * b2j + ai3 * b3j.
 * Write a test program that prompts the user to enter two 3 * 3 matrices and displays their product.
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Zadatak_02_19_08 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int row = 3;			//dimenzije matrica
		int column = 3;		
		
		System.out.println("Enter matrix1: ");				//unos elemenata pomocu metode
		double[][] matrix1 = createMatrix(row, column);
		input.nextLine();							//ocistiti input, u slucaju da korisnik upise vise od 9 brojeva razdvojeni spaceom
		System.out.println("Enter matrix2: ");
		double[][] matrix2 = createMatrix(row, column);
		
		double[][] matrix3 = multiplyMatrix(matrix1, matrix2);	//rezultat sabiranja matrice
		
		printMultiMatrix(matrix1, matrix2, matrix3);		//ispis
	}
	
	//metoda za unos elemenata matrice
	public static double[][] createMatrix(int row, int column) {
		double[][] matrix = new double[row][column];			//inicijalizacija
		for (int i = 0; i < matrix.length; i++) {				//redovi
			for (int j = 0; j < matrix[i].length; j++) 			//kolone u datom redu
				matrix[i][j] = inputCheckD();					//unos elemnata
		}
			return matrix;
	}
	
	//dobijanje matrtice koja je rzeultat mnozenja dvije matrice
	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		double[][] matrix = new double [a.length][a[0].length];		//inicijalizacija
		for (int i = 0; i < matrix.length; i++) {					
			for (int j = 0; j < matrix[i].length; j++)	
				//element nove matrice se dobija po formuli
				matrix[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j] + a[i][2] * b[2][j]; 
		}
		return matrix;
	}
	//ispis rezultata
	public static void printMultiMatrix(double[][] a, double[][] b, double[][] c) {
		for(int i = 0; i < a.length; i++) {		 	//petlja po redovima
			for (int j = 0; j < a[i].length; j++)	//stampa prvo red prve matrice
				System.out.print(a[i][j]+" ");
			if(i == 1)								//ako je indeks reda 1, ispisi "*"
				System.out.print("\t*\t");			//ako nije ispisi razmak
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
