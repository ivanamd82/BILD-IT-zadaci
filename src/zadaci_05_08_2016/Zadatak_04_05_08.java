package zadaci_05_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_04_05_08 {
	//Napisati program koji prima 10 cijelih brojeva te ih ispisuje u obrnutom redosljedu.

	public static void main(String[] args) {
		int[] array = new int[10];		// inicijalizacija niza za smjestanje brojeva
		Scanner input = new Scanner(System.in);		//unos brojeva u niz, index 0 - (array.lengh - 1)
		System.out.println("Unesite 10 cijelih brojeva: ");
		try {
			for (int i = 0; i < array.length; i++) {
				array[i]= input.nextInt();
			}
			input.close();
			System.out.println("Brojevi koje ste unijeli, u obrnutom redoslijedu su: ");
			for (int i = array.length-1; i >= 0; i--)	// prvo se prikazuje broj na zadnjem indeksu
				System.out.print(array[i]+" ");
		}
		catch (InputMismatchException ex) {
			System.out.println("Pogresan unos.");
		}
	}
}
