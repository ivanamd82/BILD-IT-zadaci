package zadaci_23_08_2016;
/*
 * Write a test program that creates two Time objects (using new Time() and new 
 * Time(555550000)) and displays their hour, minute, and second in the format hour:minute:second.
 * (Hint: The first two constructors will extract the hour, minute, and second from the elapsed time. 
 * For the no-arg constructor, the current time can be obtained using System.currentTimeMillis(), 
 * as shown in Listing 2.7, ShowCurrentTime.java.)
 */

public class TestTime {

	public static void main(String[] args) {
		
		//Kreiranje dva Time objekta 
		Time time1 = new Time();
		Time time2 = new Time(555550000);
		
		//ispis 
		System.out.println("Time1: "+time1.getHour()+":"+time1.getMinute()+":"+time1.getSecond());
		System.out.println("Time2: "+time2.getHour()+":"+time2.getMinute()+":"+time2.getSecond());
	}

}
