package zadaci_01_08_2016;

import java.util.ArrayList;

public class Zadatak_01 {

	public static void main(String[] args) {
		// Creating list and adding 10 random elements
		ArrayList<Integer> list = new ArrayList<>();
		// Add random elements
		for (int i = 0; i < 10; i++) {
			list.add((int)(Math.random() * 10));
		}
				
		System.out.println("Najveci element u listi je "+max(list));
	}
	
	public static Integer max(ArrayList<Integer> list) {
		// if list is empty or contains null
		if (list == null || list.isEmpty())
			return null;
		else {
			// set first element as max
			int max = list.get(0);
			// search for max element in list
			for (Integer i: list) {
				if (i > max) // if is element i greater than max, set i as max
					max = i;
			}
			return max;
		}
	}

}
