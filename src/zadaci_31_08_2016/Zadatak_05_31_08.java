package zadaci_31_08_2016;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Zadatak_05_31_08 {

	public static void main(String[] args) throws IOException {
		File file = new File("Salary.txt");
		
		try {
			if (!file.exists()) {
				file.createNewFile();
			}
			BufferedWriter upis = new BufferedWriter(new FileWriter(file,true));
			for (int i = 1; i <= 1000; i++) {
				String rank = randomRank();
				double salary = randomSalary(rank); 
				upis.write("FirstName" + i + " LastName" + i + "\n");
				upis.close();
				System.out.println("Napomena dodata.");
			}				
		} catch (IOException e){
			System.out.println("greska");			
		}

	}
	public static String randomRank() {
		String[] rank = {"assistant","associate","full"};
		return rank[(int)(Math.random() * 3)];
	}
	public static double randomSalary(String rank) {
		if (rank.equals("assistant")) {
			return (int)((Math.random() * 3000000) + 5000000)/100.0;
			// ako je associate generisi plati izmedju 60000 i 110000
		} else if (rank.equals("associate")) {
			return (int)((Math.random() * 5000000) + 60000000)/100.0;
		} else {
			// ako je asistent generisi plati izmedju 75000 i 130000
			return (int)((Math.random() * 5500000) + 75000000)/100.0;
		}
	}

}
