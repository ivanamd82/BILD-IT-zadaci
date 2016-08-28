package zadaci_22_08_2016;
/*
 * Write a test program that creates two Fan objects. Assign maximum speed, radius 10, 
 * color yellow, and turn it on to the first object. Assign medium speed, radius 5, 
 * color blue, and turn it off to the second object. Display the objects by invoking their toString method.
 */

public class TestFan {

	public static void main(String[] args) {
		
		//kreiranje objekata
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();
		
		//podesavanje svojstava za fan1, brzina, radius, boja, ukljucen
		fan1.setSpeed(Fan.FAST);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setOn(true);
		
		//podesavanje brzine za fan2, ostala svojstva su ostala def
		fan2.setSpeed(Fan.MEDIUM);
		
		//ispis
		System.out.println("Fan1:\n"+fan1.toString());
		System.out.println();
		System.out.println("Fan2:\n"+fan2.toString());

	}

}
