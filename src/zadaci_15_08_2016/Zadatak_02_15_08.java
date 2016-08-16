package zadaci_15_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;
/* Napisati program koji igra sa protivnikom rock-paper-scissors.
 * (papir-bunar-makaze ili tako nekako po naški) 
 * Program nasumicno generise brojeve 0, 1 i 2 koji predstavljaju papir, bunar i makaze. 
 * Program pita korisnika da unese 0, 1 ili 2 te mu ispisuje poruku
 * da li je korisnik pobijedio, da li je racunar pobijedio ili je bilo nerijeseno.
 */

public class Zadatak_02_15_08 {
	
	static String[] names = {"scissor","rock","paper"};	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {		
		
		System.out.println("Unesite jedan od brojeva 0 (scissor), 1 (rock), 2 (paper)");	//unos podataka
		int number = inputCheck();	//provjera podataka, tip i da li je izabran jedan od ponudjenih brojeva
		input.close();
		game(number);
	}
	
	//metoda koja prestavlja igru
	public static void game(int number) {	
		
		int numberComp = (int)(Math.random()*3);	//random generisan broj za odabir kompjutera
		System.out.println("Kompjuter je "+names[numberComp]+". Ti si "+names[number]+". ");	//ispis odabira racunara i korisnika
		if (number == numberComp)		//ako su isti nerijeseno	
			System.out.println("Nerijeseno");
		else {
			//u slucaju razlicitih kombinacija switch selekcija u zavisnosti od korisnikovog odabira  i prema pravilima igre
			switch (number) {		
			case 0:	 if (numberComp == 2)				
						System.out.println("Pobjedio si.");
					 else System.out.println("Izgubio si.");break;
			case 1:  if (numberComp == 0)
						System.out.println("Pobjedio si.");
					 else System.out.println("izgubio si.");break;
			case 2:  if (numberComp == 1)
						System.out.println("Pobjedio si.");
					 else System.out.println("Izgubio si.");break;	
			default: System.out.println("Pogresan unos.");
					 System.exit(1);
			}
		}
	}
	//metoda za provjeru unosa podataka
	public static int inputCheck() {	
		int unos = -1;		//pocetna vrijednost
		boolean inputCheck = true;		//kontrolna promjenljiva
		do {							// dok nije unesen broj tip int ponavljati
			try {
				unos = input.nextInt();
				if (unos == 0 || unos ==1 || unos == 2) 	//ako unos ne odgovara ni jednom od ponudjenih
					inputCheck = false;
				else System.out.println("Pogresan unos. Pokusajte ponovo: ");
			} catch (InputMismatchException ex) {		//u slucaju pogresnog formata ulaznog podataka
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				input.nextLine();
			}
		} while (inputCheck);
		return unos;
	}

}
