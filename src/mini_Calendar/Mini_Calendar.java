package mini_Calendar;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Mini_Calendar {
	
	static File file = new File("src/MiniProjekt1/notes.txt");	//fajl koji sadrzi biljeske
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		
		app();
	}
	// metoda sa koja ispisuje meni
	public static void app() throws IOException {		
		//ispisi meni
		System.out.println("Izaberite opciju: \n");
		System.out.println("1. Pogledaj kalendar\n2. Pogledaj napomene\n3. Napisi napomenu\n4. Obrisi napomene\n5. Izlaz");
		
		try {		
			int izbor = input.nextInt();	//izbor meni
			switch(izbor) {	
			case 1: {				//ako je izbor 1 pozovi funkciju za prikaz kalendara,
				calendarPrint();
				app(); break;		// ponovo izpisi meni
			}
			case 2: {				// ispisi napomene i ponovo prikazi meni
				noteIspis();
				System.out.println();
				app(); break;
			}
			case 3: {				//upis novi napomena i ponovo prikazi meni
				noteUpis();				
				app(); break;
			}
			case 4: {			// izbrisi sve napomene i prikazi meni
				clearNotes();
				app(); break;
			}
			case 5: {		//izlazak iz programa
				System.out.println("Pa-pa");
				break;
			}
			default: throw new InputMismatchException("Pogresan unos.");//u slucaju da nije izabrana ni jedna od ponudjenih opcija
			}															//izvrsiti catch blok
		}
		catch (InputMismatchException ex) {		//u slucaju pogresnog formata ulaznog podataka ispisati poruku i ponovo pozvati meni
			System.out.println("Pogresan unos. Pokusajte ponovo: ");
			app();	
			input.nextLine();	//ocistiti unos
		}
		System.exit(0);		//nakon izbora opcije 5 zavrsi sa programom	
	}
	//metoda za ispis kalendara za odabran mjesec i godinu
	public static void calendarPrint() {
		System.out.println("Unesite godinu: ");	//unos podataka i provjera pomocu metode
		int godina = inputCheckI();
		System.out.println("Unesite mjesec: ");
		int mjesec = inputCheckI();		
		while (mjesec > 12) {		// ako unese broj veci od 12 javiti gresku, ponovitu unos
			System.out.println("Pogresan unos! Unesite broj od 1 do 12: ");
			mjesec = inputCheckI();
		}
		Calendar calendar = new GregorianCalendar(godina, mjesec-1, 1);	//krirane kalendara za taj mjesec
		System.out.println();
		mjesecIme(mjesec);	//ispis imena mjeseca na osnovu broja mjeseca
		System.out.print(" "+calendar.get(GregorianCalendar.YEAR) );	//ispis godine
		System.out.println("\n-----------------------------------");
		System.out.println("Ned  Pon  Uto  Sri  Cet  Pet  Sub");
		int startDay = calendar.get(Calendar.DAY_OF_WEEK);	//pocetni dan u mjesecu
		for (int i = 1; i < startDay; i++) {	//petlja za ispis praznih mjesta prije pocetnog dana
			System.out.print("     ");	
		}
		for (int i = 1; i <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {	//ispis dana do zadnjeg dana u konkretnom mjesecu
			System.out.printf("%3d  ", i);	//formatiran ispis
			if ((i + (startDay-1)) % 7 == 0) {	//ako je ispisano 7 dana predji u novi red
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println();		
	}
	//metoda za upis napomena
	public static void noteUpis() {	
		try {
			if (!file.exists()) {	//ako ne postoji fajl, napravi ga
				file.createNewFile();
			}
			BufferedWriter upis = new BufferedWriter(new FileWriter(file,true));	//omogucava upis podataka u fajl
			System.out.println("Unesite godinu: ");		//upis podataka i provjera pomocu metode
			int god = inputCheckI();
			System.out.println("Unesite mjesec");
			int mjesec = input.nextInt();
			while (mjesec > 12) {				//ako je unesen veci broj od 12, ispis greske, ponovo omogucen unos
				System.out.println("Pogresan unos! Unesite broj od 1 do 12: ");
				mjesec = inputCheckI();
			}
			//promjenljiva na osnovu koje ce se provjeriti ispravnost datuma za napomenu
			Calendar date = new GregorianCalendar(god,mjesec-1,1);	
			System.out.println("Unesite dan: ");	//unos podataka i provjra
			int dan = inputCheckI();
			//ako je unesen veci broj od max broja dana za taj mjesec ispis poruke i povni unos
			while (dan > date.getActualMaximum(Calendar.DAY_OF_MONTH)) {	
				System.out.println("Pogresan unos. Taj mjesec ima "+date.getActualMaximum(Calendar.DAY_OF_MONTH)+" dan/a");
				dan = inputCheckI();
			}
			input.nextLine();	//ocisti input
			System.out.print("Napisite napomenu : ");	//unos napomene
			String note = input.nextLine();
			upis.write(dan+"." + mjesec+"." + god+". " + note+"\n");	//upis podataka u fajl
			upis.close();
			System.out.println("Napomena dodata.");
			System.out.println();
		}
		catch (IOException e){	//u slucaju greske 
			System.out.println("greska");
		}				
	}
	//metoda za ispis napomena
	public static void noteIspis() throws FileNotFoundException {
		Scanner ispis = new Scanner (file);	//ako je fajl prazan ispisi poruku
		if (file.length() == 0)
			System.out.println("Nema napomena.");
		while (ispis.hasNext()) {	//ispis svih podataka u fajlu
			String str = ispis.nextLine();
			System.out.println(str);
		}
		ispis.close();
	}
	//metoda za brisanje svih napomena u fajlu
	public static void clearNotes () {
		try {	
			PrintWriter writer = new PrintWriter(file);	//upisi u dokument ""
			writer.print("");
			writer.close();
			System.out.println("Sve napomene obrisane!");
		}
		catch (FileNotFoundException ex) {
			System.out.println("Fajl ne postoji");
		}
	}
	//metoda za dobijanje imena mjeseca na osnovu unesenog broja
	public static void mjesecIme(int mjesec) {	
		switch (mjesec-1) {
		case 0: System.out.print("Januar"); break;
		case 1: System.out.print("Februar"); break;
		case 2: System.out.print("Mart"); break;
		case 3: System.out.print("April"); break;
		case 4: System.out.print("Maj"); break;
		case 5: System.out.print("Jun"); break;
		case 6: System.out.print("Jul"); break;
		case 7: System.out.print("Avgust"); break;
		case 8: System.out.print("Septembar"); break;
		case 9: System.out.print("Oktobar"); break;
		case 10: System.out.print("Novembar"); break;
		case 11: System.out.print("Decembar"); break;
		}
	}
	//metoda za provjeru ispravnosti unesenih podataka
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
