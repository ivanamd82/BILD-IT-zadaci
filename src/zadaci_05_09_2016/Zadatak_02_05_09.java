package zadaci_05_09_2016;

import java.math.BigInteger;

/* 13.15
 * (Use BigInteger for the Rational class) Redesign and implement the Rational class
 * in Listing 13.13 using BigInteger for the numerator and denominator.
 */

public class Zadatak_02_05_09 {

	public static void main(String[] args) {
		
		//kreiranje objekata
		RationalBigInteger r1 = new RationalBigInteger();
		RationalBigInteger r2 = new RationalBigInteger(new BigInteger("0"),new BigInteger("-3"));
		RationalBigInteger r3 = new RationalBigInteger(BigInteger.TEN, new BigInteger("5"));
		RationalBigInteger r4 = new RationalBigInteger("2/3");
		
		//provjere metoda iz klase
		System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
		System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
		System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
		System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
		
		System.out.println(r2 + " is " + r2.doubleValue());		
		System.out.println(r3 + " + " + r2 + " = " + r3.add(r2));
		System.out.println(r2 + " + " + r4 + " = " + r2.add(r4));
		System.out.println(r2.subtract(r2));
		
	}

}
