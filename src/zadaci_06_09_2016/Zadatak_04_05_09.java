package zadaci_06_09_2016;
/*
 * 18.5 (Sum series) Write a recursive method to compute the following series:
 * m(i) = 1/3 + 2/5 + 3/7 + 4/9 + 5/11 + 6/13 + ... + i/(2i + 1)
 * Write a test program that displays m(i) for i = 1, 2, . . ., 10.
 */

public class Zadatak_04_05_09 {

	public static void main(String[] args) {
		
		//max vrijednost i ispis sume serije za vrijednosti i od 1 do n
		int n = 10;
		System.out.println("Suma serije 1/3 + 2/5 + 3/7 + 4/9 + 5/11 + 6/13 + ... + i/(2i + 1)");
		for (int i = 1; i <= n; i++) {
			System.out.print("za i = "+i+" je ");
			System.out.print(sumR(i));
			System.out.println();
		}
	}
	//metoda koja sabira trazenu seriju
	public static double sumR(int i) {
		//ako je i = 1, rezultat je i/(2i + 1) tj 1/3
		if (i == 1)
			return i*1.0/(2 * i + 1);
		//ako nije poziva samu sebe i dodaje joj i/(2i + 1)
		else return sumR(i-1) + (i*1.0/(2 * i + 1));
	}

}
