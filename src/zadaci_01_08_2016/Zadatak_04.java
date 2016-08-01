package zadaci_01_08_2016;

public class Zadatak_04 {

	public static void main(String[] args) {
		// Program generise 100 nasumicnih cijelih brojeva izmedju 0 i 9 i ispisuje koliko se puta koji broj ponovio.
		
		int[] array = new int[100]; // Initializing arrays with random values
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 10);
		}
		// display array just for checking :)
		for (int i = 0; i < 100; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		int[] counter = counter(array);	// array that contains number of repeats		
		display(counter,array); // display numbers that are repeated		
	}
	// method for creating array that contains how many times each number is repeated
	/*
	 * na nasem :) niz counter je dimenzije 10, jer su brojevi od 0-9; 
	 * svaki elemenat niza predstavlja koliko se odredjeni broj ponovio puta
	 * npr na indexu 0, sadrzan je broj ponavljanja broja 0...
	 */
	public static int[] counter(int[]array) {
		int[] counter = new int[10];
		for (int i = 0; i < counter.length; i++) {
			for( int j = 0; j < array.length; j++) {
				if(i == array[j])
					counter[i]++;
			}
		}
		return counter;
	}
	/* Metoda prikazuje koliko se svaki broj puta ponovio, ako je broj ponavljanja nekog broja 0
	 * odnosno, ne pojavljuje se u nasumicno generisanom nizu, ne prikazuje taj elemenat
	 */
	public static void display(int[] counter, int []array) {
		for (int i = 0; i< counter.length; i++)
			if(counter[i] != 0) {
				System.out.printf("Broj %d se pojavljuje %d puta.\n",i+1, counter[i]);
			}
	}

}
