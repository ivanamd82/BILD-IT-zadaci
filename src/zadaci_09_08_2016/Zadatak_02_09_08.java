package zadaci_09_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_02_09_08 {
	/*  Great circle distance predstavlja udaljenost izmedju dvije tacke na povrsine sfere.
	 *  Neka nam (x1, y1) i (x2, y2) predstavljaju geografsku sirinu i duzinu dvije tacke. 
	 *  Great circle distance izmedju ove dvije tacke moze biti izracunata koristeci se sljedecom formulom: 
	 *  d = radius * arccos (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)). 
	 *  Napisati program koij pita korisnika da unese geografsku sirinu i duzinu u stepenima
	 *  dvije tacke na povrsini zemlje te mu ispisuje great circle distance. 
	 *  Prosjecni radius zemlje je 6.371.01 km. Stepene koje korisnik unese trebamo promijeniti
	 *  u radianse koristeci se Math.toRadians metodom jer Java trigonometrijske metode koriste radianse. 
	 *  Sirina i duzina u ovoj formuli se odnose na zapad i sjever. Koristimo negativne vrijednosti da oznacimo istok i jug. 
	 */

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		final double  RADIUS = 6371.01; // radius zemlje
		
		System.out.println("Unesite koordinate prve tacke: ");	//unos podataka u stepenima i provjera tipa
		double x1 = inputCheckD();
		double y1 = inputCheckD();
		System.out.println("Unesite koordinate druge tacke: ");
		double x2 = inputCheckD();
		double y2 = inputCheckD();
		input.close();
		//izrucunavanje udaljenosti po formuli (pretvoriti stepene u radijane
		double GCDistance = RADIUS * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 - y2)));
		System.out.println("Udaljenost izmedju dvije taceke je "+GCDistance+" km.");
	}
	//metoda za provjeru unesenih podataka
	public static double inputCheckD() {
		double unos = 0;	// pocetna vrijednost
		boolean inputCheck = true;	//kontrolna promjenljiva
		do {
			try {
				unos = input.nextDouble();	//ucitavanje unosa i provjera da li je double
				inputCheck = false;	//ako je sve ok, kontrolna promjenljiva false, vrati unos									
			}
			catch (InputMismatchException ex) {	//u slucaju pogresnog unosa
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				input.nextLine();
			}
		} while (inputCheck);
		return unos;
	}

}
