package zadaci_12_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_05_12_08 {
	/* Napisati program koji ucitava cijele brojeve u rasponu od 1 do 100
	 * te broji i ispisuje koliko je koji broj puta unijet. 
	 * Pretpostavimo da nula prekida unos brojeva. 
	 * Ukoliko unesemo sljedeci niz brojeva 2 5 6 23 42 58 2 6 0 program nam ispisuje
	 * da se broj 2 ponavlja 2 puta, broj 5 jednom, broj 6 2 puta, broj 23 jednom, itd. 
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] counter = new int[100];		//niz koji ce sadrzavati koliko se koji broj puta ponovio
		int count = 0;						//kontrolni brojac, broji koliko je elemenata uneseno
		
		System.out.println("Unesite cijele brojeve, 0 prekida unos: ");	
		int num = -1;		//pocetna vrijednost promjenljive koja sprema brojeve
		do {
		try {
			num = input.nextInt();			//unos podataka
			while (num != 0) {				//dok je broj razlicit od 0 ucitava brojeve
				if(num > 0 && num <= 100) {		//ako je broj veci od 0 i mani ili jednak 100, povecaj elemenat u nizu za jedan
					counter[num-1]++;				// na poziciji num -1, jer indeksi pocinju od nula
					count++;
				}
				else throw new InputMismatchException("Izvan raspona");//ako je broj negativan ili veci od 100 javi gresku
				num = input.nextInt();				
			}
		} catch (InputMismatchException ex) {	//u slucaju pogresnog unosa
			System.out.println("Pogresan unos. Morate unijeti pozitivne brojeve od 1 do 100.");
			input.nextLine();
		}
		} while (num != 0);		
		input.close();
		//ispis
		if (count == 0) System.out.println("Niste unijeli ni jedan broj osim 0.");
		else dysplayCount(counter);	
	}
	//metoda koja ispisuje ponavljanje unesenih brojeva
	public static void  dysplayCount(int[] array) {
		for(int i = 0; i < array.length; i++) {	//provjeravaj sve elemente u nizu
			if(array[i] != 0)		//ako je element razlicit od 0 ispisi koliko se puta pojavio broj koji je na tom indeksu(tj i+1)
				System.out.printf("Broj %d se pojavljuje %d puta.\n",i+1,array[i]);			
		}
	}

}
