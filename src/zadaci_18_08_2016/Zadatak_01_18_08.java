package zadaci_18_08_2016;
/* 7.7 (Count single digits) Write a program that generates 100 random integers between 
 * 0 and 9 and displays the count for each number. (Hint: Use an array of ten integers,
 * say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
 */

public class Zadatak_01_18_08 {

	public static void main(String[] args) {
		
		final int LENGTH = 100;				//dimenzije niza
		int[] array = arrayRandom(LENGTH);	//kreiranje niza 
		int[] counter = counter(array);		//kreiranje niza koji sadrzi koliko se koji broj ponovio puta
		display(counter);					//ispis
	}
	//generisanje niza nasumicnih brojeva 0-9 pomocu Math.random
	public static int[] arrayRandom(int length) {
		int[]array = new int[length];	
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*10);
		}
		return array;		
	}
	
	 /*niz counter je dimenzije 10, jer su brojevi od 0-9; 
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
	public static void display(int[] counter) {
		for (int i = 0; i< counter.length; i++)
			if(counter[i] != 0) 
				System.out.printf("Broj %d se pojavljuje %d puta.\n",i, counter[i]);
	}

}

