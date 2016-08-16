package zadaci_16_08_2016;

import java.util.Calendar;
//Napisati metodu koja vraca datum i trenutacno vrijeme.

public class Zadatak_04_16_08 {

	public static void main(String[] args) {	
		
		System.out.println("Tacan datum i vrijeme: ");
		System.out.println(currentDateTime()); //pozivanje metode koja vraca datum i vrijeme
	}
	
	//metoda vraca tacan datum i vrijeme kao string
	public static String currentDateTime() {
		
		Calendar date = Calendar.getInstance();	//kreiranje objekta	
		//dobijanje datuma i tacnog vremena
		return  date.get(Calendar.DAY_OF_MONTH)+"." + date.get(Calendar.MONTH)+"."+date.get(Calendar.YEAR)+" "
				+date.get(Calendar.HOUR_OF_DAY)+":"+date.get(Calendar.MINUTE)+":"+date.get(Calendar.SECOND);


	}

}
