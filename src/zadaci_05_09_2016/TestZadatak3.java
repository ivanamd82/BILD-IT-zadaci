package zadaci_05_09_2016;
/*
 * uzeti u obzir samo pozitivni racionalni brojevi napisani u formi n/d
 * za sve ostale argumente javlja gresku
 */

public class TestZadatak3 {

	public static void main(String[] args) {
		
		menu();

	}
	public static void menu() {
		
		String[] args = {"1/4","+","1/4"};
		String[] args1 = {"1/1","*","1/2"};
		
		Zadatak_03_05_09.main(args);
		Zadatak_03_05_09.main(args1);
		
	}

}
