package zadaci_23_08_2016;
/* 10.3
 * (The MyInteger class) Design a class named MyInteger. The class contains:
 * An int data field named value that stores the int value represented by this object.
 * A constructor that creates a MyInteger object for the specified int value.
 * A getter method that returns the int value.
 * The methods isEven(), isOdd(), and isPrime() that return true if the 
 * value in this object is even, odd, or prime, respectively.
 * The static methods isEven(int), isOdd(int), and isPrime(int) that 
 * return true if the specified value is even, odd, or prime, respectively.
 * The static methods isEven(MyInteger), isOdd(MyInteger), and
 * isPrime(MyInteger) that return true if the specified value is even, odd, or prime, respectively.
 * The methods equals(int) and equals(MyInteger) that return true if 
 * the value in this object is equal to the specified value.
 * A static method parseInt(char[]) that converts an array of numeric characters to an int value.
 * A static method parseInt(String) that converts a string into an int value.
 */

public class MyInteger {
	
	//private data field
	private int value;
	
	//constructor that creates a MyInteger object for the specified int value
	public MyInteger(int value) {
		this.value = value;
	}
	// getter
	public int getValue() {
		return value;
	}
	//return true if the specified value is even
	public boolean isEven() {
		return (value % 2 == 0) ? true : false;			
	}
	//return true if the specified value is odd
	public boolean isOdd() {
		return (value % 2 != 0) ? true : false;	
	}
	//return true if the specified value is prime
	public boolean isPrime() {
		for(int i = 2; i < value; i++) {		//ispitujemo da li je broj djeljiv sa svakim brojem od 2 do tog broja
			if (value % i == 0)					//ako jeste nije primaran
				return false;
		}
		return true;
	}
	//static methods that return true if the specified value is even
	public static boolean isEven(int number) {
		return (number % 2 == 0) ? true : false;	
	}
	//static methods that return true if the specified value is odd
	public static boolean isOdd(int number) {
		return (number % 2 != 0) ? true : false;
	}
	//static methods that return true if the specified value is prime
	public static boolean isPrime(int number) {
		for(int i = 2; i < number; i++) {		//ispitujemo da li je broj djeljiv sa svakim brojem od 2 do tog broja
			if (number % i == 0)				//ako jeste nije primaran
				return false;
		}
		return true;
	}
	//static methods that return true if the specified value is even
	public static boolean isEven(MyInteger object) {
		return (object.getValue() % 2 == 0) ? true : false;
	}
	//static methods that return true if the specified value is odd
	public static boolean isOdd(MyInteger object) {
		return (object.getValue() % 2 != 0) ? true : false;
	}
	//static methods that return true if the specified value is prime
	public static boolean isPrime(MyInteger object) {
		for(int i = 2; i < object.getValue(); i++) {		//ispitujemo da li je broj djeljiv sa svakim brojem od 2 do tog broja
			if (object.getValue() % i == 0)					//ako jeste nije primaran
				return false;
		}
		return true;
	}
	//methods that return true if the value in this object is equal to the specified value.
	public boolean equals(int number) {
		return (this.value == number) ? true : false;		
	}
	//methods that return true if the value in this object is equal to the specified value.
	public boolean equals(MyInteger objects) {
		return (this.value == objects.getValue()) ? true : false;
	}
	//static method that converts an array of numeric characters to an int value.
	public static int parseInt(char[] array) {
		String str = new String(array);		//pretvoriti niz u string
		return Integer.parseInt(str);		//konvertovati numericki string u int, pomocu metode u Integer klasi
	}
	//static method that converts a string into an int value.
	public static int parseInt(String str) {
		return Integer.parseInt(str); 		//konvertovati numericki string u int, pomocu metode u Integer klasi
	}	
}
