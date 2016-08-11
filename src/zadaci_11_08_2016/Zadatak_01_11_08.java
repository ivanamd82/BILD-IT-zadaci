package zadaci_11_08_2016;

import java.util.Scanner;

public class Zadatak_01_11_08 {
	/* Napisati program koji pita korisnika da unese imena tri grada te ih ispise u abecednom redu.
	 * Na primjer, ukoliko korisnik unese Chicago, Los Angeles i Atlanta kao gradove, 
	 * program vraca Atlanta, Chicago, Los Angeles.
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite prvi grad: ");
		String city1 = input.nextLine();
		System.out.println("Unesite drugi grad: ");
		String city2 = input.nextLine();
		System.out.println("Unesite treci grad: ");
		String city3 = input.nextLine();
		input.close();
		String temporary = "";
		
		if (city1.compareToIgnoreCase(city2) > 0) {
			temporary = city1;
			city1 = city2;
			city2 = temporary;
		}
		if (city1.compareToIgnoreCase(city3) > 0) {
			temporary = city1;
			city1 = city3;
			city3 = temporary;
		}
		if (city2.compareToIgnoreCase(city3) > 0) {
			temporary = city2;
			city2 = city3;
			city3 = temporary;
		}
		System.out.printf("Gradovi poredani po abecednom redoslijedu: %s, %s, %s.", city1, city2, city3);
	}

}
