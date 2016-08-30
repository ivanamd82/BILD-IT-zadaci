package zadaci_26_08_2016;

public class GeometricObject {
	
	//private data fields
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	//no-arg komstruktor
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}
	//konstruktor kreira objekat sa argumentima
	public GeometricObject(String color, boolean filled) {
		this();
		this.color = color;
		this.filled = filled;
	}
	//getters and setters
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public java.util.Date getDate() {
		return dateCreated;
	}
	//ispis
	public String toString() {
		return "Color: "+color+"\nFilled: "+filled+"\nDate created"+getDate();
	}
}
