package zadaci_10_08_2016;

import java.util.Scanner;

public class Zadatak_05_10_08 {
	/* Napisati program koji pita korisnika da unese dva stringa
	 * te provjerava i ispisuje da li je drugi string substring prvog stringa. 
	 * Na primjer, ukoliko korisnik unese ABCD kao prvi string a BC kao drugi string
	 * program mu ispisuje da je BC substring ABCD stringa.
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		//unosa podataka
		System.out.println("Unesite prvi string: ");
		String s1 = input.nextLine();
		System.out.println("Unesite drugi string: ");
		String s2 = input.nextLine();
		input.close();
		
		if (s1.contains(s2))		//provjera da li s1 sadrzi s2, ako je true sadrzi, ako je false ne
			System.out.println("Drugi string je sadrzan u prvom.");		
		else System.out.println("Drugi string nije sadrzan u prvom.");
	}
}
