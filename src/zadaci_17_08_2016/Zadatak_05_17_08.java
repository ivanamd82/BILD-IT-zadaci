package zadaci_17_08_2016;
/* Napisati program koji ucitava 10 brojeva te ispisuje koilko je jedinstvenih brojeva unijeto
 * te sve jedinstvene brojeve koji su unijeti, razmaknute jednim spaceom. 
 * Ukoliko se neki broj pojavljuje vise puta, broj treba ispisati samo jednom. 
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_05_17_08 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int[] array = new int[10];					//inicijalizacija niza
		int counter = 0;							//brojac razlicitih brojeva
		
		System.out.println("Unesite 10 cijelih brojeva: ");
		
		for (int i = 0; i < array.length; i++) {		//unos brojeva
			int number = inputCheckI();					
			if(isDistinct(number,counter,array)) {		//za svaki broj koji korisnik unese provjerava se da li je vec unesen
				array[counter]= number;					//ako nije unosi se taj broj na indeks koji je odredjen brojacem
				counter++;								//povecati brojac
			}
		}
		input.close();
		
		System.out.println("Broj razlicitih brojeva je "+counter+".");	//ispis koliko ima razlicitih brojeva
		System.out.println("Brojevi su ");
		for (int i = 0; i < counter; i++)								//ispis brojeva, petlja ide od nula do brojaca
			System.out.print(array[i]+" ");
	}
	
	//metoda koja provjerava da li je broj bec unesen
	public static boolean isDistinct(int number, int index, int[] array) {
		for (int i = 0; i <= index; i++) {		//petlja provjerava sve brojeve od prvog indeksa do broja trenutno unesenih razlicitih brojeva
			if (array[i] == number) 			//ako broj vec postoji znaci da nije razlicit
				return false;
		}
		return true;
	}

	//metoda provjerava da li je broj odgovarajuceg tipa 
	public static int inputCheckI() {
		
		int unos = 0;	// pocetna vrijednost
		boolean inputCheck = true;	//kontrolna promjenljiva
		do {
			try {
				unos = input.nextInt();	//ucitavanje unosa 
				inputCheck = false;	//ako je odgovarajuceg tipa, kontrolna promjenljiva false, vrati unos									
			}
			catch (InputMismatchException ex) {	//u slucaju pogresnog unosa
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				input.nextLine();
			}
		} while (inputCheck);
		return unos;
	}
}
