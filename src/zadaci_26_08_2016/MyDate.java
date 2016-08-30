package zadaci_26_08_2016;

import java.util.GregorianCalendar;

public class MyDate {
	
	//private data fields
	private int year;
	private int month;
	private int day;
	
	//konstruktor
	public MyDate() {
		GregorianCalendar cal = new GregorianCalendar();
		year = cal.get(GregorianCalendar.YEAR);
		month = cal.get(GregorianCalendar.MONTH);
		day = cal.get(GregorianCalendar.DAY_OF_MONTH);
	}
	//kreira objekat na osnovu broja
	public MyDate(long num) {
		GregorianCalendar cal = new GregorianCalendar();	//kreiranje objekta
		cal.setTimeInMillis(num);						//postavlja vrijeme 
		year = cal.get(GregorianCalendar.YEAR);			//dobijanje godine, mjeseca i dana
		month = cal.get(GregorianCalendar.MONTH);
		day = cal.get(GregorianCalendar.DAY_OF_MONTH);		
	}
	//kreira objekat na osnovu unesenih parametara
	public MyDate(int year,int month,int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	//getters and setters
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	//ispis
	@Override
	public String toString() {
		return "MyDate [year=" + year + ", month=" + month + ", day=" + day
				+ "]";
	}

}
