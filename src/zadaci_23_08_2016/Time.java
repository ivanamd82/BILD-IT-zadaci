package zadaci_23_08_2016;
/* 10.1
 * (The Time class) Design a class named Time. The class contains: 
 * The data fields hour, minute, and second that represent a time.
 * A no-arg constructor that creates a Time object for the current time. (The
 * values of the data fields will represent the current time.)
 * A constructor that constructs a Time object with a specified elapsed time
 * since midnight, January 1, 1970, in milliseconds. (The values of the data
 * fields will represent this time.)
 * A constructor that constructs a Time object with the specified hour, minute, and second.
 * Three getter methods for the data fields hour, minute, and second, respectively.
 * A method named setTime(long elapseTime) that sets a new time
 * for the object using the elapsed time. For example, if the elapsed time is
 * 555550000 milliseconds, the hour is 10, the minute is 19, and the second is 10.
 * (Hint: The first two constructors will extract the hour, minute, and second from the elapsed time. 
 * For the no-arg constructor, the current time can be obtained using System.currentTimeMillis(), 
 * as shown in Listing 2.7, ShowCurrentTime.java.)
 */

public class Time {
	
	//private data fields
	private long hour;
	private long minute;
	private long second;
	
	//no-arg constructor that creates a Time object for the current time
	public Time() {
		second = (System.currentTimeMillis() / 1000)  % 60;
		minute = (System.currentTimeMillis() / 1000) / 60 % 60;
		hour = ((System.currentTimeMillis() / 1000) / 3600) % 24;
	}
	/*
	 * constructor that constructs a Time object with a specified elapsed time since midnight,
	 * January 1, 1970, in milliseconds. (The values of the data fields will represent this time.)
	 */
	public Time (long elapseTime) {
		setTime(elapseTime);
	}
	
	//constructor that constructs a Time object with the specified hour, minute, and second
	public Time(long hour, long minute, long second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	//getters
	public long getHour() {
		return hour;
	}
	public long getMinute() {
		return minute;
	}
	public long getSecond() {
		return second;
	}
	//method sets a new time for the object using the elapsed time
	public void setTime(long elapseTime) {
		second = (elapseTime / 1000)  % 60;
		minute = (elapseTime / 1000) / 60 % 60;
		hour = ((elapseTime / 1000) / 3600) % 24;	
	}
}
