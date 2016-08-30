package zadaci_26_08_2016;
/* 11.4 
 * (Maximum element in ArrayList) Write the following method that returns the 
 * maximum value in an ArrayList of integers. The method returns null if the
 * list is null or the list size is 0.
 * public static Integer max(ArrayList<Integer> list)
 * Write a test program that prompts the user to enter a sequence of numbers ending
 * with 0, and invokes this method to return the largest number in the input
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_03_26_08 {

	public static void main(String[] args) {
		
		//kreiranje liste
		ArrayList<Integer> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		//unos elemenata
		System.out.println("Unesite cijele brojeve, 0 zavrsava unos: ");
		int num = input.nextInt();
		while (num != 0) {
			list.add(num);
			num = input.nextInt();
		}
		input.close();
		//ispis
		System.out.println("Lista: "+list);
		System.out.println("Max: "+max(list));

	}
	//metoda trazi najvecu vrijednost u listi
	public static Integer max(ArrayList<Integer> list) {
		// pocetna vrijednost za max
		Integer max = 0;
		//ako je lista prazna varatiti null
		if (list.size() == 0)
			return null;
		//provjerava sve elemente u listi
		//ako je trenutni elem veci od trenutnog maxa, on postaje max
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) > max)
				max = list.get(i);
		}
		return max;
	}

}
