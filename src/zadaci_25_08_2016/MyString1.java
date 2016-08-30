package zadaci_25_08_2016;
/* 10.22
 * Implement the String class) The String class is provided in the Java library. 
 * Provide your own implementation for the following methods (name the new class MyString1)
 */

public class MyString1 {
	
	//private data fields
	private char[] chars;	
	
	//no-arg const
	MyString1() {
		this.chars = null;
	}
	//const whit array arg
	public MyString1(char[] chars) {
		this.chars = new char[chars.length];
		for(int i = 0; i < chars.length; i++)
			this.chars[i] = chars[i];
	}
	//return char on index
	public char charAt(int index) {
		return chars[index];
	}
	//return length of string
	public int length(){
		return chars.length;
	}
	/*
	 * metoda vraca substring od stringa 
	 * @param begin - pocetni index
	 * @param end - krajnji index
	 */	
	public MyString1 substring(int begin, int end){
		//ako su indexi negativni, ako je pocetni ili krajnji jednak duzini stringa, ako je krajnji manji od pocetnog indexa
		//javi grasku
		if (begin < 0 || end < 0 || begin == chars.length || end == chars.length || end < begin)
			throw new IndexOutOfBoundsException();
		else {
			//kreirati niz sa duzinom end-begin
			char[] sub = new char[end-begin];
			//dodati elemente sa odgovarajuce pozicije u stringu
			for (int i = 0; i < sub.length; i++) {
				sub[i] = chars[begin+i];
			}
		return new MyString1(sub);	//vratiti substring
		}
	}
	//metoda vraca string sa svim malim slovima
	public MyString1 toLowerCase() {
		MyString1 strLow =  new MyString1();		//kreiranje novog objekta
		strLow.chars = new char[this.length()];
		for(int i = 0; i < strLow.length(); i++) {	//konverzija slova iz orginalnog stringa u mala slova
			strLow.chars[i] = Character.toLowerCase(this.chars[i]);
		}
		return strLow;
	}
	/*provjera da li su stringovi jednaki
	 * @param s - string s kojim se poredi
	 */		
	public boolean equals(MyString1 s) {
		//ako je string s kojim se poredi null, provjeriti da li je this string null
		if (s == null)
			return (this.chars == null) ? true : false;
		if (s.length() != this.length())
			return false;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != chars[i]) return false;
        }
        return true;
	}
	/*
	 * vraca broj i kao string
	 */
	public static MyString1 valueOf(int i) {
		
		int length = 0;		//duzina stringa
		int n = i;			//sve dok je n vece od nule inkrementirati duzinu
		while (n > 0) {
            n /= 10;
            length++;
        }
        char[] number = new char[length];			//kreiranje niza
        for (int j = length - 1; j >= 0; j--) {	 	
            number[j] = (char)('0' + (i % 10));
            i /= 10;
        }
        return new MyString1(number);		//vraca objekat koji prestavlja string oblik broja i
    }
	
	// metoda za testiranje  potrebna u testnom programu
	@Override
	public String toString() {
		String printStr = "";
		if (this.chars != null)
			for (int i = 0; i < this.length(); i++) {
				printStr += this.chars[i];
			}
		return printStr;
	}

}
