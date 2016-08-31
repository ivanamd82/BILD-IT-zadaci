package zadaci_30_08_2016;
/* 12.7
 * (NumberFormatException) Write the bin2Dec(String binaryString)
 * method to convert a binary string into a decimal number. Implement the
 * bin2Dec method to throw a NumberFormatException if the string is not a binary string
 */

public class Zadatak_01_30_08 {

	public static void main(String[] args) {
		
		//testne promjenljive
		String s1 = "111001";
		String s2 = "20120";
		
		//prvi ispis ce odradti drugi ce javiti exception
		System.out.println("Konvrzija s1 u decimalni broj: "+bin2Dec(s1));
		System.out.println("Konvrzija s2 u decimalni broj: "+bin2Dec(s2));
		

	}
	public static int bin2Dec(String binary) throws NumberFormatException {
		//ako broj nije binaran trow exception
		if (!isBinary(binary)) {
			throw new NumberFormatException("String "+binary + " nije binaran broj.");
		}
		//konverzija iz bin u dec broj po formuli npr 111001 = 1·2^5+1·2^4+1·2^3+0·2^2+0·2^1+1·2^0 = 57
		//stepen postavljamo na maxsimalni broj indexa
		//pocetna vrijednost
		int stepen = binary.length()-1;
		int broj = 0;
		//krecemo od prvog broja pa do zadnjeg, a stepen inkrementiramo, uzimamo u obzir jedino ako je karakter '1';
		for (int i = 0; i < binary.length(); i++) {
			if (binary.charAt(i) == '1') {
                broj += Math.pow(2, stepen);
            }
			stepen--;
		}
		return broj;
		
	}
	//provjerava da li je string binarni broj
	//provjerava svaki karakter da li je 0 ili 1, ako nije onda nije bin broj
	public static boolean isBinary(String binary) {
		char[] binaryArray = binary.toCharArray();
		for (char c : binaryArray) {
			if (c != '0' && c != '1') 
			return false;
		}
		return true;
		
	}

}
