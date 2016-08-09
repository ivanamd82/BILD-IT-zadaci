package zadaci_08_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_03_08_08 {
	/*
	 * Napisati program koji pita korisnika da unese godinu i prva tri slova imena mjeseca
	 * (prvo slovo uppercase) te mu ispise broj dana u tom mjesecu. 
	 * Npr ukoliko korisnik kao godinu unese 2001 a kao mjesec Jan program mu ispisuje da Jan 2011 ima 31 dan.
	 */
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Unesite godinu: ");	//unos podataka i provjera ispravnosti pomocu metode
		int year = inputCheckI();
		System.out.println("Unesite prva tri slova imena mjeseca (prvo slovo uppercase): ");
		String month = input.next();
		
		switch (month) {		//ispis 
		case ("Jan"): System.out.println(month+" "+year+" ima 31 dan.");
		case ("Feb"): {				//ako je god pretupna
				if (isLeap(year))
					System.out.println(month+" "+year+" ima 29 dana.");
				else System.out.println(month+" "+year+" ima 28 dana.");
				break;
		}
		case ("Mar"): System.out.println(month+" "+year+" ima 31 dan."); break;
		case ("Jun"): System.out.println(month+" "+year+" ima 30 dana."); break;
		case ("Jul"): System.out.println(month+" "+year+" ima 31 dan."); break;
		case ("Avg"): System.out.println(month+" "+year+" ima 31 dan."); break;
		case ("Sep"): System.out.println(month+" "+year+" ima 30 dana."); break;
		case ("Okt"): System.out.println(month+" "+year+" ima 31 dan."); break;
		case ("Nov"): System.out.println(month+" "+year+" ima 30 dana."); break;
		case ("Dec"): System.out.println(month+" "+year+" ima 31 dan."); break;
		default: System.out.println("Pogresan mjesec");
				System.exit(0);	
		}
	}
	//metoda za odredjivanje prestupne godine, vraca true ako je god prestupna
	public static boolean isLeap (int year) {
		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) // uslov za prestupnu godinu
			return true;
		else return false;
	}
	//metoda za provjeru unesenih podataka
	public static int inputCheckI() {
		int unos = 0;	// pocetna vrijednost
		boolean inputCheck = true;	//kontrolna promjenljiva
		do {
			try {
				unos = input.nextInt();	//ucitavanje unosa i provjera da li je negativan broj
				if (unos <= 0) {
					System.out.println("Pogresan unos. Pokusajte ponovo: ");	//ako jeste ispisi poruku
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
