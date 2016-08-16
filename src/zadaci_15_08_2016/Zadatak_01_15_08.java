package zadaci_15_08_2016;
/*Napisati program koji nasumicno generise cijeli broj izmedju 1 i 12
 * te ispisuje ime mjeseca za taj broj. (Januar za 1, Ferbruar za 2....)
 */

public class Zadatak_01_15_08 {

	public static void main(String[] args) {
		//imena mjeseca su elementi niza
		String[] months = {"januar","februar","mart","april","maj","juni","juli","avgust","sepembar","oktobar","novembar","decembar"};
		int month = (int)(Math.random()*12) + 1;	//generisanje broja od 1-12
		System.out.println(month+". mjesec je "+months[month-1]+".");	//ispis imena mjeseca koje 
																		//odhovara elementu iz niza months na month -1 poziciji
	}

}
