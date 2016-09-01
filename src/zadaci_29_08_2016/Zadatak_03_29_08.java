package zadaci_29_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * *12.2 (InputMismatchException) Write a program that prompts the user to read
 * two integers and displays their sum. Your program should prompt the user to
 * read the number again if the input is incorrect.
 */

public class Zadatak_03_29_08 {

	public static void main(String[] args) {
		
		//kreiranje scannera i pocetne vrijednosti za promjenljive num1 i num2
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite dva cijela broja: ");
		int num1 = 0;
		int num2 = 0;
		boolean check = true;
		do {
			try {
				num1 = input.nextInt();	//ucitavanje unosa 
				num2 = input.nextInt();
				check = false;	//ako je odgovarajuceg tipa, kontrolna promjenljiva false, vrati unos									
			}
			catch (InputMismatchException ex) {	//u slucaju pogresnog unosa
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				input.nextLine();
			}
		} while(check);
		input.close();
		//ispis
		System.out.printf("Suma brojava %d + %d = %d ",num1,num2,num1+num2);
			
	}

}
