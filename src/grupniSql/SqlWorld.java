package grupniSql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;

public class SqlWorld {

	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		try {
			// ucitavanje JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
			//povezivanje sa bazom
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/world", "root", "pass");
			//kreiranje izjave
			Statement statement = connection.createStatement();
			
			String query = "";		
			//printanje menija i izbor	
			int izbor = menu();
			//na osnovu izbora odradi nesto :)
			switch (izbor) {
			case 1: { //spisak svih drzava
				query = "SELECT * FROM country";
				//izvrsenje izjave
				ResultSet result = statement.executeQuery(query);
				//prolazak kroz rezultate i printanje
				while(result.next()) {
					System.out.println(result.getString("Name"));
				}
				break;
			}
			case 2: { //spisak svih gradova
				query = "SELECT * FROM city";
				//izvrsavanje izjave
				ResultSet result = statement.executeQuery(query);
				while(result.next()) {
					System.out.println(result.getString("Name"));
				}
				break;
			}
			case 3: { //ispis podataka o drzavi
				System.out.println("Unseite ime drzave: ");
				String s = input.nextLine();
				//queri sa povezanim bazama
				query = "SELECT * FROM country JOIN city ON country.Capital=city.ID WHERE country.Name = '" + s + "';";
				//izvrsavanje izjave
				ResultSet result = statement.executeQuery(query);
				//ispis
				System.out.println("Name\tContinent\tRegion\tSurface Area\tPopulation: ");
				while(result.next()) {
					System.out.println(result.getString("Name")+"\t"+result.getString("Continent")+"\t"
							+result.getString("Region")+"\t"+result.getString("SurfaceArea")+"\t"
							+result.getString("Population")+"\t"+result.getString("city.Name"));
				}
				//pretraga jezika za tu drzavu
				query = "SELECT * FROM countryLanguage JOIN country ON country.Code=countryLanguage.CountryCode WHERE country.Name='"+s+"';";
				ResultSet result1= statement.executeQuery(query);
				System.out.println("Jezici");
				while(result1.next()) {
					System.out.println(result1.getString("Language"));
				}
				break;
			}
			case 4: { //ispis podataka o gradu
				System.out.println("Unseite ime grada: ");
				String s = input.nextLine();
				//povezane tabele preko coda drzave
				query = "SELECT * FROM city JOIN country ON city.CountryCode=country.Code WHERE city.Name = '" + s + "';";
				ResultSet result = statement.executeQuery(query);
				System.out.println("Ime\tDrzava\tDistrikt\tPopulacija: ");
				while(result.next()) {					
					System.out.println(result.getString("Name")+"\t"+result.getString("country.Name")+"\t"
							+result.getString("District")+"\t"+result.getString("Population"));
				}
				break;
			}
			case 5: { //ispis gradova neke drzave
				System.out.println("Unesite ime drzave: ");
				String s = input.nextLine();
				query = "SELECT * FROM city JOIN country ON city.countryCode = country.code WHERE country.Name ='"+s+"';";
				ResultSet result = statement.executeQuery(query);
				while (result.next()) {
				System.out.println(result.getString("city.Name"));
				}
				break;
			}
			case 6: { //Pretraga drzava po broju stanovnika
				System.out.println("Unesite broj stanovnika: ");
				int s= input.nextInt();
				query = "SELECT * FROM country WHERE country.Population='"+s+"';";
				ResultSet result = statement.executeQuery(query);
				while(result.next()) {
					System.out.println(result.getString("Name"));
				}
				break;
			}
			case 7: { //Spisak svih drzava na odredjenom kontinentu
				System.out.println("Unesite ime kontinenta: ");
				String s = input.nextLine();
				query = "SELECT * FROM country WHERE Continent='"+s+"';";
				ResultSet result = statement.executeQuery(query);
				while(result.next()) {
					System.out.println(result.getString("Name"));
				}
				break;
			}//izlaz
			case 8: {
				System.out.println("Pa-pa");
				System.exit(0);
			}
			}
		
			//u slucaju gresaka
		} catch (SQLException ex) {
			ex.printStackTrace();
		}catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		
	}
	//meni
	public static int menu() {
		
		System.out.println("Pretraga baze world!");
		System.out.println("Izaberite opciju: \n");
		System.out.println("1. Spisak svih drzava");
		System.out.println("2. Spisak svih gradova");
		System.out.println("3. Podaci o odredjenoj drzavi");
		System.out.println("4. Podaci o odredjenom gradu");
		System.out.println("5. Spisak svih gradova odredjene drzave");
		System.out.println("6. Pretraga drzava po broju stanovnika");
		System.out.println("7. Spisak svih drzava na odredjenom kontinentu");
		System.out.println("8. Izlaz");
		int izbor = inputCheckI();
		return izbor;	
	}
	
	//metoda provjerava da li je broj odgovarajuceg tipa 
	public static int inputCheckI() {
		java.util.Scanner input = new java.util.Scanner(System.in);	
		int unos = 0;	// pocetna vrijednost
		boolean inputCheck = true;	//kontrolna promjenljiva
		do {
			try {
				unos = input.nextInt();	//ucitavanje unosa i provjera da li je u rangu
				if (unos < 1 || unos > 8) {
					System.out.println("Pogresan unos. Pokusajte ponovo: ");	//ako nije ispisi poruku
					inputCheck = true;
				}				
					else inputCheck = false;	//ako je sve ok, kontrolna promjenljiva false, vrati unos									
			} catch (InputMismatchException ex) {	//u slucaju pogresnog unosa
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				input.nextLine();
			}
		} while (inputCheck);		
		return unos;
	}

}
