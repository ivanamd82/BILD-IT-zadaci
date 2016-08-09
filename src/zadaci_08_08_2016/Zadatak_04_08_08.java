package zadaci_08_08_2016;

public class Zadatak_04_08_08 {
	/*Pozitivni cijeli broj je savrsen broj ukoliko je jednak zbiru svih svojih pozitivnih djelilaca,
	 *iskljucujuci sebe. Na primjer, 6 je prvi savrseni broj jer 6 = 3 + 2 + 1. 
	 *Sljedeci savrseni broj je 28 jer 28 = 14 + 7 + 4 + 2 + 1. 
	 *Samo 4 savrsena broja postoje u rasponu od 0 do 10.000. Napisite program koji ispisuje sva 4.
	*/
	public static void main(String[] args) {

		System.out.println("Savrseni brojevi od 0 do 10.000: ");
		for (int number = 1; number < 10000; number++) {	//uslov petlje
			int sum = 0;									//pocetna vrijednost za sumu je 0
			for (int i = 1; i<= number/2; i++) {		//provjerava da li je broj djeljiv sa svim brojevima od 1 do njegove polovine
				if (number % i == 0)					//jer su u pitanju cijeli brojevi pa je najveci djelilac number/2
					sum += i;							//ako je broj djeljiv sa nekim brojem dodaj taj djelilac sumi		
			}
			if (sum == number)			//ako je suma jednaka broju broj je savrsen
				System.out.println(number);
		}
	}

}
