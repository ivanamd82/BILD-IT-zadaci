package zadaci_26_08_2016;

public class Student extends Person {
	
	//konstante koje opisuju status
	public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";
    
    //private data fields
    private String status;
    
    //konstruktor koji kreira objekt
    //@param name - ime
    public Student(String name) {
        super();
        super.setName(name);
    }
    //konstruktor
    public Student(String name, String address, String phoneNumber, String email, String status) {
		super(name, address, phoneNumber, email);
		this.status = status;
	}
    //getter and setter
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	//ispis
    @Override
    public String toString() {
        return "Name: " + super.getName() + " Class: " + this.getClass().getName();
    }
}
