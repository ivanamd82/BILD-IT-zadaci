package zadaci_24_08_2016;
/* 10.17
 * (Square numbers) Find the first ten square numbers that are greater than Long.MAX_VALUE. 
 * A square number is a number in the form of n2. For example, 4, 9, and 16 are square numbers. 
 * Find an efficient approach to run your program fast.
 */
import java.math.BigInteger;

public class Zadatak_02_24_08 {

	public static void main(String[] args) {
		
		//korijen broja Long.MAX_VALUE
		long numberStr = (long)Math.sqrt(Long.MAX_VALUE);
		
		/* kreiranje BigInteger broja od promjenljive numberStr
		 * broj povecamo za 1 jer nam trebaju brojevi koji su veco od Long.MAX_VALUE
		 */		
		BigInteger number = new BigInteger(numberStr+"");
		number = number.add(BigInteger.ONE);
		
		int counter = 0;		//brojac
		
		System.out.println("Prvih 10 kvadratnih brojeva koji su veci od "+Long.MAX_VALUE);
		//sve dok je brojac maji od 10 ispisuj kvadrtne brojeve
		while(counter < 10) {
			System.out.println(number.multiply(number)+" ");	//ispisi kvadratni broj dobiven mnozenjem broja sa samim sobom
			counter++;											//povecati brojac, povecati broj
			number = number.add(BigInteger.ONE);
		}
	}

}
