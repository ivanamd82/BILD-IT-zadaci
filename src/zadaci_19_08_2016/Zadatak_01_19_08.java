package zadaci_19_08_2016;
/* 8.4
 * (Compute the weekly hours for each employee) Suppose the weekly hours for all
 * employees are stored in a two-dimensional array. Each row records an employee’s
 * seven-day work hours with seven columns. For example, the following
 * array stores the work hours for eight employees. Write a program that displays
 * employees and their total hours in decreasing order of the total hours.
 * 		   Su M T W Th F Sa
 * Employee 0 2 4 3 4 5 8 8
 * Employee 1 7 3 4 3 3 4 4
 * Employee 2 3 3 4 3 3 2 2
 * Employee 3 9 3 4 7 3 4 1
 * Employee 4 3 5 4 3 6 3 8
 * Employee 5 3 4 4 6 3 4 4
 * Employee 6 3 7 4 8 3 8 4
 * Employee 7 6 3 5 9 2 7 9
 */

public class Zadatak_01_19_08 {

	public static void main(String[] args) {
		
		// radi lakseg testiranja odmah uneseni radni sati radnika u matricu 8x7
		int[][] employees = {
				{2, 4, 3, 4, 5, 8, 8},
				{7, 3, 4, 3, 3, 4, 4},
				{3, 3, 4, 3, 3, 2, 2},
				{9, 3, 4, 7, 3, 4, 1},
				{3, 5, 4, 3, 6, 3, 8},
				{3, 4, 4, 6, 3, 4, 4},
				{3, 7, 4, 8, 3, 8, 4},
				{6, 3, 5, 9, 2, 7, 9}};
		
		/* 2d niz hours koji cuva ukupan broj radni sat za svakog radnika i njegov redni broj, 
		 * koji je prenesen kao redni broj iz niza employees
		 * prvi elemenat je redni broj, drugi je ukupan broj sati u toku sedmice
		*/
		int[][] hours = new int [employees.length][2];
		for (int i = 0; i < hours.length; i++) {
			hours[i][0] = i;
			hours[i][1] = hours(employees[i]);	//poziv metode za izracunavanje ukupnog broja sati
		}
		
		hours = sortMatrix(hours);	//sortiranje niza u opadajucem redosledu pomocu metode
		//ispis
		System.out.println("Employee   Hours");
		System.out.println("----------------");
		for (int i = 0; i < hours.length; i++) {
			System.out.print("Employee ");
			for (int j = 0; j < hours[0].length; j++) {
				System.out.print(hours[i][j]+"   ");;
			}
			System.out.println();
		}	

	}
	
	// metoda za izracunavanje sume sati u toku sedmice za svakog zaposlenika
	public static int hours(int[] employee) {
		int hours = 0;
		for (int i = 0; i < employee.length; i++) {
			hours += employee[i];
		}
		return hours;
	}
	
	// metoda za sortiranje u opadajucem redosledu, u odnosu na broj sati
	public static int[][] sortMatrix(int[][] matrix) {
		int i = 0;
		while(i < matrix.length) {				//uslov za ponavljanje - broj redova
			for (int j = 0; j < matrix.length-1; j++) {		
				if(matrix[j][1] < matrix[j+1][1]) {		//poredi elemente u koloni sa satima
					int temporary1 = matrix[j][1];		//ako je manji zamjeni mjesta tim elementima, kao i pratece indekse radnika
					matrix[j][1] = matrix[j+1][1];
					matrix[j+1][1] = temporary1;
					int temporary2 = matrix[j][0];
					matrix[j][0] = matrix[j+1][0];
					matrix[j+1][0] = temporary2;
				}
			}
			i++;
		}
		return matrix;
	}

}
