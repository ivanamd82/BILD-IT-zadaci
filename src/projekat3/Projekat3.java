package projekat3;
//Oba zadatka povezana u jedan projekat

import java.util.InputMismatchException;
import java.util.Scanner;

public class Projekat3 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		//poziv metode koja ispisuje meni
		menu();
		
	}
	public static void menu() {
		//ispisi meni
		System.out.println("\nIzaberite opciju: \n");
		System.out.println("1. TicTacToe\n2. Connect Four\n3. Izlaz");
		String[] args = {};
				
		try {		
			int izbor = input.nextInt();	//izbor meni
			switch(izbor) {	
			case 1: {				//ako je izbor 1 pozovi main metodu klase TicTacToe
				TicTacToe.main(args);	
				break;		
			}
			case 2: {				// ako je izbor dva pozovi main metodu klase ConnectFour
				ConnectFour.main(args);
				break;
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
		System.exit(0);		//nakon izbora opcije 3 zavrsi sa programom	
		}
}
