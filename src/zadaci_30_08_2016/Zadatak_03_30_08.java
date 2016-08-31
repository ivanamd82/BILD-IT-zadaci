package zadaci_30_08_2016;
/* 12.11
 * (Remove text) Write a program that removes all the occurrences of a specified
 * string from a text file. For example, invoking
 * java Exercise12_11 John filename
 * removes the string John from the specified file. Your program should get the
 * arguments from the command line.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadatak_03_30_08 {

	public static void main(String[] args) {
		//provjera da li su arg ispravni
		if (args.length != 2) {
            System.out.println("Pogresni argumenti.");
            System.exit(1);
        }
		
		String s = "";
        try {
        	//kreiranje objekta
        	File file = new File(args[1]);
        	Scanner input = new Scanner(file);
			//petlja ucitava tekst iz fajla
			while (input.hasNext()) {
				s += input.nextLine() + "\n";
			}
			input.close();
			//mjenja odredjeni tekst
			s = s.replaceAll(args[0], "");
			//krira obejekat
			PrintWriter output = new PrintWriter(file);
            //upisuje promjenjeni fajl
            output.write(s);
            output.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fajl ne postoji");
            System.exit(1);
        }        
	}
	
}
