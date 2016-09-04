package projekt4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Projekat4 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		menu();
		
	}
	public static void menu() {
		//ispisi meni
		System.out.println("\nIzaberite opciju: \n");
		System.out.println("1. Hangman - vjesala\n2. Battleship - brodici \n3. Izlaz");
		String[] args = {};
				
		try {		
			int izbor = input.nextInt();	//izbor meni
			switch(izbor) {	
			case 1: {				//ako je izbor 1 pozovi funkciju za prikaz kalendara,
			Hangman.main(args);;
			menu(); break;		// ponovo izpisi meni
			}
			case 2: {				// ispisi napomene i ponovo prikazi meni
			Battleship.main(args);
			System.out.println();
			menu(); break;
			}
			case 3: {		//izlazak iz programa
			System.out.println("Pa-pa");
			break;
			}
			default: throw new InputMismatchException("Pogresan unos.");//u slucaju da nije izabrana ni jedna od ponudjenih opcija
			}															//izvrsiti catch blok
		}
		catch (InputMismatchException ex) {		//u slucaju pogresnog formata ulaznog podataka ispisati poruku i ponovo pozvati meni
			System.out.println("Pogresan unos. Pokusajte ponovo: ");
			menu();	
			input.nextLine();	//ocistiti unos
		}
		System.exit(0);		//nakon izbora opcije 5 zavrsi sa programom	
		}
}
