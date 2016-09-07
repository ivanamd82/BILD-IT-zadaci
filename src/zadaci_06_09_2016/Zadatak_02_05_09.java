package zadaci_06_09_2016;
/* 18.3
 * (Compute greatest common divisor using recursion) The gcd(m, n) can also
 * be defined recursively as follows:
 * If m % n is 0, gcd(m, n) is n.
 * Otherwise, gcd(m, n) is gcd(n, m % n).
Write a recursive method to find the GCD. Write a test program that prompts the
user to enter two integers and displays their GCD.
 */

public class Zadatak_02_05_09 {

	public static void main(String[] args) {
		
		//ispis
		System.out.println(gcd(-10,-2));
		System.out.println(gcd(-25,15));
		System.out.println(gcd(27,99));

	}
	//metoda za najveci zajednicki dijelilac
	public static int gcd(int m, int n) {
		//ako je m djeljivo sa n, n je najveci zajednicki djelilac
		//(abs. vrijednost, jer gcd je najveci pozitivan broj - def. u mat.)
		if (m % n == 0)
			return Math.abs(n);
		//ako nije, poziva samu sebe i provjerava za n i m%n
		else return gcd(n, m % n);
	}

}
