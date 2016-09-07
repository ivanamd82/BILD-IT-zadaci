package zadaci_05_09_2016_;

public class Rational extends Number implements Comparable<Rational>{

	private long[] r = new long[2];
	
	//no-arg kondtruktor 0/1 = 0
	public Rational() {
		this(0, 1);
	}
	//konstruktot sa parametrima
	public Rational(long numerator, long denominator) {
		//ako je nazivnik 0
		if (denominator == 0) {
			System.out.println("Nazivnik ne moze biti nula");
			System.exit(1);
		}
		//ako je brojnik jednak 0
		if (numerator == 0) {
			r[0] = 0;
			r[1] = 1;
		}
		else {
			//nadjemoo gcd u slucaju da su uneseni br djeljivi i skratimo ih
			long gcd = gcd(numerator, denominator);
			r[1] = Math.abs(denominator)/gcd;
			if (denominator > 0) {
				r[0]= numerator/gcd;
			}
			//ako je negativan, brojnik mjenja znak iz + u -, i obrnuto
			else r[0] = -1 * numerator / gcd;	
		}
	}
	//konstruktor sa parametrima tipa String
	public Rational(String number) {
		long numerator = 0;
		long denominator = 0;
		//ako string sadrzi '/' ili '.'
		if (number.contains("/") || number.contains(".")) {
			if (number.contains("/")) {
				//prvo pojavljivanje znaka /
				int index = number.indexOf('/');
				//brojilac je dio stringa do indeksa
				numerator = Integer.parseInt(number.substring(0, index));
				//nazivnik je dio stringa posle indeksa
				denominator = Integer.parseInt(number.substring(index + 1, number.length()));
			}
			else if (number.contains(".")) {
				int index = number.indexOf('.');
				//stepen se izracunava na osnovu broja cifara iza zareza
	            int power = number.substring(index + 1, number.length()).length();
	            //nazivnik
	            denominator = (long)(Math.pow(10,power));
	          //brojnik zavisno da li je uneseni broj pozitivan ili negativan
	            if(number.charAt(0) == '-')
	            	numerator = -(Integer.parseInt(number.substring(1, index)) * denominator
	            				+ Integer.parseInt(number.substring(index + 1, number.length())));
	            else numerator = Integer.parseInt(number.substring(0, index)) * denominator
        						+Integer.parseInt(number.substring(index + 1, number.length()));
			}
			//ako je brojnik nula
			if (numerator == 0) {
				r[0] = 0;
				r[1] = 1;
			}
			else {
				//nadjemo najmanji zajednicki djelilac, da bi mogli "skratiti" brojeve
				long gcd = gcd(numerator, denominator);
				//nazivnik
				r[1] = Math.abs(denominator)/gcd;
				//ako je nazivnik veci od nule
				if (denominator > 0) {
					//brojnik je jednak unesenom broju podjeljenom sa gcd
					r[0]= numerator/gcd;
				}
				//ako je negativan, brojnik mjenja znak iz + u -, i obrnuto i djeli se sa gcd
				else r[0] = -1 * numerator / gcd;
			}
		}
		//ako je uneseni broj u formi cijelog broja
		else {
			r[0] = Integer.parseInt(number);
			r[1] = 1;
		}
	}

	//najveci zajednicki djelilac
	private static long gcd(long n, long d) {
		//uzimamo apsolutne vrijednosti
		long n1 = Math.abs(n);
		long n2 = Math.abs(d);
		int gcd = 1;
		for (int k = 1; k <= n1 && k <= n2; k++) {
			if (n1 % k == 0 && n2 % k == 0) {
				gcd = k;
			}
		}
		return gcd;
		
	}
	//getter
	public long getNumerator() {
		return r[0];
	}
	//return deniminator
	public long getDenominator() {
		return r[1];
	}
	//sabiranje
	public Rational add(Rational secondRational) {
		long n = r[0] * secondRational.getDenominator() + r[1] * secondRational.getNumerator();
		long d = r[1] * secondRational.getDenominator();
		
		return (n == 0 ) ? new Rational() : new Rational(n,d);
	}
	//oduzimanje
	public Rational subtract(Rational secondRational) {
		long n = r[0] * secondRational.getDenominator() - r[1] * secondRational.getNumerator();
		long d = r[1] * secondRational.getDenominator();
		return (n == 0 ) ? new Rational() : new Rational(n,d);
	}
	//mnozenje
	public Rational multiply(Rational secondRational) {
		//ako je bilo koji brojnik jednak 0
		if (this.getNumerator() == 0 || secondRational.getNumerator() == 0) {
			return new Rational();
		}
		long n = r[0] * secondRational.getNumerator();
		long d = r[1] * secondRational.getDenominator();
		return new Rational(n,d);
	}
	//dijeljenje
	public Rational divide(Rational secondRational) {
		//ako se djeli nulom
		if (secondRational.getNumerator() == 0) {
			System.out.println("Dijeljenje nulom nije moguce!");
			System.exit(1);
		}
		//ako je bilo koji brojnik nula
		if (this.getNumerator() == 0 || secondRational.getNumerator() == 0) {
			return new Rational();
		}
		long n = r[0] * secondRational.getDenominator();
		long d = r[1] * secondRational.getNumerator();
		return new Rational(n,d);
	}
	@Override
	public String toString() {
		return (r[1] == 1) ? r[0]+"" : r[0]+"/"+r[1];
	}
	// Override the equals method in the Object class
	@Override 
	public boolean equals(Object other) {
		if ((this.subtract((Rational)(other))).getNumerator() == 0)
			return true;
		else return false;
	}
	@Override // Implement the abstract intValue method in Number
	public int intValue() {
		return (int)doubleValue();
	}
	@Override // Implement the abstract floatValue method in Number
	public float floatValue() {
		return (float)doubleValue();
	}
	
	@Override // Implement the doubleValue method in Number
	public double doubleValue() {
		return r[0] * 1.0 / r[1];
	}
	@Override // Implement the abstract longValue method in Number
	public long longValue() {
		return (long)doubleValue();
	}
	// Implement the compareTo method in Comparable
	@Override 	
	public int compareTo(Rational o) {
		if (this.subtract(o).getNumerator() > 0)
			return 1;
		else if (this.subtract(o).getNumerator() < 0)
			return -1;
		else
			return 0;
	}	
}
