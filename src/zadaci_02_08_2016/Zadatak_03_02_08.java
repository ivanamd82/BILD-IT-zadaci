package zadaci_02_08_2016;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Zadatak_03_02_08 {
	/*
	 * Program broji broj karaktera, rijeci i linija teksta u nekom fileu. 
	 * Rijeci trebaju biti odvojene jednim spaceom. Ime file proslijediti kao argument u program.
	 */
	public static void main(String[] args) throws IOException {
		
		String path = "C:\\Users\\Ivana\\workspace\\vjezba1\\vjezbaocjena.txt"; // input fajla, kreiranje fajla
		File file = new File(path);
		if (!file.exists()) {
			System.out.println("File ne postoji.");
			System.exit(1);
		}
		int counterLine = 0; // inicijalizacija promjenljivih, brojaci
		int counterWord = 0;
		int counterChar = 0;
		
		Scanner input = new Scanner(file);
		
		while(input.hasNext()) { // ucitavanje linija iz fajla
			String line = input.nextLine(); // i brojanje linija
			counterLine++;
			counterChar += line.length(); // brojanje karaktera
			counterWord += line.split(" ").length; // brojanje rijeci
			/*
			 * Dio koda u slucaju da program ne broji prazna mjesta kao karaktere
			 * 	for (int i = 0; i < line.length; i++) {
				counterW++;
				counterC += line[i].length();
			}
			 */
		}
		input.close();
		System.out.printf("Broj linija: %d\nBroj rijeci: %d\nBroj karaktera: %d", counterLine,counterWord,counterChar);
	}

}
