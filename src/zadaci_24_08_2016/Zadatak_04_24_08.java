package zadaci_24_08_2016;
/* 10.19
 * (Mersenne prime) A prime number is called a Mersenne prime if it can be written 
 * in the form 2^p - 1 for some positive integer p. Write a program that finds
 * all Mersenne primes with p … 100 and displays the output as shown below.
 * (Hint: You have to use BigInteger to store the number, because it is too big to
 * be stored in long. Your program may take several hours to run.)
 * p 2^p – 1
 * 2 3
 * 3 7
 * 5 31
 * ...
 */
import java.math.BigInteger;

public class Zadatak_04_24_08 {

	public static void main(String[] args) {
		
		System.out.printf("%-8s%-8s\n\n","p","2^p-1");	//ispis zaglavlja
		//petlja od 2 do 100
		for(int i = 2; i <= 100; i++){
			if(isPrime(i)) {												//ako je broj p primaran 
				if(isPrime(getMersenne(i).intValue()))						//provjeriti da li je i Mersenne primaran
					System.out.printf("%-10d%-10s\n", i, getMersenne(i));	//ako jeste ispisati ga							
			}
		}
		
	}
	//metoda za provjeru primarnih brojeva
	public static boolean isPrime(int num) { 
		// provjera da li je broj djeljiv sa brojevima u rangu od 2 do tog broja
		for (int i = 2; i < num; i++) { 
			if (num % i == 0) 	// ako je ostatak djeljenja tog broja sa nekim od brojem jednak nuli znaci da nije primaran
				return false;
		}
		return true;
	}
	//dobijanje Mersenne broja - broj koji se moze zapisati u obliku 2^p - 1
    public static BigInteger getMersenne(int p) {
        return new BigInteger("2").pow(p).subtract(BigInteger.ONE);
    }


}
