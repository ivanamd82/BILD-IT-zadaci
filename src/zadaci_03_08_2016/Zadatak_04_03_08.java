package zadaci_03_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_04_03_08 {
	/*
	 * Napisati metodu koja vraca lokaciju najveceg elementa u 2D nizu. Metoda treba da koristi sljedeci header:
	 * public static int[ ] locateLargest(double[ ][ ] a)
	 * Napisati test program koji pita korisnika da unese 2D niz te mu ispisuje lokaciju najveceg elementa u nizu.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// unos od strane korisnika, u slucaju pogresnog unosa javlja poruku.
		try {
			System.out.println("Unesite broj redova niza: ");
			int row = input.nextInt();
			inputCeck(row);		// provjera da li je broj redova negativan
			System.out.println("Unesite broj kolona: ");
			int column = input.nextInt();
			inputCeck(column);		// provjera da li je broj kolona negativan
			System.out.println("Unesite elemente matrice: ");
			double[][] matrix = createMatrix(row, column);	// metoda za unos elemenata matrice
			input.close();
			printMatrix(matrix);	// prikaz matrice
			int[] element = locateLargest(matrix);		// dodjeljivanje vrijednosti promljenljivoj koja sadrzi lokaciju najveceg elementa
			System.out.printf("Lokacija najveceg elementa u matrici je (%d,%d)",element[0],element[1]);
		}
		catch (InputMismatchException ex) {
			System.out.println("Pogresan unos.");
		}
	}
	public static double[][] createMatrix(int row, int column) {	//maetoda za unos elemenata matrice
		Scanner input = new Scanner(System.in);
		double[][] matrix = new double[row][column];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++)
				matrix[i][j] = input.nextDouble();
		}
		return matrix;
	}
	public static void printMatrix(double matrix[][]) {		//metoda za ispis matrice
		for (int i = 0; i < matrix.length; i++) {		// petlja sluzi za unos elemenata matrice, pozicija elementa
			for (int j = 0; j < matrix[i].length; j++)
				System.out.print(matrix[i][j]+" ");
			System.out.println();
		}
	}
	public static int[ ] locateLargest(double[][] a) {	// odredjivanje najveceg elementa u matrici
		int[] element = new int[2];		//inicijalizacija promjenljiv za cuvanje lokacije
		double max = a[0][0];		// prvi elemenat postavljen kao trenutno najveci
		for (int i = 0; i < a.length; i++) {	// pretraga u matrici
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > max) {	// ako je element veci od trenutnog max
					max = a[i][j];		// max dodjeljujemo vrijednost tog elementa
					element[0] = i;		// nove kordinate za lokaciju
					element[1] = j;
				}					
			}
		}
		return element;
	}
	public static int inputCeck(int num) { // metoda za provjeru unosa, u slucaju unosa negativnog broja
		if (num <= 0)
			throw new InputMismatchException ("Negativan broj.");
		return num;		
	}
}
