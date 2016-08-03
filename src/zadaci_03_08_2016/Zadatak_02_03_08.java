package zadaci_03_08_2016;

import java.util.Scanner;

public class Zadatak_02_03_08 {
	/*
	 * Metoda nalazi najmanji element u nizu decimalnih vrijednosti koristeci se sljedecim headerom:
	 * public static double min(double[ ] array)
	 * Napišite potom test program koji pita korisnika da unese deset
	 * brojeva te poziva ovu metodu da vrati najmanji element u nizu.
	 */
	public static void main(String[] args) {
		final int num = 10;
		double[] array = new double[num];
		
		Scanner input = new Scanner(System.in);
		System.out.printf("Unesite %d decimalnih brojeva: ",num);
		for (int i = 0; i < num; i++) {
			array[i] = input.nextDouble();
		}
		input.close();
		System.out.println("Najmanji broj koji ste unijeli je: "+min(array));
	}
	public static double min(double[ ] array) {
		double min = 0;
		for (int i = 0; i < array.length; i++) {
			if (min > array[i])
				min = array[i];
		}
		return min;
	}

}
