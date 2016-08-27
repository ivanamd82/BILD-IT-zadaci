package zadaci_19_08_2016;
/* 8.22
 * (Even number of 1s) Write a program that generates a 6-by-6 two-dimensional matrix filled with 0s and 1s,
 * displays the matrix, and checks if every row and every column have an even number of 1s.
 */

public class Zadatak_05_19_08 {

	public static void main(String[] args) {
		
		int row = 6;		// redovi i kolone
		int column = 6;
		
		int[][] matrix = matrixRandom01(row,column);	//kreiranje matrice sa nasumicnim 0 i 1
		//ispis
		printMatrix(matrix);	
		System.out.println(evenNumOf1R(matrix)? "U svakom redu ima paran broj jedinica." : "U svakom redu nema paran broj jedinica.");
		System.out.println(evenNumOf1C(matrix)? "U svakoj koloni ima paran broj jedinica." : "U svakoj koloni nema paran broj jedinica.");
	}
	
	//generise matricu sa nasumicnim 0 i 1
	public static int[][] matrixRandom01(int row, int column) {
		
		int[][] matrix = new int[row][column];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int)(Math.random()*2);
			}
		}
		return matrix;
	}
	//metoda koja broji jedinice u redovima i ako u svakoj ima paran br vraca true
	public static boolean evenNumOf1R(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			int counter = 0;								//brojac podesimo na 0 za svaki novi red
			for (int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] == 1) {						//ako je elem 1 inkrementirati brojac
					counter++;
				}
			}
			if (counter % 2 != 0)			//ako nije paran vratiti false
				return false;
		}
		return true;					//ako jeste bratiti true
			
	}
	//metoda koja broji jedinice u kolonama i ako u svakoj ima paran broj vraca true
	public static boolean evenNumOf1C(int[][] matrix) {
		for (int i = 0; i < matrix[0].length; i++) {
			int counter = 0;
			for (int j = 0; j < matrix.length; j++) {
				if(matrix[j][i] == 1) {
					counter++;
				}
			}
			if (counter % 2 != 0)
				return false;
		}
		return true;
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

}
