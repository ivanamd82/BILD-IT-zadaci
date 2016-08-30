package zadaci_26_08_2016;

public class Faculty extends Employee {
	
	//private data fields
	private int officeHours;
	private String rank;
	
	//no-arg konstruktor
	public Faculty() {
		
	}
	//konstruktor
	public Faculty(String name, String address, String phoneNumber, String email, double salary, String office, MyDate dateHired, int officeHours, String rank) {
		super(name, address, phoneNumber, email, salary, office, dateHired);
		this.officeHours = officeHours;
		this.rank = rank;		
	}
	//geterrs and setters
	public int getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(int officeHours) {
		this.officeHours = officeHours;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	//ispis pojedinosti
	@Override
	public String toString() {
		return "Name: " + super.getName() + " Class: " + this.getClass().getName();
	}
}
