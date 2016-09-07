package zadaci_06_09_2016;
/* 18.4
 * (Sum series) Write a recursive method to compute the following series:
 * m(i) = 1 +1/2 + 1/3 + ... + 1/i
 * Write a test program that displays m(i) for i = 1, 2, . . ., 10.
 */

public class Zadatak_03_05_09 {

	public static void main(String[] args) {
		
		//max vrijednost i ispis sume serije za vrijednosti i od 1 do n
		int n = 10;
		System.out.println("Suma serije 1 +1/2 + 1/3 + ... + 1/i");
		for (int i = 1; i <= n; i++) {
			System.out.print("za i = "+i+" je ");
			System.out.print(sumR(i));
			System.out.println();
		}			
	}
	
	//metoda koja sabira trazenu seriju
	public static double sumR(int i) {
		//ako je i = 1, rezultat je 1
		if (i == 1)
			return 1;
		//ako nije poziva samu sebe i dodaje joj 1/i
		else return sumR(i - 1) + (1.0 / i);
	}

}
