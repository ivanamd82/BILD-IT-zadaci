package zadaci_11_08_2016;

import java.util.Calendar;

public class Zadatak_03_11_08 {
	/* Ako pozovemo metodu System.currentTimeMillis() dobijemo broj milisekundi
	 * od 1. januara 1970 do trenutka pozivanja metode. 
	 * Napisati program koji ispisuje trenutacni datum i vrijeme u formatu
	 * "Trenutni datum i vrijeme: 22. juli, 2015 19:59:47"
	 */

	public static void main(String[] args) {
		final int GMT = 2;		//nasa vremenska zona
		long millis = System.currentTimeMillis();	//metoda vraca broj milisekundi od 1. januara 1970 do trenutka pozivanja metode. 
		//ispis		
		System.out.print("Trenutni datum i vrijeme: "+currentDate(millis)+" "+currentTime(millis, GMT));
	}
	//metoda za dobijanje tacnog vremena
	public static String currentTime(long millis, int gmt) {
		String time = "";	
		long sec = millis/1000;				//ukupne sekunde
		long min = sec / 60 % 60;			//minute
		long hours = sec / 60 / 60 % 24;	//sate se dobijaju kao ostatak djeljenja ukupnih sati sa 24
		sec = sec % 60;						//takan broj preostalih sekundi
		
		hours = (hours + gmt) % 24;				//tacan broj sati, korekcija zbog vremenske zone

		time = hours+":"+min+":"+sec;	//ispis vremena
		return time;
	}
	//metoda za odredjivanje tacnog datuma
	public static String currentDate(long millis) {
		//niz koji sadrzi imena mjeseci
		String[] months = {"januar","februar","mart","april","maj","juni","juli","avgust","septembar","oktobar","novembar","decembar"};
		String datum = "";	
		Calendar date = Calendar.getInstance();		//kreiranje objekta
		date.setTimeInMillis(millis);				//postavljanje vremena 
		int month = date.get(Calendar.MONTH);		//dobijanje mjeseca (broj 0-11)
		int year = date.get(Calendar.YEAR);			//dobijanje godine
		int day = date.get(Calendar.DAY_OF_MONTH);		//dobijanje dana u mjesecu
		datum = day+". "+months[month]+", "+year;		//ispis, ime mjeseca se dobija iz niza kao element na indexu koji odgovara mjesecu
		return datum;		
	}	
}
