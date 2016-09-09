package zadaci_08_09_2016;

import java.util.ArrayList;

/*
 * 19.3 (Distinct elements in ArrayList) Write the following method that returns a new
 * ArrayList. The new list contains the non-duplicate elements from the original list.
 * public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
 */

public class Zadatak_01_08_09 {

	public static void main(String[] args) {

		//unos
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add((int)(Math.random()*10));
		}
		//ispis prve liste i nove liste
		System.out.println(list);
		list = removeDuplicates(list);
		System.out.println(list);

	}
	//metoda pravi listu bez duplih elemenata
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
		
		ArrayList<E> listNew = new ArrayList<>();
		for (E i : list ) {
			//ako lista ne sadrzi elemenat, dodaj ga
			if (!listNew.contains(i))
				listNew.add(i);
		}
		return listNew;
	}

}
