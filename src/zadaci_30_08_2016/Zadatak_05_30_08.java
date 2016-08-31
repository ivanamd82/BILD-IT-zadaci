package zadaci_30_08_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/* 12.14
 * (Process scores in a text file) Suppose that a text file contains an unspecified
 * number of scores separated by blanks. Write a program that prompts the user
 * to enter the file, reads the scores from the file, and displays their total and
 * average.
 */

public class Zadatak_05_30_08 {

	public static void main(String[] args) throws IOException {
		
		//unos imena fajla
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite ime fajla: ");
		//pocetne vrijednosti za promjenljive, suma, brojac brojeva, prosjek
		double sum = 0;
		int counter = 0;
		double average = 0;
		//kreiranje objekta File i novi Scanner
		try {
			File file = new File(input.next());
			Scanner inputF = new Scanner(file);
			//dok ne dodje do kraja dokumenta ucitavaj i sabiri sve brojeve
			while(inputF.hasNext()) {
				sum += inputF.nextDouble();
				counter ++;
			}
			input.close();
			inputF.close();
		//u slucaju da fajl ne postoji
		} catch (FileNotFoundException ex) {
			System.out.println("Fajl ne postoji.");
			System.exit(1);
		//u slucaju da sadrzi nesto dr osim brojeva	
		} catch (InputMismatchException ex) {
			System.out.println("Pogresan unos.");
			System.exit(1);
		}
		//ako je brojac 0, fajl je prazan, ako nije ispisati sumu i prosjek
		if (counter != 0) {
			average = sum / counter;
			System.out.println("\nSuma svih brojeva: " +sum + "\nProsjek: " + average);
		}
		else System.out.println("Fajl je prazan.");
	}

}
