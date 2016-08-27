package zadaci_19_08_2016;
/* 8.10
 * (Largest row and column) Write a program that randomly fills in 0s and 1s into
 * a 4-by-4 matrix, prints the matrix, and finds the first row and column with the
 * most 1s. Here is a sample run of the program:
 * 0011
 * 0011
 * 1101
 * 1010
 * The largest row index: 2
 * The largest column index: 2
 */

public class Zadatak_03_19_08 {

	public static void main(String[] args) {
		
		int row = 4;				//kolene i redovi
		int column = 4;

		int[][] matrix = matrixRandom01(row,column);	//kreiranje matrice sa 0 i 1
		printMatrix(matrix);							//ispis
		
		System.out.printf("The largest row index: %d\nThe largest column index: %d",largestRow(matrix),largestColumn(matrix));

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
	//metoda pronalazi red sa najvecom sumom
	public static int largestRow(int[][] matrix) {
		int index = 0;			//pocetna vrijednost indeksa je prvi red
		int max = 0;			//pocetna vrijednost reda sa najvecom sumom 
		for (int i = 0; i < matrix.length; i++) {
			int sum = 0;		//sumu postavljamo na 0 sa svakim novim redom
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];		//dodavanje elemenata sumi
				if (max < sum) {			//ako je max manji od sume postavljanje novog max i promjena indexa
					max = sum;
					index = i;
				}
			}
		}
		return index;	//vraca index reda sa najvecom sumom
	}
	//metoda pronalazi kolonu sa najvecom sumom
	public static int largestColumn(int[][] matrix) {	
		int index = 0;			//pocetna vrijednost indeksa je prva kolona
		int max = 0;			////pocetna vrijednost kolona sa najvecom sumom 
		for (int i = 0; i < matrix[0].length; i++) {
			int sum = 0;				//sumu postavljamo na 0 sa svakom novom kolnom
			for (int j = 0; j < matrix.length; j++) {
				sum += matrix[j][i];			//dodavanje elementa sumi
				if (max < sum) {				//ako je max manji od sume postavljanje novog max i promjena indexa
					max = sum;
					index = i;
				}
			}
		}
		return index;			//vraca index kolone sa najvecom sumom
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
