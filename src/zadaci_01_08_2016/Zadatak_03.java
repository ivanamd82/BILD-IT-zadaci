package zadaci_01_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_03 {

	public static void main(String[] args) {
		// Napisati metodu koja prima dva cijela broja i pronalazi najveci zajednicki djelilac
		Scanner input = new Scanner(System.in);
		// Geting input form user
		try {
			System.out.println("Unesite prvi broj: ");
			int num1 = input.nextInt();
			System.out.println("Unesite drugi broj: ");
			int num2 = input.nextInt();
			input.close();
			
			System.out.printf("Najveci zajednicki djelilac brojeva %d i %d je %d.",num1,num2,gcd(num1,num2));
		}
		catch (InputMismatchException ex) {
			System.out.println("Pogresan unos.");
		}
		
	}
	// method for greatest common divisor 
	public static int gcd(int num1, int num2) {
		int gcd = 1; // set gcd (greatest common divisor)
		for (int i = 2; i <= Math.min(num1, num2); i++) { // checking if both number are divisible with i in range 2-smaller number
			if (num1 % i == 0 && num2 % i == 0) 
				gcd = i; // if is gcd become i
		}
		return gcd;
	}
}
