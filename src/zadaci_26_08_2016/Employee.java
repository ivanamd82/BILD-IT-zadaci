package zadaci_26_08_2016;

public class Employee extends Person {
	
	//private data fields
	private String office;
	private double salary;
	private MyDate dateHired;
	
	//no-arg konstruktor
	public Employee() {

	}
	//konstruktor koji kreira objekat sa svim argumentima
	public Employee(String name, String address, String phoneNumber, String email, double salary, String office, MyDate dateHired){
		super(name, address, phoneNumber, email);
		this.dateHired = dateHired;
		this.salary = salary;
		this.office = office;
	}
	//geteri seteri
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public MyDate getDateHired() {
		return dateHired;
	}
	public void setDateHired(MyDate dateHired) {
		this.dateHired = dateHired;
	}
	//ispis pojedinosti
	@Override
	public String toString() {
		return "Name: " + super.getName() + " Class: " + this.getClass().getName();
	}
}
