package zadaci_02_08_2016;

public class Zadatak_01_02_08 {
	/* 
	 * Program ispisuje sve prestupne god, 10 po liniji, raspon 101-2100g, odvojene jednim spaceom.
	 * Ispis i ukupnog broja godina
	 */
	public static void main(String[] args) {

		final int FIRST = 101; // vremenski period odredjen konstantama
		final int LAST = 2100;
		int counter = 0; // brojac prestupnih godina
		for (int i = FIRST; i <= LAST; i++) {
			if ((i % 400 == 0) || (i % 4 == 0 && i % 100 != 0)) { // uslov za prestupnu godinu
				System.out.print(i+" "); // ako je prestupna ispisati je
				counter++;	// brojac se povecava
				if (counter % 10 == 0) 	// ako je ispisano 10 godina preci u novi red
					System.out.println();
				
			}
		}
		System.out.printf("\nBroj prestupnih godina u periodu %d - %d god: %d",FIRST,LAST,counter);
	}

}
