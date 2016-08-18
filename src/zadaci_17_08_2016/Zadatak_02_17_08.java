package zadaci_17_08_2016;
/* Napisati program koji prima karakter te vraca njegov Unicode. 
 * Primjer: ukoliko korisnik unese karakter E program mu vraca 69 kao unicode za taj karakter.
 */

import java.util.Scanner;

public class Zadatak_02_17_08 {	

	public static void main(String[] args) {		
		
		Scanner input = new Scanner(System.in);			//unos podataka
		System.out.println("Unesite jedan karakter: ");		
		int slovo = (int)input.next().charAt(0);		//karakter nkoji je prvi unesen (char) je konvertovan u int, tj unicode kod
		input.close();
		System.out.println("Unikod znak: "+slovo);		//ispis		
	}

}
