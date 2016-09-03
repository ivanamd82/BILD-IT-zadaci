package zadaci_01_09_2016;

import java.util.ArrayList;
/* 13.3
 * (Sort ArrayList) Write the following method that sorts an ArrayList of numbers.
 * public static void sort(ArrayList<Number> list)
 */

public class Zadatak_05_01_09 {

	public static void main(String[] args) {
		
		//kreiranje liste
		ArrayList<Number> list = new ArrayList<>(); 
		for (int i = 0; i < 10; i++) {
			list.add((int)(Math.random()*10));
		}
		//ispis liste
		System.out.println(list);	
		sort(list);
		System.out.println(list);
		

	}
	public static void sort(ArrayList<Number> list) {
		//pocetna vrijednost
		int i = 0;
		//petlja dok index ne dodje do kraja liste
		while(i < list.size()) {
			//petla, ide do predzadnjeg elementa
			for (int j = 0; j < list.size()-1; j++) {
				//poredimo elemente na indeku j  i indeksu j+1
				// ako je veca od elementa na idneksu j+1, zamijeni im pozicije.
				if (list.get(j).doubleValue() > list.get(j+1).doubleValue()) {
					// promjenljiva za privremeno cuvanje elementa
					Number temp = list.get(j);
					// kopiramo elemenat sa prvog indeksa na indeks drugog elementa
					list.set(j, list.get(j+1));
					// kopiramo temp (drugi elemenat) preko prvog elementa
					list.set(j+1, temp);
				}
			}
			//povecati i
			i++;
		}
	}

}
