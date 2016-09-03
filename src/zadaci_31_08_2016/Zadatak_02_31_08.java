package zadaci_31_08_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * 12.18 (Add package statement) Suppose you have Java source files under the directories
chapter1, chapter2, . . . , chapter34. Write a program to insert the
statement package chapteri; as the first line for each Java source file under
the directory chapteri. Suppose chapter1, chapter2, . . . , chapter34
are under the root directory srcRootDirectory. The root directory and
chapteri directory may contain other folders and files. Use the following
command to run the program:
java Exercise12_18 srcRootDirectory
 */

public class Zadatak_02_31_08 {

	public static void main(String[] args) {
		// ukoiko nisu uneseni argumenti, stopiraj izvodjenje programa
		if (args.length == 0) {
			System.out.println("Nevalidan unos argumenata !");
			System.exit(-1);
		}
		//kreiraj file na osnovu proslijedjene putanje
		File rootDir = new File(args[0]);
		File[] directories = rootDir.listFiles();

		ArrayList<File> packageDirs = new ArrayList<>();
		// copy - paste from stackowerflow
		for (int i = 0; i < directories.length; i++) {
			if (directories[i].isDirectory() && directories[i].getName().contains("Chapter")) {
				packageDirs.add(directories[i]);
			}
		}
		// ukoliko nisu pronadjeni chapteri
		if (packageDirs.isEmpty()) {
			System.out.print("Nema pronadjenih chaptera unutar " + rootDir.getName());
			System.exit(1);
		}
		// ukoliko postoje chapteri
		for (File dir : packageDirs) {
			// uzmi fajlove iz svakog od njih
			File[] files = dir.listFiles();
			// ako nema fileova, preskoci datu iteraciju
			if (files == null)
				continue;
			// ukoliko postoje
			for (File file : files) {
				// provjeri da li su tipa java file
				if (file.getName().contains(".java")) {
					// te pozovi metodu kojoj prosljedjuje pojedinacni file i
					// ime direktorija
					updateFilePackage(file, dir.getName());
				}
			}
		}

	}

	// metoda koja dodaje ime paketa unutar java file-a
	private static void updateFilePackage(File file, String name) {

		String lineSeparator = System.getProperty("line.separator");
		String packageString = "package " + name + ";";

		// scanner za citanje iz file-a
		try (Scanner input = new Scanner(file)) {

			while (input.hasNext()) {

				String s = input.nextLine();
				if (s.equals(packageString)) {
					System.out.println("File: " + file + " already has package " + name);
					return;
				}
				packageString += lineSeparator + s;

			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		// spremanje novog file-a
		try (PrintWriter out = new PrintWriter(file)) {
			out.write(packageString);
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		System.out.println(packageString);

	}

}
