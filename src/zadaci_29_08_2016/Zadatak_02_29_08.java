package zadaci_29_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

/* 11.17
 * (Algebra: perfect square) Write a program that prompts the user to enter an integer
 * m and find the smallest integer n such that m * n is a perfect square. (Hint:
 * Store all smallest factors of m into an array list. n is the product of the factors that
 * appear an odd number of times in the array list. For example, consider m = 90,
 * store the factors 2, 3, 3, 5 in an array list. 2 and 5 appear an odd number of times
 * in the array list. So, n is 10.) Here are sample runs:
 */

public class Zadatak_02_29_08 {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter an integer m: " );
		int m = input.nextInt();		
		int n = smallestSquare(m);
		System.out.println("The smallest number n for m * n to be a perfect square is "+n);
		System.out.println("n * m is "+n*m);

	}
	public static ArrayList<Integer> factors(int m) {
		
		ArrayList<Integer> list = new ArrayList<>();
		int i = 2;						//// promjenljiva koja predstavlja potencijalne faktore, pocetna vrijednost 2
		while (m > 1) {			// uslov za ponavljanje petlje
			if (m % i == 0) {		// ako je broj djeljiv sa brojem i, onda je i faktor tog broja
				list.add(i);
				m /= i;	
			}
			else i++;		}
		return list;
	}
	
	public static ArrayList<Integer> factorsOdd(ArrayList<Integer> list) {
		
		ArrayList<Integer> odd = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			int counter = 1;
			for (int j = 0; j < list.size(); j++) {
				if(i != j) {
					if(list.get(i) == list.get(j)) {
						counter++;
					}
				}                
            }
			if (counter % 2 != 0 && !odd.contains(list.get(i))) {
				odd.add(list.get(i));
			}
        }
		return odd;		
	}
	
	public static int multiply(ArrayList<Integer> list) {
		int num = 1;
		for (int i: list) {
			num *= i;
		}
		return num;
	}
	
	public static int smallestSquare(int m) {
		
		ArrayList<Integer> list = factors(m);
		ArrayList<Integer> odd = factorsOdd(list);
		return multiply(odd);
	}
}
