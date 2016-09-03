package zadaci_02_09_2016;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Zadatak_01_02_09 {
	
	public static void main(String[] args) {
		
		GregorianCalendar cal = new GregorianCalendar();
		//ako nisu uneseni argumeni prikazi trenutni mjesec i godinu
		if (args.length == 0) {
			System.out.println("No arguments! Showing calendar for current month and year:\n");
			calendarPrint(cal.get(GregorianCalendar.YEAR), cal.get(GregorianCalendar.MONTH)+1); 
		} 
		else if (args.length == 1) {
			// ako je unesen jedan argument prikazi trenutnu godinu i uneseni mjesec
			calendarPrint(cal.get(GregorianCalendar.YEAR), Integer.parseInt(args[0]));
		}
		else {
			//ako su argumenti za mjesec i godinu pogresni prikazi trenutni mjesec
			if (Integer.parseInt(args[0]) <= 0 || Integer.parseInt(args[0]) > 12 || 
					Integer.parseInt(args[1]) <= 2016 || Integer.parseInt(args[1]) > 0) {
				System.out.println("Invalid arguments! Showing calendar for current month and year:\n");
				calendarPrint(cal.get(GregorianCalendar.YEAR), cal.get(GregorianCalendar.MONTH)+1); 
			}
			else calendarPrint(Integer.parseInt(args[1]), Integer.parseInt(args[0]));
		}
			
			

	}
	//metoda printa kalendar za odredjenu godinu i mjesec
	public static void calendarPrint(int godina, int mjesec) {
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
	//dobijanje imena mjeseca
	public static void mjesecIme(int mjesec) {	
		switch (mjesec-1) {
		case 0: System.out.print("\tJanuar"); break;
		case 1: System.out.print("\tFebruar"); break;
		case 2: System.out.print("\tMart"); break;
		case 3: System.out.print("\tApril"); break;
		case 4: System.out.print("\tMaj"); break;
		case 5: System.out.print("\tJun"); break;
		case 6: System.out.print("\tJul"); break;
		case 7: System.out.print("\tAvgust"); break;
		case 8: System.out.print("\tSeptembar"); break;
		case 9: System.out.print("\tOktobar"); break;
		case 10: System.out.print("\tNovembar"); break;
		case 11: System.out.print("\tDecembar"); break;
		}
	}


}