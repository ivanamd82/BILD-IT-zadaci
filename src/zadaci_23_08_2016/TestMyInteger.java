package zadaci_23_08_2016;
//Write a client program that tests all methods in the class.

public class TestMyInteger {

	public static void main(String[] args) {
		
		//kreiranje objekta
		MyInteger myInteger = new MyInteger(12);
		
		//ispis vrijednosti i testiranje svih metoda u klasi
		System.out.println("Cijeli broj (objekt myInteger): "+myInteger.getValue());  //ispis broja
		System.out.println("Paran: "+myInteger.isEven());					//da li je paran, metoda instance
		System.out.println("Neparan: "+myInteger.isOdd());					//da li je neparan, metoda instance
		System.out.println("Primaran: "+myInteger.isPrime());				//da li je primaran, metoda instance
		System.out.println("Paran: "+MyInteger.isEven(myInteger));			//da li je paran, staticna metoda ima objekat kao argument
		System.out.println("Neparan: "+MyInteger.isOdd(myInteger));			//da li je neparan, staticna metoda
		System.out.println("Primaran:"+MyInteger.isPrime(myInteger));		//da li je primaran, staticna metoda		
		System.out.println();	
		
		int number = 22;													//testna promjenljiva, cijeli broj
		System.out.println("Cijeli broj: "+number);							//ispis broja
		System.out.println("Paran: "+MyInteger.isEven(number));				//da li je paran, staticna metoda ima kao argument cijeli broj
		System.out.println("Neparan: "+MyInteger.isOdd(number));			//da li je neparan, staticna metoda
		System.out.println("Primaran: "+MyInteger.isPrime(number));			//da li je primaran, staticna metoda		
		System.out.println();
		
		MyInteger object = new MyInteger(7);			//kreiranje objekta
		System.out.println("Cijeli broj (object): "+object.getValue());
		//provjera da li je objekt myInteger jednak objektu	object
		System.out.println("Da li su jednaki (myInteger i object): "+myInteger.equals(object));	
		
		//provjera da li je object myInteger(value) jednak cijelom broju koji je proslijedjen kao argument
		System.out.println("Da li su jednaki: (myInteger i br 12): "+myInteger.equals(12));	
		System.out.println();
		
		//konverzija stringa u int broj
		String str = "123";
		System.out.println(MyInteger.parseInt(str));
		
		//konverzija niza numerickih karaktera u int broj
		char[] array = {'1','2'};
		System.out.println(MyInteger.parseInt(array));
	}

}
