package zadaci_31_08_2016;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
/*
 * **12.23 (Process scores in a text file on the Web) Suppose that the text file on the
 * Web http://cs.armstrong.edu/liang/data/Scores.txt contains an unspecified number
 * of scores. Write a program that reads the scores from the file and displays their
 * total and average. Scores are separated by blanks.
 */

public class Zadatak_04_31_08{

	public static void main(String[] args){
		
		//adresa fajla
		String address = "http://cs.armstrong.edu/liang/data/Scores.txt";
		//varijable suma, brojac, prosjek
		double sum = 0;
		int counter = 0;
		double average = 0;
		
		try{
			//kreiranje objekta
			URL url = new URL(address);
			Scanner input = new Scanner(url.openStream());
			//ucitavanje iz fajla i dodavanje brojeva sumi, inkrementirati brojac
			while (input.hasNext()){
				sum += input.nextDouble();
				counter++;
			}
			input.close();
		}//u slucaju greski
		catch (MalformedURLException ex){
			System.out.println("Pogresan url");
		}
		catch (IOException ex){
			System.out.println("I/O Errors: no such file");
		}
		//ako je brojac veci od 0, ispise sumu i prosjek, inace javi poruku
		if (counter > 0){
			average = sum / counter;
			System.out.println("\nSuma svih brojeva: " +sum + "\nProsjek: " + average);
		}
		else System.out.println("Fajl je prazan.");

	}

}
