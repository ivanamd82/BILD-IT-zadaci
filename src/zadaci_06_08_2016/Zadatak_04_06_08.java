package zadaci_06_08_2016;

import java.util.Scanner;

public class Zadatak_04_06_08 {
	/*
	 * Napisati program koji pita korisnika da unese neki string te mu ispisuje
	 * sve karaktere koji se nalaze na neparnim pozicijama. 
	 * Na primjer, ako korisnik unese string Beijing Chicago, program vraca BiigCiao.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		//unos podataka
		System.out.println("Unesite string: ");
		String str = input.nextLine();	
		input.close();
		charOnOddPos(str);
	}
	//metoda za ispis karaktera na neparnim pozicijama
	public static void charOnOddPos(String str) {
		for(int i = 0; i < str.length(); i += 2)	//i se povecava za 2, od pocetnog indeksa 0 ispisuje svaki karakter na neparnom mjestu
			System.out.print(str.charAt(i)+"");		//odnosno gledano po indeksima na parnom, jer indeksi pocinju od 0
	}
}
