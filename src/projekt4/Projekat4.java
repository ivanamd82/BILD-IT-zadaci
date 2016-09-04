package projekt4;
//Oba zadatka povezana u jedan projekat

import java.util.InputMismatchException;
import java.util.Scanner;

public class Projekat4 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		//poziv metode koja ispisuje meni
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
			case 1: {			//ako je izbor 1 pozovi main metodu klase Hangman
				Hangman.main(args);;
				break;		// ponovo izpisi meni
			}
			case 2: {			// ako je izbor 2 pozovi main metodu klase Battleship
				Battleship.main(args);
				break;
			}
			case 3: {		//izlazak iz programa
				System.out.println("Pa-pa");
				break;
			}
			//u slucaju da nije izabrana ni jedna od ponudjenih opcija izvrsiti catch blok
			default: throw new InputMismatchException("Pogresan unos.");
			}								
		}
		//u slucaju pogresnog formata ulaznog podataka ispisati poruku i ponovo pozvati meni
		catch (InputMismatchException ex) {		
			System.out.println("Pogresan unos. Pokusajte ponovo: ");
			menu();	
			input.nextLine();	//ocistiti unos
		}
		System.exit(0);		//nakon izbora opcije 3 zavrsi sa programom	
		}
}
