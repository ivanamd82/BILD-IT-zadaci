package zadaci_02_09_2016;

import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject> {
	
	//private data fields
	private String color = "white";
	private boolean filled;
	private Date dateCreated;
	
	//no-arg constructor
	protected GeometricObject() {
		dateCreated = new Date();
	}
	//constructor
	protected GeometricObject(String color, boolean filed) {
		this();
		this.color = color;
		this.filled = filed;
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

	public Date getDateCreated() {
		return dateCreated;
	}
	
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	//Return a string representation of this object 
    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }
    public abstract double getArea();

	public abstract double getPerimeter();
	
	@Override
	public int compareTo(GeometricObject o) {
        if (getArea() == o.getArea())
            return 0;
        else if (getArea() > o.getArea())
            return 1;
        else
            return -1;
	}
	public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
        return (o1.compareTo(o2) >= 0) ? o1 : o2;
    }	
}
