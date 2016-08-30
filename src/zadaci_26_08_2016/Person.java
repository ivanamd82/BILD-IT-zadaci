package zadaci_26_08_2016;

public class Person {
	
	// private data fields
	private String name;
	private String address;
	private String phoneNumber;
	private String email;
	
	//no-arg konstruktor
	public Person() {
		
	}
	//konstruktor
	public Person(String name, String address, String phoneNumber, String email) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//ispis osobina objekta
	public String toString() {
		return "Name: "+name+"\nAddres: "+address+"\nPhone Number: "+phoneNumber+"\nE-mail: "+email;
	}
	

}
