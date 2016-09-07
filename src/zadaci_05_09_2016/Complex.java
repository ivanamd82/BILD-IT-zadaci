package zadaci_05_09_2016;

public class Complex {
	// realini i kompleksni dio
	private double a;
	private double b;
	
	//no-arg kondtruktor
	public Complex() {
		
	}

	//konstruktot sa parametr0m
	public Complex(double a) {
		this(a, 0.0);
	}

	////konstruktot sa parametrima
	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}

	//sabiranje
	public Complex add(Complex c) {
		return new Complex(a + c.getRealPart(), b + c.getImaginaryPart());
	}

	//oduzimanje
	public Complex substract(Complex c) {
		return new Complex(a - c.getRealPart(), b - c.getImaginaryPart());
	}

	//mnozenje
	public Complex multiply(Complex c) {
		double real = a * c.getRealPart() - b * c.getImaginaryPart();
		double imaginary = b * c.getRealPart() + a * c.getImaginaryPart();

		return new Complex(real, imaginary);
	}

	//dijeljenje
	public Complex divide(Complex c) {
		double real = (a * c.getRealPart() + b * c.getImaginaryPart())
				/ (Math.pow(c.getRealPart(), 2) + Math.pow(
						c.getImaginaryPart(), 2));
		double imaginary = (b * c.getRealPart() + a * c.getImaginaryPart())
				/ (Math.pow(c.getRealPart(), 2) + Math.pow(
						c.getImaginaryPart(), 2));

		return new Complex(real, imaginary);
	}

	//absoslutna vrijednost
	public double abs() {
		return (int) (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) * 100) / 100.0;
	}

	//realni dio kompleksnog broja.	
	public double getRealPart() {
		return a;
	}

	//Vraca imaginarni dio.	
	public double getImaginaryPart() {
		return b;
	}

	@Override
	public Complex clone() {
		Complex c = new Complex(a, b);
		return c;
	}

	//metod koji vrsi operacije sabiranja, oduzimana, mnozenja i
	// dijeljenja dva poslijedjena kompleksna broja.	
	public static void allOperations(Complex a, Complex b) {
		System.out.println("(" + a + ") + (" + b + ") = " + a.add(b));
		System.out.println("(" + a + ") - (" + b + ") = " + a.substract(b));
		System.out.println("(" + a + ") * (" + b + ") = " + a.multiply(b));
		System.out.println("(" + a + ") + (" + b + ") = " + a.divide(b));
		System.out.println("|(" + a + ")| = " + a.abs());
	}

	@Override
	public String toString() {
		if (a == 0.0) {
			if (b != 0) {
				return (int) (b * 100) / 100.0 + "i";
			} else {
				return "0";
			}
		} else {
			if (b == 0.0) {
				return (int) (a * 100) / 100.0 + "";
			} else {
				return (int) (a * 100) / 100.0 + " + " + (int) (b * 100)
						/ 100.0 + "i";
			}
		}
	}
}