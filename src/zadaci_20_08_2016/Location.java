package zadaci_20_08_2016;
/* 9.13 
 * (The Location class) Design a class named Location for locating a maximal
 * value and its location in a two-dimensional array. The class contains public data
 * fields row, column, and maxValue that store the maximal value and its indices
 * in a two-dimensional array with row and column as int types and maxValue as a double type.
 * Write the following method that returns the location of the largest element in a two-dimensional array:
 * public static Location locateLargest(double[][] a)
 * The return value is an instance of Location.
 */

public class Location {
	
	// public data fields
	public int row;
	public int column;
	public double maxValue;
	
	//no-arg constructor
	public Location() {
	}
	
	//returns the location of the largest element in a two-dimensional array
	public static Location locateLargest(double[][] a) {
		//kreiranje objekta, postavljanje maxValue na 0,0
		Location location = new Location();
		location.maxValue = a[0][0];
		
		for (int i = 0; i < a.length; i++) {		//prolazi kroz niz i poredi vrijednosti, postavlja vecu za trenutnu najvecu lokaciju
			for (int j = 0; j < a[i].length; j++) {		
				if (a[i][j] > location.maxValue) {
					location.maxValue = a[i][j];
					location.row = i;
					location.column = j;
				}
			}
		}
		//vratiti instancu klase Location
		return location;
	}

}
