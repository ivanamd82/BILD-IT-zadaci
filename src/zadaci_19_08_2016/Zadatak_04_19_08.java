package zadaci_19_08_2016;
/* 8.16
 * (Sort two-dimensional array) Write a method to sort a two-dimensional array
 * using the following header: public static void sort(int m[][])
 * The method performs a primary sort on rows and a secondary sort on columns.
 * For example, the following array
 * {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}}
 * will be sorted to
 * {{1, 1},{1, 2},{1, 7},{4, 1},{4, 2},{4, 5}}.
 */

public class Zadatak_04_19_08 {

	public static void main(String[] args) {
		
		int[][] m = {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}}; 	//2D niz
		
		sort(m);			// metoda za sortiranje
		
		printMatrix(m);		//ispis
		

	}
	//metoda za sortiranje matrice
	public static void sort(int m[][]) {
		
		for (int i = 0; i < m.length; i++) { //prvo provjeravamo da li je prvi element veci ili jednaki u podnizovima, ako je veci zammjeni mjesta
			for (int j = 0; j < m.length; j++) {
				if (m[i][0] < m[j][0]) {
					int temp[] = m[i];
					m[i] = m[j];
					m[j] = temp;
				}
				if (m[i][0] == m[j][0]);	//ako je isti onda provjeri drugi element, ako je veci zamjeni mjesta
					if(m[i][1] < m[j][1]) {
						int temp = m[i][1];
						m[i][1] = m[j][1];
						m[j][1] = temp;
					}
			}
		}
	}
	//metoda za ispisa matrice
	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
