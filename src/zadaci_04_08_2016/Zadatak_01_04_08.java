package zadaci_04_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_01_04_08 {
	/*
	 * Napisati program koji pita korisnika da unese neki cijeli broj 
	 * te ispisuje njegove najmanje faktore u rastucem redosljedu. 
	 * Npr, ukoliko korisnik unese 120 program treba da ispise 2, 2, 2, 3, 5. (2 * 2 * 2 * 3 * 5 = 120)
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	// unos podataka od strane korisnika
		System.out.println("Unesit cijeli broj: ");
		boolean inputCheck = true;	//promljenljiva za petlju kod pogresnog inputa, dok je true ponavljati unos
		do {
			try {
				int num = input.nextInt();
		
				int i = 2;	// promjenljiva koja predstavlja faktore, pocetna vrijednost 2
				System.out.println("Najmanji faktori broja "+num+" u rastecem redosledu: ");
				if (num < 0) {		// ako je broj negativan print "-" i dalje koristi absolutnu vrijednost broja
					System.out.print("-");
					num = Math.abs(num);
				}
				while (num > 1) {		// uslov za ponavljanje petlje
					if (num % i == 0) {		// ako je broj djeljiv sa brojem i, onda je i faktor tog broja
						num = num / i;		// promjenljiivoj dodjeli vrijednost broj podjeljen sa faktorom
						System.out.print(i+" ");	// ispisi faktor
					}
					else i++;	// mako broj nije djeljiv sa i povecaj vrijednos i za 1
							// i ispituj ponovo da li je taj broj djeljiv sa novim brojem i
				}
				inputCheck = false;		//promjena uslova za izlazak iz petlje
			}
			catch (InputMismatchException ex) {		//u slucaju pogresnog unosa	ispisati poruku
				System.out.println("Pogresan unos.\nUnesite cijeli broj: ");
				input.nextLine();
			}
		} while(inputCheck);
		input.close();
	}

}
