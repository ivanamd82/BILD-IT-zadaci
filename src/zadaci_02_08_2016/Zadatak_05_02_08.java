package zadaci_02_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_05_02_08 {
	/* 
	 * Metoda prima jedan argument i simulira bacanje novcica toliko puta
	 * zatim ispisuje koliko je puta je novcic pokazao glavu, a koliko puta pismo. 
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite cijeli broj (broj bacanja novcica): "); 
		try {
			int num = input.nextInt(); // inicijalizacija promjenljive, broj bacanja novcica
			input.close();		
			inputCeck(num);		// u slucaju da je broj manji od 1, javlja pogresan unos
			coinToss(num);			
		}
		catch (InputMismatchException ex) {
			System.out.println("Pogresan unos. Morate unijeti pozitivan cijeli broj.");
		}
	}
	public static int inputCeck (int num) { // metoda za provjeru da li je broj pozitivan
		if (num <= 0)
			throw new InputMismatchException ("Negativan broj.");
		return num;			
	}
	public static void coinToss(int num) {	
		int bacanje = 0;	// inicijalizacija promjenljivih
		int glava = 0;
		
		for (int i = 0; i < num; i++) {	// simulacija bacanja novcica, random brojevi 0 i 1
			bacanje = (int)(Math.random()*2);
			if (bacanje == 0)	// ako je broj 0 onda je glava, povecati brojac
				glava++;
		}
		System.out.printf("Glava je bila %d puta, a pismo %d puta",glava,num-glava);
	}

}
