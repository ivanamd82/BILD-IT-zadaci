package zadaci_15_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;
/* Napisati metodu koja ispisuje n x n matricu koristeci se sljedecim headerom: 
 * public static void printMatrix(int n). 
 * Svaki element u matrici je ili 0 ili 1, nasumicno generisana. 
 * Napisati test program koji pita korisnika da unese broj n te mu ispise n x n matricu u konzoli. 
 */

public class Zadatak_05_15_08 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Unesite velicinu matrice (nxn): ");	//unos dimenzije matrice
		int n = inputCheckI();
		input.close();
		
		printMatrix(n);	//pozivanje metode za generisanje matrice

	}
	//metoda koja generise matricu dimenzija nxn sa elemntima 0 i 1
	public static void printMatrix(int n) {
		
		int[][] matrix = new int[n][n];		//inicijalizacija
		for (int i = 0; i < matrix.length; i++) {			//redovi
			for (int j = 0; j < matrix[i].length; j++) {	//kolone
				matrix[i][j] = (int)(Math.random()*2);		//element matrice nasumicno generisan br 0 ili 1	
				System.out.print(matrix[i][j]+" ");			//ispis elementa
			}
			System.out.println();							//kad zavrsi red predji u novi
		}
	}
	//metoda za provjeru unosa
	public static int inputCheckI() {	
		int unos = 0;		//pocetna vrijednost
		boolean inputCheck = true;		//kontrolna promjenljiva
		do {							// dok nije unesen broj odgovarajuceg tipa ponavljati
			try {
				unos = input.nextInt();		
				if (unos <= 0) {			//ako je unesen negativan broj ili 0
					System.out.println("Pogresan unos. Pokusajte ponovo: ");
					inputCheck = true;
				}				
				else inputCheck = false;	//ako je unos ok kontrolna promjenljiva postavljena na false								
			}
			catch (InputMismatchException ex) {		//u slucaju pogresnog formata ulaznog podataka
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				input.nextLine();
			}
		} while (inputCheck);
		return unos;

	}

}
