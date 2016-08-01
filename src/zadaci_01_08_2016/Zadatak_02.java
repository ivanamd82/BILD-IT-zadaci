package zadaci_01_08_2016;

import java.util.Scanner;

public class Zadatak_02 {

	public static void main(String[] args) {
		// Korisnik unosi sring, program racuna broj samoglasnika i suglasnika
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite string: ");
		String str = input.nextLine().toUpperCase(); // converting string to upper case
		input.close();
		countVC(str);
		
	}
	public static void countVC(String str) {
		int counterV = 0; // set counter of vowels on 0
		int counterC = 0; // set counter of consonants on 0
		
		// check characters in string 
		for (int i = 0; i <= str.length()-1; i++) {
			if (Character.isLetter(str.charAt(i))) { // check is character letter
				if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U')
					counterV++; // if vowel increment counter
				else counterC++; // if consonant increment counter
			}			
		}
		System.out.printf("Broj suglasnika u stringu: %d\nBroj samoglasnika u stringu: %d",counterV,counterC);
		
	}

}
