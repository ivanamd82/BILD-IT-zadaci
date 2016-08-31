package zadaci_31_08_2016;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/* 12.19
 * (Count words) Write a program that counts the number of words in President 
 * Abraham Lincoln’s Gettysburg address from http://cs.armstrong.edu/liang/data/Lincoln.txt.
 */

public class Zadatak_03_31_08 {

	public static void main(String[] args) {
		
		//adresa fajla
		String address = "http://cs.armstrong.edu/liang/data/Lincoln.txt";
		int counterW = 0;	//brojac rijeci
		
		try {
			//kreiranje objekta
			URL url = new URL(address);
			Scanner input = new Scanner(url.openStream());
			//ucitavanje fajla linija po linija i brojanje rijeci pomocu split metode u svakoj liniji
			while(input.hasNext()) {
				counterW += input.nextLine().split(" ").length;
			}
			//ispis
			System.out.println("BRoj rijeci u dokumentu: "+counterW);
			input.close();
		} 
		//u slucaju da fajl nije nadjen
		catch (MalformedURLException ex) {
			System.out.println("Pogresn url");
		}
		catch (IOException ex) {
			System.out.println("I/O Errors: no such file");
		}		

	}

}
