package zadaci_01_09_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/* 12.31
 * (Baby name popularity ranking) The popularity ranking of baby names from 
 * years 2001 to 2010 is downloaded from www.ssa.gov/oact/babynames and stored
 * in files named babynameranking2001.txt, babynameranking2002.txt, . . . ,
 * babynameranking2010.txt. Each file contains one thousand lines. Each line
 * contains a ranking, a boy’s name, number for the boy’s name, a girl’s name,
and number for the girl’s name. For example, the first two lines in the file
babynameranking2010.txt are as follows:
So, the boy’s name Jacob and girl’s name Isabella are ranked #1 and the boy’s
name Ethan and girl’s name Sophia are ranked #2. 21,875 boys are named
Jacob and 22,731 girls are named Isabella. Write a program that prompts the
user to enter the year, gender, and followed by a name, and displays the ranking
of the name for the year.
 */

public class Zadatak_03_01_09 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		//kreiranje imena liste iz koje ce se citati, lista pozudjena od dejana za test :)
		String fileS = "babyNames";
		System.out.println("Enter the year: ");
		int year = inputCheckI();
		fileS += year+".txt";  //dobijen fajl za citanje
		
		try {
			//kreiranje objekta
			File file = new File(fileS);
			//unos pola djeteta
			System.out.println("Enter the gender (M / F): ");
			//prebaceno u velika slova
			char gender = Character.toUpperCase(input.next().charAt(0));
			//ime djeteta
			System.out.println("Enter the name: ");
			String name = input.next();
			//kreiranje objekta
			Scanner inputF = new Scanner(file);
			//kontrolna promjenljiva
			boolean control = false;
			//citati do kraja dokumenta, petlja
			while (inputF.hasNext()) {
				//ucitava cijelu liniju teksta
				String s = inputF.nextLine();
				//podjeli u niz
	            String[] array = s.split(" ");
	            //pretraga, ako je pol M i element na indexu 1 odgovara unesenom imenu ispisi rank(elem index 0)
	            //kontrolna promjenljiva rtu, izlazak iz petlej
	            if (gender == 'M' && array[1].equals(name)) {
	            	System.out.println(name+" is ranked #"+array[0]+" in year "+year);
	            	control = true;
					break;
	            }
	            //kao i za M pol, analogno tome i za F
	            if (gender == 'F' && array[3].equals(name)) {
	            	System.out.println(name+" is ranked #"+array[0]+" in year "+year);
	            	control = true;
					break;
	            }
	      	}
			//ako je kontrolna false, nije pronadjeno ime
			 if (!control)
					System.out.println("The name "+name+" is not ranked in year "+year);
			inputF.close();
		}
		///u slucaju gresaka
		catch (FileNotFoundException ex) {
			System.out.println("greska");
			ex.printStackTrace();
		}
		catch (InputMismatchException ex) {
			// ako je doslo do greske tokom ucitavanja, prikazi poruku
			System.out.println("greska");
			ex.printStackTrace();
		}
	}
	//provjera unesene godine
public static int inputCheckI() {
		
		int unos = 0;	// pocetna vrijednost
		boolean inputCheck = true;	//kontrolna promjenljiva
		do {
			try {
				unos = input.nextInt();	//ucitavanje unosa i provjera da li je pozitivan
				if (unos < 2001 || unos > 2010 ) {
					System.out.println("Pogresan unos. Pokusajte ponovo (2001 - 2010): ");	//ako nije ispisi poruku
					inputCheck = true;
				}				
				else inputCheck = false;	//ako je sve ok, kontrolna promjenljiva false, vrati unos									
			}
			catch (InputMismatchException ex) {	//u slucaju pogresnog unosa
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				input.nextLine();
			}
		} while (inputCheck);
		return unos;
	}

}
