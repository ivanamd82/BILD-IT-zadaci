package zadaci_01_09_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/* 12.30
 * (Occurrences of each letter) Write a program that prompts the user to enter 
 * a file name and displays the occurrences of each letter in the file. Letters are
 * case-insensitive. Here is a sample run:
 */

public class Zadatak_02_01_09 {

	public static void main(String[] args) {
		
		//kreiranje scannera i unos podataka
		Scanner input = new Scanner(System.in);
		System.out.println("Unesit ime fajla: ");
		String s = input.next();
		//niz koji ce cuvati sve karaktere iz dokumenta
		int[] counter = new int[26];
		char ch = ' ';
		//brojac - kontrolna promjenljiva
		int count = 0;
		
		try {
			//kreiranje objekta
			File file = new File(s);
			input = new Scanner(file);
			while (input.hasNext()) {
				//ucita rijec
				String str = input.next();
				for (int i = 0; i < str.length(); i++) {
					//ispituje karaktere u rijeci
					ch = str.charAt(i);
					//ako je karakter slovo povecati kontrolni brojac i na odgovarajucem indexu,
					//koji je dobijen kao razlika karaktera i 'A', povecati vrijednost za 1
						if(Character.isLetter(ch)) {
							count++;
							ch = Character.toUpperCase(ch);
							counter[ch - 'A']++;
						}
				}
			}
			//ako je brojac 0, dokument ne sadrzi slova
			if (count == 0) 
				System.out.println("no letters");
			else {
				//ispis
				for (int i = 0; i < counter.length; i++) {
					System.out.printf("Number of %c's: %d\n",(char)(i+'A'),counter[i]);
				}
			}
		}
		catch(FileNotFoundException ex) {
			System.out.println("greska");
			ex.printStackTrace();
		}

	}

}
