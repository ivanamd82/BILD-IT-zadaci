package zadaci_01_08_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_05 {

	public static void main(String[] args) {
		// Program gets inputs from user, until the input is 0
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>(); 
		System.out.println("Unesite cijele brojeve, 0 prekida unos: ");
		try {
			int number = input.nextInt();
			while (number != 0) {
				list.add(number); //add numbers to arrayList
				number = input.nextInt();
			}
			input.close();
			
			maxNumCount(list);
			
		}
		catch (InputMismatchException ex) {
			System.out.println("Pogresan unos. Program prihvata samo brojeve.");
		}		
	}
	public static void maxNumCount(ArrayList<Integer> list) {
		if (list.size() == 0) // condition if list is empty
			System.out.println("Nema elemenata u listi.");
		else {
			int max = list.get(0); // set first element as max
			int counter = 0; // number of repeats
			for (Integer i: list) {
				if (i > max) { //if next number is greater from current max number set new max
					max = i;
					counter = 1; // restart counter
				}
				else if (i == max) // if max is repeated increment counter
					counter++;
			}
			System.out.println("Najveci broj je "+max+" i ponavlja se "+counter+" puta.");
		}

	}

}
