package zadaci_01_09_2016;

import java.util.ArrayList;

/* 13.2
 * (Shuffle ArrayList) Write the following method that shuffles an ArrayList of numbers:
 * public static void shuffle(ArrayList<Number> list)
 */

public class Zadatak_04_01_09 {

	public static void main(String[] args) {
		
		//kreiranje liste
		ArrayList<Number> list = new ArrayList<>(); 
		for (int i = 0; i < 10; i++) {
			list.add((int)(Math.random()*10));
		}
		//ispis liste
		System.out.println(list);
		//poziv metode za mjesanje
		shuffle(list);
		//lista nakon mjesanja
		System.out.println(list);
		

	}
	//metoda izmjesa elemente u listi
	public static void shuffle(ArrayList<Number> list) {
		//petlaj ide do 100
		for (int i = 0; i < 100; i++) {
			//varijable za dva indeksa nasumicno generisana broja od 0 do duzine liste
			int index1 = (int)(Math.random() * list.size());
			int index2 = (int)(Math.random() * list.size());
			//ptivremena promjenljiva za cuvanje broja na index1
			Number num = list.get(index1);
			//zamjeniti mjesta brojevina ma datim indeksima
			list.set(index1, list.get(index2));
			list.set(index2, num);
		}
	}

}
