package zadaci_18_08_2016;
/* 7.13 (Random number chooser) Write a method that returns a random number between 1 and 54,
 * excluding the numbers passed in the argument. The method header is specified as follows:
 * public static int getRandom(int... numbers)
 */

public class Zadatak_02_18_08 {

	public static void main(String[] args) {
		
		System.out.println(getRandom(1,2,3,4,5,6,7));

	}
	
	//metoda generise nasumicne brojeve izmedju 1 i 54, osim onih koji se nalaze u listi proslijedjenih argumenata
	public static int getRandom(int... numbers) {
		int random = 0;			//pocetna vrijednost random broja postavljena na 0
		do {
			random = (int)(Math.random()*54)+1;				//sve dok je random broj jednak nekom od elemenata sa lite postavi random na 0
			for (int i = 0; i < numbers.length; i++) {		//i ponavljalj generisanje broja
				if (random == numbers[i])
					random = 0;;
			}
		} while(random == 0);		
		return random;				//ako je uslov ispunjen vrati nasumicno generisan broj
	}

}
