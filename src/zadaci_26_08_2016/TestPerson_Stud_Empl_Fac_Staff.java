package zadaci_26_08_2016;

public class TestPerson_Stud_Empl_Fac_Staff {

	public static void main(String[] args) {
		
		//kreiranje objekata
		Person person = new Person();
		Student student = new Student("Marko", "Sivsa bb", "063/160-619", "mail@yahoo.com", "freshman");
		MyDate dateHired = new MyDate(2010,05,11);
		Employee employee = new Employee();
		Faculty faculty = new Faculty("Pero", "Sivsa bb", "063/160-619", "mail@yahoo.com", 500, "asistent", dateHired, 200, "rank");
		Staff staff = new Staff("Vinko", "Sivsa bb", "063/160-619", "mail@yahoo.com", 1000, "asistent", dateHired,"direktor");
		
		//ispis
		System.out.println(person);
		System.out.println(student);
		System.out.println(employee);
		System.out.println(faculty);
		System.out.println(staff);


	}

}
