package zadaci_16_08_2016;

import java.util.Scanner;
/* Napisati program koji pita korisnika da unese neki string
 * te mu ispisuje duzinu tog stringa kao i prvo slovo stringa. 
 */

public class Zadatak_02_16_08 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		System.out.println("Unesite string: ");//unos podataka
		String s = input.nextLine();
		input.close();
		//ispis duzine stringa i prvog karaktera
		System.out.println("Duzina stringa je "+s.length()+".\nPrvi karakter je "+s.charAt(0));

	}

}
