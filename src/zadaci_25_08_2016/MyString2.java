package zadaci_25_08_2016;
/* 10.23
 * (Implement the String class) The String class is provided in the Java library. 
 * Provide your own implementation for the following methods (name the new class MyString2):
 */

public class MyString2 {
	
	//data fields
	private String s;
	
	/* konstruktor
	 * @param s = string
	 */	
	public MyString2(String s) {
		this.s = s; 
	}
	
	// metod aporedi dva stringa, tj razlike u intigeru
	public int compare(String s) {
		// granica za provjeru je duzina kraceg stringa
		int limit = (s.length() < this.s.length()) ? s.length() : this.s.length();
		char ch1, ch2;	
		//provjerava svaki karakter od prvog do postavljene granice i vraca razliku izmedju int vrijednosti karaktera
		for (int i = 0; i < limit; i++) {
			ch1 = this.s.charAt(i);
			ch2 = s.charAt(i);
			if (ch1 != ch2) 
                return ch1 - ch2;
		}
		return this.s.length() - s.length();
		
	}
	//vraca podstring od zadanog indeksa do kraja stringa
	public MyString2 substring(int begin) {
		MyString2 substring = new MyString2("");
		substring.s = this.s.substring(begin);
		return substring;
	}
	//konvertuje sve karaktere u velika slova
	public MyString2 toUpperCase() {
		MyString2 str = new MyString2("");
		str.s = this.s.toUpperCase();
		return str;
	}
	// vraca niz karaktera stringa
	public char[] toChars() {
		return this.s.toCharArray();
	}
	//vraca string koji prestavlja opis boolean vrijednosti
	public static MyString2 valueOf(boolean b) {
		MyString2 str = new MyString2("");
		str.s = (b)? "true" : "false";
		return str;
	}
	//ispis stringa
	public String toString() {
		return this.s;
	}
}
