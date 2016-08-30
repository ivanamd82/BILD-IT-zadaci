package zadaci_25_08_2016;

public class TestMyString1 {

	public static void main(String[] args) {
		
		//kreiranje char nizova
		char[] slova = {'S','t','r','I','n','g'};
		char[] slova1 = {'S','t','r','I','n','g'};
		char[] slova2 = {'s','t','r','i','n','g'};
		
		//kreiranje objekata
		MyString1 str = new MyString1(slova);
		MyString1 str1 = new MyString1(slova1);
		MyString1 str2 = new MyString1(slova2);
		
		//kreiranje numerickog stringa pomocu metode
		MyString1 str3 = MyString1.valueOf(5555);
		
		//ispis i provjera svih metoda u klasi
		int index = 2;
		System.out.println("Str: "+str);
		System.out.println("Duzina stringa str je : "+str.length());
		System.out.println("Na indexu "+index+" stringa str se nalazi karakter "+str.charAt(index));
		System.out.println("Substring stringa str, indexi 1 i 4: "+str.substring(1, 4));
		System.out.println("String str sva mala slova: "+str.toLowerCase());
		System.out.println();
		System.out.println("Str1: "+str1);
		System.out.println("Da li su jednaki str i str1 "+str.equals(str1));
		System.out.println();
		System.out.println("Str2: "+str2);
		System.out.println("Da li su jednaki str i str2 "+str.equals(str2));
		System.out.println();
		System.out.println("Da li su jednaki str1 i str2 "+str1.equals(str2));
		System.out.println();
		System.out.println("Str3 : "+str3);
	}

}
