package zadaci_03_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_03_03_08 {
	/*
	 *  Nizovi niz1 i niz2 su striktno identicni ukoliko su svi njihovi elementi na istim pozicijama jednaki.
	 *  Napisati metodu koja vraca true ukoliko su nizovi niz1 i niz2 striktno identicni. Koristiti sljedeci header:
	 *  public static boolean equals(int[ ] niz1, int[ ] niz2)
	 *  Napisati testni program koji pita korisnika da unese dva niza cijelih brojeva te provjerava da li su striktno identicni.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("Unesite dimenziju nizova: ");		// unos podataka od strane korisnika
			int n = input.nextInt();
			inputCeck(n);		// provjera da li je broj negativan
			System.out.println("Unesite elemente prvog niza: ");
			int[] niz1 = createArray(n);
			System.out.println("Unesite elemente druhog niza: ");
			int[] niz2 = createArray(n);
			input.close();
			// poziv metode za odredjivanje jednakosti nizova, u sklopu uslovnog izraza (da ne bude da nikad ne koristim :))
			System.out.println(equals(niz1,niz2) ? "Nizovi su striktno identicni." : "Nizovi nisu striktno identicni.");
		}
		catch (InputMismatchException ex) {
			System.out.println("Pogresan unos.");
		}

	}
	// metoda za kreiranje niza, unos od strane korisnika
	public static int[] createArray(int n) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[n];		// inicijalizacija
		for(int i = 0; i < n; i++) {	// petlja sluzi za unos elemenata matrice, pozicija elementa
			array[i] = input.nextInt();		// unos elemenata niza od strane korisnika
		}
		return array;
	}
	// metoda za provjeru jednakosti nizova
	public static boolean equals(int[] niz1, int[] niz2) {
		for (int i = 0; i < niz1.length; i++) {	// provjera svih elemenata na istim pozicijama u nizu
			if (niz1[i] != niz2[i])			// ako su elementi razliciti nizovi nisu striktno identicni
				return false;
		}
		return true;
	}
	public static int inputCeck(int num) { // metoda za provjeru unosa, u slucaju unosa negativnog broja
		if (num <= 0)
			throw new InputMismatchException ("Negativan broj.");
		return num;		
	}

}
