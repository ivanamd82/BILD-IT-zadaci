package zadaci_17_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_03_17_08 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Unesite broj tipa short (-32,768 do 32,767): ");	//unos podataka
		short number = inputCheckS();
		
		System.out.println(shortToBinary(number));		//ispis unjetog short broja u 16 bitni binarni oblik
	}
	
	//metoda vraca shgort broj u kao strin sa 16 bita
	public static String shortToBinary(short number) {
		
		String str = Integer.toBinaryString(number);	//metoda vraca broj kao string koji prikazuje binarni broj
		int length = str.length();						//duzina stringa
		String zero = "00000000000000000";				//string 16 nula, jer predstavljamo broj u 16-bitnom obliku
		if (length < 16)								//ako je duzina Stringa str manja od 16, treba prikazati nule ispred
		 str = zero.substring(0, 16-length).concat(str);	//sto se postize kad se prikaze dio stringa zero, na pozicijama
															// 0 do 16-duzina stringa str. i doda se string str
		else
		  str = str.substring(length - 16);				//ako je broj negativan prikazati zadnjih 16 karaktera/cifara, jer se 
		return str;									// negativan broj prikazuje sa 32 bita sa metodom Integer.toBinaryString		
	}
	
	//metoda provjerava da li je broj odgovarajuceg tipa 
	public static short inputCheckS() {
		
		short unos = 0;	// pocetna vrijednost
		boolean inputCheck = true;	//kontrolna promjenljiva
		do {
			try {
				unos = input.nextShort();	//ucitavanje unosa
				inputCheck = false;
			}
			catch (InputMismatchException ex) {	//u slucaju pogresnog unosa
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				input.nextLine();
			}
		} while (inputCheck);
		return unos;


	}

}
