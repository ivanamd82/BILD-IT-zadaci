package zadaci_20_08_2016;
/* 9.6
 * (Stopwatch) Design a class named StopWatch. The class contains:
 * Private data fields startTime and endTime with getter methods.
 * A no-arg constructor that initializes startTime with the current time.
 * A method named start() that resets the startTime to the current time.
 * A method named stop() that sets the endTime to the current time.
 * A method named getElapsedTime() that returns the elapsed time for the stopwatch in milliseconds.
 * Draw the UML diagram for the class and then implement the class. Write a test
 * program that measures the execution time of sorting 100,000 numbers using selection sort.
 */

public class StopWatch {	
	
	//private data fields
	private long startTime;
	private long endTime;
	
	//no-arg constructor that initializes startTime with the current time
	public StopWatch() {
		startTime = System.currentTimeMillis();
	}
	
	//resets the startTime to the current time
	public void start() {
		startTime = System.currentTimeMillis();
	}
	
	//sets the endTime to the current time
	public void stop() {
		endTime = System.currentTimeMillis();
	}
	
	//returns the elapsed time for the stopwatch in milliseconds
	public long getElapsedTime() {
		return (endTime - startTime);
	}
	
	//getters
	public long getStartTime() {
		return startTime;
	}
	public long getEndTime() {
		return endTime;
	}

}
