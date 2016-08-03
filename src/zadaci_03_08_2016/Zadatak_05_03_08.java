package zadaci_03_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_05_03_08 {
	/*
	 * Implementirati sljedecu metodu da sortira redove u 2D nizu.
	 * public static double[ ][ ] sortRows(double[ ][ ] array)
	 * Napisati testni program koji pita korisnika da unese 3x3 matricu
	 * (ili da pita korisnika koliku matricu zeli unijeti)
	 * te mu ispisuje na konzoli matricu sa sortiranim redovima - od najmanjeg broja do najveceg.
	 */
	public static void main(String[] args) {	
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Unesite dimenzije matrice: ");	// unos dimenzija od strane korisnika
			int row = input.nextInt();
			inputCeck(row);			// provjera za negativan broj
			int column = input.nextInt();
			inputCeck(column);		// provjera za negativan broj
			System.out.println("Unesite elemente matrice: ");
			double[][] matrix = createMatrix(row, column);	//poziv metode za unos elemenata matrice
			input.close();
			matrix = sortRows(matrix);	// poziv metode za sortiranje elemenata u redovima
			printMatrix(matrix);	// ispis sortirane matrice	
		}
		catch (InputMismatchException ex) {
			System.out.println("Pogresan unos.");
		}
	}		
	public static double[][] createMatrix(int row, int column) {	//metoda za unos elemenata u matricu
		Scanner input = new Scanner(System.in);
		double[][] matrix = new double[row][column];
		for (int i = 0; i < matrix.length; i++) {	// petlja sluzi za unos elemenata matrice, pozicija elementa
			for (int j = 0; j < matrix[i].length; j++)
				matrix[i][j] = input.nextDouble();
		}
		return matrix;
	}	
	public static double[][] sortRows(double[][] array) {	// metoda za sortiranje elemenata u redovima 
		for (int row = 0; row < array.length; row++) {		// glavna petlaj ide po redovima
			for (int i = 0; i < array[row].length - 1; i++) {	// od pocetnog elemnta do predzadnjeg, nema smisla porediti sam sa sobom
				for (int j = i+1; j < array[row].length; j++) {	// poredi sa sledecim elementom 
					if ( array[row][i] > array[row][j]) {		// ako je element veci od sledeceg zamjeniti mjesta
						double temp = array[row][i];
						array[row][i] = array[row][j];
						array[row][j] = temp;
					}
				}
			}
		}
		return array;
	}
	public static void printMatrix(double matrix[][]) {		// ispis matrice
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++)
				System.out.print(matrix[i][j]+" ");
			System.out.println();
		}
	}
	public static int inputCeck(int num) { // metoda za provjeru unosa, u slucaju unosa negativnog broja
		if (num <= 0)
			throw new InputMismatchException ("Negativan broj.");
		return num;		
	}
}
