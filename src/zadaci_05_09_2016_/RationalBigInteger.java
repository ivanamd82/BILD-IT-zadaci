package zadaci_05_09_2016_;

import java.math.BigInteger;

public class RationalBigInteger extends Number implements Comparable<RationalBigInteger> {
	
	private BigInteger numerator = BigInteger.ZERO;
	private BigInteger denominator = BigInteger.ONE;
	
	//no-arg kondtruktor 0/1 = 0
	public RationalBigInteger() {
		this(BigInteger.ZERO, BigInteger.ONE);
	}
	//konstruktot sa parametrima
	public RationalBigInteger(BigInteger numerator, BigInteger denominator) {
		
		//nadjemoo gcd u slucaju da su uneseni br djeljivi i skratimo ih,
		//ne znam kako se to tako zove, ja sam u skoli tako ucila :)
		BigInteger gcd = gcd(numerator, denominator);
		//nazivnik je jednak abs. vrijednosti unesenog br i gcd
		this.denominator = denominator.abs().divide(gcd);
		
		//ako je uneseni br za nazivnik pozitivan brojnik je jednak
		//unesenom br podjeljenom sa gcd
		if (denominator.compareTo(BigInteger.ZERO) >= 0) {
			this.numerator = numerator.divide(gcd);
		}
		//ako je negativan, brojnik mjenja znak iz + u -, i obrnuto
		else this.numerator = numerator.divide(gcd).negate();
	}
	//Construct a rational with string
	public RationalBigInteger(String decimal) {
		//ako string sadrzi / ili .
		if (decimal.contains("/") || decimal.contains(".")) {
			//ucitava index pojavljivanja . ili /
			int index = (decimal.contains(".")) ? decimal.indexOf('.') : decimal.indexOf('/');
			//brojnik i nazivnik
			BigInteger d;
			BigInteger n;
			// ako je string u formi decimalnog broja
			if (decimal.contains(".")) {
				//stepen se izracunava na osnovu broja cifara iza zareza
				int power = decimal.substring(index + 1, decimal.length()).length();
				//nazivnik
				d = new BigInteger((int)(Math.pow(10,power))+"");
				//brojnik zavisno da li je uneseni broj pozitivan ili negativan
				if(decimal.charAt(0) == '-')
					n = (new BigInteger(decimal.substring(1, index)).multiply(d)).add(new BigInteger(decimal.substring(index + 1, decimal.length()))).negate();
				else n = (new BigInteger(decimal.substring(0, index)).multiply(d)).add(new BigInteger(decimal.substring(index + 1, decimal.length())));
				//n = n.add(new BigInteger(decimal.substring(index + 1, decimal.length())));
			} else {
				// ako sadrzi '/'
				n = new BigInteger(decimal.substring(0, index));
				d = new BigInteger(decimal.substring(index + 1, decimal.length()));
			}
			//ako je brojnik 0
			if (n.equals(BigInteger.ZERO)) {
				this.numerator = BigInteger.ZERO;
				this.denominator = BigInteger.ONE;				
			}
			else {
				BigInteger gcd = gcd(n, d);
				this.numerator = ((d.compareTo(BigInteger.ZERO) > 0) ? BigInteger.ONE : new BigInteger("-1")).multiply(n).divide(gcd);
				this.denominator = d.abs().divide(gcd);
			}
		}
		else {
			this.numerator = new BigInteger(decimal);
			this.denominator = BigInteger.ONE;
		}

    }
	//metoda pronalazi najveci zajednicki djelilac
	public static BigInteger gcd(BigInteger n, BigInteger d) {
		//absolutne vrijednosti
		BigInteger n1 = n.abs();
		BigInteger d1 = d.abs();
		//pocetna vrijednost = 1
		BigInteger gcd = BigInteger.ONE;
		//for od 1, do min od dva unesena broja , i++
		for (BigInteger k = BigInteger.ONE; k.compareTo(n1) <= 0 && k.compareTo(d1) <= 0; k = k.add(BigInteger.ONE)) {
			//ako su oba djeljiva sa k on je trenutni gcd
			if (n1.remainder(k).equals(BigInteger.ZERO) && d1.remainder(k).equals(BigInteger.ZERO)) {
				gcd = k;
			}
		}
		return gcd;
	}
	//geters
	public BigInteger getNumerator() {
		return numerator;
	}

	public BigInteger getDenominator() {
		return denominator;
	}

	//metoda za sabiranje
	public RationalBigInteger add(RationalBigInteger secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator()).add(denominator.multiply(secondRational.getNumerator()));
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return (n.equals(BigInteger.ZERO))? new RationalBigInteger() : new RationalBigInteger(n, d);
	}
	//metoda za oduzimanje
	public RationalBigInteger subtract(RationalBigInteger secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator()).subtract(denominator.multiply(secondRational.getNumerator()));
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return (n.equals(BigInteger.ZERO))? new RationalBigInteger() : new RationalBigInteger(n, d);
	}
	//metoda za mnozenje
	public RationalBigInteger multiply(RationalBigInteger secondRational) {
		BigInteger n = numerator.multiply(secondRational.getNumerator());
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return (n.equals(BigInteger.ZERO))? new RationalBigInteger() : new RationalBigInteger(n, d);
	}
	//metoda za djeljenje
	public RationalBigInteger divide(RationalBigInteger secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator());
		BigInteger d = denominator.multiply(secondRational.getNumerator());
		return (n.equals(BigInteger.ZERO))? new RationalBigInteger() : new RationalBigInteger(n, d);
	}

	@Override
	public String toString() {
		return (denominator.equals(BigInteger.ONE) ? numerator + "" : numerator
				+ "/" + denominator);
	}

	// the equals method in the Object class
	@Override
	public boolean equals(Object o) {
		return (this.subtract((RationalBigInteger) (o))).getNumerator()
				.equals(BigInteger.ZERO);
	}
	// Implement the abstract intValue method in Number
	@Override
	public int intValue() {
		return (int) doubleValue();
	}
	// Implement the doubleValue method in Number
	@Override
	public double doubleValue() {
		// ako se podijeli gubi se preciznost
		// ovdje prvo mnozimo numerator sa 100 pa ga tek onda podijelimo sa
		// dominatorom, extractujemo double vrijednost i onda podijelimo sa sto.
		// tako dobijamo preciznost na dvije decimale
		return new BigInteger("100").multiply(numerator).divide(denominator)
				.doubleValue() / 100.0;
	}
	
	// Implement the abstract floatValue method in Number
	@Override
	public float floatValue() {
		return (float) doubleValue();
	}	
	// Implement the abstract longValue method in Number
	@Override
	public long longValue() {
		return (long) doubleValue();
	}
	
	public BigInteger bigIntegerValue() {
		return numerator.divide(denominator);
	}
	//Implement the compareTo method in Comparable
	@Override
	public int compareTo(RationalBigInteger o) {
		if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) > 0)
			return 1;
		else if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) < 0)
			return -1;
		else
			return 0;
	}
}
