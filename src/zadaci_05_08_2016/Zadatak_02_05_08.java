package zadaci_05_08_2016;

public class Zadatak_02_05_08 {
	/* Napisati program koji simulira nasumicno izvlacenje karte iz spila od 52 karte. 
	 * Program treba ispisati koja karta je izvucena (A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q ili K)
	 * te znak u kojem je data karta (Srce, Pik, Djetelina, Kocka).
	 * Primjer: Karta koju ste izvukli je 10 u znaku kocke.
	 */
	public static void main(String[] args) {
		// karte i boje predstavljeni u nizovima
		String[] cards = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		String[] colors = {"srce", "pik", "djetelina", "kocka"};
		int card = (int)(Math.random() * 13);	//random karta, jedan broj 0-12 predstavlja lokaciju elementa u nizu cards
		int color = (int)(Math.random() * 4);	//random boja, jedan broj 0-3	predstavlja lokaciju boje u nizu
		System.out.println("Karta koju ste izvukli je "+cards[card]+" u znaku "+colors[color]+".");
	}

}
