package zadaci_22_08_2016;
/* 9.8 
 * (The Fan class) Design a class named Fan to represent a fan. The class contains:
 * Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to denote the fan speed.
 * A private int data field named speed that specifies the speed of the fan (the default is SLOW).
 * A private boolean data field named on that specifies whether the fan is on (the default is false).
 * A private double data field named radius that specifies the radius of the fan (the default is 5).
 * A string data field named color that specifies the color of the fan (the default is blue).
 * The accessor and mutator methods for all four data fields.
 * A no-arg constructor that creates a default fan.
 * A method named toString() that returns a string description for the fan. If the fan is on,
 * the method returns the fan speed, color, and radius in one combined string. 
 * If the fan is not on, the method returns the fan color and radius
 * along with the string “fan is off” in one combined string.
 */

public class Fan {
	
	//constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to denote the fan speed
	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;
	
	//private data field
	private int speed;
	private boolean on;
	private double radius;
	private String color;
	
	//no-arg constructor that creates a default fan
	public Fan() {
		speed = SLOW;
		on = false;
		radius = 5;
		color = "blue";
	}
	//getters and setters
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//returns a string description for the fan
	public String toString() {
		//if is on
		if (isOn())
			return "Fan speed "+getSpeed()+"\nFan color "+getColor()+"\nFan radius "+getRadius()+"\nFan color "+getColor();
		//if is off
		else 
			return"Fan color " +getColor()+ "\nFan radius " +getRadius()+"\nFan is off";
	}	
}
