package zadaci_27_08_2016;
/* 11.9 
 * (Largest rows and columns) Write a program that randomly fills in 0s and 1s into an n-by-n matrix,
 * prints the matrix, and finds the rows and columns with the most 1s. 
 * (Hint: Use two ArrayLists to store the row and column indices with the most 1s.)
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_01_27_08 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter the array size n: ");		//unos dimenzije matrice i provjera
		int n = inputCheckI();
		int[][] matrix = matrixRandom01(n);					//poziv metode za generisanje matrice 
		System.out.println("The random array is ");			//ispis matrice
		printMatrix(matrix);
		
		largest(matrix);		//poziv metode koja ispisuje index redova i kolona sa najvecim brojem jedinica
	}	
	
	//generise matricu dimenzija nxn sa nasumicnim 0 i 1
	public static int[][] matrixRandom01(int n) {
		
		int[][] matrix = new int[n][n];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int)(Math.random()*2);
			}
		}
		return matrix;
	}
	//metoda za ispis matrice
	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	//metoda za ispis indeksa najveceg reda i kolone
	public static void largest(int[][] matrix) {
		ArrayList<Integer> listR = new ArrayList<>();	//liste za cuvanje indeksa redova i kolona sa najvise 1
		ArrayList<Integer> listC = new ArrayList<>();
		int maxR = 0;									//pocetne vrijednosti za trenutno najveci red i kolonu
		int maxC = 0;
		for (int i = 0; i < matrix.length; i++) {		
			int sumR = 0;									//sume u redu i koloni postavljamo na 0 pri svakom novom redu, odn koloni
			int sumC = 0;
			for (int j = 0; j < matrix[i].length; j++) {	//sumi dodaj vrijednos elementa
				sumR += matrix[i][j];
				sumC += matrix[j][i];
			}
			if (maxR < sumR) {		//ako je trenutno max br 1 u redu manji od sume 1 u trenutnom redu
				listR.clear();		//ocisti listu i dodaj joj novu vrijednost max, tj index novog reda sa najvecim brojem 1
				maxR = sumR;
				listR.add(i);
			}
			else if (sumR == maxR)	//ako je trenutno max br 1 u redu jednak sumi 1 u trenutnom redu
				listR.add(i);		//listi dodaj i indeks tog reda
			if (maxC < sumC) {
				listC.clear();		//analogno provjeri za redove tako i za kolone
				maxC = sumC;
				listC.add(i);
			}
			else if (sumC == maxC)
				listC.add(i);	
		}
		//ispis
		System.out.print("\nThe largest row index: "); 
		for (int i : listR) {
			System.out.print(i+" ");
		}		
		System.out.print("\nThe largest column index: ");
		for (int i : listC) {
			System.out.print(i+" ");
		}
	}
	
	//metoda provjerava da li je broj odgovarajuceg tipa 
	public static int inputCheckI() {
		
		int unos = 0;	// pocetna vrijednost
		boolean inputCheck = true;	//kontrolna promjenljiva
		do {
			try {
				unos = input.nextInt();	//ucitavanje unosa i provjera da li je pozitivan
				if (unos < 0) {
					System.out.println("Pogresan unos. Pokusajte ponovo: ");	//ako nije ispisi poruku
					inputCheck = true;
				}				
				else inputCheck = false;	//ako je sve ok, kontrolna promjenljiva false, vrati unos									
			}
			catch (InputMismatchException ex) {	//u slucaju pogresnog unosa
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				input.nextLine();
			}
		} while (inputCheck);
		return unos;
	}
	
}
