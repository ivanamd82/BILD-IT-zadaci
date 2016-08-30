package zadaci_25_08_2016;

public class TestMyCharacter {

	public static void main(String[] args) {
		
		//kreiranje objekta
		MyCharacter c1 = new MyCharacter('a');
		MyCharacter c2 = new MyCharacter('d');
		
		int i = 77;
		//ispitivanje nekih metoda
		MyCharacter c3 = new MyCharacter(i);
		
		System.out.println("Da li je karakter "+c1.getChar()+" broj? "+c1.isDigit());
		System.out.println("Da li su c1 i c2 jednaki? "+c1.equals(c2));

	}

}
