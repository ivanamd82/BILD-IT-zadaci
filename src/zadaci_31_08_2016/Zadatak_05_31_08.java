package zadaci_31_08_2016;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Zadatak_05_31_08 {

	public static void main(String[] args) throws IOException {
		//kreiranje objekta
		File file = new File("Salary.txt");
		
		try {
			//ako fajl ne postoji napravi
			if (!file.exists()) {
				file.createNewFile();
			}
			//omogucava upis podataka u fajl
			BufferedWriter upis = new BufferedWriter(new FileWriter(file,true));
			//uslov za ponavljanje
			for (int i = 1; i <= 1000; i++) {
				//random rank pomocu metode
				String rank = randomRank();
				//random plata pomoc metode
				double salary = randomSalary(rank); 
				//upis podataka u fajl
				upis.write("FirstName"+i+" LastName"+i+" "+rank+" "+salary+"\n");
			}
			upis.close();//u slucaju greske 
		} catch (IOException ex){
			System.out.println("greska");	
			ex.printStackTrace();
		}

	}
	//na osnovu niza koji kao elemente ima radna mjesta, generise tri broja koji predstavljaju indekse niza
	public static String randomRank() {
		String[] rank = {"assistant","associate","full"};
		return rank[(int)(Math.random() * 3)];
	}
	//plata u zavisnosti od radnog mjesta, plata dobijena kao int, 
	//za dva decimalna mjesta veci bri podljeljena sa 100.0 da se dobije double broj sa 2 decimale
	public static double randomSalary(String rank) {
		//ako je assistent plata izmedju 50000 i 80000
		if (rank.equals("assistant")) {
			return (int)((Math.random() * 3000000) + 5000000)/100.0;
			// ako je associate plata izmedju 60000 i 110000
		} else if (rank.equals("associate")) {
			return (int)((Math.random() * 5000000) + 6000000)/100.0;
		} else {
			// ako je asistent izmedju 75000 i 130000
			return (int)((Math.random() * 5500000) + 7500000)/100.0;
		}
	}

}
