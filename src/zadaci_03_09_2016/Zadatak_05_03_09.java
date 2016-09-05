package zadaci_03_09_2016;
/* 13.13
 * (Enable the Course class cloneable) Rewrite the Course class in Listing 10.6
 * to add a clone method to perform a deep copy on the students field.
 */

public class Zadatak_05_03_09 {

	public static void main(String[] args)  {
		
		Course c1 = new Course("Java");
		// dodajemo studente
		c1.addStudent("Student1");
		c1.addStudent("Student2");
		c1.addStudent("Student3");
		// kloniramo niz
		Course c2 = (Course)c1.clone();
		// prikazujemo c1
		System.out.println("Kurs 1");
		for (String c: c1.getStudents()) {
			if (c != null) 
			System.out.println(c);
		}
		System.out.println();
		// prikazujemo c2
		System.out.println("Kurs 2");
		for (String c: c2.getStudents()) {
			if (c != null) 
			System.out.println(c);
		}
	}

}
