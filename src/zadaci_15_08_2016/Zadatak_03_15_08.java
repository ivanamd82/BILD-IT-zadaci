package zadaci_15_08_2016;
// Napisati program koji sabira sljedecu seriju 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 ..... + 95/97 + 97/99.

public class Zadatak_03_15_08 {

	public static void main(String[] args) {
		
		// ispisuje sumu 1/3 + 3/5 + ... + 97/99
		double sum = 0;
		for (int i = 1; i <= 97; i+=2) {	//brojnik ide od 1 do 97, a nazivnik je za dva veci od brojnika (3-99)
			sum+= i*1.0/(i+2);					//dodati na sumu
		}
		System.out.println("1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 ..... + 95/97 + 97/99 = "+sum);
	}

}
