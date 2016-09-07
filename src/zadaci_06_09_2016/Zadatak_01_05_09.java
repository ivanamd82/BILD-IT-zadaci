package zadaci_06_09_2016;

import java.util.Scanner;

/* 18.2
 * (Fibonacci numbers) Rewrite the fib method in Listing 18.2 using iterations.
 * Hint: To compute fib(n) without recursion, you need to obtain fib(n - 2) and fib(n - 1) first.
 * Let f0 and f1 denote the two previous Fibonacci numbers. 
 * The current Fibonacci number would then be f0 + f1. 
 * The algorithm can be described as follows:
f0 = 0; // For fib(0)
f1 = 1; // For fib(1)
for (int i = 1; i <= n; i++) {
currentFib = f0 + f1;
f0 = f1;
f1 = currentFib;
}
// After the loop, currentFib is fib(n)
Write a test program that prompts the user to enter an index and displays its
Fibonacci number.
 */

public class Zadatak_01_05_09 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite index: ");
		int index = input.nextInt();
		System.out.println("Fibonacijev broj na "+index+" indeksu je "+fib(index));
		input.close();
	}
	
	public static long fib(long index) {
	
		if (index == 0) {
			return 0;
		}
		else if (index == 1) {
			return 1;
		}
		else {
			return fib(index - 1) + fib(index - 2);
		}
	}

}
