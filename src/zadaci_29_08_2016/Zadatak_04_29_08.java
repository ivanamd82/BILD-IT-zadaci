package zadaci_29_08_2016;

import java.util.Scanner;

/* 12.3
 * (ArrayIndexOutOfBoundsException) Write a program that meets the following requirements:
 * Creates an array with 100 randomly chosen integers.
 * Prompts the user to enter the index of the array, then displays the corresponding
 * element value. If the specified index is out of bounds, display the message Out of Bounds.
 */

public class Zadatak_04_29_08 {

	public static void main(String[] args) {
		
		//kreira niz sa random brojevima 
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100);
		}
		//kreira scannerobjekat
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite index elementa: ");
		//ucitava index
		int index = input.nextInt();
		input.close();
		try {
			//ispis
			System.out.printf("Element na indeksu %d je %d",index, array[index]);
		}
		//ako je unesen ne postojeci index ispis poruke
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds");
		}

	}

}
