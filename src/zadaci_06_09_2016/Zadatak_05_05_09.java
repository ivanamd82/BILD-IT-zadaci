package zadaci_06_09_2016;
/* 18.6
 * (Sum series) Write a recursive method to compute the following series:
 * m(i) = 1/2 + 2/3 + ... + i/(i + 1)
 * Write a test program that displays m(i) for i = 1, 2, . . ., 10.
 */

public class Zadatak_05_05_09 {

	public static void main(String[] args) {
		
		//max vrijednost i ispis sume serije za vrijednosti i od 1 do n
		int n = 10;
		System.out.println("Suma serije  1/2 + 2/3 + ... + i/(i + 1)");
		for (int i = 1; i <= n; i++) {
			System.out.print("za i = "+i+" je ");
			System.out.print(sumR(i));
			System.out.println();
		}
	}
	//metoda koja sabira trazenu seriju
	public static double sumR(int i) {
		//ako je i = 1, rezultat je i/(i + 1) tj 1/2
		if (i == 1)
			return i*1.0/(i + 1);
		//ako nije poziva samu sebe i dodaje joj i/(i + 1)
		else return sumR(i-1) + (i*1.0/(i + 1));
	}

}
