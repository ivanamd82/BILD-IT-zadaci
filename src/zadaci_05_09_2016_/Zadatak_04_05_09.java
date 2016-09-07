package zadaci_05_09_2016_;

import java.util.Scanner;

/* 13.17
 * (Math: The Complex class) A complex number is a number in the form a + bi,
where a and b are real numbers and i is 2-1. The numbers a and b are known
as the real part and imaginary part of the complex number, respectively. You can
perform addition, subtraction, multiplication, and division for complex numbers
using the following formulas:
 */

public class Zadatak_04_05_09 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first complex number: ");
		double firstReal = input.nextDouble();
		double firstImaginary = input.nextDouble();
		System.out.print("Enter the second complex number: ");
		double secondReal = input.nextDouble();
		double secondImaginary = input.nextDouble();
		// kreiramo objekte
		Complex c1 = new Complex(firstReal, firstImaginary);
		Complex c2 = new Complex(secondReal, secondImaginary);
		// pozivamo statican metod u klasi Complex koji izvrsava
		// sve operacije nad komoleksnim brojevima
		Complex.allOperations(c1, c2);
	}
}