package zadaci_02_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_04_02_08 {
	/* 
	 * Metoda ispisuje nxn matricu public static void printMatrix(int n)
	 * elementi su 0 i 1, nasumicno generisani. korisnik unosi n
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite dimenziju matrice n: ");
		try {
			int n = input.nextInt(); // promjenjljiva za dimenziju matrice
			input.close();
			inputCeck(n);	// metoda za provjeru da li je n > 0
			printMatrix(n);
		}
		catch (InputMismatchException ex) {
			System.out.println("Pogresan unos.");
		}				
	}
	public static int inputCeck (int num) { //metoda za provjeru da li je n negativan br
		if (num <= 0)
			throw new InputMismatchException ("Negativan broj.");
		return num;			
	}
	public static void printMatrix(int n) {
		int[][] matrix = new int[n][n]; // inicijalizacija matrice
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
			matrix[i][j] = (int)(Math.random() * 2); // popunjavanje matrice random 0 i 1
			System.out.print(matrix[i][j]+" ");	// ispis elemenata
			}
			System.out.println();	// nakon svakog reda matrice ispis poceti u novom redu/liniji
		}

	}

}
