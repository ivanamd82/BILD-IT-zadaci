package zadaci_24_08_2016;
/* 10.21
 * (Divisible by 5 or 6) Find the first ten numbers greater than Long.MAX_VALUE that are divisible by 5 or 6.
 */

import java.math.BigInteger;

public class Zadatak_05_24_08 {

	public static void main(String[] args) {
		
		BigInteger number = new BigInteger(Long.MAX_VALUE+"");
		BigInteger div5 = new BigInteger("5");
		BigInteger div6 = new BigInteger("6");
		int counter = 0;
		
		System.out.println("Prvih 10 brojeva vecih od "+Long.MAX_VALUE+" koji su djeljivi sa 5 ili 6");
		while(counter < 10) {
			if(number.remainder(div5).equals(BigInteger.ZERO) || number.remainder(div6).equals(BigInteger.ZERO)) {
        		System.out.println(number+" ");
        		counter++;
        	}
        	number = number.add(BigInteger.ONE);	//povecati broj za 1
		}

	}

}
