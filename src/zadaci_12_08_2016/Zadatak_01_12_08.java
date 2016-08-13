package zadaci_12_08_2016;

public class Zadatak_01_12_08 {
	/* Pretpostavimo da se registarska tablica za auto sastoji od
	 * tri uppercase karaktera i 4 broja u sljedecem formatu AAA-1234. 
	 * Napisati program koji nasumicno generise tablicu.
	 */

	public static void main(String[] args) {		
		
		String tablica = "";			//pocetna vrijednost promjenljive prazan string;
		char letter = ' ';				//inicijalizacija promjenljive za cuvanje generisanih slova
		
		for (int i = 0; i < 3; i++) {		//petlja za generisanje 3 uppercase karaktera
			letter = (char)(Math.random()*26+65);	//generisanje broja u rangu 65-90(velika slova u ASCCI) i konverzija u char
			tablica += letter;						//dodavanje svakog slova stringu
		}
		tablica += "-";							//dodavanje karaktera "-" stringu
		
		int number = 0;							//promjenljiva za generisane brojeve
		for (int i = 0; i < 3; i++) {			//generisanjje 3 cijela jednocifrena broja
			number = (int)(Math.random()*10);
			tablica += number;					//dodavanje svakog broja stringu
		}
		System.out.println(tablica);			//ispis
	}

}
