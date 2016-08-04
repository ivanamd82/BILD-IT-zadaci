package zadaci_04_08_2016;

public class Zadatak_04_04_08 {
	// Napisati metodu koja printa 100 nasumicnih uppercase karaktera i 100 nasumicnih brojeva, 10 po liniji.

	public static void main(String[] args) {
		final int n = 100;			// constante odredjuju broj brojeva koje treba printati i broj brojeva po liniji
		final int numPerLine = 10;
		randomUpperCaseCharNum(n, numPerLine);


	}
	// metoda za prikaz n velikih slova i n cijelih brojeva do 100
	public static void randomUpperCaseCharNum(int num, int numPerLine) {		
		for (int i = 1; i <= num; i++) {							//velika slova se nalaze u rasponu od 65-90
			System.out.print((char)(Math.random()*26+65)+" ");		//prikaz random svelikog slova
			if(i % numPerLine == 0)									//ako je prikazano slova kojiko je zadano promjenjlivom numPerLine
				System.out.println();								// predji u novi red
		}
		for (int i = 1; i <= num; i++) {
			System.out.printf("%-3d",(int)(Math.random()*100));		//generisanje random broja 0-99 i prikaz
			if(i % numPerLine == 0)
				System.out.println();
		}
	}

}
