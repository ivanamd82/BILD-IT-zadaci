package zadaci_26_08_2016;

import java.util.ArrayList;
import java.util.Collections;

public class Zadatak_05_26_08 {

	public static void main(String[] args) {
		
		// kreiranje liste i dodavanje 20 elemenata
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			list.add(i);
		}
		//ispis
		System.out.println(list);
		//poziv metode za mijesanje elemenata
		shuffle(list);
		//ispis
		System.out.println(list);

	}
	//metoda mijesa elemente u nizu
	public static void shuffle(ArrayList<Integer> list) {
		
		for (int i = 0; i < 100; i++) {
			// poziv metode swap iz Collecions koja mjenja elemente u listi
			// na odredjenim indeksima koji su nasumicno generisanje
			Collections.swap(list, (int) (Math.random() * list.size()),
					(int) (Math.random() * list.size()));
		}
	}

}
