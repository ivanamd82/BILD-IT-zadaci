package zadaci_25_08_2016;

public class TestMyString2 {

	public static void main(String[] args) {
		
		//kreiranje objekata
		String s = "String";
		String s1 = "strIng";
		MyString2 str = new MyString2(s);
		MyString2 str1 = new MyString2(s1);
		
		//provjera metoda
		System.out.println("Poredjenje stringa str i str1: "+str.compare(s1));
		System.out.println("Substring stringa str od 2 indexa: "+str.substring(2));
		System.out.println("String str sva velika slova: "+str.toUpperCase());
		
		//kreiranje char niza
		char[] chars = str.toChars();
		boolean b = true;
		System.out.println(str.valueOf(b));
	}

}
