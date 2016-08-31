package zadaci_30_08_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.sun.corba.se.spi.orbutil.fsm.Input;

/* 12.13
 * (Count characters, words, and lines in a file) Write a program that will count
 * the number of characters, words, and lines in a file. Words are separated by whitespace characters.
 * The file name should be passed as a command-line argument, as shown in Figure 12.13.
 */

public class Zadatak_04_30_08 {

	public static void main(String[] args) {
		
		////provjera da li su arg ispravni
		if (args.length != 1) {
			System.out.println("Pogresan unos. Unesite ime fajla.");
			System.out.println(1);
		}
		//ako fajl ne postoji
		File file = new File(args[0]);
		if (!file.exists()) {
			System.out.println("Fajl ne postoji.");
			System.exit(2);
		}
		// inicijalizacija promjenljivih, brojaci
		int counterLine = 0;
		int counterWord = 0;
		int counterChar = 0;
		
		try {
			//kreiranje scanner objekta
			Scanner input = new Scanner(file);
			//ucitavanje teksta iz fajla
			while (input.hasNext()) {
				//ucitava cijelu liniju
				String line = input.nextLine();
				//inkrementirati brojac linija
				counterLine++;
				//dodati broj karaktera, duzina cijele linije
				counterChar += line.length();
				//broj rijeci dobija se pomocu split metode
				counterWord += line.split(" ").length;
			}
			input.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Fajl ne postoji.");
			System.exit(2);
		}
		//ispis
		System.out.println("File "+args[0]+" has\n"+counterChar+" charcters\n"+counterWord+" words\n"+counterLine+" lines");
	}

}
