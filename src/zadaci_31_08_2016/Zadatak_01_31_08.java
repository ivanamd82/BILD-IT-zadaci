package zadaci_31_08_2016;

import java.io.PrintWriter;
import java.util.Scanner;

/*
 * **12.12 (Reformat Java source code) Write a program that converts the Java source
code from the next-line brace style to the end-of-line brace style. For example,
the following Java source in (a) uses the next-line brace style. Your program
converts it to the end-of-line brace style in (b).
 */

public class Zadatak_01_31_08 {

	public static void main(String[] args) {
		try {
			// Za citanje file-a sa konzole, odkomentirati ove linije, a
			// komentirati narednu
			/**
			 * String path = args[0];
			 * 
			 */
			String path = "src/zadaci_31_08_2016/Zadatak_04_31_08.java";
			// kreiranje file-a na osnovu proslijedjene putanje
			java.io.File file = new java.io.File(path);
			file.createNewFile();
			// za citanje iz file-a
			Scanner in = new Scanner(file); // kreiranje skenera
			// ukoliko file ne postoji, ne nastavljaj dalje
			if (!file.exists()) {
				System.out.println(file + " does not exist.");
				System.exit(1);
			}
			// String Buffer za dodavanje stringova
			StringBuffer sb1 = new StringBuffer();
			// Ubaci stringove u StringBuffer
			while (in.hasNext()) {
				String s = in.nextLine();
				System.out.println(s);
				sb1.append(s + System.lineSeparator());
			}
			in.close();
			// poziv metode
			String output = format(sb1.toString());
			// printanje u konzoli
			System.out.println(output);
			// printanje u file natrag
			PrintWriter pw = new PrintWriter(file);
			pw.print(output);
			pw.close();
		} catch (Exception e) {
			System.err.println("Greska. Pokusajte ponovo.");
		}

	}

	// provjerava da li postoji "{" u stringu te ga prebacuje u liniju iznad
	public static String format(String s) {
		String result = "";
		result = s.replaceAll("\\s+\\{", "{");
		return result;
	}

}
