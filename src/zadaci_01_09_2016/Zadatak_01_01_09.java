package zadaci_01_09_2016;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * (Process large dataset) A university posts its employees’ salaries at http://cs.armstrong.edu/liang/data/Salary.txt. 
 * Each line in the file consists of a faculty member’s first name, last name, rank, and salary
 * (see Programming Exercise12.24). Write a program to display the total salary for assistant professors,
 * associate professors, full professors, and all faculty, respectively, and display
 * the average salary for assistant professors, associate professors, full professors,and all faculty, respectively.
 */

public class Zadatak_01_01_09 {

	public static void main(String[] args) {
		
		//url adresa
		String address = "http://cs.armstrong.edu/liang/data/Salary.txt";
		
		try {
			//kreiranje objekta
			URL url = new URL(address);
			Scanner input = new Scanner(url.openStream());
			String rank = "";
			//kreiranje promjenljivih za cuvanje suma plata
			BigDecimal suma = new BigDecimal(0);
			BigDecimal suma1 = new BigDecimal(0);
			BigDecimal suma2 = new BigDecimal(0);
			BigDecimal suma3 = new BigDecimal(0);
			//brojaci 
			int counter = 0;
			int counter1 = 0;
			int counter2 = 0;
			int counter3 = 0;
			
			while(input.hasNext()) {
				//preskociti prva dva stringa jer su imena 
				input.next();
				input.next();
				//ucitati rank
				rank = input.next();
				//na osnovu radnog mjesta dodati vrijednost sl ucitanog odgovarajucoj sumi
				//povecati odgovarajuci brojac
				if (rank.equals("assistant")) {
					suma1 = suma1.add(new BigDecimal(input.nextDouble()+""));
					counter1++;
				} else if (rank.equals("associate")) {
					suma2 = suma2.add(new BigDecimal(input.nextDouble()+""));
					counter2++;
				} else {
					suma3 = suma3.add(new BigDecimal(input.nextDouble()+""));
					counter3++;
				}
				//povecati ukupni brojac svih radnika
				counter++;
			}
			input.close();
			//suma svih 
			suma = suma.add(suma1.add(suma2.add(suma3)));
			//ispis
			System.out.println("Suma plata za assistant profesore: "+suma1);
			System.out.println("Suma plata za associate profesore: "+suma2);
			System.out.println("Suma plata za full profesore: "+suma3);
			System.out.println("Suma plata za sve profesore: "+suma);
			System.out.println("Prosijek plata za assistant profesore: "+suma1.divide(new BigDecimal(counter1), 2, BigDecimal.ROUND_UP));
			System.out.println("Prosijek plata za associate profesore: "+suma2.divide(new BigDecimal(counter2),2, BigDecimal.ROUND_UP));
			System.out.println("Prosijek plata za full profesore: "+suma3.divide(new BigDecimal(counter3),2, BigDecimal.ROUND_UP));
			System.out.println("Prosijek svih plata: "+suma.divide(new BigDecimal(counter),2, BigDecimal.ROUND_UP));
		}
		//u slucaju gresaka
		catch (MalformedURLException ex) {
			System.out.println("Pogresan url");
		}
		catch (IOException ex) {
			System.out.println("I/O Errors: no such file");
		}
		catch (InputMismatchException e) {
			// ako uctitani podatak nije odgovarajuce vrijednosti prikazi poruku
			System.out.println("Pogresan unos!");
		}

	}

}
