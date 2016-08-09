package zadaci_08_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_01_08_08 {
	/*
	 * Napisati program koji ispisuje tri nasumicna cijela broja te pita korisnika da unese njihov zbir.
	 * Ukoliko korisnik pogrijesi, program ispisuje pitanje ponovo sve sa porukom da pokusa ponovo.
	 * Ukoliko korisnik unese tacan odgovor, program mu cestita i zavrsava sa radom. 
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		int num1 = (int)(Math.random() * 10);	//tri nasumicna broja
		int num2 = (int)(Math.random() * 10);
		int num3 = (int)(Math.random() * 10);
		boolean inputCheck = true;
		System.out.printf("Koliko je %d + %d + %d ? ",num1,num2,num3); //Ispis pitanja
		do {
			try {
				int answer = input.nextInt();	//ucitati odgovor
				while (num1+num2+num3 != answer) {	//sve dok odgovor nije tacan, pitati ponovo
					System.out.printf("Odgovor nije tacan! Pokusajte ponovo.\nKoliko je %d + %d +%d ? ",num1,num2,num3);
					answer = input.nextInt();	//ucitati odgovor
				}
				System.out.println("Cestitamo. Odgovor je tacan.");	//ako je odgovor tacan ispis poruke
				inputCheck = false;
			}
			catch (InputMismatchException ex) {	// ako je unesen pogresan tip podataka ispis poruke
				System.out.println("Pogresan unos. Morate unijeti cijeli broj.");
				input.nextLine();
			}
		} while (inputCheck);
		input.close();
	}

}
