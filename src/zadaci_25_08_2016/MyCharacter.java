package zadaci_25_08_2016;

public class MyCharacter {
	
	public static final char MIN_VALUE = '\u0000';
	public static final char MAX_VALUE = '\uFFFF';

	private char ch;
	
	public MyCharacter(char ch) {
        this.ch = ch;
    }
	
	public MyCharacter(int n) {
		//ako je izvan opsega javi poruku o greski
		if (n >= MIN_VALUE && n <= MAX_VALUE) {
			this.ch = (char)(n);
		} else {
			System.out.println("Pogresan unos.");
		}
	}
	//provjerava da li je karakter broj
	public static boolean isDigit(char ch) {
        return ch <= '9' && ch >= '0';
    }
	//provjerava da li je malo slovo
	public static boolean isLowerCase(char ch) {
        return (ch <= 'z' && ch >= 'a');
    }
	//provjerava da li je veliko slovo
    public static boolean isUpperCase(char ch) {
        return (ch <= 'Z' && ch >= 'A');
    }
    //provjerava da li je slovo
    public static boolean isLetter(char ch) {
        return (ch <= 'z' && ch >= 'a') ||
                (ch <= 'Z' && ch >= 'A');
    }
    //provjerava da li je slovo ili broj
    public static boolean isLetterOrDigit(char ch) {
        return isLetter(ch) || isDigit(ch);
    }
    //da li je broj
    public boolean isDigit() {
        return isDigit(ch);
    }
    //da li je slovo
    public boolean isLetter() {
        return isLetter(ch);
    }
    //vraca karakter
    public char getChar() {
        return ch;
    }
    //provjerava da li su karakteri jednaki
    public boolean equals(MyCharacter ch) {
        return this.ch == ch.getChar();
    }
}
