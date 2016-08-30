package zadaci_26_08_2016;

public class Staff extends Employee {
	
	//private date fields
	private String title;
	
	//no-arg konstruktor
	public Staff() {
		
	}
	//konstruktor
	public Staff(String name, String address, String phoneNumber, String email, double salary, String office, MyDate dateHired, String title) {
		super(name, address, phoneNumber, email, salary, office, dateHired);
		this.title = title;
	}
	//getters and setters
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	//ispis detalja
	@Override
	public String toString() {
		return "Name: " + super.getName() + " Class: " + this.getClass().getName();
	}
}
