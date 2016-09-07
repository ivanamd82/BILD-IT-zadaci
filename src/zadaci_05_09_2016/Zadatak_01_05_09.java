package zadaci_05_09_2016;

/* 13.14
 * (Demonstrate the benefits of encapsulation) Rewrite the Rational class in
Listing 13.13 using a new internal representation for the numerator and denominator.
Create an array of two integers as follows:
private long[] r = new long[2];
Use r[0] to represent the numerator and r[1] to represent the denominator.
The signatures of the methods in the Rational class are not changed, so a client
application that uses the previous Rational class can continue to use this new
Rational class without being recompiled.
 */

public class Zadatak_01_05_09 {

	public static void main(String[] args) {
		
		//kreiranje objekata
		Rational r1 = new Rational(0,3);
		Rational r2 = new Rational(2,5);
		Rational r3 = new Rational("-2/3");
		String s = "-1.5";
		Rational nula = new Rational("0.0");
		//ispisi metoda iz klase
		System.out.println(nula + " * " + r2 + " = " + nula.multiply(r2));
		System.out.println("2/3 + "+r3+" = "+new Rational("2/3").add(r3));		
		System.out.println(r1+" + "+r2+" = "+r1.add(r2));
		System.out.println(r1+" - "+r2+" = "+r1.subtract(r2));
		System.out.println(r1+" * "+r2+" = "+r1.multiply(r2));
		System.out.println(r1+" / "+r2+" = "+r1.divide(r2));
		System.out.println(r1+" je "+r1.doubleValue());
		System.out.println(r2+" je "+r2.doubleValue());
		System.out.println(r3);
		System.out.println(s+" je "+new Rational(s));
		System.out.println(new Rational(1,2).subtract(new Rational(1,4)));
		System.out.println(new Rational("0").subtract(new Rational(1,4)));
		System.out.println(r1.divide(nula));
	}

}
